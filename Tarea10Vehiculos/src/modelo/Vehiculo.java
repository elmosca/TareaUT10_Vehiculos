package modelo;

import javafx.beans.property.*;
import java.util.Objects;



public abstract class Vehiculo {
    private StringProperty marca;
    private StringProperty modelo;
    private IntegerProperty anoFabricacion;
    private IntegerProperty kms;
    private IntegerProperty potencia;
    private DoubleProperty precio;
    private ObjectProperty<TipoCombustible> combustible;
    private Medidas medidas;

    // Constructores, getters, setters, hashCode, equals, toString, getPotenciaKW

    //constructor sin parámetros
    public Vehiculo() {
        
    }

    public Vehiculo(String marca, String modelo, int anoFabricacion, int kms, int potencia, double precio, TipoCombustible combustible, Medidas medidas) {
        this.marca = new SimpleStringProperty ( marca );
        this.modelo = new SimpleStringProperty ( modelo );
        this.anoFabricacion = new SimpleIntegerProperty ( anoFabricacion );
        this.kms = new SimpleIntegerProperty ( kms );
        this.potencia = new SimpleIntegerProperty ( potencia );
        this.precio = new SimpleDoubleProperty ( precio );
        this.combustible = new SimpleObjectProperty<> ( combustible );
        this.medidas = medidas;
    }

    public Vehiculo(Vehiculo vehiculo) {
        this.marca = vehiculo.marca;
        this.modelo = vehiculo.modelo;
        this.anoFabricacion = vehiculo.anoFabricacion;
        this.kms = vehiculo.kms;
        this.potencia = vehiculo.potencia;
        this.precio = vehiculo.precio;
        this.combustible = vehiculo.combustible;
        this.medidas = vehiculo.medidas;
    }
    //getters y setters

    public String getMarca() {
        return marca.get ( );
    }

    public StringProperty marcaProperty() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca.set ( marca );
    }

    public String getModelo() {
        return modelo.get ( );
    }

    public StringProperty modeloProperty() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo.set ( modelo );
    }

    public int getAnoFabricacion() {
        return anoFabricacion.get ( );
    }

    public IntegerProperty anoFabricacionProperty() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion.set ( anoFabricacion );
    }

    public int getKms() {
        return kms.get ( );
    }

    public IntegerProperty kmsProperty() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms.set ( kms );
    }

    public int getPotencia() {
        return potencia.get ( );
    }

    public IntegerProperty potenciaProperty() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia.set ( potencia );
    }

    public double getPrecio() {
        return precio.get ( );
    }

    public DoubleProperty precioProperty() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio.set ( precio );
    }

    public TipoCombustible getCombustible() {
        return combustible.get ( );
    }

    public ObjectProperty<TipoCombustible> combustibleProperty() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible.set ( combustible );
    }

    public Medidas getMedidas() {
        return medidas;
    }

    public void setMedidas(Medidas medidas) {
        this.medidas.setAlto ( medidas.getAlto ( ) );
        this.medidas.setAncho ( medidas.getAncho ( ) );
        this.medidas.setLargo ( medidas.getLargo ( ) );
    }

    public int getPotenciaKW() {
        return (int) (this.getPotencia ( ) * 0.735);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca=" + marca +
                ", modelo=" + modelo +
                ", anoFabricacion=" + anoFabricacion +
                ", kms=" + kms +
                ", potencia=" + potencia +
                ", precio=" + precio +
                ", combustible=" + combustible +
                ", medidas=" + medidas +
                '}';
    }
    //equals y hashCode
    @Override
    public int hashCode() {
        return Objects.hash(marca.get(), modelo.get(), anoFabricacion.get(), kms.get(), potencia.get(), precio.get(), combustible.get(), medidas);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) obj;
        return marca.get().equals(vehiculo.marca.get()) &&
                modelo.get().equals(vehiculo.modelo.get()) &&
                anoFabricacion.get() == vehiculo.anoFabricacion.get() &&
                kms.get() == vehiculo.kms.get() &&
                potencia.get() == vehiculo.potencia.get() &&
                precio.get() == vehiculo.precio.get() &&
                combustible.get() == vehiculo.combustible.get() &&
                medidas.equals(vehiculo.medidas);
    }

}
