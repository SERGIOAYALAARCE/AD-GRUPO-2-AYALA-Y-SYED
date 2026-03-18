package eje2;

import java.util.HashMap;

public class MapaMinero {

    private Zona[][] mapa;
    private int filas;
    private int columnas;

    public MapaMinero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        mapa = new Zona[filas][columnas];
    }

    public void setZona(int i, int j, Zona z) {
        mapa[i][j] = z;
    }

    public void analizarRegion(int k) {

        double maxValor = -1;
        int mejorFila = 0;
        int mejorCol = 0;

        // recorrer todas las submatrices k x k
        for (int i = 0; i <= filas - k; i++) {
            for (int j = 0; j <= columnas - k; j++) {

                double suma = 0;

                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        suma += mapa[x][y].valorEconomico();
                    }
                }

                if (suma > maxValor) {
                    maxValor = suma;
                    mejorFila = i;
                    mejorCol = j;
                }
            }
        }

        // Mostrar resultados
        System.out.println("Región más valiosa encontrada:\n");
        System.out.println("Posición inicial: (" + mejorFila + ", " + mejorCol + ")");
        System.out.println("Tamaño de la región: " + k + " x " + k + "\n");

        System.out.println("Zonas analizadas:");

        HashMap<String, Integer> contador = new HashMap<>();

        for (int i = mejorFila; i < mejorFila + k; i++) {
            for (int j = mejorCol; j < mejorCol + k; j++) {

                Zona z = mapa[i][j];
                System.out.println(z);

                contador.put(z.getMineral(),
                        contador.getOrDefault(z.getMineral(), 0) + 1);
            }
        }

        System.out.println("\nValor total estimado: " + String.format("%.2f", maxValor));

        // Mineral predominante
        String dominante = "";
        int max = 0;

        for (String m : contador.keySet()) {
            if (contador.get(m) > max) {
                max = contador.get(m);
                dominante = m;
            }
        }

        System.out.println("Mineral predominante en la región: " + dominante);
    }
}