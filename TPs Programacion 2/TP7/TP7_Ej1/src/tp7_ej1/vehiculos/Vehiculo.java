/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_ej1.vehiculos;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String marca, String modelo) {
        this.marca= marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
      
    
    public void mostrarInfo(){
        System.out.println(this.toString());
    }
}
