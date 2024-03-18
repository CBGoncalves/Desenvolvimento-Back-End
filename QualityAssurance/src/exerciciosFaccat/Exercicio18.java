package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			int anoAtual, anoNascimento, idade;

			System.out.println("Digite o ano atual: ");
			anoAtual = sc.nextInt();

			System.out.println("Digite o ano que você nasceu: ");
			anoNascimento = sc.nextInt();

			if (anoAtual < 2023 || anoNascimento < 0) {
				System.out.println("Digite anos validos");
			} else {
				idade = anoAtual - anoNascimento;

				if (idade < 16) {
					System.out.println("Você não pode votar");
				} else {
					System.out.println("Você pode votar");
				}

			}
			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}
}
