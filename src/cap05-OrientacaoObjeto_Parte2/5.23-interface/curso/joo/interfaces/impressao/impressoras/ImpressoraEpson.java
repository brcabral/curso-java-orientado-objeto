package curso.joo.interfaces.impressao.impressoras;

import curso.joo.interfaces.impressao.Impressora;
import curso.joo.interfaces.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora {
    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Cliente: " + imprimivel.getCabecalhoPagina());
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("==                   EPSON                   ==");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
    }
}
