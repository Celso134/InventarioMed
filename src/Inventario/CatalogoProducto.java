/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

/**
 *
 * @author copec
 */

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CatalogoProducto implements Serializa{
    private ArrayList<Producto> productos;

    public CatalogoProducto(){
        productos = new ArrayList<Producto>();
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public ArrayList<Producto> consultaCatalogo(){return null;}
    
    public boolean agregarProducto(String tipoProducto, String nombre, String date, float precio, String unidadMedida, String descripcion, String dimension, String distintivo){
        switch(tipoProducto){
            case "Material":
                MaterialDeCuracion producto = new MaterialDeCuracion();
                producto.setClasificacion(distintivo);
                producto.setDescripcion(descripcion);
                producto.setDimension(new Dimension(dimension));
                producto.setFechaCaducidad((MaterialDeCuracion.convertToDate(date)));
                producto.setNombre(nombre);
                producto.setPrecio(precio);
                producto.setUnidadMedida(unidadMedida);
                productos.add(producto);
                return true;
            case "Medicamento":
                Medicamento productoM = new Medicamento();
                productoM.setEspecificacion(distintivo);
                productoM.setDescripcion(descripcion);
                productoM.setDimension(new Dimension(dimension));
                productoM.setFechaCaducidad(Medicamento.convertToDate(date));
                productoM.setNombre(nombre);
                productoM.setPrecio(precio);
                productoM.setUnidadMedida(unidadMedida);
                productos.add(productoM);
                return true;
        }return false;
    }

    @Override
    public String serializa() {
        try{
            JSONObject json = new JSONObject();
            JSONArray jProductos = new JSONArray();
            productos.forEach((producto) -> {
                jProductos.put(producto.serializa());
            });
            json.put("producto", jProductos);
            return json.toString();
        }catch(JSONException e){return null;}
    }
    public static CatalogoProducto deserealiza(String linea){
        try {
            CatalogoProducto cP = new CatalogoProducto();
            JSONObject json = new JSONObject(linea);
            JSONArray jProductos = json.getJSONArray("producto");
            ArrayList<Producto> productos = new ArrayList<>();
            for(int i = 0; i <= jProductos.length(); i++){
                productos.add(Producto.deserializa(jProductos.getString(i)));
            }
            cP.setProductos(productos);
            return cP;
        } catch (JSONException ex) {
            return null;
        }
    }
}
