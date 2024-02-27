package curso.joo.enums.baralho;

public enum Naipe {
    ESPADAS("Preta"),
    COPAS("Vermelha"),
    PAUS("Preta"),
    OURO("Vermelha");

    private String cor;

    Naipe(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
}
