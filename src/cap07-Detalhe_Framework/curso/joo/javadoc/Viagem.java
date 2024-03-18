package curso.joo.javadoc;

import java.util.Date;

/**
 * 
 * Representa a viagem de um funcionários.
 * 
 * @author Breno Cabral
 */
public class Viagem {
    private Date dataInicio;
    private Date dataFim;
    private Funcionario funcionario;

    public Viagem() {
        //
    }

    public Viagem(Date dataInicio, Date dataFim, Funcionario funcionario) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.funcionario = funcionario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
