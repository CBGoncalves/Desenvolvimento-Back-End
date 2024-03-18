package guiInterfaces;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ExemploComboBox {

	private JFrame frame;

	ExemploComboBox() {
		
		// cria um frame
		frame = new JFrame("Exemplo ComboBox");
		frame.setLayout(null);
		frame.setSize(400, 500);
		
		// cria um array de strings com as opções do combobox
		String sexo[] = { "Masculino", "Feminino", "Outro" };
		
		// cria o combobox passando o array com as opções como parâmetro
		JComboBox cb = new JComboBox(sexo);
		cb.setBounds(50, 50, 90, 20);
		
		// adiciona o combobox ao frame
		frame.add(cb);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new ExemploComboBox();
	}
}



