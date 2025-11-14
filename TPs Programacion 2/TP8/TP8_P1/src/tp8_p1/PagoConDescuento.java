/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tp8_p1;

import tp8_p1.Pago;

/**
 *
 * @author Usuario
 */
public interface PagoConDescuento extends Pago{
    double aplicarDescuento(double monto);
}
