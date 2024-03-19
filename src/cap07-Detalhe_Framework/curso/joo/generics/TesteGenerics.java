package curso.joo.generics;

import java.util.ArrayList;
import java.util.List;

public class TesteGenerics {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("João"));
        funcionarios.add(new Funcionario("Maria"));

        // Sem o generics isso era possível, porém daria erro em tempo de execução
        // funcionarios.add("Pedro");

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome do funcionário: " + funcionario.getNome());
        }
    }
}
