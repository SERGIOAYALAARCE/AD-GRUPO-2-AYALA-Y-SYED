package practicas;

public class Smartphone implements Cargable {
    private String modelo;
    private double consumoVatios;
    private int    nivelBateria;

    public Smartphone(String modelo, double consumoVatios) {
        this.modelo        = modelo;
        this.consumoVatios = consumoVatios;
        this.nivelBateria  = 50;
    }

    public String getModelo()              { return modelo; }
    public double getConsumoVatios()       { return consumoVatios; }
    public int    getNivelBateria()        { return nivelBateria; }
    public void   cargar(int cantidad)     { nivelBateria = Math.min(100, nivelBateria + cantidad); }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Smartphone)) return false;
        Smartphone otro = (Smartphone) obj;
        return this.modelo.equals(otro.modelo) && this.consumoVatios == otro.consumoVatios;
    }

    @Override
    public String toString() { return "Smartphone[" + modelo + ", " + consumoVatios + "W]"; }
}