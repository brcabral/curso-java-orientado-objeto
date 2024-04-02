package cap11_java8.apiData.exemplo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import cap11_java8.apiData.model.Aluguel;
import cap11_java8.apiData.model.Carro;
import cap11_java8.apiData.model.Cliente;

public class AlugarCarro {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva", LocalDate.of(1985, Month.FEBRUARY, 8));
        Carro carro = new Carro("Gol", 90.0, Year.of(2012));

        LocalDateTime dataHoraDaRetirada = LocalDateTime.of(LocalDate.now(),
                LocalTime.of(LocalTime.now().getHour(), 0));
        LocalDateTime dataHoraParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);

        Aluguel aluguel = new Aluguel(cliente, carro, dataHoraDaRetirada, dataHoraParaDevolucao);
        imprimirRecebo(aluguel);

    }

    private static void imprimirRecebo(Aluguel aluguel) {
        System.out.println(">>>>>>>>>>>>>>>>>> RECIBO <<<<<<<<<<<<<<<<<<");
        System.out.println("Carro: " + aluguel.getCarro().getModelo());
        System.out.println("Cliente: " + aluguel.getCliente().getNome());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Data e hora da retirada: " + aluguel.getDataHoraDaRetirada().format(formatter));
        System.out.println(
                "Data e hora prevista para devolução: " + aluguel.getDataHoraPrevistaParaDevolucao().format(formatter));
    }
}
