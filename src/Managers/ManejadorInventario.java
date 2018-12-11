/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

/**
 *
 * @author copec
 */
public class ManejadorInventario {
    private Inventario.Inventario inventario;
    private ManejadorArchivo manejadorArchivo;

    public ManejadorInventario(Inventario.Inventario inventario){
    this.inventario = inventario;
}
    
    public void guardaInventario(){
        manejadorArchivo = new ManejadorArchivo("Inventario",false);
        manejadorArchivo.escribeLinea(inventario.serializa());
        manejadorArchivo.cerrarArchivo();
    }
    public void cargaInventario() {
        manejadorArchivo = new ManejadorArchivo("Inventario", true);
        if (manejadorArchivo.leerLinea() == null) {
            manejadorArchivo.cerrarArchivo();
            System.out.println("No hay Inventario para cargar.");
        } else {
            manejadorArchivo.cerrarArchivo();
            manejadorArchivo = new ManejadorArchivo("Inventario", true);
            inventario = Inventario.Inventario.crearInventario(manejadorArchivo.leerLinea());
            System.out.println("Inventario cargado");
            manejadorArchivo.cerrarArchivo();
        }
    }
    public Inventario.Inventario obtenerInventario(){return inventario;}
}
