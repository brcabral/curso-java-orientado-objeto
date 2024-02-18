import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        String indicacao = (idade >= 18) ? "adulto" : "criança/adolescente";
        System.out.println("Você é um(a): " + indicacao);
    }
}
