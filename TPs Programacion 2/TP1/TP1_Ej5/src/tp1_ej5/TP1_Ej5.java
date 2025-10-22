/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TP1_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, suma, resta, division, multiplicacion;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro numero entero");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        division = num1 / num2;
        multiplicacion = num1 * num2;
        
        System.out.println("Los resultados de los numeros ingresados son: "
                + "\nsuma = " + suma + "\nresta = " + resta + "\ndivision = " 
                + division + "\nmultiplicacion = " + multiplicacion);
        
    }
    
}
