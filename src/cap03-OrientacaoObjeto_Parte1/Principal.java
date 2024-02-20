public class Principal {
    public static void main(String[] args) {
        // Declarado a variável meuCarro
		Carro meuCarro;
		// Instanciado a variável com um objeto carro 
		meuCarro = new Carro();
		
		meuCarro.fabricante = "FIAT";
		meuCarro.modelo = "Palio";
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Preto";
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Civic";
		seuCarro.anoDeFabricacao = 2009;
		seuCarro.cor = "Preto";
		
		System.out.println("---------- Meu carro ----------");
		System.out.println("Modelo: " + meuCarro.fabricante);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: " + meuCarro.anoDeFabricacao);
		System.out.println("Ano: " + meuCarro.cor);
		
		System.out.println();
		System.out.println("---------- Seu carro ----------");
		System.out.println("Modelo: " + seuCarro.fabricante);
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano: " + seuCarro.anoDeFabricacao);
		System.out.println("Ano: " + seuCarro.cor);
    }
}
