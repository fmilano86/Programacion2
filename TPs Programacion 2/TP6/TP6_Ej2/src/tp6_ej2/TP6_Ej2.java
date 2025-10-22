/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6_ej2;

/**
 *
 * @author Usuario
 */
public class TP6_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1) Creamos una biblioteca
        Biblioteca biblio = new Biblioteca("Biblioteca Central");

        // 2) Crear al menos tres autores
        Autor autor1 = new Autor("A001", "Julio Cortázar", "Argentina");
        Autor autor2 = new Autor("A002", "Ursula K. Le Guin", "Estados Unidos");
        Autor autor3 = new Autor("A003", "Haruki Murakami", "Japón");

        // 3) Agregar 5 libros asociados a alguno de los autores
        biblio.agregarLibro("ISBN-001", "Rayuela", 1963, autor1);
        biblio.agregarLibro("ISBN-002", "Historias de cronopios y de famas", 1962, autor1);
        biblio.agregarLibro("ISBN-003", "The Left Hand of Darkness", 1969, autor2);
        biblio.agregarLibro("ISBN-004", "Kafka en la orilla", 2002, autor3);
        biblio.agregarLibro("ISBN-005", "Tokio Blues (Norwegian Wood)", 1987, autor3);

        // 4) Listar todos los libros con su información y la del autor
        System.out.println("\n(4) Listar libros:");
        biblio.listarLibros();

        // 5) Buscar un libro por su ISBN (ya imprime dentro del método)
        System.out.println("\n(5) Buscar libro por ISBN 'ISBN-004':");
        biblio.buscarLibroPorIsbn("ISBN-004");

        // 6) Filtrar y mostrar los libros publicados en un año específico
        System.out.println("\n(6) Filtrar por año 1963:");
        biblio.filtrarLibrosPorAnio(1963);

        // 7) Eliminar un libro por su ISBN y listar los libros restantes
        System.out.println("\n(7) Eliminar 'ISBN-002' y listar restantes:");
        biblio.eliminarLibro("ISBN-002");
        biblio.listarLibros();

        // 8) Mostrar la cantidad total de libros en la biblioteca
        System.out.println("\n(8) Cantidad total de libros:");
        System.out.println("Total de libros: " + biblio.obtenerCantidadLibros());

        // 9) Listar todos los autores de los libros disponibles en la biblioteca
        System.out.println("\n(9) Autores disponibles:");
        biblio.mostrarAutoresDisponibles();
    }        
}
