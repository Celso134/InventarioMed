package Managers;

import Inventario.Inventario;

public class ManejadorInventario {

    private Inventario inventario;
    private ManejadorArchivo manejadorArchivo;

    public ManejadorInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    
    public void setInventario(Inventario inventario){
        this.inventario = inventario;
    }
    public Inventario getInventario(){
        return inventario;
    }

    public void guardaInventario(boolean trel) {
        manejadorArchivo = new ManejadorArchivo("Inventario", trel);
        manejadorArchivo.escribeLinea(inventario.serializa());
        manejadorArchivo.cerrarArchivo();
    }

    public Inventario cargaInventario() {
        String ar;
        Inventario inv = new Inventario();
        manejadorArchivo = new ManejadorArchivo("Inventario", true);
        if (manejadorArchivo.leerLinea() == null) {
            manejadorArchivo.cerrarArchivo();
            System.out.println("No hay Inventario para cargar.");
            return inv;
        } else {
            manejadorArchivo.cerrarArchivo();
            manejadorArchivo = new ManejadorArchivo("Inventario", true);
            System.out.println("Inventario cargado");
            ar = manejadorArchivo.leerLinea();
            manejadorArchivo.cerrarArchivo();
            return (Inventario.crearInventario(ar));
        }
    }

    public Inventario obtenerInventario() {
        return inventario;
    }
}
