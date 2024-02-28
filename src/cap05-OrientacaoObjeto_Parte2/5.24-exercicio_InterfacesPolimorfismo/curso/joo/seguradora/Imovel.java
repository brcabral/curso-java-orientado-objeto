package curso.joo.seguradora;

public class Imovel implements Seguravel {
    private double valorMercado;
    private int areaConstruida;

    public Imovel(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = valorMercado * 0.003;
        valorApolice = valorApolice + (areaConstruida * 0.5);
        return valorApolice;
    }

    @Override
    public String obterDescricao() {
        return "Imóvel com área construída de " + areaConstruida + "m2 e valor de mercado " + valorMercado;
    }
}
