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

    public void receber() throws OperacaoContaException {
        if (this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
            this.situacaoConta = SituacaoConta.PAGA;

            System.out.println("Recebendo a conta " + this.descricao + " no valor de "
                    + this.valor + " e vencimento em " + this.dataVencimento
                    + " do cliente " + this.cliente.getNome() + ".");

        } else if (this.situacaoConta.equals(SituacaoConta.PAGA)) {
            throw new OperacaoContaException("A conta não pode ser recebida pois já foi recebida.");
        } else {
            throw new OperacaoContaException("A conta não pode ser recebida pois está cancelada.");
        }
    }

    public void cancelar() throws OperacaoContaException {
        if (this.valor < 50000d) {
            super.cancelar();
        } else {
            throw new OperacaoContaException("A conta não pode ser cancelada pois o valor dela é superior a R$ 50 mil");
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nConta a Receber");
        System.out.println("===================================");
        System.out.println("Cliente: " + this.getCliente().getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Data de vencimento: " + this.getDataVencimento());
        System.out.println("Situação: " + this.getSituacaoConta());
        System.out.println("===================================");
    }
}
