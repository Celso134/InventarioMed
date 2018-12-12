/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import org.json.JSONException;
import org.json.JSONObject;
import GUI.MainFrame;
import GUI.ConsultorFrame;
import Inventario.Estante;
import Inventario.Inventario;

/**
 *
 * @author copec
 */
public class Consultor extends Usuario{
    
    Managers.ManejadorCatalogoProducto manejadorCatalogo;
    Managers.ManejadorInventario manejadorInventario;
    Inventario inv;
    
    public Consultor(String nombre, String pass) {
        super(nombre, pass);
        inv = Inventario.cargaInventario();
    }
    public Inventario getInventario(){
        return inv;
    }
    public java.util.ArrayList<Estante> getEstantes(){
        inv = Inventario.cargaInventario();  
        return inv.getEstantes();
    }
    @Override
    public String serializa() {
        try {
            JSONObject json = new JSONObject();
            json.put("nombreUsuario", getNombre());
            json.put("Pass", getPass());
            json.put("Tipo_Usuario", "Consultor");
            return json.toString();
        } catch (JSONException e) {
            return null;
        }
    }

    @Override
    public void lanzarFrame() {
        ConsultorFrame cF = new ConsultorFrame(this);
        cF.setVisible(true);
    }
    
    public void actualizaInventario(){
        inv = Inventario.cargaInventario();
    }
}
