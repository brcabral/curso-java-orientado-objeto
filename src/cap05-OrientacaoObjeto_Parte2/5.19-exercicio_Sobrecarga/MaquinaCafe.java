public class MaquinaCafe {
    int acucarDisponivel;

    void fazerCafe() {
        fazerCafe(10);
    }

    void fazerCafe(int quantidadeAcucar) {
        if (acucarDisponivel >= quantidadeAcucar) {
            acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
        } else {
            System.out.println("Não há açucar suficiene para fazer seu café.");
        }
    }
}
