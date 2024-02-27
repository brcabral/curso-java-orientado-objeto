package com.algaworks.cursojava.financeiro.modelo;

public class ContaPagar {
    private String descricao;
    private Double valor;
    private String dataVencimento;
    private Fornecedor fornecedor;
    private SituacaoConta situacaoConta;

    public ContaPagar() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this();
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
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

    public void cancelar() {
        if (this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
            this.situacaoConta = SituacaoConta.CANCELADA;
            System.out.println("Conta cancelada!");            
        } else if (this.situacaoConta.equals(SituacaoConta.PAGA)) {
            System.out.println("A conta não pode ser paga pois já foi paga.");
        } else {
            System.out.println("A conta não pode ser paga pois já foi cancelada.");
        }
    }
}
