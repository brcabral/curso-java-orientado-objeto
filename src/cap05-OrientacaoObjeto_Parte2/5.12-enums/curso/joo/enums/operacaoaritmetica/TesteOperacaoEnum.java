package curso.joo.enums.operacaoaritmetica;

public class TesteOperacaoEnum {
    public static void main(String[] args) {
        OperacaoAritmetica operacaoAritmetica = OperacaoAritmetica.ADICAO;
        int resultado = operacaoAritmetica.operacao(5, 3);
        System.out.println("O resultado da operação é: " + resultado);
        System.out.println();

        // É possível fazer um loop através dos valores e métodos do ENUM
        for (OperacaoAritmetica oa : OperacaoAritmetica.values()) {
            System.out.println(oa + "-> " + oa.operacao(4, 2));
        }
    }
}
