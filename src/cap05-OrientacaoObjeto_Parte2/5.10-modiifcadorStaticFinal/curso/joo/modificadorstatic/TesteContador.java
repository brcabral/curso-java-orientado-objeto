package curso.joo.modificadorstatic;

public class TesteContador {
    public static void main(String[] args) {
        Contador contador = new Contador();
        System.out.println("Contador: " + Contador.COUNT);

        Contador.COUNT++;
        System.out.println("Contador: " + Contador.COUNT);

        Contador.imprimirContador();
    }
}
