package cap11_java8.lambda;

import java.util.List;
import java.util.stream.Stream;

import cap11_java8.lambda.dao.FaturaDAO;
import cap11_java8.lambda.modelo.Fatura;

public class ExemploStream {
    public static void main(String[] args) {
        List<Fatura> faturas = new FaturaDAO().buscarFaturasVencidas();

        /*
         * for (Fatura fatura : faturas) {
         * if (fatura.getValor() >= 250.0) {
         * System.out.println("Alerta: Fatura acima de R$250.0 -> " + fatura);
         * }
         * }
         */

        Stream<Fatura> streamFatura = faturas.stream().filter(fatura -> fatura.getValor() >= 250);
        System.out.println(">>> streamFatura <<<");
        streamFatura.forEach(f -> System.out.println(f));

        // A lista original não é alterada quando usamos o stream
        System.out.println(">>> faturas <<< ");
        faturas.forEach(f -> System.out.println(f));

        System.out.println();

        // Adicionando o filtro e imprimindo as faturas em risco usando lambda
        faturas.stream()
                .filter(fatura -> fatura.getValor() > 250)
                .forEach(f -> System.out.println(f));

        System.out.println();

        // Adicionando o filtro e imprimindo as faturas em risco usando interfaces funcionais
        faturas.stream()
                .filter(Fatura::estaoEmRisco)
                .forEach(System.out::println);
    }
}
