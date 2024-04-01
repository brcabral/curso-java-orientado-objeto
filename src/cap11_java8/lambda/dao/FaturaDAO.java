package cap11_java8.lambda.dao;

import java.util.ArrayList;
import java.util.List;

import cap11_java8.lambda.modelo.Fatura;

public class FaturaDAO {
    public List<Fatura> buscarFaturasVencidas() {
        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura("joao@localhost.com", 350.0));
        faturas.add(new Fatura("maria@localhost.com", 150.0));
        faturas.add(new Fatura("jose@localhost.com", 290.0));

        return faturas;
    }
}
