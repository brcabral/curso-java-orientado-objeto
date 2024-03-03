package curso.joo.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {
    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(hoje);

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(format.format(hoje));

        String dataNascimento = "20/01/1985";
        DateFormat formatNascimento = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date nascimento = formatNascimento.parse(dataNascimento);
            System.out.println("Data de nascimento: " + formatNascimento.format(nascimento));
        } catch (Exception e) {
            System.out.println("Formato de data inválido.");
        }
    }
}
