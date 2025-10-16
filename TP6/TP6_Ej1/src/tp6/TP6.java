/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class TP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto a = new Producto("1523", "Manzana", 1500.0, 21, CategoriaProducto.ALIMENTOS);
        Producto b = new Producto("8741", "Computadora", 4500.0, 4, CategoriaProducto.ELECTRONICA);
        Producto c = new Producto("6632", "Pantalon", 700.0, 8, CategoriaProducto.ROPA);
        Producto d = new Producto("9682", "Estufa", 1100.0, 2, CategoriaProducto.HOGAR);
        Producto e = new Producto("5562", "Agua", 3500.0, 12, CategoriaProducto.ALIMENTOS);
        
        ArrayList <Producto> productos = new ArrayList();
        productos.add(a);
        productos.add(b);
        productos.add(c);
        productos.add(d);
        productos.add(e);
        
        Inventario inventarioPrueba = new Inventario(productos);
        inventarioPrueba.listarProductos();
        
        Producto p = inventarioPrueba.buscarProductoPorId("9682");
        System.out.println(p.toString());
        
        inventarioPrueba.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        inventarioPrueba.eliminarProducto("5562");
        inventarioPrueba.listarProductos();
        
        inventarioPrueba.actualizarStock("1523", 13);
        inventarioPrueba.listarProductos();
        
        inventarioPrueba.obtenerTotalStock();
        
        Producto prodMayorStock = inventarioPrueba.obenerProductoConMayorStock();
        System.out.println("El producto con mayor stock es: " + prodMayorStock);
        
        inventarioPrueba.filtrarProductosPorPrecio(1000.0, 3000.0);
        
        inventarioPrueba.mostrarCategoriasDisponibles();
        
    }
    
}
