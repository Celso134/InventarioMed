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
public class Dimension{
    private String nombre;
    private int dimension;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    
    public Dimension(String nombre){
    this.nombre = nombre;
    switch(nombre){
        case "Chico":
            dimension = 5;
            break;
        case "Mediano":
            dimension = 10;
            break;
        case "Grande":
            dimension = 15;
            break;
    }
    }
    
}
