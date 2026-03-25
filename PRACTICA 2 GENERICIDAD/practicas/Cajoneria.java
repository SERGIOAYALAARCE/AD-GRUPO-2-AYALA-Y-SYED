package practicas;

import java.util.ArrayList;

public class Cajoneria<T> {
    private ArrayList<Caja<T>> cajas = new ArrayList<>();
    private int tope;

    public Cajoneria(int tope) {
        this.tope = tope;
    }

    public void add(String color, T objeto) {
        if (cajas.size() < tope) {
            Caja<T> caja = new Caja<>(color);
            caja.setObjeto(objeto);
            cajas.add(caja);
        } else {
            throw new RuntimeException("no caben más cajas");
        }
    }

    // Ejercicio 4.1 — search
    public String search(T elemento) {
        for (int i = 0; i < cajas.size(); i++) {
            if (cajas.get(i).getObjeto().equals(elemento)) {
                return "Posición: " + (i + 1) + ", Color: " + cajas.get(i).getColor();
            }
        }
        return "Elemento no encontrado";
    }

    // Ejercicio 4.2 — delete
    public T delete(T elemento) {
        for (int i = 0; i < cajas.size(); i++) {
            if (cajas.get(i).getObjeto().equals(elemento)) {
                T obj = cajas.get(i).getObjeto();
                cajas.remove(i);
                return obj;
            }
        }
        return null;
    }

    // Ejercicio 4.3 — toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s %-15s %-20s%n", "Posición", "Color Caja", "Objeto"));
        sb.append("-".repeat(45)).append("\n");
        for (int i = 0; i < cajas.size(); i++) {
            sb.append(String.format("%-10d %-15s %-20s%n",
                (i + 1),
                cajas.get(i).getColor(),
                cajas.get(i).getObjeto().toString()
            ));
        }
        return sb.toString();
    }

    // Ejercicio 6 — contar
    public int contar(T elemento) {
        int count = 0;
        for (Caja<T> caja : cajas) {
            if (caja.getObjeto().equals(elemento))
                count++;
        }
        return count;
    }
}