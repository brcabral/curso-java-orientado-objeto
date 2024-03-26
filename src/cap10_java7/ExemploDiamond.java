package cap10_java7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExemploDiamond {
    public static void main(String[] args) {
        // Com o Diamond não há a necessidade de declarar o tipo em new ArrayList<String>()
        List<String> nomesClientes = new ArrayList<>();
        nomesClientes.add("João");
        nomesClientes.add("Maria");

        Map<String, Set<String>> carrosPorMontadora = new HashMap<>();
        // Precisa informar o tipo do HashSet, pois ele não "lê" a declaração na linha de cima
        carrosPorMontadora.put("Chevrolet", new HashSet<String>());
        carrosPorMontadora.get("Chevrolet").add("Cruze");

        Set<String> carrosDaVolks;
        carrosPorMontadora.put("Volks", carrosDaVolks = new HashSet<>());
        carrosPorMontadora.get("Volks").add("Jetta");
    }
}
