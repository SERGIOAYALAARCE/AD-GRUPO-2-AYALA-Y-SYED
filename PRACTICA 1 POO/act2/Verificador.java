package act2;

public class Verificador {

    public static boolean seSobreponen(Rectangulo A, Rectangulo B) {
        return Math.max(A.x1, B.x1) < Math.min(A.x2, B.x2) &&
               Math.max(A.y1, B.y1) < Math.min(A.y2, B.y2);
    }

    public static boolean seJuntan(Rectangulo A, Rectangulo B) {
        boolean tocanX = Math.max(A.x1, B.x1) == Math.min(A.x2, B.x2) &&
                         Math.max(A.y1, B.y1) < Math.min(A.y2, B.y2);

        boolean tocanY = Math.max(A.y1, B.y1) == Math.min(A.y2, B.y2) &&
                         Math.max(A.x1, B.x1) < Math.min(A.x2, B.x2);

        return tocanX || tocanY;
    }

    public static boolean sonDisjuntos(Rectangulo A, Rectangulo B) {
        return A.x2 < B.x1 || B.x2 < A.x1 ||
               A.y2 < B.y1 || B.y2 < A.y1;
    }
}