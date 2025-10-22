/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej12;

/**
 *
 * @author Usuario
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de monto: " + impuesto.getMonto() +
                           " para contribuyente: " + impuesto.getContribuyente().getNombre());
    }
}
