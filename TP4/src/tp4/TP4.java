/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author Usuario
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Facundo", "Analista");
        Empleado e2 = new Empleado(5, "Alejandra", "Coordinadora", 1000);
        Empleado e3 = new Empleado(3, "Florencia", "Diseñadora BD", 500);
        
        e1.actualizarSalario(400.0);
        e2.actualizarSalario(-10);
        
        System.out.println(e1.toString());
        System.out.println(e3.toString());
        System.out.println(e2.toString());
        
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
