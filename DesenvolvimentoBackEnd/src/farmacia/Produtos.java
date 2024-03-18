package farmacia;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Produtos extends JFrame{

	public Produtos() {
		
		setTitle("Gerenciamento de Produtos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		add(panel);
	}

}
