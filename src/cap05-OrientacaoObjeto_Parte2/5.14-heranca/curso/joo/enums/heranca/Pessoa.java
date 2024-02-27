package curso.joo.enums.heranca;

public class Pessoa {
    protected String nome;
    protected int idade;

    public void seApresentar() {
        System.out.println("Olá! Eu sou o " + nome + " e tenho " + idade + " anos.");
    }
}
