package Managers;

import Inventario.CatalogoProducto;

/**
 *
 * @author copec
 */
public class ManejadorCatalogoProducto {
    CatalogoProducto catalogoProducto;
    ManejadorArchivo manejadorArchivo;
    
    public boolean agregarProducto(String tipoProducto, String nombre, String date, float precio, String unidadMedida, String descripcion, String dimension, String distintivo){
        boolean trel;
        trel = catalogoProducto.agregarProducto(tipoProducto, nombre, date, precio, unidadMedida, descripcion, dimension, distintivo);
        return trel;
    }
    
    public void guardaProductos(){
        manejadorArchivo = new ManejadorArchivo("Usuarios",true);
        manejadorArchivo.escribeLinea(catalogoProducto.serializa());
        manejadorArchivo.cerrarArchivo();
    }
    public void cargaProductos(){
        manejadorArchivo = new ManejadorArchivo("Usuarios",true);
        catalogoProducto = CatalogoProducto.deserealiza(manejadorArchivo.leerLinea());
        manejadorArchivo.cerrarArchivo();
    }
    public java.util.ArrayList<Inventario.Producto> obtenerCatalogoProductos(java.util.ArrayList<Inventario.Producto> asd){
        return asd = catalogoProducto.getProductos();}
}
