/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TP2_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, positivos, negativos, ceros;
        positivos = 0;
        negativos = 0;
        ceros = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero");
            num = Integer.parseInt(input.nextLine());
            if (num == 0) {
                ceros += 1;
            }
            if (num > 0) {
                positivos += 1;
            }
            if (num < 0){
                negativos +=1;
            }
        }
        
        System.out.println("Positivos: " + positivos + "\nNegativos: " + negativos + "\nCeros: " + ceros);
    }
}
