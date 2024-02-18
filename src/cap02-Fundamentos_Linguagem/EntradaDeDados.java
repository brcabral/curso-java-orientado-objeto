import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu peso: ");
        int peso = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("IMC de " + nome + " é: " + imc);
    }
}
