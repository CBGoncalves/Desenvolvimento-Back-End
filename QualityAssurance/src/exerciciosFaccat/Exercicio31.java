package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio31 {

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

			if ((valorA < valorB + valorC) && (valorB < valorA + valorC) && (valorC < valorA + valorB)) {
				System.out.println("Forma um triângulo.");
			} else {
				System.out.println("Não forma um triângulo.");
			}
			
			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
