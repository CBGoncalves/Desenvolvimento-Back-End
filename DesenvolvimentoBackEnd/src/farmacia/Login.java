package farmacia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Login extends JFrame {
	
	private String email;
	
	private JLabel lblImage;
	private JTextField campoEmail;
	private JPasswordField campoSenha;
	private JButton botaoLogin;
	private JButton botaoCadastro;
	private JButton botaoRecuperarSenha;

	private final String DB_URL = "jdbc:mysql://localhost:3306/farmacia";
	private final String DB_USER = "root";
	private final String DB_PASSWORD = "root";

	public Login() {

		setTitle("Login");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(650, 350);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel panel = new JPanel();
		panel.setLayout(null);

		lblImage = new JLabel();
		lblImage.setIcon(new ImageIcon("farmajailson.png"));
		lblImage.setBounds(275, 12, 100, 100);

		campoEmail = new JTextField("E-mail");
		campoEmail.setBounds(200, 137, 250, 30);

		campoSenha = new JPasswordField("Senha");
		campoSenha.setBounds(200, 193, 250, 30);

		botaoLogin = new JButton("Login");
		botaoLogin.setBounds(80, 273, 150, 30);

		botaoCadastro = new JButton("Cadastrar");
		botaoCadastro.setBounds(250, 273, 150, 30);

		botaoRecuperarSenha = new JButton("Recuperar Senha");
		botaoRecuperarSenha.setBounds(420, 273, 150, 30);

		botaoLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				email = campoEmail.getText();
				String senha = new String(campoSenha.getPassword());

				try {
					Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
					String query = "SELECT email, senha FROM usuario WHERE email=? AND senha=?";
					PreparedStatement preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, email);
					preparedStatement.setString(2, senha);
					ResultSet rs = preparedStatement.executeQuery();

					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!", "Sucesso",
								JOptionPane.INFORMATION_MESSAGE);
						
						Home home = new Home(email);
						home.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null,
								"Usuário não encontrado! Verifique o email e senha digitados e tente novamente.",
								"Erro", JOptionPane.ERROR_MESSAGE);
					}

					preparedStatement.close();
				} catch (Exception e2) {

				}

			}
		});

		botaoCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Cadastro cadastro = new Cadastro();
				cadastro.setVisible(true);
				dispose();
			}
		});
		
		botaoRecuperarSenha.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				RecuperarSenha recuperarSenha = new RecuperarSenha();
				recuperarSenha.setVisible(true);
				dispose();
				
			}
		});

		panel.add(lblImage);
		panel.add(campoEmail);
		panel.add(campoSenha);
		panel.add(botaoLogin);
		panel.add(botaoCadastro);
		panel.add(botaoRecuperarSenha);

		add(panel);
	}
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			Login login = new Login();
			login.setVisible(true);
		});

	}
}
