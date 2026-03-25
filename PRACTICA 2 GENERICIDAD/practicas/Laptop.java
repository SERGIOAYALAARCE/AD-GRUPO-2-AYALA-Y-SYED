package practicas;

public class Laptop implements Cargable {
    private String marca;
    private double consumoVatios;
    private int    nivelBateria;

    public Laptop(String marca, double consumoVatios) {
        this.marca         = marca;
        this.consumoVatios = consumoVatios;
        this.nivelBateria  = 30;
    }

    public String getMarca()               { return marca; }
    public double getConsumoVatios()       { return consumoVatios; }
    public int    getNivelBateria()        { return nivelBateria; }
    public void   cargar(int cantidad)     { nivelBateria = Math.min(100, nivelBateria + cantidad); }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Laptop)) return false;
        Laptop otra = (Laptop) obj;
        return this.marca.equals(otra.marca) && this.consumoVatios == otra.consumoVatios;
    }

    @Override
    public String toString() { return "Laptop[" + marca + ", " + consumoVatios + "W]"; }
}