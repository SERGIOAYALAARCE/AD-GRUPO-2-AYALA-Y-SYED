package practicas;

public class Golosina {
    private String nombre;
    private double peso;

    public Golosina(String nombre, double peso) {
        this.nombre = nombre;
        this.peso   = peso;
    }

    public String getNombre()          { return this.nombre; }
    public void   setNombre(String n)  { this.nombre = n; }
    public double getPeso()            { return this.peso; }
    public void   setPeso(double p)    { this.peso = p; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Golosina)) return false;
        Golosina otra = (Golosina) obj;
        return this.nombre.equals(otra.nombre) && this.peso == otra.peso;
    }

    @Override
    public String toString() {
        return nombre + " (" + peso + "g)";
    }
}