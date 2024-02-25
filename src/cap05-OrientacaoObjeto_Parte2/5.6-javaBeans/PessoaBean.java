public class PessoaBean {
    // Atributos privados
    private String nome;
    private int idade;

    // Precisa ter um contrutor default (sem argumentos)
    public PessoaBean() {
    }

    // Métodos getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
