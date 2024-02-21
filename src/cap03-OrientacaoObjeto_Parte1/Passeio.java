public class Passeio {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "José";

        pessoa.cachorro = new Cachorro();
        pessoa.cachorro.nome = "Bidu";
		pessoa.cachorro.idade = 3;
		pessoa.cachorro.raca = "Boxer";
		pessoa.cachorro.sexo = 'M';

        Caminhada caminhada = new Caminhada();
        caminhada.andar(pessoa);
    }
}
