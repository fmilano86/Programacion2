/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_ej3;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public ArrayList<Curso> getCursos() { return cursos; }

    // Público: asegura la sincronización llamando a setProfesor del curso
    public void agregarCurso(Curso c) {
        if (c == null) return;
        if (c.getProfesor() != this) {
            c.setProfesor(this); // sincroniza ambos lados
        } else {
            if (!tieneCurso(c)) {
                cursos.add(c);
            }
        }
        System.out.println("Se intentó agregar el curso '" + c.getCodigo() + "' al profesor " + nombre + ".");
    }

    public void eliminarCurso(Curso c) {
        if (c == null) return;
        if (tieneCurso(c)) {
            cursos.remove(c);
        }
        if (c.getProfesor() == this) {
            c.setProfesor(null); // sincroniza ambos lados
        }
        System.out.println("Se intentó eliminar el curso '" + c.getCodigo() + "' del profesor " + nombre + ".");
    }

    // Solo para uso interno desde Curso.setProfesor (evita recursión)
    void agregarCursoInterno(Curso c) {
        if (c == null) return;
        if (!tieneCurso(c)) {
            cursos.add(c);
        }
    }

    // Solo para uso interno desde Curso.setProfesor (evita recursión)
    void eliminarCursoInterno(Curso c) {
        cursos.remove(c);
    }

    boolean tieneCurso(Curso c) {
        return cursos.contains(c);
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor " + nombre + " no dicta cursos actualmente.");
            return;
        }
        System.out.println("Cursos de " + nombre + ":");
        for (int i = 0; i < cursos.size(); i++) {
            Curso cu = cursos.get(i);
            System.out.println(" - " + cu.getCodigo() + " | " + cu.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor{id='" + id + "', nombre='" + nombre + "', especialidad='" + especialidad
                + "', cantCursos=" + cursos.size() + "}");
    }

    @Override
    public String toString() {
        return "Profesor{id='" + id + "', nombre='" + nombre + "', especialidad='" + especialidad + "'}";
    }
}
