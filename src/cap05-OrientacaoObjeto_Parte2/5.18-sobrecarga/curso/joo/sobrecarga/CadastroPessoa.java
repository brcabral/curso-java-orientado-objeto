package curso.joo.sobrecarga;

public class CadastroPessoa {
    private void armazenar(String nome, int idade) {
        // Salva no banco de dados...
        System.out.println("Salvando: " + nome + " com " + idade + " anos.");
    }

    public void cadastrar(Pessoa pessoa) {
        armazenar(pessoa.getNome(), pessoa.getIdade());
    }

    public void cadastrar(String nome, int idade) {
        armazenar(nome, idade);
    }

    public void cadastrar(String nome) {
        armazenar(nome, 0);
    }
}
