package cap11_java8.apiData.exemplo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import cap11_java8.apiData.model.Cliente;

public class CadastroCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva", LocalDate.of(2000, Month.AUGUST, 13));
        int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();

        if (idade >= 18) {
            System.out.printf("Ok, pode ser cadastrado. Sua idade é %d\n", idade);
        } else {
            System.err.printf("Sua idade é %d. Então não pode ter carteira.\n", idade);
        }
    }
}
