package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			int valorA, valorB, valorC;

			System.out.println("Digite o primeiro valor:");
			valorA = sc.nextInt();
			System.out.println("Digite o segundo valor:");
			valorB = sc.nextInt();
			System.out.println("Digite o terceiro valor:");
			valorC = sc.nextInt();

			if ((valorA == valorB) || (valorA == valorC) || (valorB == valorC)) {
				System.out.println("Não é possivel digitar valores repetidos!");
				
			} else if ((valorA > valorB) && (valorA > valorC)) {
				System.out.println(valorA + "\nO primeiro valor é o maior.");
				
			} else if ((valorB > valorA) && (valorB > valorC)) {
				System.out.println(valorB + "\nO segundo valor é o maior.");
				
			} else if ((valorC > valorA) && (valorC > valorB)) {
				System.out.println(valorC + "\nO terceiro valor é o maior.");
				
			}

			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
