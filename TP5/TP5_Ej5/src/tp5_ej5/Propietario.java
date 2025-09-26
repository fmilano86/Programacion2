/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej5;

/**
 *
 * @author Usuario
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; 

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void asignarComputadora(Computadora c) {
        if (c != null) {
            this.computadora = c;
        }
    }

    public Computadora getComputadora() {
        return computadora;
    }
}
