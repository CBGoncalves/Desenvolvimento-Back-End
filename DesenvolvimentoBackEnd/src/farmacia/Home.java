package farmacia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Home extends JFrame {

	private JMenu menuProdutos, menuFuncionarios, menuFornecedores;
	private JMenuItem gerenciarProdutos;
	
	private String emailDaOutraClasse;

	public Home(String email) {
		
		this.emailDaOutraClasse = email;
		
		System.out.println(emailDaOutraClasse);


		setTitle("Home");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 400);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel panel = new JPanel();
		panel.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuProdutos = new JMenu("Produtos");
		menuFuncionarios = new JMenu("Funcionarios");
		menuFornecedores = new JMenu("Fornecedores");
		
		gerenciarProdutos = new JMenuItem("Gerenciar Produtos");
		gerenciarProdutos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					Produtos produtos = new Produtos();
					produtos.setVisible(true);
					dispose();

				} catch (Exception e2) {
					System.out.println(e2);
				}

			}
		});
		
		menuProdutos.add(gerenciarProdutos);

		menuBar.add(menuProdutos);
		menuBar.add(menuFuncionarios);
		menuBar.add(menuFornecedores);

		setJMenuBar(menuBar);
		add(panel);
	}
}
