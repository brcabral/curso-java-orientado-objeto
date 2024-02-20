public class PrincipalCarro02 {
    public static void main(String[] args) {
        Proprietario dono = new Proprietario();
		dono.nome = "João da Silva";
		dono.cpf = "000.000.000-00";
		dono.idade = 25;
		dono.logradouro = "Rua João Pinheiro, 10";
		dono.bairro = "Centro";
		dono.cidade = "Uberlandia";

		Carro meuCarro = new Carro();
		meuCarro.fabricante = "FIAT";
		meuCarro.modelo = "Palio";
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Preto";
		meuCarro.dono = dono;
    }
}
