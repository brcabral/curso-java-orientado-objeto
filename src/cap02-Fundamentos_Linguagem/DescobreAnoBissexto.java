import java.util.Scanner;

public class DescobreAnoBissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o ano: ");
        int ano = entrada.nextInt();

        if (ano % 400 == 0) {  // Todos os anos múltiplos de 400 são bissextos
            System.out.println("O ano " + ano + " é bissexto.");
        } else if (ano % 4 == 0) { // Um ano múltiplo de 4 e não múltiplo de 100 é bissexto
            if (ano % 100 != 0) {
                System.out.println("O ano " + ano + " é bissexto.");
            } else {
                System.out.println("O ano " + ano + " não é bissexto.");
            }
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}
