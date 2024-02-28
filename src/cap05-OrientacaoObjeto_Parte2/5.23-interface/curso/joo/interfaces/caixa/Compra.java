package curso.joo.interfaces.caixa;

import curso.joo.interfaces.impressao.Imprimivel;
import curso.joo.interfaces.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {
    private String nomeCliente;
    private String produto;

    private double valorTotal;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String getCabecalhoPagina() {
        return this.getNomeCliente();
    }

    @Override
    public String getCorpoPagina() {
        return this.getProduto() + " -> " + this.getValorTotal();
    }
}
