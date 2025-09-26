/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej9;

/**
 *
 * @author Usuario
 */
public class TP5_Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente p = new Paciente("Jorge Ramírez", "OSDE");
        Profesional pr = new Profesional("Dra. Gómez", "Cardiología");
        CitaMedica c = new CitaMedica("2025-10-01", "09:00", p, pr);

        System.out.println("Paciente de la cita OK: " + (c.getPaciente() == p));
        System.out.println("Profesional de la cita OK: " + (c.getProfesional() == pr));
    }
    
}
