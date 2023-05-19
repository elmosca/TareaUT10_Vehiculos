package modelo;
import javafx.beans.property.*;

import java.util.Objects;

public class Moto extends Vehiculo {
    private IntegerProperty numRuedas;

    public Moto() {
        super();
        this.numRuedas = new SimpleIntegerProperty();
    }

    public Moto(String marca, String modelo, int anoFabricacion, int kms, int potencia, double precio, TipoCombustible combustible, Medidas medidas, int numRuedas) {
        super(marca, modelo, anoFabricacion, kms, potencia, precio, combustible, medidas);
        this.numRuedas = new SimpleIntegerProperty(numRuedas);
    }

    public Moto(Moto moto) {
        super(moto);
        this.numRuedas = moto.numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas.get();
    }

    public IntegerProperty numRuedasProperty() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas.set(numRuedas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numRuedas.get());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Moto moto = (Moto) obj;
        return numRuedas.get() == moto.numRuedas.get();
    }

    @Override
    public String toString() {
        return "Moto{" +
                "numRuedas=" + numRuedas.get() +
                "} " + super.toString();
    }
}


