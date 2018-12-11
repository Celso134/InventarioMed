/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author copec
 */
public class Medicamento extends Producto{
    private String especificacion;

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    @Override
    public String serializa() {
        try{
            JSONObject json = new JSONObject();
            json.put("nombre", getNombre());
            json.put("precio", getPrecio());
            json.put("descripcion", getDescripcion());
            json.put("especificacion", getEspecificacion());
            json.put("unidadDeMedida", getUnidadMedida());
            json.put("dimension", getDimension().getNombre());
            json.put("fechaCaducidad", convertDateToString(getFechaCaducidad()));
            return json.toString();
        }catch(JSONException e){return null;}
    }
    public static Medicamento deserializa(String linea){
        try{
            JSONObject json = new JSONObject(linea);
            Medicamento medicamento = new Medicamento();
            medicamento.setEspecificacion(json.getString("especificacion"));
            medicamento.setDescripcion(json.getString("descripcion"));
            medicamento.setDimension(new Dimension(json.getString("dimension")));
            medicamento.setFechaCaducidad(convertToDate(json.getString("fechaCaducidad")));
            medicamento.setPrecio(json.getLong("precio"));
            medicamento.setUnidadMedida(json.getString("unidadDeMedida"));
            medicamento.setNombre(json.getString("nombre"));
            return medicamento;
        }catch(JSONException e){
            System.out.println("Ese no era un medicamento, procediendo a deserealizar un Material de curacion.");
            return null;
        }
    }
    
    public static java.util.Date convertToDate(String date){
        try {
            return new SimpleDateFormat("dd/mm/yyyy").parse(date);
        } catch (ParseException ex) {
            return null;
        }
    }
    
    public String convertDateToString(java.util.Date date){
        return new SimpleDateFormat("dd/mm/yyyy").format(date);
    }

    @Override
    public String getDistintivo() {
        return especificacion;
    }

    @Override
    public String queEres() {
        return "Especificacion";
    }
}
