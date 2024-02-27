package com.algaworks.cursojava.financeiro.modelo;

public class ContaPagar extends Conta {
    private Fornecedor fornecedor;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ContaPagar() {
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        super();
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public void pagar() {
        if (this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
            this.situacaoConta = SituacaoConta.PAGA;

            System.out.println("Pagando conta " + this.descricao + " no valor de "
                    + this.valor + " e vencimento em " + this.dataVencimento
                    + " do fornecedor " + this.fornecedor.getNome() + ".");
        } else if (this.situacaoConta.equals(SituacaoConta.PAGA)) {
            System.out.println("A conta não pode ser paga pois já foi paga.");
        } else {
            System.out.println("A conta não pode ser paga pois está cancelada.");
        }
    }
}
