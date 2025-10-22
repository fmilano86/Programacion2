/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej3;

/**
 *
 * @author Usuario
 */
public class TP5_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor a = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial e = new Editorial("Sudamericana", "Buenos Aires");
        Libro l = new Libro("Cien años de soledad", "978-950-07-1234-5", a, e);

        System.out.println("Autor asignado correctamente: " + (l.getAutor() == a));
        System.out.println("Editorial asignada correctamente: " + (l.getEditorial() == e));
    }
    
}
