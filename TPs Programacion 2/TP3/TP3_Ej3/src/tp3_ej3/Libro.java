/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej3;

/**
 *
 * @author Usuario
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0){
        this.anioPublicacion = anioPublicacion;
        }
    }  
}
