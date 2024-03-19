package curso.joo.regex;

public class SplitSpring {
    public static void main(String[] args) {
        String texto = "O9Java1é3uma9linguagem9orientada1a8objetos.";
        String[] palavras = texto.split("\\d+");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
