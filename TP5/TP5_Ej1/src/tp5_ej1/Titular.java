/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej1;

/**
 *
 * @author Usuario
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; 

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void asignarPasaporte(Pasaporte p) {
        if (p != null) {
            this.pasaporte = p;
        }
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
}
