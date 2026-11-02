package com.mycompany.homestay.reserva;
import java.util.Objects;
public class ServicioPago {
    private final PasarelaPago pasarela;
    public ServicioPago(PasarelaPago pasarela) {
        this.pasarela = Objects.requireNonNull(
            pasarela, "La pasarela es obligatoria."
        );
    }
    public boolean procesarPago(Reserva r, double monto) {
        if (r == null) {
            throw new IllegalArgumentException(
                "La reserva no puede ser nula."
            );
        }
        if (!Double.isFinite(monto) || monto <= 0) {
            return false;
        }
        if (!r.getEstado().equals("TEMPORAL")) {
            return false;
        }
        return pasarela.cobrar(monto);
    }
}
