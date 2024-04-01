package cap11_java8.interfacesFuncionais.impressao.impressoras;

import cap11_java8.interfacesFuncionais.impressao.Impressora;
import cap11_java8.interfacesFuncionais.modelo.Compra;

public class ImpressoraHP implements Impressora {
    @Override
    public void imprimir(Compra c) {
        System.out.println("Enviando compra para a impressora HP -> " + c);
    }
}
