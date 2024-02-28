package curso.joo.abstrata;

public class ProdutoPerecivel extends Produto {
    String dataValidade;

    @Override
    public void imprimirDescricao() {
        System.out.println("Descrição: " + super.getDescricao() + ", com vencimento em " + dataValidade);
    }
}
