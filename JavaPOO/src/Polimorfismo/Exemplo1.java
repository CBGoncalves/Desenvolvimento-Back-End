package Polimorfismo;

public class Exemplo1 {

	public static void main(String[] args) {
		Sobrecarga s = new Sobrecarga();
		
		// Para instanciar um método com sobrecarga, basta escolher a partir das assinaturas
		s.soma();
		s.soma(5.5);
		s.soma(8);
		s.soma(2.5, 7);
		s.soma(14, 15.5);
	}

}
