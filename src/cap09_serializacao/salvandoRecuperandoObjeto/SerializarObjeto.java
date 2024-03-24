package cap09_serializacao.salvandoRecuperandoObjeto;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import cap09_serializacao.salvandoRecuperandoObjeto.model.Pessoa;

public class SerializarObjeto {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João da Silva");
        pessoa.setIdade(25);
        pessoa.setProfissao("Motorista");

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("./cap09_serializacao/salvandoRecuperandoObjeto/files/joao.obj"))) {
            out.writeObject(pessoa);
            System.out.println("Objeto salvo com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro salvando o objeto.\n" + e.getMessage());
            e.printStackTrace();
        }
    }
}
