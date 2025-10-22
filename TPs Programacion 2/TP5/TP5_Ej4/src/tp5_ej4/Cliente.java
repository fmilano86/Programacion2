/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej4;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; 

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void asignarTarjeta(TarjetaDeCredito t) {
        if (t != null) {
            this.tarjeta = t;
        }
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }
}
