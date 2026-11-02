
package com.mycompany.homestay.reserva;
import com.mycompany.homestay.propiedades.Unidad;
import java.util.Objects;
public class Reserva {
    private String id;
    private Unidad unidad;
    private String estado;
    public Reserva(String id, Unidad unidad) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "El ID no puede estar vacio."
            );
        }
        this.id = id;
        this.unidad = Objects.requireNonNull(
            unidad, "La unidad es obligatoria."
        );
        this.estado = "TEMPORAL";
    }
    public void confirmar() {
        if (!estado.equals("TEMPORAL")) {
            throw new IllegalStateException(
                "La reserva no esta en estado TEMPORAL."
            );
        }
        this.estado = "CONFIRMADA";
    }
    public String getId() {
        return id;
    }
    public Unidad getUnidad() {
        return unidad;
    }
    public String getEstado() {
        return estado;
    }
}
