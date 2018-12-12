/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
/**
 *
 * @author copec
 */
public class Estante implements Serializa{
    private String nombre;
    private java.util.ArrayList<Slot> slots;
    private String descripcion;
    private int espacioTotal;
    private int espacioRestante;

    public int getEspacioTotal() {
        return espacioTotal;
    }

    public void setEspacioTotal(int espacioTotal) {
        this.espacioTotal = espacioTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Slot> getSlots() {
        return slots;
    }

    public void setSlots(ArrayList<Slot> slots) {
        this.slots = slots;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Estante(String nombre, int cantidadSlots){
        this.nombre = nombre;
        slots = new java.util.ArrayList<>();
        for(int i = 0; i < cantidadSlots; i++){
            Slot slot = new Slot();
            slot.setEspacio(50);
            slots.add(slot);
        }
        for(Slot slot : slots){
            espacioTotal = slot.getEspacio() + espacioTotal;
        }
        espacioRestante = espacioTotal;
    }
    public Estante(String nombre, int cantidadSlots, int espacioPorSlot){
        this.nombre = nombre;
        slots = new java.util.ArrayList<>();
        for(int i = 0; i < cantidadSlots; i++){
            Slot slot = new Slot();
            slot.setEspacio(espacioPorSlot);
            slots.add(slot);
        }
        for(Slot slot : slots){
            espacioTotal = slot.getEspacio() + espacioTotal;
        }
        espacioRestante = espacioTotal;
    }
    public Estante(){}
    public void agregarProducto(ProductoAgregado producto) {
        if (producto.getProducto().getDimension().getDimension() <= espacioRestante) {
            Slot slot = slots.get(0);
            slot.agregarProducto(producto);
            this.espacioRestante = espacioRestante - producto.getProducto().getDimension().getDimension();
        } else {
            JOptionPane.showMessageDialog(null, "Espacio insuficiente.", "Error en campos", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void quitarProducto(int index){
        ProductoAgregado producto;
        Slot slot = slots.get(0);
        producto = slot.quitaProducto(index);
        try{
        this.espacioRestante = espacioRestante + producto.getProducto().getDimension().getDimension();
        setEspacioRestante(espacioRestante);
        JOptionPane.showMessageDialog(null, "Para proseguir eliminando productos, guarde cambios por favor.", "Error en campos", JOptionPane.INFORMATION_MESSAGE);
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No hay productos para quitar.", "Error en campos", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public String serializa() {
        try{
            JSONObject json = new JSONObject();
            json.put("nombreEstante", getNombre());
            json.put("descripcion", "jajajajtl");
            json.put("tamanio", getEspacioTotal());
            json.put("tamanioRestante", getEspacioRestante());
            JSONArray jSlots = new JSONArray();
            for(Slot slot : slots){
                jSlots.put(slot.serializa());
            }
            json.put("slots", jSlots);
            return json.toString();
        }catch(JSONException e){return null;}
    }
    
    public static Estante deserializa(String linea){
        try {
            JSONObject json = new JSONObject(linea);
            Estante estante = new Estante();
            estante.setDescripcion(json.getString("descripcion"));
            estante.setNombre(json.getString("nombreEstante"));
            estante.setEspacioTotal(json.getInt("tamanio"));
            estante.setEspacioRestante(json.getInt("tamanioRestante"));
            java.util.ArrayList<Slot> slots;
            slots = new java.util.ArrayList<>();
            JSONArray jSlots = json.getJSONArray("slots");
            for(int i = 0; i < jSlots.length(); i++){
                slots.add(Slot.deserializa(jSlots.getString(i)));
            }
            estante.setSlots(slots);
            return estante;
        } catch (JSONException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void setEspacioRestante(int espacioRestante) {
        this.espacioRestante = espacioRestante;
    }

    public int getEspacioRestante() {
        return espacioRestante;
    }
}
