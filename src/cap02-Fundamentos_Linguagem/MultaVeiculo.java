import java.util.Scanner;

public class MultaVeiculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Tipo do veículo (passeio ou caminhão): ");
        String tipoVeiculo = entrada.nextLine();

        System.out.print("Qual a velocidade máxima da via? ");
        int velocidadeMaxima = entrada.nextInt();

        System.out.print("Qual a velocidade do veículo? ");
        int velocidadeVeiculo = entrada.nextInt();

        /*
            veículo de passeio com velocidade maior que 10% da velocidade da via
            e caminhao com velocidade maior que 5% deve receber multa
        */

        if ((tipoVeiculo.equals("passeio")) && (velocidadeVeiculo > velocidadeMaxima * 1.1)) {
            System.out.println("O veículo será multado.");
        } else if ((tipoVeiculo.equals("caminhao")) && (velocidadeVeiculo > velocidadeMaxima * 1.05)) {
            System.out.println("O caminhão será multado.");
        }

    }
}