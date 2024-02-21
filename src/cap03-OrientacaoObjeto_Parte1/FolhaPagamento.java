public class FolhaPagamento {
    // assinatura do método -> double calcularSalario(int, int, double, double)
    double calcularSalario(int horasNormais, int horasExtra, double valorHoraNormal, double valorHoraExtra) {
        double valorHorasNormais = horasNormais * valorHoraNormal;
        double valorHorasExtras = horasExtra * valorHoraExtra;

        return valorHorasNormais + valorHorasExtras;
    }
}
