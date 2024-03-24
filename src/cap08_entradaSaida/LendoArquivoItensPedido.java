package cap08_entradaSaida;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LendoArquivoItensPedido {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("./cap08_entradaSaida/files/itens_pedido.txt")))) {
            Locale localeBrasil = new Locale("pt", "BR");
            scanner.useLocale(localeBrasil);

            NumberFormat formatador = NumberFormat.getCurrencyInstance(localeBrasil);

            scanner.useDelimiter(";");

            while (scanner.hasNext()) {
                String produto = scanner.next();
                int quantidade = scanner.nextInt();
                double valor = scanner.nextDouble();
                scanner.nextLine();

                System.out.printf("Produto: %s. Quantidade: %d. Por: %s\n", produto, quantidade,
                        formatador.format(valor));
            }
        } catch (IOException e) {
            System.err.println("Erro abrindo o arquivo. Erro: " + e.getMessage());
        }
    }
}
