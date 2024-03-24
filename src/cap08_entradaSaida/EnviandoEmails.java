package cap08_entradaSaida;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EnviandoEmails {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("./cap08_entradaSaida/files/emails.txt"))) {
            String email = null;
            while ((email = reader.readLine()) != null) {
                System.out.println("Enviando e-mail para: " + email);
            }
        } catch (IOException e) {
            System.err.println("Não foi possível gravar o arquivo." + e.getMessage());
        }
    }
}
