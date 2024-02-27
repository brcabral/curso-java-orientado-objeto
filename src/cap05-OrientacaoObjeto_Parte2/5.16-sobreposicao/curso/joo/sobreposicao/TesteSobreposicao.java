package curso.joo.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {
    public static void main(String[] args) {
        ProdutoPerecivel produto = new ProdutoPerecivel();
		produto.descricao = "Caixa de fósfero";
		produto.dataValidade = new Date();
		produto.identificar();
    }
}
