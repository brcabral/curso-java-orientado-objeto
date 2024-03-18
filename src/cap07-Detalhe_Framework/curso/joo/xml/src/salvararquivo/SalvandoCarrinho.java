package salvararquivo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import modelo.Produto;

public class SalvandoCarrinho {
	public static void main(String[] args) throws FileNotFoundException {
		List<Produto> carrinho = new ArrayList<>();
		carrinho.add(new Produto(1L, "sabonete", new BigDecimal("2.30")));
		carrinho.add(new Produto(2L, "shampoo", new BigDecimal("8.20")));
		carrinho.add(new Produto(3L, "creme dental", new BigDecimal("3.50")));

		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		xstream.alias("carrinho", List.class);

		OutputStream os = new FileOutputStream("./xml/carrinho.xml");
		xstream.toXML(carrinho, os);
	}
}
