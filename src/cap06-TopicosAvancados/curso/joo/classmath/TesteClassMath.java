package curso.joo.classmath;

import static java.lang.Math.PI;
import static java.lang.Math.min;

public class TesteClassMath {
    public static void main(String[] args) {
        // Comprimento de uma circunferência (2 x r x PI)
        int raio = 4;
        double comprimento = 2 * raio * PI;
        System.out.println("Comprimento da circunferência: " + comprimento);

        // Máximo e mínimo
        double[] precosProdutoA = { 30.20, 25.49 };
        double maiorPreco = Math.max(precosProdutoA[0], precosProdutoA[1]);
        System.out.println("Maior preço: " + maiorPreco);
        System.out.println("Menor preço: " + min(precosProdutoA[0], precosProdutoA[1]));

        // Potência
        System.out.println("Potência (2³): " + Math.pow(2, 3));

        // Raiz quadrada
        System.out.println("Raiz quadrada de 9: " + Math.sqrt(9));

        // Arredondamento ceil, floor e round
        double n = 5.68;
        System.out.println("Maior inteiro: " + Math.ceil(n));
        System.out.println("Menor inteiro: " + Math.floor(n));
        System.out.println("Arredondar: " + Math.round(n));

        // Trigonometria
        System.out.println("Seno: " + Math.sin(40));
        System.out.println("Cos:" + Math.cos(30));

        // Números randomicos
        double numeroAleatorio = Math.random() * 60;
        System.out.println("Número aleatório: " + (int) numeroAleatorio);
    }
}