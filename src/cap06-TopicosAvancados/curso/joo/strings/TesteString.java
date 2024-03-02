package curso.joo.strings;

public class TesteString {
    public static void main(String[] args) {
        // String, StringBuilder e StringBuffer
        /**
         * Diferenças entre StringBuilder e StringBuffer
         * - StringBuilder -> É mais rápido, porém não tem suporte a threads
         * - StringBuffer -> É mais lento, porém tem suporte a threads
         */

        String s = "Olá"; // Criada a String "Olá"
        s = s + " pessoal!"; // Criado uma nova String "Olá pessoal!"
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Olá"); // Cria a StringBuilder
        sb.append(" pessoal!"); // Reaproveita a StringBuilder
        String resultado = sb.toString();
        System.out.println("Com StringBuilder: " + resultado);
    }
}
