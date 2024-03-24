package cap09_serializacao.salvandoRecuperandoObjeto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import cap09_serializacao.salvandoRecuperandoObjeto.model.Pessoa;

public class DesserializarObjeto {
    public static void main(String[] args) {
        try (ObjectInput in = new ObjectInputStream(
                new FileInputStream("./cap09_serializacao/salvandoRecuperandoObjeto/files/joao.obj"))) {
            Pessoa pessoa = (Pessoa) in.readObject();
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Profissão: " + pessoa.getProfissao());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Erro convertendo para a classe Pessoa.");
            e.printStackTrace();
        }
    }
}
