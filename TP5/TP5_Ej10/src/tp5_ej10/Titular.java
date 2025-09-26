/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej10;

/**
 *
 * @author Usuario
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; 

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void asignarCuenta(CuentaBancaria c) {
        if (c != null) {
            this.cuenta = c;
        }
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }
}
