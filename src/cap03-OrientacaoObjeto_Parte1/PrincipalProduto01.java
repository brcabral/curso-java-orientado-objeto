public class PrincipalProduto01 {
    public static void main(String[] args) {
        // Tipos primitivos são passados por parâmetro como cópia
        double precoProduto = 140.0;

        Produto p = new Produto();
        p.definirPreco(precoProduto);

        System.out.println("Preço do produto: " + precoProduto);
        System.out.println();

		// Objetos são passados por parâmetro como referência
		Preco preco = new Preco();
		preco.valorCustos = 140;

		Produto produto = new Produto();
		produto.definirPreco(preco, 20, 15);

		System.out.println("Valor custos: " + preco.valorCustos);
		System.out.println("Valor impostos: " + preco.valorImpostos);
		System.out.println("Valor lucro: " + preco.valorLucro);
		System.out.println("Preço venda: " + preco.precoVenda);
    }
}
