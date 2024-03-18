package curso.joo.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LendoArquivoProperties {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("./cap07-Detalhe_Framework/curso/joo/properties/config/config.properties"));

        // Conectar no banco de dados...
        String url = properties.getProperty("banco.dados.url");
        String usuario = properties.getProperty("banco.dados.usuario");
        String senha = properties.getProperty("banco.dados.senha");

        System.out.printf("Conectando no banco de dados: %s, com o usuário: %s\n", url, usuario);

        try {
            // Imagina que o erro ocorreu devido a uma configuração errada do banco de dados
            int x = 5 / 0;
        } catch (Exception e) {
            // Se acontecer algum erro, você precisa informar o administrador por e-mail
            String email = properties.getProperty("email.admin");
            System.err.printf("Enviando email para: %s informando o erro: %s\n", email, e.getMessage());
        }
    }
}
