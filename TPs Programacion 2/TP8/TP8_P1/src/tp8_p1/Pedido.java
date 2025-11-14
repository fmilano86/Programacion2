/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8_p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author Usuario
 */
public class Pedido implements Pagable {
    private final String codigo;
    private final Cliente cliente;                // Pedido debe notificar al Cliente
    private final List<Producto> productos = new ArrayList<>(); // 1 a N con Producto
    private EstadoPedido estado = EstadoPedido.CREADO;
    private Pago medioPago;                       // Estrategia de pago

    public Pedido(String codigo, Cliente cliente) {
        if (codigo == null || codigo.isBlank()) throw new IllegalArgumentException("Código inválido");
        if (cliente == null) throw new IllegalArgumentException("Cliente requerido");
        this.codigo = codigo;
        this.cliente = cliente;
        notificarCambioEstado(null, this.estado);
    }

    public void agregarProducto(Producto p) {
        if (p == null) throw new IllegalArgumentException("Producto nulo");
        productos.add(p);
    }

    public boolean removerProducto(Producto p) {
        return productos.remove(p);
    }

    public List<Producto> getProductos() {
        return Collections.unmodifiableList(productos);
    }

    public String getCodigo() { return codigo; }
    public EstadoPedido getEstado() { return estado; }

    public void setMedioPago(Pago medioPago) {
        this.medioPago = medioPago;
    }

    private void setEstado(EstadoPedido nuevo) {
        EstadoPedido anterior = this.estado;
        this.estado = nuevo;
        notificarCambioEstado(anterior, nuevo);
    }

    private void notificarCambioEstado(EstadoPedido anterior, EstadoPedido nuevo) {
        String msg = (anterior == null)
                ? "Pedido " + codigo + " creado. Estado: " + nuevo
                : "Pedido " + codigo + " cambió de estado: " + anterior + " -> " + nuevo;
        cliente.notificar(msg);
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    /**
     * Intenta cobrar usando el medio de pago seteado.
     * Si el medio de pago ofrece descuento, se aplica antes de procesar el pago.
     */
    public boolean pagar() {
        if (medioPago == null) throw new IllegalStateException("No hay medio de pago configurado");
        if (productos.isEmpty()) throw new IllegalStateException("El pedido no tiene productos");

        double monto = calcularTotal();

        if (medioPago instanceof PagoConDescuento pcD) {
            double conDesc = pcD.aplicarDescuento(monto);
            cliente.notificar("Se aplicó descuento con " + medioPago.getNombre() + ": $" + String.format("%.2f", monto) + " -> $" + String.format("%.2f", conDesc));
            monto = conDesc;
        }

        boolean ok = medioPago.procesarPago(monto);
        if (ok) {
            setEstado(EstadoPedido.PAGADO);
        } else {
            cliente.notificar("Pago rechazado con " + medioPago.getNombre() + ". Monto: $" + String.format("%.2f", monto));
        }
        return ok;
    }

    public void preparar()   { setEstado(EstadoPedido.EN_PREPARACION); }
    public void enviar()     { setEstado(EstadoPedido.ENVIADO); }
    public void entregar()   { setEstado(EstadoPedido.ENTREGADO); }
    public void cancelar()   { setEstado(EstadoPedido.CANCELADO); }

    @Override
    public String toString() {
        return "Pedido " + codigo + " (" + estado + ") - Total: $" + String.format("%.2f", calcularTotal());
    }
}
