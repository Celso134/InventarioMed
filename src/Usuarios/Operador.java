/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author copec
 */

import Inventario.*;
import org.json.JSONException;
import org.json.JSONObject;
import GUI.MainFrame;
import GUI.ConsultorFrame;
import GUI.OperadorFrame;

public class Operador extends Usuario{

    Managers.ManejadorInventario manejadorInventario;
    Inventario inv;
    
    public Operador(String nombre, String pass) {
        super(nombre, pass);
        inv = new Inventario();
    }
    
    public void agregarProductoEstante(ProductoAgregado productoAgregado){}
    public void quitarProductoEstante(String nombreProducto, Estante estante){
    }
    public void quitarProductoEstante(ProductoAgregado productoAgregado, Estante estante){}
    public void guardaInventario(){}
    public Inventario getInventario(){
        return inv;
    }

    @Override
    public String serializa() {
        try {
            JSONObject json = new JSONObject();
            json.put("nombreUsuario", getNombre());
            json.put("Pass", getPass());
            json.put("Tipo_Usuario", "Operador");
            return json.toString();
        } catch (JSONException e) {
            return null;
        }
    }

    @Override
    public void lanzarFrame() {
        OperadorFrame oF = new OperadorFrame(this);
        oF.setVisible(true);
    }
}
