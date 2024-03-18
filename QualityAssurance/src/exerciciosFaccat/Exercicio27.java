package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			int n1;
			
			System.out.println("Digite um número inteiro:");
			n1 = sc.nextInt();
			
			if (n1 == 0) {
				System.out.println("Por favor, digite um valor válido!");
			} else if (n1 > 0) {
				System.out.println("Esse número é positivo.");
			} else {
				System.out.println("Esse número é negativo.");
			}

			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
