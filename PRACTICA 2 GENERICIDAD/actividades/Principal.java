package actividades;

public class Principal {
    public static void main(String[] args) {

        // --- Bolsa de Chocolatinas ---
        Bolsa<Chocolatina> bolsaCho = new Bolsa<Chocolatina>(3);
        Chocolatina c  = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);

        System.out.println("--- Chocolatinas ---");
        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }

        // --- Bolsa de Golosinas ---
        Bolsa<Golosina> bolsaGol = new Bolsa<Golosina>(3);
        Golosina g1 = new Golosina("chicle",   10.5);
        Golosina g2 = new Golosina("caramelo", 5.0);
        Golosina g3 = new Golosina("gomita",   8.3);
        bolsaGol.add(g1);
        bolsaGol.add(g2);
        bolsaGol.add(g3);

        System.out.println("--- Golosinas ---");
        for (Golosina golosina : bolsaGol) {
            System.out.println(golosina.getNombre() + " - " + golosina.getPeso() + "g");
        }
    }
}