package practicas;

import java.util.ArrayList;

public class PowerStation<T extends Cargable> {
    private ArrayList<T> dispositivos = new ArrayList<>();

    public void conectar(T dispositivo) {
        dispositivos.add(dispositivo);
    }

    public double calcularConsumoTotal() {
        double total = 0;
        for (T d : dispositivos)
            total += d.getConsumoVatios();
        return total;
    }

    public int buscarDispositivo(T prototipo) {
        for (int i = 0; i < dispositivos.size(); i++)
            if (dispositivos.get(i).equals(prototipo)) return i;
        return -1;
    }

    public void mostrarReporte() {
        System.out.printf("%-10s %-30s %-10s%n", "Posición", "Dispositivo", "Consumo(W)");
        System.out.println("-".repeat(52));
        for (int i = 0; i < dispositivos.size(); i++) {
            System.out.printf("%-10d %-30s %-10.1f%n",
                (i + 1),
                dispositivos.get(i).toString(),
                dispositivos.get(i).getConsumoVatios()
            );
        }
    }
}