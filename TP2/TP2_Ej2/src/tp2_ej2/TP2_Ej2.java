/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TP2_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el segundo numero");
        int num2 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el tercer numero");
        int num3 = Integer.parseInt(input.nextLine());

        int mayor = num1; 

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El mayor es: " + mayor);
    }    
}
