package Inventario;

/**
 *
 * @author copec
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.json.JSONException;

public class MaterialDeCuracion extends Producto{
    
    private String clasificacion;

    
    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    
    @Override
    public String serializa() {
        try{
            JSONObject json = new JSONObject();
            json.put("nombre", getNombre());
            json.put("precio", getPrecio());
            json.put("descripcion", getDescripcion());
            json.put("clasificacion", getClasificacion());
            json.put("unidadDeMedida", getUnidadMedida());
            json.put("dimension", getDimension().getNombre());
            json.put("fechaCaducidad", convertDateToString(getFechaCaducidad()));
            return json.toString();
        }catch(JSONException e){return null;}
    }
    
    public static MaterialDeCuracion deserializa(String linea){
        try{
            JSONObject json = new JSONObject(linea);
            MaterialDeCuracion materialDeCuracion = new MaterialDeCuracion();
            materialDeCuracion.setClasificacion(json.getString("clasificacion"));
            materialDeCuracion.setDescripcion(json.getString("descripcion"));
            materialDeCuracion.setDimension(new Dimension(json.getString("dimension")));
            materialDeCuracion.setFechaCaducidad(convertToDate(json.getString("fechaCaducidad")));
            materialDeCuracion.setPrecio(json.getLong("precio"));
            materialDeCuracion.setUnidadMedida(json.getString("unidadDeMedida"));
            materialDeCuracion.setNombre(json.getString("nombre"));
            return materialDeCuracion;
        }catch(JSONException e){
            return null;
        }
    }
    
    public static boolean validaFecha(String stringDate){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date date = sdf.parse(stringDate);
            return stringDate.equals(sdf.format(date));
        } catch (ParseException ex) {
            return false;
        }
    }
    
    public static java.util.Date convertToDate(String stringDate){
        try{
            return validaFecha(stringDate) ? new SimpleDateFormat("dd/MM/yyyy").parse(stringDate) : null;
        }catch(ParseException ignore){
            ignore.printStackTrace();
            return null;
        }
    }
    
    public String convertDateToString(java.util.Date date){
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }

    @Override
    public String getDistintivo() {
        return clasificacion;
    }

    @Override
    public String queEres() {
        return "Clasificacion";
    }
}
