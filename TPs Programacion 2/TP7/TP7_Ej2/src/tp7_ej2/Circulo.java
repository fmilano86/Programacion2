/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_ej2;

/**
 *
 * @author Usuario
 */
public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }
       
    @Override
    public double area() {
        return 3.14 * radio;
    }    
}
