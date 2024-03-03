package curso.joo.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 23);

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(format.format(calendar.getTime()));

        // add - altera o atributo solicitado e os demais necessários
        calendar.add(Calendar.MONTH, 1);
        System.out.println(format.format(calendar.getTime()));

        // rool - altera apenas o atributo solicitado
        calendar.roll(Calendar.DAY_OF_MONTH, 1);
        System.out.println(format.format(calendar.getTime()));
    }
}
