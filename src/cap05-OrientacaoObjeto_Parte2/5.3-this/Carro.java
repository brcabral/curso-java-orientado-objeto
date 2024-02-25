public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;

    Proprietario dono; // null

    void ligar() {
        if (modelo != null) {
            System.out.println("Ligando o carro: " + modelo);
        }
    }

    void alterarModelo(String modelo) {
        if (modelo != null) {
            // modelo = modelo;
            this.modelo = modelo;
        }
    }

}
