package practicas;

public class TestGen {

    static <T> boolean exist(T[] arreglo, T elemento) {
        for (T item : arreglo) {
            if (item.equals(elemento))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[]  v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};

        System.out.println(exist(v, "Sanchez")); // true
        System.out.println(exist(w, 34));        // true
        System.out.println(exist(v, "Lopez"));   // false

        // System.out.println(exist(w, "Salas")); // Error intencional - tipos incompatibles

        // Prueba con Golosina
        Golosina[] golosinas = {
            new Golosina("chicle",   10.5),
            new Golosina("caramelo", 5.0),
            new Golosina("gomita",   8.3)
        };
        Golosina buscar = new Golosina("caramelo", 5.0);
        System.out.println(exist(golosinas, buscar)); // true si equals está implementado

        // Prueba con Chocolatina
        Chocolatina[] chocolatinas = {
            new Chocolatina("milka"),
            new Chocolatina("ferrero")
        };
        Chocolatina buscarCho = new Chocolatina("milka");
        System.out.println(exist(chocolatinas, buscarCho)); // true si equals está implementado
    }
}