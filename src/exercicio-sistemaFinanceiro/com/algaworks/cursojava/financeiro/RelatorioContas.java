package com.algaworks.cursojava.financeiro;

import com.algaworks.cursojava.financeiro.modelo.Conta;

public class RelatorioContas {
    public void exibirListagem(Conta[] contas) {
        System.out.println("*************************************");
        System.out.println("RELATÓRIO DE CONTAS A PAGAR E RECEBER");
        System.out.println("*************************************");

        for (Conta conta : contas) {
            conta.exibirDetalhes();
        }

        System.out.println("*************************************");
    }
}
