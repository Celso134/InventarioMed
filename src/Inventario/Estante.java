/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        for(int i = 0; i <= cantidadSlots; i++){
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
        for(int i = 0; i <= cantidadSlots; i++){
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
    public boolean agregarProducto(ProductoAgregado producto){
        if(producto.getProducto().getDimension().getDimension() < espacioRestante){
            Slot slot = slots.get(1);
            slot.agregarProducto(producto);
            espacioRestante = espacioRestante - producto.getProducto().getDimension().getDimension();
        }
        return false;
    }

    @Override
    public String serializa() {
        try{
            JSONObject json = new JSONObject();
            json.put("nombreEstante", getNombre());
            json.put("descripcion", "jajajajtl");
            json.put("tamanio", getEspacioTotal());
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
            java.util.ArrayList<Slot> slots;
            slots = new java.util.ArrayList<>();
            JSONArray jSlots = json.getJSONArray("slots");
            for(int i = 0; i <= jSlots.length(); i++){
                slots.add(Slot.deserializa(jSlots.getString(i)));
            }
            estante.setSlots(slots);
            return estante;
        } catch (JSONException ex) {
            return null;
        }
    }
}
