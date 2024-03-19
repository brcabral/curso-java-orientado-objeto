package curso.joo.debug;

public class Fibonacci {
    // F(n) = F(n-1) + F(n-2)
    // 0, 1, 1, 2, 3, 5, 8...
    public static long calcular(long posicao) {
        if ((posicao == 0) || (posicao == 1)) {
            return posicao;
        }

        // long valor1 = calcular(posicao - 1);
        // long valor2 = calcular(posicao - 2);
        // return valor1 + valor2;

        long valor = calcular(posicao - 1) + calcular(posicao - 2);
        return valor;
    }
}
