/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8_p1;

/**
 *
 * @author Usuario
 */
public class PayPal implements Pago{
    private final String cuentaEmail;
    private final double fee; // por ejemplo 2% -> 0.02

    public PayPal(String cuentaEmail, double fee) {
        if (cuentaEmail == null || cuentaEmail.isBlank()) throw new IllegalArgumentException("Cuenta PayPal inválida");
        this.cuentaEmail = cuentaEmail;
        this.fee = Math.max(0, Math.min(fee, 1.0));
    }

    @Override
    public String getNombre() { return "PayPal (" + cuentaEmail + ")"; }

    @Override
    public boolean procesarPago(double monto) {
        double totalConFee = monto * (1.0 + fee);
        System.out.println("[Pago] " + getNombre() + " cobró $" + String.format("%.2f", totalConFee) + " (monto $" + String.format("%.2f", monto) + " + fee " + (int)(fee*100) + "%)");
        return monto > 0;
    }
}
