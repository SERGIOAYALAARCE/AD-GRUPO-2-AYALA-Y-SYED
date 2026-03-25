package practicas;

public class Caja<T> {
    private String color;
    private T objeto;

    public Caja(String color) {
        this.color = color;
    }

    public String getColor()       { return color; }
    public T      getObjeto()      { return objeto; }
    public void   setObjeto(T obj) { this.objeto = obj; }

    @Override
    public String toString() {
        return "Caja[color=" + color + ", objeto=" + objeto + "]";
    }
}