package curso.joo.enums.operacaoaritmetica;

public enum OperacaoAritmetica {
    ADICAO {
        public int operacao(int x, int y) {
            return x + y;
        }
    },
    SUBTRACAO {
        public int operacao(int x, int y) {
            return x - y;
        }
    };

    public abstract int operacao(int x, int y);
}
