package cap11_java8.lambda.modelo;

public class Fatura {
    private String emailDevedor;
    private double valor;
    private boolean emailEnviado;

    public Fatura(String emailDevedor, double valor) {
        super();
        this.emailDevedor = emailDevedor;
        this.valor = valor;
    }

    public String getEmailDevedor() {
        return emailDevedor;
    }

    public void setEmailDevedor(String emailDevedor) {
        this.emailDevedor = emailDevedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isEmailEnviado() {
        return emailEnviado;
    }

    public void setEmailEnviado(boolean emailEnviado) {
        this.emailEnviado = emailEnviado;
    }

    public String resumo() {
        return "Valor devido: R$" + this.valor;
    }

    public void atualizarStatus() {
        System.out.println("Atualizando o status de valor R$" + this.valor);
    }

    public boolean estaoEmRisco() {
        return this.valor >= 250 ? true : false;
    }

    @Override
    public String toString() {
        return "E-mail: " + this.emailDevedor + ". Valor R$ " + this.valor;
    }
}
