package cap10_java7;

public class ExemploSeparadorDigitosLiterais {
    public static void main(String[] args) {
        long populacaoSaoPaulo = 11_000_000L;
        long populacaoGrandeSaoPaulo = 11_000_000 + 9_000_000;
        System.out.printf("População de São Paulo: %d\n", populacaoSaoPaulo);
        System.out.printf("População da grande São Paulo: %d\n", populacaoGrandeSaoPaulo);

        double precoVeiculo = 200_000.99_1d;
        System.out.printf("Preço veiculo: %.3f\n", precoVeiculo);

        int x = 1___2___3; // Evite usar assim
        int y = 1_2_3;
        System.out.printf("São iguais: %b\n", (x == y));
    }
}
