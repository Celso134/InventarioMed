package Managers;

import Inventario.CatalogoProducto;

/**
 *
 * @author copec
 */
public class ManejadorCatalogoProducto {
    CatalogoProducto catalogoProducto;
    ManejadorArchivo manejadorArchivo;
    
    
    public ManejadorCatalogoProducto(){
        catalogoProducto = new CatalogoProducto();
    }
    public void agregarProducto(String tipoProducto, String nombre, String date, float precio, String unidadMedida, String descripcion, String dimension, String distintivo){
        catalogoProducto.agregarProducto(tipoProducto, nombre, date, precio, unidadMedida, descripcion, dimension, distintivo);
    }
    
    public void guardaProductos(){
        manejadorArchivo = new ManejadorArchivo("Catalogo",false);
        manejadorArchivo.escribeLinea(catalogoProducto.serializa());
        manejadorArchivo.cerrarArchivo();
    }
    public void cargaProductos(){
        manejadorArchivo = new ManejadorArchivo("Catalogo",true);
        if(manejadorArchivo.leerLinea() == null){
            manejadorArchivo.cerrarArchivo();
            System.out.println("No hay catalogo para cargar.");
        }else{manejadorArchivo.cerrarArchivo();
        manejadorArchivo = new ManejadorArchivo("Catalogo",true);
        catalogoProducto = CatalogoProducto.deserealiza(manejadorArchivo.leerLinea());
        manejadorArchivo.cerrarArchivo();
        }
    }
    public java.util.ArrayList<Inventario.Producto> obtenerCatalogoProductos(){
        return catalogoProducto.getProductos();}
}
