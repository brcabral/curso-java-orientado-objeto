package curso.joo.interfaces.pagamento.operadora;

import curso.joo.interfaces.pagamento.Autorizavel;
import curso.joo.interfaces.pagamento.Cartao;
import curso.joo.interfaces.pagamento.Operadora;

public class RedeCard implements Operadora {
    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("456") && autorizavel.getValorTotal() < 200;
    }
}
