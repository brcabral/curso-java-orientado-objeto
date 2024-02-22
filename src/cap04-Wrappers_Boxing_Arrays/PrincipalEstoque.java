import java.util.Scanner;

public class PrincipalEstoque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Obtém a quantidade de produtos que o usuário deseja informar
        System.out.print("Quantos produtos você deseja inserir? ");
        int quantidadeProdutos = entrada.nextInt();

        // Precisamos dessa linha extra para garantir que uma nova linha seja lida,
        // pois nextInt não lê uma nova linha, mas apenas um número.
        // Fica feio, mas tente não coloca-la para ver o que acontece.
        entrada.nextLine();

        // instancia um objeto da classe Estoque
        Estoque estoque = new Estoque();

        // Instancia um array de produtos com a quantidade de
        // posições que o usuário informou
        estoque.produtos = new Produto[quantidadeProdutos];

        // Percorre todas as posições no array (que estão nulas)
        // e preenche uma por uma com a entrada do teclado do usuário
        for (int i = 0; i < estoque.produtos.length; i++) {
            estoque.produtos[i] = new Produto();

            System.out.println("\n >>> Produto " + i + " <<<");
            System.out.println("------------------------");

            System.out.print("Digite a descrição do produto: ");
            estoque.produtos[i].descricao = entrada.nextLine();

            System.out.print("Digite a quantidade de itens do produto: ");
            estoque.produtos[i].quantidade = entrada.nextInt();
            entrada.nextLine();
        }
        estoque.listarProdutos();

        entrada.close();
    }
}
