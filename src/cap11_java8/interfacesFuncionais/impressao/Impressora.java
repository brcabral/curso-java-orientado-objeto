package cap11_java8.interfacesFuncionais.impressao;

import cap11_java8.interfacesFuncionais.modelo.Compra;

// Anotação opcional
@FunctionalInterface
public interface Impressora {
    // Uma interface que tem apenas 1 método é chamada de interface funcional
    public void imprimir(Compra compra);
}
