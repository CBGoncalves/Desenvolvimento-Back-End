package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			int valorA, valorB, valorC, valorFinal;

			System.out.println("Digite o primeiro valor:");
			valorA = sc.nextInt();
			System.out.println("Digite o segundo valor:");
			valorB = sc.nextInt();
			System.out.println("Digite o terceiro valor:");
			valorC = sc.nextInt();

			if ((valorA == valorB) || (valorA == valorC) || (valorB == valorC)) {
				System.out.println("Não é possivel digitar valores repetidos!");
			} else if ((valorA > valorB) && (valorA > valorC) && (valorB > valorC)) {
				valorFinal = valorA + valorB;
				System.out.println("A soma dos dois maiores valores é de " + valorFinal + ".");

			} else if ((valorA > valorB) && (valorA > valorC) && (valorC > valorB)) {
				valorFinal = valorA + valorC;
				System.out.println("A soma dos dois maiores valores é de " + valorFinal + ".");

			} else if ((valorB > valorA) && (valorB > valorC) && (valorC > valorA)) {
				valorFinal = valorB + valorC;
				System.out.println("A soma dos dois maiores valores é de " + valorFinal + ".");

			} else if ((valorB > valorA) && (valorB > valorC) && (valorA > valorC)) {
				valorFinal = valorB + valorA;
				System.out.println("A soma dos dois maiores valores é de " + valorFinal + ".");

			} else if ((valorC > valorA) && (valorC > valorB) && (valorB > valorA)) {
				valorFinal = valorB + valorC;
				System.out.println("A soma dos dois maiores valores é de " + valorFinal + ".");

			} else if ((valorC > valorA) && (valorC > valorB) && (valorA > valorB)) {
				valorFinal = valorA + valorC;
				System.out.println("A soma dos dois maiores valores é de " + valorFinal + ".");

			}

			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
