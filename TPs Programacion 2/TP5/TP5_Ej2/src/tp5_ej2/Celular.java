/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej2;

/**
 *
 * @author Usuario
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;  
    private Usuario usuario;  

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void asignarUsuario(Usuario u) {
        if (u != null) {
            this.usuario = u;
            u.asignarCelular(this);
        }
    }
    
    public Usuario getUsuario() {   
        return usuario;
    }
}    
