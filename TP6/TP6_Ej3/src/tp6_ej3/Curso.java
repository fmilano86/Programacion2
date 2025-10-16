/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_ej3;

/**
 *
 * @author Usuario
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // responsable

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    // Sincroniza ambos lados (invariante de asociación)
    public void setProfesor(Profesor p) {
        if (this.profesor == p) {
            System.out.println("El curso '" + codigo + "' ya tenía asignado ese profesor.");
            return;
        }

        Profesor anterior = this.profesor;
        this.profesor = p;

        if (anterior != null) {
            anterior.eliminarCursoInterno(this);
        }
        if (p != null) {
            p.agregarCursoInterno(this);
            System.out.println("Asignado profesor '" + p.getNombre() + "' al curso '" + codigo + "'.");
        } else {
            System.out.println("Se removió el profesor del curso '" + codigo + "'.");
        }
    }

    public void mostrarInfo() {
        String prof = (profesor != null) ? profesor.getNombre() : "SIN PROFESOR";
        System.out.println("Curso{codigo='" + codigo + "', nombre='" + nombre + "', profesor=" + prof + "}");
    }

    @Override
    public String toString() {
        return "Curso{codigo='" + codigo + "', nombre='" + nombre + "'}";
    }
}
