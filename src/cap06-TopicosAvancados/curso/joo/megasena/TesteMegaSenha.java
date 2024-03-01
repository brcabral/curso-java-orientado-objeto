package curso.joo.megasena;

import java.util.Scanner;

public class TesteMegaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos jogos deseja gerar? ");
        int quantidadeJogos = scanner.nextInt();

        MegaSena megaSena = new MegaSena();
        for (int i = 0; i < quantidadeJogos; i++) {
            megaSena.sortearNumeros();

            System.out.print("Numeros sorteados para o " + (i + 1) + "º jogo: ");
            megaSena.exibirNumerosSorteados();
        }

        scanner.close();
    }
}
