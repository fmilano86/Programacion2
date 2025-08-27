/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, division;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        num1 = Double.parseDouble (input.nextLine());
        System.out.println("Ingrese otro numero: ");
        num2 = Double.parseDouble (input.nextLine());
        division = num1 / num2;
        System.out.println("El resultado de la division de los numeros ingresados es " +  division);
    }
    
}
