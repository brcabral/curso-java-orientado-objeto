package com.algaworks.cursojava.financeiro.modelo;

public abstract class Conta {
    protected String descricao;
    protected Double valor;
    protected String dataVencimento;
    protected SituacaoConta situacaoConta;

    public Conta() {
        this.situacaoConta = SituacaoConta.PENDENTE;
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

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public abstract void exibirDetalhes();

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
