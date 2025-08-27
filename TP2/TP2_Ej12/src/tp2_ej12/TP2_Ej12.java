/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej12;

/**
 *
 * @author Usuario
 */
public class TP2_Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precios[] = new double [5];
        double[] precios2 = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        imprimirprecios(precios2);
        
        precios2 [2] = 129.99;
        
        System.out.println("Precios modificados:");
        imprimirprecios(precios2);
    }    
    
    static void imprimirprecios(double[] array){
            for (int i = 0; i < array.length; i++){
            double elemento = array[i];
            System.out.println("Precio: $" + elemento);
        }
    }
    
}
