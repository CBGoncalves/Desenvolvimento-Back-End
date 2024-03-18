package farmacia;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Cadastro extends JFrame {

	private JLabel lblImage;
	private JTextField campoNome;
	private JTextField campoEmail;
	private JPasswordField campoSenha;
	private JPasswordField campoConfirmaSenha;
	private JButton botaoCadastrar;
	private JButton botaoLogin;

	private final String DB_URL = "jdbc:mysql://localhost:3306/farmacia";
	private final String DB_USER = "root";
	private final String DB_PASSWORD = "root";

	public Cadastro() {

		setTitle("Cadastro de Usuário");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(650, 430);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		lblImage = new JLabel();
		lblImage.setIcon(new ImageIcon("farmajailson.png"));
		lblImage.setBounds(275, 12, 100, 100);
		
		campoNome = new JTextField("Nome");
		campoNome.setBounds(200, 127, 250, 30);
		
		campoEmail = new JTextField("E-mail");
		campoEmail.setBounds(200, 172, 250, 30);
		
		campoSenha = new JPasswordField("Senha");
		campoSenha.setBounds(200, 217, 250, 30);
		
		campoConfirmaSenha = new JPasswordField("Confirmar Senha");
		campoConfirmaSenha.setBounds(200, 262, 250, 30);
		
		botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setBounds(165, 331, 150, 30);
		
		botaoLogin = new JButton("Login");
		botaoLogin.setBounds(335, 331, 150, 30);

		panel.add(lblImage);
		panel.add(campoNome);
		panel.add(campoEmail);
		panel.add(campoSenha);
		panel.add(campoConfirmaSenha);
		panel.add(botaoCadastrar);
		panel.add(botaoLogin);

		add(panel);

		botaoCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = campoNome.getText();
				String email = campoEmail.getText();
				String senha = new String(campoSenha.getPassword());
				String confirmarSenha = new String(campoConfirmaSenha.getPassword());

				if (!senha.equals(confirmarSenha)) {
					JOptionPane.showMessageDialog(null, "As senhas não coincidem.", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				try {
					Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
					String query="INSERT INTO usuario(nome,email,senha)VALUES(?,?,?)";
					PreparedStatement preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, nome);
					preparedStatement.setString(2, email);
					preparedStatement.setString(3, senha);
					preparedStatement.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
					
					preparedStatement.close();
				} catch (Exception e2) {
					
				}

			}
		});
		
		botaoLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
	}
}
