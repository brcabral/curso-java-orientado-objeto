package curso.joo.joptionpane;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane01 {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
        JOptionPane.showMessageDialog(null, "Atenção e-mail não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "O campo CPF é obrigatório", "Erro", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);

        URL url = ExemploJOptionPane01.class.getResource("algaworks.png");
        Icon icone = new ImageIcon(url);
        JOptionPane.showMessageDialog(null, "Obrigado por escolher a Algaworks", "Algaworks",
                JOptionPane.INFORMATION_MESSAGE, icone);
    }
}
