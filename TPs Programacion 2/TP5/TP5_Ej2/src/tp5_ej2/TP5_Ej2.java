/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej2;

/**
 *
 * @author Usuario
 */
public class TP5_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bateria b = new Bateria("BT-5000", "5000mAh");
        Celular c = new Celular("356789012345678", "Acme", "X10", b);
        Usuario u = new Usuario("María López", "30111222");

        c.asignarUsuario(u);

        System.out.println("Usuario del celular OK: " + (c.getUsuario() == u));
        System.out.println("Celular del usuario OK: " + (u.getCelular() == c));
    }
    
}
