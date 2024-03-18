package estudos;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class LoginCadastro extends JFrame {
	
	private JTextField campoEmail;
	private JTextField campoUsuario;
	private JPasswordField campoSenha;
	private JPasswordField campoConfirmaSenha;
	private JButton botaoCadastrar;
	private JButton botaoLogin;
	private JButton botaoEsqueceuSenha;
	private JPanel panel;
	private JPanel telaLogin;
	private JPanel telaRedefinirSenha;
	
	public LoginCadastro() {
		
		setTitle("Cadastro de Usuário");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(650, 350);
		setLocationRelativeTo(null);
		setResizable(false);

		panel = new JPanel();
		panel.setLayout(null);
		
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		
		campoEmail = new JTextField("E-mail");
		campoEmail.setBounds(200,50,250,30);
		campoEmail.setBorder(loweredbevel);
		campoEmail.setBackground(new Color(224, 223, 223));
		
		campoUsuario = new JTextField("Usuário");
		campoUsuario.setBounds(200,90,250,30);
		campoUsuario.setBorder(loweredbevel);
		campoUsuario.setBackground(new Color(224, 223, 223));
		
		campoSenha = new JPasswordField("Senha");
		campoSenha.setBounds(200,130,250,30);
		campoSenha.setBorder(loweredbevel);
		campoSenha.setBackground(new Color(224, 223, 223));
		
		campoConfirmaSenha = new JPasswordField("Confirmar Senha");
		campoConfirmaSenha.setBounds(200,170,250,30);
		campoConfirmaSenha.setBorder(loweredbevel);
		campoConfirmaSenha.setBackground(new Color(224, 223, 223));
		
		botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setBounds(200,220,250,30);
		botaoCadastrar.setBackground(new Color(188, 98, 2));
		botaoCadastrar.setForeground(new Color(255, 255, 255));
		
		botaoLogin = new JButton("Login");
		botaoLogin.setBounds(200,270,100,30);
		botaoLogin.setBackground(new Color(188, 98, 2));
		botaoLogin.setForeground(new Color(255, 255, 255));
		
		
		botaoEsqueceuSenha = new JButton("Esqueceu sua Senha");
		botaoEsqueceuSenha.setBounds(350,270,100,30);
		botaoEsqueceuSenha.setBackground(new Color(188, 98, 2));
		botaoEsqueceuSenha.setForeground(new Color(255, 255, 255));

		panel.add(campoEmail);
		panel.add(campoUsuario);
		panel.add(campoSenha);
		panel.add(campoConfirmaSenha);
		panel.add(botaoCadastrar);
		panel.add(botaoLogin);
		panel.add(botaoEsqueceuSenha);

		add(panel);

		botaoCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String email = campoEmail.getText();
				String usuario = campoUsuario.getText();
				String senha = new String(campoSenha.getPassword());
				String confirmarSenha = new String(campoConfirmaSenha.getPassword());

				if (!senha.equals(confirmarSenha)) {
					JOptionPane.showMessageDialog(null, "As senhas não coincidem.", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}

			}
		});
		
		botaoLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JTextField campoEmailLogin;
				JPasswordField campoSenhaLogin;
				JButton botaoLogin;
				JButton botaoEsqueceuSenhaLogin;
				JButton botaoCadastrarLogin;
				
				panel.setVisible(false);
				setTitle("Login");
				
				
				telaLogin = new JPanel();
				telaLogin.setLayout(null);
				
				campoEmailLogin = new JTextField("E-mail");
				campoEmailLogin.setBounds(200,50,250,30);
				campoEmailLogin.setBorder(loweredbevel);
				campoEmailLogin.setBackground(new Color(224, 223, 223));
				
				campoSenhaLogin = new JPasswordField("Senha");
				campoSenhaLogin.setBounds(200,90,250,30);
				campoSenhaLogin.setBorder(loweredbevel);
				campoSenhaLogin.setBackground(new Color(224, 223, 223));
				
				botaoLogin = new JButton("Login");
				botaoLogin.setBounds(200,220,250,30);
				botaoLogin.setBackground(new Color(188, 98, 2));
				botaoLogin.setForeground(new Color(255, 255, 255));
				
				botaoEsqueceuSenhaLogin = new JButton("Esqueceu sua Senha");
				botaoEsqueceuSenhaLogin.setBounds(200,270,100,30);
				botaoEsqueceuSenhaLogin.setBackground(new Color(188, 98, 2));
				botaoEsqueceuSenhaLogin.setForeground(new Color(255, 255, 255));
				
				
				botaoCadastrarLogin = new JButton("Cadastrar");
				botaoCadastrarLogin.setBounds(350,270,100,30);
				botaoCadastrarLogin.setBackground(new Color(188, 98, 2));
				botaoCadastrarLogin.setForeground(new Color(255, 255, 255));
				
				telaLogin.add(campoEmailLogin);
				telaLogin.add(campoSenhaLogin);
				telaLogin.add(botaoLogin);
				telaLogin.add(botaoEsqueceuSenhaLogin);
				telaLogin.add(botaoCadastrarLogin);
				
				add(telaLogin);
				
				botaoEsqueceuSenhaLogin.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						telaLogin.setVisible(false);
						telaRedefinirSenha.setVisible(true);
						setTitle("Redefinir Senha");
					}
				});
				
				botaoCadastrarLogin.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						telaLogin.setVisible(false);
						panel.setVisible(true);
						setTitle("Cadastro de Usuário");
					}
				});
			}
		});
		
		botaoEsqueceuSenha.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JLabel titulo;
				JTextField campoEmail;
				JButton botaoEnviar;
				JButton botaoLogin;
				
				
				panel.setVisible(false);
				setTitle("Redefinir Senha");
				
				
				telaRedefinirSenha = new JPanel();
				telaRedefinirSenha.setLayout(null);
				
				titulo = new JLabel("Insira seu e-mail para redefinir sua senha");
				titulo.setBounds(200,50,250,50);
				
				campoEmail = new JTextField("E-mail");
				campoEmail.setBounds(200,100,250,30);
				campoEmail.setBorder(loweredbevel);
				campoEmail.setBackground(new Color(224, 223, 223));
				
				botaoEnviar = new JButton("Enviar");
				botaoEnviar.setBounds(200,150,250,30);
				botaoEnviar.setBackground(new Color(188, 98, 2));
				botaoEnviar.setForeground(new Color(255, 255, 255));
				
				botaoLogin = new JButton("Login");
				botaoLogin.setBounds(200,250,250,30);
				botaoLogin.setBackground(new Color(188, 98, 2));
				botaoLogin.setForeground(new Color(255, 255, 255));
				
				telaRedefinirSenha.add(titulo);
				telaRedefinirSenha.add(campoEmail);
				telaRedefinirSenha.add(botaoEnviar);
				telaRedefinirSenha.add(botaoLogin);
				
				add(telaRedefinirSenha);
				
				botaoLogin.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						telaRedefinirSenha.setVisible(false);
						telaLogin.setVisible(true);
						setTitle("Login");
					}
				});
			}
		});
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			LoginCadastro loginCadastro = new LoginCadastro();
			loginCadastro.setVisible(true);
		});
	}
}


