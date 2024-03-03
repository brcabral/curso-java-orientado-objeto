package curso.joo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TesteNumeros {
    public static void main(String[] args) {
        DecimalFormat formatador =  new DecimalFormat("R$ #,##0.00");
        double valorProduto = 1350.8;

        System.out.println(valorProduto);
        System.out.println(formatador.format(valorProduto));

        String entrada = "R$ 50,34";
        try {
            double numero = formatador.parse(entrada).doubleValue();
            System.out.println("Número: " + numero);
        } catch (Exception e) {
            System.out.println("Entrada inválida.");
        }

        BigDecimal bg = new BigDecimal(5131231231000d);
        bg = bg.divide(BigDecimal.TEN);
        System.out.println(bg);
    }
}
