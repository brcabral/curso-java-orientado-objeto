package curso.joo.calculadoragravidez;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
    private Date dataUltimoPeriodoMenstrual;

    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }

    private Calendar converterDateParaCalendar(Date data) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }

    public Date calcularDataEstimadaConcepcao() {
        Calendar ultimoPeriodoMenstrualCalendar = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
        ultimoPeriodoMenstrualCalendar.add(Calendar.WEEK_OF_YEAR, 2);
        return ultimoPeriodoMenstrualCalendar.getTime();
    }

    public Date calcularDataEstimadaParto() {
        Calendar ultimoPeriodoMenstrualCalendar = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
        ultimoPeriodoMenstrualCalendar.add(Calendar.WEEK_OF_YEAR, 40);
        return ultimoPeriodoMenstrualCalendar.getTime();
    }
}
