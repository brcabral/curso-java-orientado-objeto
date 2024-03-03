package curso.joo.jar_javadoc;

import java.util.Scanner;

/**
 * Essa classe é utilizada para fazer o calculo do IMC O IMC é baseado no peso e
 * altura da pessoa
 * 
 * @author Breno Cabral
 *
 */
public class CalculoIMC {
    /**
     * quando não informado os dados corretamente
     * 
     * @exception IllegalArgumentException
     * 
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println();

        double imc = calcularIMC(peso, altura);
        System.out.println("Seu imc é: " + imc);

        entrada.close();
    }

    /**
     * @deprecated
     */
    public static double informarPeso() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

        entrada.close();

        return peso;
    }

    /**
     * @deprecated
     */
    public static double informarAltura() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        entrada.close();

        return altura;
    }

    /**
     * O método faz o calculo do IMC
     * 
     * @param peso   Peso da pessoa
     * @param altura Altura da pessoa
     * @return valorImc Valor do IMC da pessoa
     */
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
