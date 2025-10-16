/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6_ej3;

/**
 *
 * @author Usuario
 */
public class TP6_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        // 1) Crear al menos 3 profesores y 5 cursos
        Profesor pr1 = new Profesor("P01", "Ana Martínez", "Matemática");
        Profesor pr2 = new Profesor("P02", "Carlos Gómez", "Programación");
        Profesor pr3 = new Profesor("P03", "Laura Pérez", "Estadística");

        Curso c1 = new Curso("MAT101", "Álgebra I");
        Curso c2 = new Curso("PROG1", "Programación I");
        Curso c3 = new Curso("EST101", "Estadística Descriptiva");
        Curso c4 = new Curso("PROG2", "Programación II");
        Curso c5 = new Curso("MAT202", "Análisis II");

        // 2) Agregar profesores y cursos a la universidad
        uni.agregarProfesor(pr1);
        uni.agregarProfesor(pr2);
        uni.agregarProfesor(pr3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3) Asignar profesores a cursos usando asignarProfesorACurso(...)
        uni.asignarProfesorACurso("MAT101", "P01");
        uni.asignarProfesorACurso("PROG1", "P02");
        uni.asignarProfesorACurso("EST101", "P03");
        uni.asignarProfesorACurso("PROG2", "P02");
        uni.asignarProfesorACurso("MAT202", "P01");

        // 4) Listar cursos con su profesor y profesores con sus cursos
        System.out.println("\n(4) Listado de cursos y profesores:");
        uni.listarCursos();
        System.out.println();
        uni.listarProfesores();
        System.out.println();
        pr1.listarCursos();
        pr2.listarCursos();
        pr3.listarCursos();

        // 5) Cambiar el profesor de un curso y verificar sincronización
        System.out.println("\n(5) Cambiar profesor de PROG2 a P03:");
        uni.asignarProfesorACurso("PROG2", "P03");
        pr2.listarCursos(); // PROG2 ya no debería figurar en pr2
        pr3.listarCursos(); // PROG2 debería figurar ahora en pr3

        // 6) Remover un curso y confirmar que ya no aparece en la lista del profesor
        System.out.println("\n(6) Eliminar curso 'MAT101':");
        uni.eliminarCurso("MAT101");
        pr1.listarCursos(); // MAT101 no debería figurar

        // 7) Remover un profesor y dejar profesor = null en sus cursos
        System.out.println("\n(7) Eliminar profesor 'P02':");
        uni.eliminarProfesor("P02");
        uni.listarCursos(); // cursos que tenía P02 deben quedar SIN PROFESOR

        // 8) Reporte: cantidad de cursos por profesor
        System.out.println("\n(8) Reporte cantidad de cursos por profesor:");
        uni.reporteCantidadCursosPorProfesor();
    }
}
    

