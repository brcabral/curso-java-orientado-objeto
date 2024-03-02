package curso.joo.excecoes;

public class TesteExcecoesChecadas {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(100);

        try {
            contaCorrente.sacar(60);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println("Saldo: " + contaCorrente.getSaldo());

        try {
            contaCorrente.sacar(50);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente.");
        } finally {
            System.out.println("Obrigado por utilizar nosso sistema!");
        }

        System.out.println("Saldo final: " + contaCorrente.getSaldo());
    }
}
