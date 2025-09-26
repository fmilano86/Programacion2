/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej1;

/**
 *
 * @author Usuario
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision; 
    private Foto foto;           
    private Titular titular;     

    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }

    public void asignarTitular(Titular t) {
        if (t != null) {
            this.titular = t;
            t.asignarPasaporte(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

}
