/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej12;

/**
 *
 * @author Usuario
 */
public class Impuesto {
    private String monto;
    private Contribuyente contribuyente; 

    public Impuesto(String monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public String getMonto() {
        return monto;
    }
}
