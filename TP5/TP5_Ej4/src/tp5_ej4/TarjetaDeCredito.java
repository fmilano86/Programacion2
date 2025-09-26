/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej4;

/**
 *
 * @author Usuario
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; 
    private Banco banco;     

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void asignarCliente(Cliente c) {
        if (c != null) {
            this.cliente = c;
            c.asignarTarjeta(this);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }
}
