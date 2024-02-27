package com.algaworks.cursojava.financeiro.modelo;

public class ContaReceber extends Conta {
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ContaReceber() {
    }

    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        super();
        this.cliente = cliente;
        super.descricao = descricao;
        super.valor = valor;
        super.dataVencimento = dataVencimento;
    }

    public void receber() {
        if (this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
            this.situacaoConta = SituacaoConta.PAGA;

            System.out.println("Recebendo a conta " + this.descricao + " no valor de "
                    + this.valor + " e vencimento em " + this.dataVencimento
                    + " do cliente " + this.cliente.getNome() + ".");

        } else if (this.situacaoConta.equals(SituacaoConta.PAGA)) {
            System.out.println("A conta não pode ser recebida pois já foi recebida.");
        } else {
            System.out.println("A conta não pode ser recebida pois está cancelada.");
        }
    }

    public void cancelar() {
        if (this.valor < 50000d) {
            super.cancelar();
        } else {
            System.out.println("A conta não pode ser cancelada pois o valor dela é superior a R$ 50 mil");
        }
    }
}
