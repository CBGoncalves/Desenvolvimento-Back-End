package exerciciosManzano;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			int base, expoente, resultado;

			System.out.println("Digite o valor da base: ");
			base = sc.nextInt();

			System.out.println("Digite o valor do expoente: ");
			expoente = sc.nextInt();

			resultado = 1;
			for (int i = 0; i < expoente; i++) {
				resultado = resultado * base;
			}

			System.out.println("A potência é: " + resultado + ".");

			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
