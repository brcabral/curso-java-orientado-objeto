package cap11_java8.apiData.exemplo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

import cap11_java8.apiData.model.Aluguel;
import cap11_java8.apiData.model.Carro;
import cap11_java8.apiData.model.Cliente;

public class DevolverCarro {
    public static void main(String[] args) {
        Aluguel aluguel = recuperarAluguel();

        // Para cada hora de atraso, ele paga 10% do valor do carro em multa
        LocalDateTime dataHoraRealDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.now());
        aluguel.setDataHoraRealDaDevolucao(dataHoraRealDaDevolucao);
        aluguel.imprimirFatura();
    }

    private static Aluguel recuperarAluguel() {
        Cliente cliente = new Cliente("João Silva", LocalDate.of(1985, Month.FEBRUARY, 8));
        Carro carro = new Carro("Gol", 90.0, Year.of(2012));

        LocalDateTime dataHoraDaRetirada = LocalDateTime.of(LocalDate.now(),
                LocalTime.of(LocalTime.now().getHour(), 0));
        LocalDateTime dataHoraParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);

        Aluguel aluguel = new Aluguel(cliente, carro, dataHoraDaRetirada, dataHoraParaDevolucao);
        return aluguel;
    }
}
