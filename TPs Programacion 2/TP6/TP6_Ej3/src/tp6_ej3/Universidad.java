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
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        if (p == null) return;
        if (!profesores.contains(p)) {
            profesores.add(p);
            System.out.println("Profesor agregado: " + p.getNombre());
        } else {
            System.out.println("El profesor ya estaba en la universidad.");
        }
    }

    public void agregarCurso(Curso c) {
        if (c == null) return;
        if (!cursos.contains(c)) {
            cursos.add(c);
            System.out.println("Curso agregado: " + c.getCodigo() + " - " + c.getNombre());
        } else {
            System.out.println("El curso ya estaba en la universidad.");
        }
    }

    // Busca e IMPRIME el resultado dentro del método
    public Profesor buscarProfesorPorId(String id) {
        int i = 0;
        Profesor encontrado = null;
        while (encontrado == null && i < profesores.size()) {
            Profesor actual = profesores.get(i);
            if (actual.getId().equalsIgnoreCase(id)) {
                encontrado = actual;
            }
            i++;
        }
        if (encontrado != null) {
            System.out.println("Profesor encontrado: " + encontrado.getNombre() + " (id=" + id + ")");
        } else {
            System.out.println("No se encontró profesor con id " + id + ".");
        }
        return encontrado;
    }

    // Busca e IMPRIME el resultado dentro del método
    public Curso buscarCursoPorCodigo(String codigo) {
        int i = 0;
        Curso encontrado = null;
        while (encontrado == null && i < cursos.size()) {
            Curso actual = cursos.get(i);
            if (actual.getCodigo().equalsIgnoreCase(codigo)) {
                encontrado = actual;
            }
            i++;
        }
        if (encontrado != null) {
            System.out.println("Curso encontrado: " + encontrado.getCodigo() + " - " + encontrado.getNombre());
        } else {
            System.out.println("No se encontró curso con código " + codigo + ".");
        }
        return encontrado;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c != null && p != null) {
            c.setProfesor(p); // sincroniza ambos lados
        } else {
            System.out.println("No se pudo asignar: verifique que existan curso y profesor.");
        }
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        System.out.println("Profesores en '" + nombre + "':");
        for (int i = 0; i < profesores.size(); i++) {
            profesores.get(i).mostrarInfo();
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }
        System.out.println("Cursos en '" + nombre + "':");
        for (int i = 0; i < cursos.size(); i++) {
            cursos.get(i).mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.setProfesor(null); // rompe la relación del lado del curso y del profesor
            }
            cursos.remove(c);
            System.out.println("Curso eliminado: " + codigo);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // dejar profesor = null en todos los cursos que dictaba
            ArrayList<Curso> cursosACero = new ArrayList<>(p.getCursos());
            for (int i = 0; i < cursosACero.size(); i++) {
                cursosACero.get(i).setProfesor(null);
            }
            profesores.remove(p);
            System.out.println("Profesor eliminado: " + id);
        }
    }

    public void reporteCantidadCursosPorProfesor() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores para el reporte.");
            return;
        }
        System.out.println("Reporte: Cantidad de cursos por profesor");
        for (int i = 0; i < profesores.size(); i++) {
            Profesor p = profesores.get(i);
            System.out.println(" - " + p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
        }
    }
}
