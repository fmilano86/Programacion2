/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej11;

/**
 *
 * @author Usuario
 */
public class Cancion {
    private String titulo;
    private Artista artista; 

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public Artista getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }
}
