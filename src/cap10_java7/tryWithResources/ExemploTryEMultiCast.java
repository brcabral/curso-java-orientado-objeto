package cap10_java7.tryWithResources;

import java.util.Scanner;

public class ExemploTryEMultiCast {
    public static void main(String[] args) {
        // Try with resources
        // Caso a classe precisar ser fechada, ela será fechada automaticamente
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = entrada.nextLine();

            System.out.print("Digite sua idade: ");
            String idade = entrada.nextLine();

            // Multi catch
            // Caso a exceções forem ter o mesmo tratamento, pode separá-las por pipe
            try {
                SalvarAluno.salvar(nome, idade);
            } catch (NegocioException | NumberFormatException e) {
                System.err.println("Impossível completar operação. Motivo: " + e.getMessage());
            }
        }
    }
}
