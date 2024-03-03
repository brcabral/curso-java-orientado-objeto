package curso.joo.collections;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {
    // NÃO permite adicionar o mesmo objeto mais de uma vez
    // NÃO respeita a ordem de entrada dos objetos
    // NÃO é possível recuperar o objeto pelo get (uma vez que o Set não guarda posição)
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("José");
        Aluno aluno4 = new Aluno("Pedro");

        Set<Aluno> alunos = new HashSet<Aluno>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno2);

        imprimirAlunos(alunos);
    }

    public static void imprimirAlunos(Set<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
        }
    }
}
