/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej7;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;        // agregación 1–1
    private Conductor conductor; // asociación 1–1

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void asignarConductor(Conductor c) {
        if (c != null) {
            this.conductor = c;
            c.asignarVehiculo(this);
        }
    }

    public Conductor getConductor() {
        return conductor;
    }
}
