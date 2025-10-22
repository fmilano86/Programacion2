/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej13;

/**
 *
 * @author Usuario
 */
public class TP2_Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precios[] = new double [5];
        double[] precios2 = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        imprimirRecursivo(precios2, 0);
        
        precios2 [2] = 129.99;
        
        System.out.println("Precios modificados:");
        imprimirRecursivo(precios2, 0);
    }
    
    static void imprimirRecursivo(double[] array, int indice) {
        
        if (indice == array.length) {
            return;
        }
        
        System.out.println("Precio: $" + array[indice]);
        imprimirRecursivo(array, indice + 1);
    }
}
