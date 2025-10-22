/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_ej2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevo = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevo);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("Listado de libros en '" + nombre + "':");
        for (int i = 0; i < libros.size(); i++) {
            libros.get(i).mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        int i = 0;
        Libro encontrado = null;
        while (encontrado == null && i < libros.size()) {
            Libro actual = libros.get(i);
            if (actual.getIsbn().equalsIgnoreCase(isbn)) {
                encontrado = actual;
            }
            i++;
        }

        
        if (encontrado != null) {
            System.out.println("Libro encontrado:");
            encontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró ningún libro con ISBN " + isbn + ".");
        }

        return encontrado; 
    }

    public void eliminarLibro(String isbn) {
        Libro aEliminar = buscarLibroPorIsbn(isbn);
        if (aEliminar != null) {
            libros.remove(aEliminar);
            System.out.println("Se eliminó el libro con ISBN " + isbn + ".");
        }
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> filtrados = new ArrayList<>();
        for (int i = 0; i < libros.size(); i++) {
            Libro l = libros.get(i);
            if (l.getAnioPublicacion() == anio) {
                filtrados.add(l);
            }
        }
        if (filtrados.isEmpty()) {
            System.out.println("No hay libros publicados en el año " + anio + ".");
        } else {
            System.out.println("Libros publicados en el año " + anio + ":");
            for (int i = 0; i < filtrados.size(); i++) {
                filtrados.get(i).mostrarInfo();
            }
        }
    }

    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("No hay autores para mostrar (no hay libros).");
            return;
        }
        ArrayList<String> autoresUnicos = new ArrayList<>();
        for (int i = 0; i < libros.size(); i++) {
            Autor a = libros.get(i).getAutor();
            if (a != null) {
                String linea = a.getId() + " | " + a.getNombre() + " | " + a.getNacionalidad();
                if (!autoresUnicos.contains(linea)) {
                    autoresUnicos.add(linea);
                }
            }
        }
        System.out.println("Autores disponibles en '" + nombre + "':");
        for (int i = 0; i < autoresUnicos.size(); i++) {
            System.out.println(" - " + autoresUnicos.get(i));
        }
    }
}
