package curso.joo.interfaces;

import curso.joo.interfaces.caixa.Checkout;
import curso.joo.interfaces.caixa.Compra;
import curso.joo.interfaces.impressao.Impressora;
import curso.joo.interfaces.impressao.impressoras.ImpressoraHp;
import curso.joo.interfaces.pagamento.Cartao;
import curso.joo.interfaces.pagamento.Operadora;
import curso.joo.interfaces.pagamento.operadora.Cielo;

public class TesteCheckout {
    public static void main(String[] args) {
        Operadora operadora = new Cielo();
        Impressora impressora = new ImpressoraHp();

        Cartao cartao = new Cartao();
        cartao.setNomeTitular("Joao M Couves");
        cartao.setNumeroCartao("123456");

        Compra compra = new Compra();
        compra.setNomeCliente("João Mendonça Couves");
        compra.setProduto("Sabonete");
        compra.setValorTotal(2.5);

        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);
    }
}
