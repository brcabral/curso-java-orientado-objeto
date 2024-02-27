package curso.joo.enums.heranca;

public class TesteHeranca {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        jogador.nome = "Ronaldo";
        jogador.idade = 33;
        jogador.seApresentar();
        jogador.dizerSeAindaJoga();
    }
}
