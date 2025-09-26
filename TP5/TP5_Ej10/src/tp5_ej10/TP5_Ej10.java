/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej10;

/**
 *
 * @author Usuario
 */
public class TP5_Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("ABC123", "2025-09-26");
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", "50000", clave);
        Titular t = new Titular("María Pérez", "33444555");

        cuenta.asignarTitular(t);

        System.out.println("Titular de la cuenta OK: " + (cuenta.getTitular() == t));
        System.out.println("Cuenta del titular OK: " + (t.getCuenta() == cuenta));
    }
    
}
