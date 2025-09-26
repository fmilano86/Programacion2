/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej5;

/**
 *
 * @author Usuario
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;   // composición 1–1
    private Propietario propietario; // asociación 1–1

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
    }

    public void asignarPropietario(Propietario p) {
        if (p != null) {
            this.propietario = p;
            p.asignarComputadora(this);
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }
}
