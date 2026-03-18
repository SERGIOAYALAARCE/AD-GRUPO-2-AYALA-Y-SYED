package eje1;

public class ContainerRect {

    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;

    public static int numRec = 0;

    public ContainerRect(int n) {
        this.n = n;
        rectangulos = new Rectangulo[n];
        distancias = new double[n];
        areas = new double[n];
    }

    public void addRectangulo(Rectangulo r) {

        if (numRec < n) {

            rectangulos[numRec] = r;

            // Distancia euclidiana entre esquinas
            distancias[numRec] =
                r.getEsquina1().distancia(r.getEsquina2());

            // Área del rectángulo
            double base = Math.abs(r.getEsquina1().getX() - r.getEsquina2().getX());
            double altura = Math.abs(r.getEsquina1().getY() - r.getEsquina2().getY());
            areas[numRec] = base * altura;

            numRec++;

        } else {
            System.out.println("No es posible guardar más rectángulos");
        }
    }

    @Override
    public String toString() {

        String resultado = "Rectangulo\tCoordenadas\t\tDistancia\tArea\n";

        for (int i = 0; i < numRec; i++) {

            resultado += (i + 1) + " ([" +
                    rectangulos[i].getEsquina1().getX() + ", " +
                    rectangulos[i].getEsquina1().getY() + "], [" +
                    rectangulos[i].getEsquina2().getX() + ", " +
                    rectangulos[i].getEsquina2().getY() + "]) " +
                    String.format("%.3f", distancias[i]) + " " +
                    String.format("%.2f", areas[i]) + "\n";
        }

        return resultado;
    }
}