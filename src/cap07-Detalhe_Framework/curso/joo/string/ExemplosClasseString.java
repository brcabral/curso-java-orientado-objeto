package curso.joo.string;

public class ExemplosClasseString {
    public static void main(String[] args) {
        System.out.println("------- Upper Case -------");
        String nome = "Pedro";
        System.out.println(nome.toUpperCase());
        System.out.println(nome);

        nome = nome.toUpperCase();
        System.out.println(nome);

        System.out.println();
        System.out.println("------- Comparar String (equals) -------");
        String s1 = "Pedro";
        String s2 = "Pedro";
        System.out.println("s1 == s2? " + (s1 == s2));

        String s3 = new String("Pedro");
        System.out.println("s1 == s3? " + (s1 == s3));

        System.out.println("s1.equals(s2)? " + (s1.equals(s2)));
        System.out.println("s1.equals(s3)? " + (s1.equals(s3)));

        String s4 = "PeDrO";
        System.out.println("s1.equals(s4)? " + (s1.equals(s4)));
        System.out.println("s1.equalsIgnoreCase(s4)? " + (s1.equalsIgnoreCase(s4)));

        System.out.println();
        System.out.println("------- charAt -------");
        String s5 = "ALGAWORKS";
        System.out.println(s5.charAt(0));
        System.out.println(s5.charAt(2));
        System.out.println(s5.charAt(8));

        System.out.println();
        System.out.println("------- length -------");
        System.out.println(s5.length());

        System.out.println();
        System.out.println("------- Concatenar char -------");
        char[] array = { 'O', 'L', 'A' };
        String s6 = new String(array);
        System.out.println(s6);

        System.out.println();
        System.out.println("------- sub string -------");
        // Existe 2 métodos para pegar uma parte de uma string (substring)
        // public String substring(int beginIndex)
        // public String substring(int beginIndex, int endIndex)
        String s7 = "Desenvolvimento Java";
        System.out.println(s7.substring(16));

        String s8 = "Curso online de desenvolvimento de software";
        System.out.println(s8.substring(7, 12));

        System.out.println();
        System.out.println("------- trim -------");
        String s9 = "  Algaworks  ";
        System.out.println(">" + s9 + "<");
        System.out.println(">" + s9.trim() + "<");

        System.out.println();
        System.out.println("------- split -------");
        String s10 = "Curso_online_de_desenvolvimento_de_software";

        String[] curso = s10.split("_");
        for (int i = 0; i < curso.length; i++) {
            System.out.println("[" + i + "] -> " + curso[i]);
        }

        System.out.println();
        System.out.println("------- index of -------");
        String s11 = "Java";
        int indice = s11.indexOf('a');
        System.out.println(indice);

        // É possível usar o indexOf passando um segundo parâmetro
        // nele dizemos a partir de que posição deve iniciar a busca
        int segundoIndice = s11.indexOf('a', indice + 1);
        System.out.println(segundoIndice);

        int indiceAPartirDoUltimoCaracter = s11.lastIndexOf('a');
        System.out.println(indiceAPartirDoUltimoCaracter);

        System.out.println();
        System.out.println("------- replace -------");
        String s12 = "Desenvolvimento Java";
        System.out.println(s12.replaceAll("Java", "de software"));
        // (?i) indica para ignorar maiúsculas e minúsculas
        System.out.println(s12.replaceAll("(?i)java", "de sistemas"));
    }
}
