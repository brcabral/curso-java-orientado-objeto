package cap11_java8.lambda;

import java.util.List;

import cap11_java8.lambda.dao.FaturaDAO;
import cap11_java8.lambda.modelo.Fatura;
import cap11_java8.lambda.util.EnviarEmail;

public class ExemploLambda {
    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
        EnviarEmail enviarEmail = new EnviarEmail();

        // Fazendo iteração com foreach
        /*
         * for (Fatura f : faturasVencidas) {
         * enviarEmail.enviar(f.getEmailDevedor(), f.resumo());
         * }
         */

        // Fazendo a iteração com lambda - Apenas 1 método
        /* faturasVencidas.forEach(f -> enviarEmail.enviar(f.getEmailDevedor(), f.resumo())); */

        // Fazendo a iteração com lambda - Mais de 1 método
        faturasVencidas.forEach(f -> {
            enviarEmail.enviar(f.getEmailDevedor(), f.resumo());
            f.setEmailEnviado(true);
        });
    }
}
