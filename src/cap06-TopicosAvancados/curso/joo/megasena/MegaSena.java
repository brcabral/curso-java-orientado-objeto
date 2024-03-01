package curso.joo.megasena;

public class MegaSena {
    private static final int QUANTIDADE_NUMEROS_SORTEADOS = 6;
    private static final int MAIOR_NUMERO_SORTEADO = 60;
    int[] numerosSorteados = new int[QUANTIDADE_NUMEROS_SORTEADOS];

    public void sortearNumeros() {
        int i = 0;
        while (i < QUANTIDADE_NUMEROS_SORTEADOS) {
            int numeroSorteado = (int) (Math.random() * MAIOR_NUMERO_SORTEADO);
            if (!jaFoiSorteado(numeroSorteado)) {
                numerosSorteados[i] = numeroSorteado;
                i++;
            }
        }
    }

    public boolean jaFoiSorteado(int numero) {
        for (int i = 0; i < QUANTIDADE_NUMEROS_SORTEADOS; i++) {
            if (numerosSorteados[i] == numero || numero == 0) {
                return true;
            }
        }

        return false;
    }

    public void exibirNumerosSorteados() {
        for (int i = 0; i < QUANTIDADE_NUMEROS_SORTEADOS; i++) {
            System.out.print((int) numerosSorteados[i]);
            if (i != 5) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}
