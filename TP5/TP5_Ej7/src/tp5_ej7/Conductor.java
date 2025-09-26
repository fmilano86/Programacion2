/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej7;

/**
 *
 * @author Usuario
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // asociación 1↔1

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void asignarVehiculo(Vehiculo v) {
        if (v != null) {
            this.vehiculo = v;
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
