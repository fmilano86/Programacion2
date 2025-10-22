/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej8;

/**
 *
 * @author Usuario
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; 

    public Documento(String titulo, String contenido, FirmaDigital firma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = firma;
    }

    public FirmaDigital getFirma() {
        return firma;
    }
}
