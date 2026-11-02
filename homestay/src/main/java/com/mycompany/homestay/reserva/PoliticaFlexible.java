
package com.mycompany.homestay.reserva;
public class PoliticaFlexible implements PoliticaCancelacion {
    @Override
    public double calcularReembolso(double montoTotal) {
        if (!Double.isFinite(montoTotal) || montoTotal < 0) {
            throw new IllegalArgumentException(
                "El monto total no es valido."
            );
        }
        return montoTotal;
    }
}
