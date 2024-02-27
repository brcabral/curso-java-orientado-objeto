package curso.joo.polimorfismo;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(4000);
        imprimirSaldo(conta);

        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(3500);
        imprimirSaldo(contaCorrente);

        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(2000);
        imprimirSaldo(contaPoupanca);
    }

    private static void imprimirSaldo(Conta conta) {
        System.out.println("Salda da conta é de R$" + conta.getSaldo());

        if (conta instanceof ContaCorrente) {
            ContaCorrente cc = (ContaCorrente) conta;
            System.out.println("O limite da conta corrente é R$" + cc.getLimite());
        }

        if (conta instanceof ContaPoupanca) {
            ContaPoupanca cp = (ContaPoupanca) conta;
            System.out.println("O rendimento da conta poupança é R$" + cp.getRendimentos());
        }

        System.out.println();
    }
}
