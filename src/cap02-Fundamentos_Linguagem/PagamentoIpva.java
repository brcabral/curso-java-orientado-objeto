import java.util.Scanner;

public class PagamentoIpva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o final da placa: ");
        int finalPlaca = entrada.nextInt();

        switch (finalPlaca) {
            case 1:
                System.out.println("O vencimento é dia 11 de janeiro.");
                break;
            case 2:
                System.out.println("O vencimento é dia 12 de janeiro.");
                break;
            case 3:
                System.out.println("O vencimento é dia 13 de janeiro.");
                break;
            case 4:
                System.out.println("O vencimento é dia 14 de janeiro.");
                break;
            case 5:
                System.out.println("O vencimento é dia 15 de janeiro.");
                break;
            case 6:
                System.out.println("O vencimento é dia 16 de janeiro.");
                break;
            case 7:
                System.out.println("O vencimento é dia 17 de janeiro.");
                break;
            case 8:
                System.out.println("O vencimento é dia 18 de janeiro.");
                break;
            case 9:
                System.out.println("O vencimento é dia 19 de janeiro.");
                break;
            case 0:
                System.out.println("O vencimento é dia 20 de janeiro.");
                break;
            default :
                System.out.println("Final da placa inválido.");
        }
    }   
}
