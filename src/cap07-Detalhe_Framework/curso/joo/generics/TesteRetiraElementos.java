package curso.joo.generics;

import java.util.ArrayList;
import java.util.List;

public class TesteRetiraElementos {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("João"));
        funcionarios.add(new Funcionario("Maria"));

        Funcionario funcionario = RetiraElementos.recuperarPrimeiro(funcionarios);
        System.out.println("Funcionário: " + funcionario.getNome());
    }
}
