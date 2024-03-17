package curso.joo.varargs;

public class CorreioEletronico {
    public void enviarEmails(String... emails) {
        for (String email : emails) {
            System.out.println("E-mail enviado para " + email);
        }
    }
}
