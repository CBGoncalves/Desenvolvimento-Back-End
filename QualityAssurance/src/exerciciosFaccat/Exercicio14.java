package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();

		if (valor > 10) {
			System.out.println("É MAIOR QUE 10");
		} else if(valor == 10) {
			System.out.println("É IGUAL A 10");
		} else {
			System.out.println("NÃO É MAIOR QUE 10");
		}
		
		sc.close();
	}

}
