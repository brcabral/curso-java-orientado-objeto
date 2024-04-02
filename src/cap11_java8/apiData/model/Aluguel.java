package cap11_java8.apiData.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aluguel {
    private Cliente cliente;
    private Carro carro;
    private LocalDateTime dataHoraDaRetirada;
    private LocalDateTime dataHoraPrevistaParaDevolucao;
    private LocalDateTime dataHoraRealDaDevolucao;

    public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataHoraDaRetirada,
            LocalDateTime dataHoraPrevistaParaDevolucao) {
        this.cliente = cliente;
        this.carro = carro;
        this.dataHoraDaRetirada = dataHoraDaRetirada;
        this.dataHoraPrevistaParaDevolucao = dataHoraPrevistaParaDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public LocalDateTime getDataHoraDaRetirada() {
        return dataHoraDaRetirada;
    }

    public void setDataHoraDaRetirada(LocalDateTime dataHoraDaRetirada) {
        this.dataHoraDaRetirada = dataHoraDaRetirada;
    }

    public LocalDateTime getDataHoraPrevistaParaDevolucao() {
        return dataHoraPrevistaParaDevolucao;
    }

    public void setDataHoraPrevistaParaDevolucao(LocalDateTime dataHoraPrevistaParaDevolucao) {
        this.dataHoraPrevistaParaDevolucao = dataHoraPrevistaParaDevolucao;
    }

    public LocalDateTime getDataHoraRealDaDevolucao() {
        return dataHoraRealDaDevolucao;
    }

    public void setDataHoraRealDaDevolucao(LocalDateTime dataHoraRealDaDevolucao) {
        this.dataHoraRealDaDevolucao = dataHoraRealDaDevolucao;
    }

    public void imprimirFatura() {
        Duration duration = Duration.between(dataHoraPrevistaParaDevolucao, dataHoraRealDaDevolucao);
        System.out.println(">>>>>>>>>>>>>>>>>> Fatura <<<<<<<<<<<<<<<<<<");
        if (!duration.isNegative()) {
            double multa = duration.toHours() * carro.getValorDiaria() * 0.1;
            System.out.printf("Valor da multa R$ %.2f. Pois você atrasou %d horas.", multa, duration.toHours());
        } else {
            System.out.println("Obrigado. Você foi pontual.");
        }
    }
}
