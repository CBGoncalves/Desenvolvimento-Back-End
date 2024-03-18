package estudos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Login extends JFrame {

	private JLabel lblEmail;
	private JLabel lblSenha;
	private JTextField campoEmail;
	private JPasswordField campoSenha;
	private JButton btnLogin;
	private JButton btnCadastro;
	private JButton btnRecuperarSenha;
	private JPanel panelLogin;

	public Login() {

		setTitle("Login");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 400);
		setLocationRelativeTo(null);
		setResizable(false);

		panelLogin = new JPanel();
		panelLogin.setLayout(null);

		lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(275, 58, 100, 20);

		campoEmail = new JTextField();
		campoEmail.setBounds(275, 88, 250, 30);

		lblSenha = new JLabel("Senha");
		lblSenha.setBounds(275, 143, 100, 20);

		campoSenha = new JPasswordField();
		campoSenha.setBounds(275, 173, 250, 30);

		btnLogin = new JButton("Login");
		btnLogin.setBounds(325, 233, 150, 30);

		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String email = campoEmail.getText();
				String senha = new String(campoSenha.getPassword());
				try {
					
					// Conecta no banco de dados
					Connection con = (Connection) DriverManager
							.getConnection("jdbc:mysql://localhost:3306/javaswingtest", "root", "root");
					// Query que busca o usuario que está tentando logar através dos email e senha
					// no banco
					PreparedStatement query = con
							.prepareStatement("SELECT email, senha FROM usuario WHERE email=? AND senha=?");
					// mapeia cada posição e atribui o campo
					query.setString(1, email);
					query.setString(2, senha);
					// executa a query e guarda o resultado na variável rs
					ResultSet rs = query.executeQuery();

					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Usuário não encontrado! Verifique o email e senha digitados e tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
					}

				} catch (SQLException sqlException) {
					System.out.println(sqlException);
				}

			}
		});

		btnCadastro = new JButton("Cadastrar");
		btnCadastro.setBounds(325, 283, 150, 30);

		panelLogin.add(lblEmail);
		panelLogin.add(campoEmail);
		panelLogin.add(lblSenha);
		panelLogin.add(campoSenha);
		panelLogin.add(btnLogin);
		panelLogin.add(btnCadastro);

		add(panelLogin);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Login login = new Login();
			login.setVisible(true);
		});

	}

}
