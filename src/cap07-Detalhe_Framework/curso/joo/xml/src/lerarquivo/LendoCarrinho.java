package lerarquivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import modelo.Produto;

public class LendoCarrinho {
	public static void main(String[] args) throws FileNotFoundException {
		XStream xstream = new XStream(new DomDriver());
		xstream.addPermission(AnyTypePermission.ANY);
		xstream.alias("produto", Produto.class);
		xstream.alias("carrinho", List.class);

		@SuppressWarnings("unchecked")
		List<Produto> carrinho = (List<Produto>) xstream.fromXML(new FileInputStream("./xml/carrinho.xml"));
		for (Produto produto : carrinho) {
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Descrição: " + produto.getDescricao());
			System.out.println("Valor: " + produto.getValor());
			System.out.println();
		}
	}
}
