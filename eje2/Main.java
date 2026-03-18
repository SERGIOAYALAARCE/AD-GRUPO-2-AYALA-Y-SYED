package eje2;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new File("datos.txt"));

            int filas = sc.nextInt();
            int columnas = sc.nextInt();

            MapaMinero mapa = new MapaMinero(filas, columnas);

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {

                    String mineral = sc.next();
                    double cantidad = sc.nextDouble();
                    double pureza = sc.nextDouble();

                    mapa.setZona(i, j, new Zona(mineral, cantidad, pureza));
                }
            }

            sc.close();

            int k = 2; // tamaño de subregión (puedes pedirlo por teclado)

            mapa.analizarRegion(k);

        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
}