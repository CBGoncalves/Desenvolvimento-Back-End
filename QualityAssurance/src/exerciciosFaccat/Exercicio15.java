package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double valor;

		System.out.println("Digite um valor: ");
		valor = sc.nextInt();

		if (valor >= 0) {
			System.out.println("O valor digitado é positivo: " + valor);
		} else {
			System.out.println("O valor digitado é negativo: " + valor);
		}

		sc.close();

	}

}
