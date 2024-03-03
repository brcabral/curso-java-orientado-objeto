package curso.joo.jar_javadoc;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println();

        double imc = peso / (altura * altura);
        System.out.println("Seu imc é: " + imc);
    }
}
