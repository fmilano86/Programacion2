/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TP2_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, suma_pares;
        suma_pares = 0;
        
        System.out.println("Ingrese un número (0 para terminar): ");
        num = Integer.parseInt(input.nextLine());
        
        while (num !=0) {
            if (num % 2 == 0){
               suma_pares = suma_pares + num; 
            }
            System.out.println("Ingrese un número (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("La suma de los números pares es: " + suma_pares);
    }
    
}
