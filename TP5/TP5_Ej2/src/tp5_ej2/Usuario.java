/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej2;

/**
 *
 * @author Usuario
 */
public class Usuario {
     private String nombre;
    private String dni;
    private Celular celular; 

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void asignarCelular(Celular c) {
        if (c != null) {
            this.celular = c;
        }
    }

    public Celular getCelular() {
        return celular;
    }
    
    
}
