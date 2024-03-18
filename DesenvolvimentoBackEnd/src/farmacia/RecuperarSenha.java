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

public class RecuperarSenha extends JFrame {

	private JLabel lblImage;
	private JTextField campoEmail;
	private JPasswordField campoSenha;
	private JPasswordField campoConfirmarSenha;
	private JButton botaoEnviar;
	private JButton botaoCancelar;

	private final String DB_URL = "jdbc:mysql://localhost:3306/farmacia";
	private final String DB_USER = "root";
	private final String DB_PASSWORD = "root";

	public RecuperarSenha() {

		setTitle("Recuperar Senha");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(650, 400);
		setLocationRelativeTo(null);
		setResizable(false);

		JPanel panel = new JPanel();
		panel.setLayout(null);

		lblImage = new JLabel();
		lblImage.setIcon(new ImageIcon("farmajailson.png"));
		lblImage.setBounds(275, 12, 100, 100);

		campoEmail = new JTextField("E-mail");
		campoEmail.setBounds(200, 137, 250, 30);

		campoSenha = new JPasswordField("Nova Senha");
		campoSenha.setBounds(200, 193, 250, 30);

		campoConfirmarSenha = new JPasswordField("Confirmar Senha");
		campoConfirmarSenha.setBounds(200, 249, 250, 30);

		botaoEnviar = new JButton("Enviar");
		botaoEnviar.setBounds(165, 304, 150, 30);

		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(335, 304, 150, 30);

		botaoEnviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String email = campoEmail.getText();
				String senha = new String(campoSenha.getPassword());
				String confirmarSenha = new String(campoConfirmarSenha.getPassword());

				if (!senha.equals(confirmarSenha)) {
					JOptionPane.showMessageDialog(null, "As senhas não coincidem.", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}

				try {

					Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
					String query2 = "SELECT email FROM usuario WHERE email=?;";
					PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
					preparedStatement2.setString(1, email);
					ResultSet rs = preparedStatement2.executeQuery();

					if (rs.next()) {

						String query = "UPDATE usuario SET senha=? WHERE email=?;";
						PreparedStatement preparedStatement = connection.prepareStatement(query);
						preparedStatement.setString(1, senha);
						preparedStatement.setString(2, email);
						preparedStatement.executeUpdate();

						JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!", "Sucesso",
								JOptionPane.INFORMATION_MESSAGE);

						Login login = new Login();
						login.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null,
								"Usuário não encontrado! Verifique o email e senha digitados e tente novamente.",
								"Erro", JOptionPane.ERROR_MESSAGE);
					}
					
					connection.close();

				} catch (Exception e2) {
					System.out.println(e2);
				}
			}
		});

		botaoCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});

		panel.add(lblImage);
		panel.add(campoEmail);
		panel.add(campoSenha);
		panel.add(campoConfirmarSenha);
		panel.add(botaoEnviar);
		panel.add(botaoCancelar);

		add(panel);
	}

}
