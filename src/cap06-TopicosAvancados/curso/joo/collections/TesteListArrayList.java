package curso.joo.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {
    // Permite adicionar o mesmo objeto mais de uma vez
    // Respeita a ordem de entrada dos objetos
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("José");
        Aluno aluno4 = new Aluno("Pedro");

        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno2);

        imprimirAlunos(alunos);
    }

    public static void imprimirAlunos(List<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
        }
    }
}
