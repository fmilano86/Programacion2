/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_ej2;

/**
 *
 * @author Usuario
 */
public abstract class FiguraGeometrica {
    private String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public abstract double area();
}
