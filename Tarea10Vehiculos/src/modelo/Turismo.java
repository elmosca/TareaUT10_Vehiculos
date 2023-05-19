package modelo;
import javafx.beans.property.*;

import java.util.Objects;

public class Turismo extends Vehiculo {
    private ObjectProperty<TipoCarroceria> tipoCarroceria;

    public Turismo() {
        super();
        this.tipoCarroceria = new SimpleObjectProperty<>();
    }

    public Turismo(String marca, String modelo, int anoFabricacion, int kms, int potencia, double precio, TipoCombustible combustible, Medidas medidas, TipoCarroceria tipoCarroceria) {
        super(marca, modelo, anoFabricacion, kms, potencia, precio, combustible, medidas);
        this.tipoCarroceria = new SimpleObjectProperty<>(tipoCarroceria);
    }

    public Turismo(Turismo turismo) {
        super(turismo);
        this.tipoCarroceria = turismo.tipoCarroceria;
    }

    public TipoCarroceria getTipoCarroceria() {
        return tipoCarroceria.get();
    }

    public ObjectProperty<TipoCarroceria> tipoCarroceriaProperty() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(TipoCarroceria tipoCarroceria) {
        this.tipoCarroceria.set(tipoCarroceria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoCarroceria.get());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Turismo turismo = (Turismo) obj;
        return tipoCarroceria.get() == turismo.tipoCarroceria.get();
    }

    @Override
    public String toString() {
        return "Turismo{" +
                "tipoCarroceria=" + tipoCarroceria.get() +
                "} " + super.toString();
    }
}
