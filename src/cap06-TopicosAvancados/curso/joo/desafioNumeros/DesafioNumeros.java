package curso.joo.desafioNumeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do produto: ");
        BigDecimal valor = scanner.nextBigDecimal();

        BigDecimal valorPercentual = valor.multiply(BigDecimal.TEN).divide(new BigDecimal(100));

        DecimalFormat format = new DecimalFormat("R$ #,##0.00");
        String valorFormatado = format.format(valorPercentual);

        System.out.println("Valor calculado: " + valorPercentual);
        System.out.println("Valor formatado: " + valorFormatado);

        scanner.close();
    }
}
