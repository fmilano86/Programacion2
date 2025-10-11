/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }    
    
    public void agregarProducto(Producto p){
        this.productos.add(p);
    }
    
    public void listarProductos(){
        System.out.println(productos.toString());
    }
    
    public Producto buscarProductoPorId(String id){
        int i = 0;
        Producto productoEncontrado = null;
        while (productoEncontrado == null && i < productos.size()){
            Producto productoActual = productos.get(i);
            if (productoActual.getId().equalsIgnoreCase(id)){
                productoEncontrado = productoActual;
            }
        i++;
        }
        productoEncontrado.toString();
        return productoEncontrado;
        
    }
    
    public void eliminarProducto(String id){
        Producto productoEliminable = this.buscarProductoPorId(id);
        if (productoEliminable != null){
            productos.remove(productoEliminable);
        }               
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
        Producto productoModificable = this.buscarProductoPorId(id);
        if (productoModificable != null){
            productoModificable.modificarCantidad(nuevaCantidad);
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList <Producto> listaCategoria = new ArrayList();
        for (Producto p : productos){
            if (p.getCategoria().equalsIgnoreCase(categoria.name())){
                listaCategoria.add(p);
            }
        }
        System.out.println(listaCategoria);
    }
    
    public void obtenerTotalStock(){
        int totalStock = 0;
        for (Producto p : productos){
            totalStock += p.getCantidad();
        }
        System.out.println("Total stock: " + totalStock);
    }
    
    public Producto obenerProductoConMayorStock(){
        Producto productoMayorStock = null;
        int mayorStock = 0;
        for(Producto p : productos){
            if(p.getCantidad() > mayorStock){
                productoMayorStock = p;
                mayorStock = p.getCantidad();
            }
        }
        return productoMayorStock;    
    }
    
    public void filtrarProductosPorPrecio(double min, double max){
        ArrayList <Producto> productosFiltrados = new ArrayList();
        for(Producto p : productos){
            if(p.getPrecio() >= min && p.getPrecio() <= max){
                productosFiltrados.add(p);
            }
        }
        System.out.println("Productos en el rango de precio: " + productosFiltrados);
    }
    
    public void mostrarCategoriasDisponibles(){
        ArrayList<CategoriaProducto> categoriasDisponibles = new ArrayList();
        for(Producto p : productos){
            if (p.getCantidad() > 0){
                CategoriaProducto categoria = p.obtenerCategoria();
                boolean categoriaIncluida = false;
                int i = 0;
                while(categoriaIncluida == false && i < categoriasDisponibles.size()){
                    CategoriaProducto categoriaAnalizada = categoriasDisponibles.get(i);
                    if(categoriaAnalizada == categoria){
                        categoriaIncluida = true;
                    }
                    i++;                   
                }
                if(!categoriaIncluida){
                    categoriasDisponibles.add(categoria);
                }
            }
        }
        System.out.println("Las categorias disponibles son: " + categoriasDisponibles.toString());
    }
}
