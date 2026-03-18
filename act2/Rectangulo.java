package act2;

public class Rectangulo {
    double x1, y1, x2, y2;

    public Rectangulo(double x1, double y1, double x2, double y2) {
        // Normalizar coordenadas
        this.x1 = Math.min(x1, x2);
        this.y1 = Math.min(y1, y2);
        this.x2 = Math.max(x1, x2);
        this.y2 = Math.max(y1, y2);
    }

    public double calculoArea() {
        return (x2 - x1) * (y2 - y1);
    }

    @Override
    public String toString() {
        return "[(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")]";
    }
}