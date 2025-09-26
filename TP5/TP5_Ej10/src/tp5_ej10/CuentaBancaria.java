/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej10;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    private String cbu;
    private String saldo;
    private ClaveSeguridad clave; 
    private Titular titular;      

    public CuentaBancaria(String cbu, String saldo, ClaveSeguridad clave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
    }

    public void asignarTitular(Titular t) {
        if (t != null) {
            this.titular = t;
            t.asignarCuenta(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }
}
