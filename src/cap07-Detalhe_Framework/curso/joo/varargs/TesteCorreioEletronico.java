package curso.joo.varargs;

public class TesteCorreioEletronico {
    public static void main(String[] args) {
        CorreioEletronico correio = new CorreioEletronico();
        correio.enviarEmails("joao@localhost.com", "maria@localhost.com", "pedro@localhost.com");
    }
}
