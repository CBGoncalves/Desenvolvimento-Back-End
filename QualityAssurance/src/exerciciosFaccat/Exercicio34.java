package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);

			int x, y, z;

			System.out.println("Por gentileza, digite o valor de x:");
			x = sc.nextInt();
			System.out.println("Por gentileza, digite o valor de y:");
			y = sc.nextInt();
			
			z = x * y + 5;

			if (z == 0) {
				System.out.println("Resposta A, número é " + z + ".");
			} else if (z <= 100) {
				System.out.println("Resposta B, número é " + z + ".");
			} else {
				System.out.println("Resposta C, número é " + z + ".");
			}
			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
