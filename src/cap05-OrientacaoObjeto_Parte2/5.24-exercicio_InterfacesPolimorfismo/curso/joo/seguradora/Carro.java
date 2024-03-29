package curso.joo.seguradora;

public class Carro implements Seguravel {
    private double valorMercado;
    private int anoFabricacao;

    public Carro(double valorMercado, int anoFabricacao) {
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = valorMercado * 0.04;
        if (anoFabricacao < 2000) {
            valorApolice = valorApolice * 0.90;
        }

        return valorApolice;
    }

    @Override
    public String obterDescricao() {
        return "Carro ano " + anoFabricacao + " com valor de mercado " + valorMercado;
    }
}
