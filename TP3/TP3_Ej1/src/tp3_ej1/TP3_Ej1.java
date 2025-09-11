/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ej1;

/**
 *
 * @author Usuario
 */
public class TP3_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante fmm = new Estudiante();
        
        fmm.mostrarInfo();
        fmm.apellido = "Milano";
        fmm.nombre = "Facundo";
        fmm.curso = "Programacion";
        fmm.calificacion = 9;
        fmm.mostrarInfo();
        
        fmm.bajarCalificacion(2);
        fmm.mostrarInfo();
        fmm.subirCalificacion(1);
        fmm.mostrarInfo();       
    }
    
}
