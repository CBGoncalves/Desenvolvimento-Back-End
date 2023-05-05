package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String args[]) {
		
		try {
			
			int b, h, a;
			String erro;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite a base do retangulo: ");
			b = sc.nextInt();
			
			System.out.println("Digite a altura do retangulo: ");
			h = sc.nextInt();
			
			if(!(b==h)) {
				a = b * h;
				
				System.out.println("A area do retangulo e : " + a);
				sc.close();
			} else {
				erro = "Os valores nao podem ser iguais";
				System.out.println(erro);
			}
			
		} catch (Exception e) {
			System.out.println("Digite valores validos " + e);
		}
	}

}
