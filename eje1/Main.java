package eje1;

public class Main {

    public static void main(String[] args) {

        // Crear contenedor (capacidad 5 por ejemplo)
        ContainerRect cont = new ContainerRect(5);

        // Rectángulos
        Coordenada c1 = new Coordenada(1.5, 0.3);
        Coordenada c2 = new Coordenada(7.6, 2.2);

        Coordenada c3 = new Coordenada(4.0, 4.2);
        Coordenada c4 = new Coordenada(9.4, -2.5);

        Rectangulo r1 = new Rectangulo(c1, c2);
        Rectangulo r2 = new Rectangulo(c3, c4);

        // Agregar al contenedor 
        cont.addRectangulo(r1);
        cont.addRectangulo(r2);

        // Mostrar info básica
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("¿Sobrepuestos?: " + Verificador.esSobrePos(r1, r2));
        System.out.println("¿Juntos?: " + Verificador.esJunto(r1, r2));
        System.out.println("¿Disjuntos?: " + Verificador.esDisjunto(r1, r2));

        //  Mostrar contenedor (LO QUE TE PIDEN)
        System.out.println("\nContenido del contenedor:");
        System.out.println(cont);
    }
}
