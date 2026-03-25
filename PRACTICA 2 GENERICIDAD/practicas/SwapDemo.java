package practicas;

import java.util.Arrays;

public class SwapDemo {

    public static <T> void swap(T[] arreglo, int i, int j) {
        if (i < 0 || j < 0 || i >= arreglo.length || j >= arreglo.length)
            throw new IllegalArgumentException("Índices fuera de rango");
        T temp     = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
    }

    public static void main(String[] args) {
        String[]  letras  = {"A", "B", "C", "D"};
        Integer[] numeros = {10, 20, 30, 40};

        swap(letras,  1, 3);
        swap(numeros, 0, 2);

        System.out.println(Arrays.toString(letras));  // [A, D, C, B]
        System.out.println(Arrays.toString(numeros)); // [30, 20, 10, 40]
    }
}