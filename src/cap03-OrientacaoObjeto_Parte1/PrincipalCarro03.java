public class PrincipalCarro03 {
    public static void main(String[] args) {
        Proprietario dono1 = new Proprietario();
		dono1.nome = "João da Silva";

		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";

		meuCarro.dono = dono1;

		System.out.println("meuCarro.dono.nome: " + meuCarro.dono.nome);
		System.out.println("dono.nome: " + dono1.nome);
		System.out.println();

		meuCarro.dono.nome = "Maria Joaquina";
		System.out.println("meuCarro.dono.nome: " + meuCarro.dono.nome);
		System.out.println("dono.nome: " + dono1.nome);
		System.out.println();

		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";

		meuCarro.dono = dono1;
		seuCarro.dono = dono1;

		System.out.println(">>> Antes da mudança <<<");
		System.out.println("meuCarro.dono.nome: " + meuCarro.dono.nome);
		System.out.println("seuCarro.dono.nome: " + seuCarro.dono.nome);
		System.out.println("dono.nome: " + dono1.nome);
		System.out.println();

		meuCarro.dono.nome = "Sebastião Pereira";

		System.out.println(">>> Depois da mudança <<<");
		System.out.println("meuCarro.dono.nome: " + meuCarro.dono.nome);
		System.out.println("seuCarro.dono.nome: " + seuCarro.dono.nome);
		System.out.println("dono.nome: " + dono1.nome);
		System.out.println();
    }
}
