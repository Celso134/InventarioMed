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

import java.util.ArrayList;
import Inventario.*;
import org.json.JSONObject;
import org.json.JSONException;
import GUI.MainFrame;
import GUI.AdministradorFrame;
import Managers.ManejadorInventario;

public class Administrador extends Usuario{
    Inventario inv;
    
    public Administrador(String nombre, String pass) {
        super(nombre, pass);
        inv = Inventario.cargaInventario();
    }
    public void crearEstante(String nombre, int cantidadSlot){
        inv.crearEstante(nombre, cantidadSlot);
    }
    public void crearEstante(String nombre, int cantidadSlots, int espacioPorSlot){
        inv.crearEstante(nombre, cantidadSlots, espacioPorSlot);
    }
    public void agregarProductoCatalogo(Producto producto){
    
    }
    public void quitarProductoCatalogo(Producto producto){}
    public void quitarProductoCatalogo(String nombre){}
    public ArrayList<Estante> getEstantes(){
        return Inventario.cargaInventario().getEstantes();
    }
    public Inventario getInventario(){
        return inv;
    }
    
    public void setInv(Inventario inv) {
        this.inv = inv;
    }

    @Override
    public String serializa() {
        try {
            JSONObject json = new JSONObject();
            json.put("nombreUsuario", getNombre());
            json.put("Pass", getPass());
            json.put("Tipo_Usuario", "Administrador");
            return json.toString();
        } catch (JSONException e) {
            return null;
        }
    }

    @Override
    public void lanzarFrame() {
        AdministradorFrame aF = new AdministradorFrame(this, getUsersManager());
        aF.setVisible(true);
    }
}
