/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8_p1;

/**
 *
 * @author Usuario
 */
public class Cliente implements Notificable {
    private final String nombre;
    private final String email;

    public Cliente(String nombre, String email) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre inválido");
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public String getEmail()  { return email; }

    @Override
    public void notificar(String mensaje) {
                System.out.println("[Notificación a " + nombre + " <" + email + ">] " + mensaje);
    }
}
