/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej1;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nCurso: " + curso + "\nCalificacion: " + calificacion);
    }
    
    void subirCalificacion(int puntos){
        calificacion += puntos;
    }
    
    void bajarCalificacion(int puntos){
        calificacion -= puntos;
    }
}
