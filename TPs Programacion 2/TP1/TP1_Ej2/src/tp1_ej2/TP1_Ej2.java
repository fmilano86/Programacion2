/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TP1_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stockActual, nuevoStock, cantidadVendida, cantidadRecibida;
        System.out.println("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida); 
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    static int actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida){
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
}
