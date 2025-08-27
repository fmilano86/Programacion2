/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej9;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TP2_Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, precio, Costoenvio, precioFinal;
        String zona;
        System.out.println("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = input.nextLine();
        Costoenvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envío es: " + Costoenvio);
        precioFinal = calcularPrecioFinal(Costoenvio, precio);
        System.out.println("El total a pagar es: "+ precioFinal);
    }
    
    static double calcularCostoEnvio(double peso, String zona){
        if (zona.equalsIgnoreCase("nacional")){
            return peso * 5;
        }else if(zona.equalsIgnoreCase("internacional")){
            return peso * 10;
        }else{
            System.out.println("Zona inválida. Se asume costo 0.");
            return 0;
        }
    }
        
    static double calcularPrecioFinal(double precio, double Costoenvio){
        return precio + Costoenvio;
    }
}
