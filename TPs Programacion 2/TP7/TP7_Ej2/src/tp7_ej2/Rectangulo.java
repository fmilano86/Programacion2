/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_ej2;

/**
 *
 * @author Usuario
 */
public class Rectangulo extends FiguraGeometrica {
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }    

    @Override
    public double area() {
        return base * altura;
    }
    
}
