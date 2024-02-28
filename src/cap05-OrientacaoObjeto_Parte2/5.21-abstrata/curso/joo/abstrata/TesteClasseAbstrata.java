package curso.joo.abstrata;

public class TesteClasseAbstrata {
    public static void main(String[] args) {
        Produto produto = new ProdutoPerecivel();
        produto.descricao = "Caixa de leite";

        ProdutoPerecivel pp = (ProdutoPerecivel) produto;
        pp.dataValidade = "10/03/2012";

        produto.imprimirDescricao();
    }
}
