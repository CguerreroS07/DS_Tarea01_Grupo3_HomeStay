
package com.mycompany.homestay.reserva;
import com.mycompany.homestay.propiedades.Unidad;
import com.mycompany.homestay.busqueda.Periodo;
import java.util.Objects;
import java.util.UUID;
public class ServicioReserva {
    private final ServicioPago servicioPago;
    public ServicioReserva(ServicioPago servicioPago) {
        this.servicioPago = Objects.requireNonNull(
            servicioPago, "El servicio de pago es obligatorio."
        );
    }
    public Reserva crearReservaTemporal(Unidad u, Periodo p) {
        Objects.requireNonNull(
            u, "La unidad es obligatoria."
        );
        Objects.requireNonNull(
            p, "El periodo es obligatorio."
        );
        String id = UUID.randomUUID().toString();
        return new Reserva(id, u);
    }
    public void confirmarReserva(Reserva r, double monto) {
        Objects.requireNonNull(
            r, "La reserva es obligatoria."
        );
        if (!r.getEstado().equals("TEMPORAL")) {
            throw new IllegalStateException(
                "La reserva no se puede confirmar."
            );
        }
        if (servicioPago.procesarPago(r, monto)) {
            r.confirmar();
            System.out.println(
                "Reserva confirmada exitosamente."
            );
        } else {
            System.out.println(
                "El pago fue rechazado. La reserva no se confirmo."
            );
        }
    }
}
