/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej13;

/**
 *
 * @author Usuario
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); 
        System.out.println("QR generado con valor: " + qr.getValor() +
                           " para usuario: " + qr.getUsuario().getNombre());
    }
}
