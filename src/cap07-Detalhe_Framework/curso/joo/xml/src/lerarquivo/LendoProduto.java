package lerarquivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import modelo.Produto;

public class LendoProduto {
	public static void main(String[] args) throws FileNotFoundException {
		XStream xstream = new XStream(new DomDriver());
		xstream.addPermission(AnyTypePermission.ANY);
		xstream.alias("produto", Produto.class);

		Produto produto = (Produto) xstream.fromXML(new FileInputStream("./xml/produto.xml"));
		System.out.println("Código: " + produto.getCodigo());
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Valor: " + produto.getValor());
	}
}
