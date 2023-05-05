package ExercicioHeranca;

import Herança.Professor;

public class Exercicio {
	
	public static void main(String[] args) {
		Cachorro c = new Cachorro ();
		Arara a = new Arara();
		
		c.setComprimentoPelo(10.0);
		c.setCor("Caramelo");
		c.setPeso(45.0);
		
		a.setCor("Azul");
		a.setPeso(1.5);
		
		System.out.println("Dados do cachorro");
		System.out.println("A cor do pelo e: "+c.getCor());
		System.out.println("O comprimento do pelo e: "+c.getComprimentoPelo());
		System.out.println("O peso do cachorro e: "+c.getPeso());
		c.emitirSom();
		c.locomover();
		
		System.out.println("\nDados da arara");
		System.out.println("A cor do pelo e: "+a.getCor());
		System.out.println("O peso do cachorro e: "+a.getPeso());
		a.emitirSom();
		a.locomover();
	}
	
}
