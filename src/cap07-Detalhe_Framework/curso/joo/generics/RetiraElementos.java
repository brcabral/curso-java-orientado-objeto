package curso.joo.generics;

import java.util.List;

public class RetiraElementos {
    public static <T> T recuperarPrimeiro(List<T> lista) {
        return lista.get(0);
    }
}
