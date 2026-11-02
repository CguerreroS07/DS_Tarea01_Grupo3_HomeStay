package com.mycompany.homestay.reserva;
public class PasarelaPagoExterna implements PasarelaPago {
    @Override
    public boolean cobrar(double monto) {
        if (!Double.isFinite(monto) || monto <= 0) {
            System.out.println("Monto de pago invalido.");
            return false;
        }
        System.out.println(
            "Cobrando $" + monto + " mediante pasarela externa."
        );
        return true;
    }
}
