package modelo;
import javafx.beans.property.*;

import java.util.Objects;

public class Medidas {
    private IntegerProperty alto;
    private IntegerProperty ancho;
    private IntegerProperty largo;

    public Medidas() {
        this.alto = new SimpleIntegerProperty();
        this.ancho = new SimpleIntegerProperty();
        this.largo = new SimpleIntegerProperty();
    }

    public Medidas(int alto, int ancho, int largo) {
        this.alto = new SimpleIntegerProperty(alto);
        this.ancho = new SimpleIntegerProperty(ancho);
        this.largo = new SimpleIntegerProperty(largo);
    }

    public Medidas(Medidas medidas) {
        this.alto = medidas.alto;
        this.ancho = medidas.ancho;
        this.largo = medidas.largo;
    }

    public int getAlto() {
        return alto.get();
    }

    public IntegerProperty altoProperty() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto.set(alto);
    }

    public int getAncho() {
        return ancho.get();
    }

    public IntegerProperty anchoProperty() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho.set(ancho);
    }

    public int getLargo() {
        return largo.get();
    }

    public IntegerProperty largoProperty() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo.set(largo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alto.get(), ancho.get(), largo.get());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Medidas medidas = (Medidas) obj;
        return alto.get() == medidas.alto.get() &&
                ancho.get() == medidas.ancho.get() &&
                largo.get() == medidas.largo.get();
    }

    @Override
    public String toString() {
        return "Medidas{" +
                "alto=" + alto.get() +
                ", ancho=" + ancho.get() +
                ", largo=" + largo.get() +
                '}';
    }
}


