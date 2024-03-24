package cap08_entradaSaida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmails {
    public static void main(String[] args) {
        String[] emails = { "joao2@localhost.com", "maria2@localhost.com", "ricardo2@localhost.com" };

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("./cap08_entradaSaida/files/emails.txt", true))) {
            for (String email : emails) {
                writer.write(email);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Não foi possível gravar o arquivo." + e.getMessage());
        }

        try (PrintStream writer = new PrintStream("./cap08_entradaSaida/files/emails2.txt")) {
            for (String email : emails) {
                writer.println(email);
            }
        } catch (IOException e) {
            System.err.println("Não foi possível gravar o arquivo." + e.getMessage());
        }
    }
}