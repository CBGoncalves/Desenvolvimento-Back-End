package exemplo;

import javax.swing.*;

public class ExemploJavaSwing {
	public static void main(String[] args) {
		JFrame f = new JFrame();// creating instance of JFrame

		JButton b = new JButton("Login");// creating instance of JButton
		JButton bot = new JButton("Cadastro");
		
		b.setBounds(130, 100, 100, 40);// x axis, y axis, width, height
		bot.setBounds(130, 200, 100, 50);
		
		f.add(b);// adding button in JFrame
		f.add(bot); 

		f.setSize(400, 500);// 400 width and 500 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible
	}
}