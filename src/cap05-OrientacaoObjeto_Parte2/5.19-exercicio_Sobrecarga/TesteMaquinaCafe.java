public class TesteMaquinaCafe {
    public static void main(String[] args) {
        MaquinaCafe maquina = new MaquinaCafe();
        maquina.acucarDisponivel = 30;

        // faz cafe com a quantidade de açúcar padrão
        maquina.fazerCafe();

        maquina.fazerCafe(15);

        // não será possível fazer esse cafezinho, pois a máquina
        // só tinha 30gr de açúcar disponível (no início)
        maquina.fazerCafe(10);
    }
}
