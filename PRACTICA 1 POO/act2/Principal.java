package act2;

import java.util.Scanner;

public class Principal {

    public static Rectangulo rectanguloSobre(Rectangulo A, Rectangulo B) {
        double x1 = Math.max(A.x1, B.x1);
        double y1 = Math.max(A.y1, B.y1);
        double x2 = Math.min(A.x2, B.x2);
        double y2 = Math.min(A.y2, B.y2);

        return new Rectangulo(x1, y1, x2, y2);
    }

    public static void mostrarRectangulo(String nombre, Rectangulo r) {
        System.out.println("Rectangulo " + nombre + " = " + r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectángulo A
        System.out.println("Ingrese una esquina del 1er rectángulo:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Ingrese la esquina opuesta del 1er rectángulo:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Rectangulo A = new Rectangulo(x1, y1, x2, y2);

        // Rectángulo B
        System.out.println("Ingrese una esquina del 2do rectángulo:");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        System.out.println("Ingrese la esquina opuesta del 2do rectángulo:");
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();

        Rectangulo B = new Rectangulo(x3, y3, x4, y4);

        // Mostrar
        mostrarRectangulo("A", A);
        mostrarRectangulo("B", B);

        // Verificar casos
        if (Verificador.seSobreponen(A, B)) {
            System.out.println("Rectangulos A y B se sobreponen");

            Rectangulo inter = rectanguloSobre(A, B);
            System.out.println("Area de sobreposicion = " + inter.calculoArea());

        } else if (Verificador.seJuntan(A, B)) {
            System.out.println("Rectangulos A y B se juntan");

        } else {
            System.out.println("Rectangulos A y B son disjuntos");
        }

        sc.close();
    }
}