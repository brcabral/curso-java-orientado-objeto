package curso.joo.interfaces.pagamento.operadora;

import curso.joo.interfaces.pagamento.Autorizavel;
import curso.joo.interfaces.pagamento.Cartao;
import curso.joo.interfaces.pagamento.Operadora;

public class Cielo implements Operadora {
    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123") && autorizavel.getValorTotal() < 100;
    }
}
