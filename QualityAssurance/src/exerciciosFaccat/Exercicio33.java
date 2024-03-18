package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			int valorA, valorB;

			System.out.println("Digite o primeiro valor:");
			valorA = sc.nextInt();
			System.out.println("Digite o segundo valor:");
			valorB = sc.nextInt();

			if (valorA == valorB) {
				System.out.println("Não é possivel digitar valores repetidos!");
			} else if (valorA > valorB) {
				System.out.println("O primeiro valor é maior que o segundo");
			} else {
				System.out.println("O segundo valor é maior que o primeiro.");
			}
			
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
