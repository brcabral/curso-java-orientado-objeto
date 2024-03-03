package curso.joo.ordenacao;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPeloNome {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 22);
        Pessoa pessoa2 = new Pessoa("Adriana", 23);
        Pessoa pessoa3 = new Pessoa("Bruno", 21);

        List<Pessoa> pessoas = Arrays.asList(pessoa1, pessoa2, pessoa3);
        Collections.sort(pessoas);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
