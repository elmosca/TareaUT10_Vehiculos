package modelo;
import javafx.beans.property.*;

import java.util.Objects;

public class Industrial extends Vehiculo {
    private DoubleProperty tamanoCaja;

    public Industrial() {
        super();
        this.tamanoCaja = new SimpleDoubleProperty();
    }

    public Industrial(String marca, String modelo, int anoFabricacion, int kms, int potencia, double precio, TipoCombustible combustible, Medidas medidas, double tamanoCaja) {
        super(marca, modelo, anoFabricacion, kms, potencia, precio, combustible, medidas);
        this.tamanoCaja = new SimpleDoubleProperty(tamanoCaja);
    }

    public Industrial(Industrial industrial) {
        super(industrial);
        this.tamanoCaja = industrial.tamanoCaja;
    }

    public double getTamanoCaja() {
        return tamanoCaja.get();
    }

    public DoubleProperty tamanoCajaProperty() {
        return tamanoCaja;
    }

    public void setTamanoCaja(double tamanoCaja) {
        this.tamanoCaja.set(tamanoCaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanoCaja.get());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Industrial industrial = (Industrial) obj;
        return Double.compare(industrial.tamanoCaja.get(), tamanoCaja.get()) == 0;
    }

    @Override
    public String toString() {
        return "Industrial{" +
                "tamanoCaja=" + tamanoCaja.get() +
                "} " + super.toString();
    }
}



