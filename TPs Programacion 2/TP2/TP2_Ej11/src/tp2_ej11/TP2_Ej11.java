/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej11;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TP2_Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        calcularDescuentoEspecial(precio);
    }
    
    public static void calcularDescuentoEspecial(double precio) {
        
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    static double DESCUENTO_ESPECIAL = 0.10;
    
}
