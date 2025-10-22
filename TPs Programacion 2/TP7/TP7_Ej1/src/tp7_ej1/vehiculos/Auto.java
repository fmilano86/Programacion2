/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_ej1.vehiculos;

/**
 *
 * @author Usuario
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;
    
    public Auto(String marca, String modelo, int cantidadPuertas){
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+ "Auto{" + "cantidadPuertas=" + cantidadPuertas + '}' ;
    }
    
    public void mostrarInfo(){
        System.out.println(this.toString());
    }
}
