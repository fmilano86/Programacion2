/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8_p1;

/**
 *
 * @author Usuario
 */
public class TP8_P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli = new Cliente("Facundo", "facu@mail.com");

        Pedido pedido = new Pedido("PED-001", cli);
        pedido.agregarProducto(new Producto("Teclado Mecánico", 45000));
        pedido.agregarProducto(new Producto("Mouse Inalámbrico", 22000));
        pedido.agregarProducto(new Producto("Pad XL", 12000));

        System.out.println(pedido); // antes de pagar

        // Elegimos medio de pago con descuento (10%)
        pedido.setMedioPago(new TarjetaCredito("1234567812345678", "Facundo Milano", 0.10));
        pedido.pagar();          // notifica cambio de estado a PAGADO
        pedido.preparar();       // notifica
        pedido.enviar();         // notifica
        pedido.entregar();       // notifica

        System.out.println(pedido); // al final
    }
}
    

