public class Televisor {
    Integer canal = 130;
    Integer volume = 20;

    void mudarCanal(Integer novoCanal) {
        if (canal.equals(novoCanal)) {
            System.out.println("O novo canal é igual ao canal atual.");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }

    void mudarVolume(Integer novoVolume) {
        if (novoVolume.equals(volume)) {
            System.out.println("O novo volume é igual ao volume atual.");
        } else {
            volume = novoVolume;
            System.out.println("Volume alterado para " + volume);
        }
    }

    public static void main(String[] args) {
        Televisor tv = new Televisor();
        // Não deveria mudar o canal e o volume
        tv.mudarCanal(130);
        tv.mudarVolume(20);

        System.out.println();

        // Deveria mudar o canal e o volume
        tv.mudarCanal(10);
        tv.mudarVolume(300);
    }
}
