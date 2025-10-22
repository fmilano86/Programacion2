/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TP2_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese la categoria del producto [A, B o C]: ");
        char categoria = input.nextLine().charAt(0);
        double precio_final;
        
        switch (categoria) {
            case 'A':
            case 'a':
                precio_final = precio * 0.9;
                System.out.println("Descuento aplicado: %10\nPrecio final:  " + precio_final);
                break;
                
            case 'B':
            case 'b':
                precio_final = precio * 0.85;
                System.out.println("Descuento aplicado: %15\nPrecio final:  " + precio_final);
                break;
                
            case 'C':
            case 'c':
                precio_final = precio * 0.8;
                System.out.println("Descuento aplicado: %20\nPrecio final:  " + precio_final);
                break;
                
            default:
                throw new AssertionError("La categoria de producto no es válida.");
        }
                
               
        
    }
    
}
