package curso.joo.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {
    // O Map é formado por uma chave e um valor
    // Um Map permite adicionar um mesmo valor
    // Porém NÃO permite acidionar a mesma chave
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("José");
        Aluno aluno4 = new Aluno("Pedro");

        Map<Integer, Aluno> alunos = new HashMap<Integer, Aluno>();
        alunos.put(1, aluno1);
        alunos.put(2, aluno2);
        alunos.put(3, aluno3);
        alunos.put(4, aluno4);
        alunos.put(1, aluno1);
        alunos.put(5, aluno2);

        imprimirAlunos(alunos);
        recuperarAluno(alunos, 3);
    }

    public static void imprimirAlunos(Map<Integer, Aluno> alunos) {
        for (Aluno aluno : alunos.values()) {
            System.out.println("Nome: " + aluno.getNome());
        }
    }

    private static void recuperarAluno(Map<Integer, Aluno> alunos, int i) {
        Aluno aluno = alunos.get(i);
        System.out.println("Aluno recuperado: " + aluno.getNome());
    }
}
