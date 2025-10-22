/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7_ej3;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class TP7_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 150000, 3));
        empleados.add(new EmpleadoTemporal("Luis", 80, 2000));
        empleados.add(new EmpleadoPlanta("Sofía", 180000, 5));

        
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " gana $" + e.calcularSueldo());
            
            if (e instanceof EmpleadoPlanta) {
                System.out.println(" Es empleado de planta.\n");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(" Es empleado temporal.\n");
            }
        }
    }
}
    

