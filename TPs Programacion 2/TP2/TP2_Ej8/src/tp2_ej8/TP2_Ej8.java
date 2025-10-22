/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TP2_Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double PrecioBase, PrecioFinal, impuesto, descuento;
        System.out.println("Ingrese el precio base del producto: ");
        PrecioBase = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):  ");
        impuesto = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = Double.parseDouble(input.nextLine());
        PrecioFinal = calcularPrecioFinal(PrecioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: " + PrecioFinal);
    }
    
    static double calcularPrecioFinal(double PrecioBase, double impuesto, double descuento) {
        
        return PrecioBase + (PrecioBase * (impuesto / 100)) - (PrecioBase * (descuento / 100));
            }
    
}
