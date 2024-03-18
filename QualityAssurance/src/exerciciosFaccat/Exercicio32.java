package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			String timeA, timeB;
			int golsA, golsB;

			System.out.println("Digite o nome do primeiro time: ");
			timeA = sc.next();
			System.out.println("Digite a quantidade de gols que o primeiro time marcou: ");
			golsA = sc.nextInt();
			System.out.println("Digite o nome do segundo time: ");
			timeB = sc.next();
			System.out.println("Digite a quantidade de gols que o segundo time marcou: ");
			golsB = sc.nextInt();

			if (golsA > golsB) {
				System.out.println("Vitória do time " + timeA + "!");

			} else if (golsB > golsA) {
				System.out.println("Vitória do time " + timeB + "!");

			} else {
				System.out.println("Empate!");
			}

			sc.close();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
