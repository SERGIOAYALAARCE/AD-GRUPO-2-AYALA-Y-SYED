package practicas;

public class TestGen567 {

    // Ejercicio 1 — método exist
    static <T> boolean exist(T[] arreglo, T elemento) {
        for (T item : arreglo)
            if (item.equals(elemento)) return true;
        return false;
    }

    public static void main(String[] args) {

        // ---- Ejercicio 1 ----
        String[]  v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};
        System.out.println(exist(v, "Sanchez")); // true
        System.out.println(exist(w, 34));        // true

        // ---- Ejercicio 5 — Cajoneria de Golosinas ----
        System.out.println("\n=== Cajoneria de Golosinas ===");
        Cajoneria<Golosina> cajGolosinas = new Cajoneria<>(6);
        cajGolosinas.add("Rojo",     new Golosina("chicle",   10.5));
        cajGolosinas.add("Amarillo", new Golosina("caramelo", 5.0));
        cajGolosinas.add("Verde",    new Golosina("gomita",   8.3));
        cajGolosinas.add("Azul",     new Golosina("chicle",   10.5)); // duplicado para contar
        cajGolosinas.add("Blanco",   new Golosina("paleta",   15.0));
        cajGolosinas.add("Negro",    new Golosina("goma",     3.2));

        System.out.println(cajGolosinas);

        // search
        System.out.println("Buscar caramelo: " + cajGolosinas.search(new Golosina("caramelo", 5.0)));

        // delete
        Golosina eliminada = cajGolosinas.delete(new Golosina("gomita", 8.3));
        System.out.println("Eliminada: " + eliminada);
        System.out.println(cajGolosinas);

        // contar (ejercicio 6)
        System.out.println("Cantidad de chicle 10.5g: " + cajGolosinas.contar(new Golosina("chicle", 10.5)));

        // ---- Ejercicio 7 — Cajoneria de Chocolatinas ----
        System.out.println("\n=== Cajoneria de Chocolatinas ===");
        Cajoneria<Chocolatina> cajChocolatinas = new Cajoneria<>(4);
        cajChocolatinas.add("Rojo",     new Chocolatina("milka"));
        cajChocolatinas.add("Amarillo", new Chocolatina("ferrero"));
        cajChocolatinas.add("Verde",    new Chocolatina("milka")); // duplicado
        cajChocolatinas.add("Azul",     new Chocolatina("snickers"));

        System.out.println(cajChocolatinas);

        System.out.println("Buscar ferrero: " + cajChocolatinas.search(new Chocolatina("ferrero")));

        Chocolatina elimChoc = cajChocolatinas.delete(new Chocolatina("snickers"));
        System.out.println("Eliminada: " + elimChoc);

        System.out.println("Cantidad de milka: " + cajChocolatinas.contar(new Chocolatina("milka")));
    }
}