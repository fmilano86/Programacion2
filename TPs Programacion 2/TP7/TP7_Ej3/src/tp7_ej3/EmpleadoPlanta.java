/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_ej3;

/**
 *
 * @author Usuario
 */
public class EmpleadoPlanta extends Empleado{
    private double sueldoBase;
    private int aniosAntiguedad;

    public EmpleadoPlanta(String nombre, double sueldoBase, int aniosAntiguedad) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (aniosAntiguedad * 5000);
    }
}
