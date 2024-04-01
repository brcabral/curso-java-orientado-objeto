package cap11_java8.interfacesFuncionais;

import cap11_java8.interfacesFuncionais.impressao.Impressora;
import cap11_java8.interfacesFuncionais.modelo.Compra;

public class TesteInterfacesFuncionais {
    public static void main(String[] args) {
        /*
         * Impressora impressora = new ImpressoraHP();
         * Compra compra = new Compra("Sabonete", 2.5);
         * impressora.imprimir(compra);
         */

        Impressora impressora = (compra) -> {
            System.out.println("Enviando compra para a impressora HP -> " + compra);
        };

        Compra compra = new Compra("Creme dental", 5.20);
        impressora.imprimir(compra);
    }
}
