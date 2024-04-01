package cap11_java8.lambda;

import java.util.List;

import cap11_java8.lambda.dao.FaturaDAO;
import cap11_java8.lambda.modelo.Fatura;

public class ExemploReferenciaMetodos {
    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

        /*
         * for (Fatura f : faturasVencidas) {
         * f.atualizarStatus();
         * }
         */

        // Chama o método atualizarStatus para todas as faturas em faturasVencidas
        faturasVencidas.forEach(Fatura::atualizarStatus);
    }
}
