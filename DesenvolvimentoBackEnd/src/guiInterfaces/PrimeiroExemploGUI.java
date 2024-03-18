package guiInterfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PrimeiroExemploGUI {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		// cria um botão
		JButton button = new JButton("Clique Aqui!");
		button.setBounds(130,100,100,40);
		
		// adicionando uma ação quando clicamos no botão
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// mostra um JOptionPane com a mensagem "Oi! Tudo Bem"
				JOptionPane.showMessageDialog(null, "Oi! Tudo Bem?", "Alert", JOptionPane.WARNING_MESSAGE);	
			}
		});
		
		// adiciona o botão na tela
		frame.add(button);
		
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);	
		
	}

}
