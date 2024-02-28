package curso.joo.abstrata;

public abstract class Produto {
    String descricao;

    public String getDescricao() {
        return descricao;
    }

    public abstract void imprimirDescricao();
}
