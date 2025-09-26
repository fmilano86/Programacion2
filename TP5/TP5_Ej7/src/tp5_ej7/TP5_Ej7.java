/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej7;

/**
 *
 * @author Usuario
 */
public class TP5_Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor m = new Motor("Nafta", "MTR123456");
        Vehiculo v = new Vehiculo("AB123CD", "Sedan", m);
        Conductor c = new Conductor("Roberto López", "LIC987654");

        v.asignarConductor(c);

        System.out.println("Conductor del vehículo OK: " + (v.getConductor() == c));
        System.out.println("Vehículo del conductor OK: " + (c.getVehiculo() == v));
    }
    
}
