public class TesteArrayComCarro {
    public static void main(String[] args) {
        Carro[] carros = new Carro[4];

        carros[0] = new Carro();
        carros[0].anoDeFabricacao = 2011;
        System.out.println("Ano fabricação: " + carros[0].anoDeFabricacao);

        Carro carro = new Carro();
        carro.anoDeFabricacao = 2012;
        carros[1] = carro;
        System.out.println("Ano fabricação: " + carros[1].anoDeFabricacao);
    }
}
