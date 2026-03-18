package act1;

public class Main {

    public static void main(String[] args) {

        Coordenada c1 = new Coordenada(1,1);
        Coordenada c2 = new Coordenada(4,4);

        Coordenada c3 = new Coordenada(3,3);
        Coordenada c4 = new Coordenada(6,6);

        Rectangulo r1 = new Rectangulo(c1,c2);
        Rectangulo r2 = new Rectangulo(c3,c4);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("¿Sobrepuestos?: " + Verificador.esSobrePos(r1,r2));
        System.out.println("¿Juntos?: " + Verificador.esJunto(r1,r2));
        System.out.println("¿Disjuntos?: " + Verificador.esDisjunto(r1,r2));

    }
}