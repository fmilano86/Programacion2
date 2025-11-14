/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8_p1;

/**
 *
 * @author Usuario
 */
public class TarjetaCredito implements PagoConDescuento {
   private final String numeroEnmascarado;
    private final String titular;
    private final double porcentajeDescuento; // por ejemplo, 10% -> 0.10

    public TarjetaCredito(String numero, String titular, double porcentajeDescuento) {
        if (numero == null || numero.length() < 4) throw new IllegalArgumentException("Número de tarjeta inválido");
        this.numeroEnmascarado = "****-****-****-" + numero.substring(numero.length() - 4);
        this.titular = titular;
        this.porcentajeDescuento = Math.max(0, Math.min(porcentajeDescuento, 1.0));
    }

    @Override
    public String getNombre() { return "Tarjeta de Crédito (" + numeroEnmascarado + ")"; }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1.0 - porcentajeDescuento);
    }

    @Override
    public boolean procesarPago(double monto) {
        // Simulación: aprobamos si el monto es mayor a 0
        System.out.println("[Pago] " + getNombre() + " aprobó $" + String.format("%.2f", monto) + " para " + titular);
        return monto > 0;
    } 
}
