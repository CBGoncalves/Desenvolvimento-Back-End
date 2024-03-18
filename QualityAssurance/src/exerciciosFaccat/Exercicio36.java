package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			int idadeHomem1, idadeHomem2, idadeMulher1, idadeMulher2;

			System.out.println("Digite a idade do primeiro homem:");
			idadeHomem1 = sc.nextInt();
			System.out.println("Digite a idade do segundo homem:");
			idadeHomem2 = sc.nextInt();
			System.out.println("Digite a idade da primeira mulher:");
			idadeMulher1 = sc.nextInt();
			System.out.println("Digite a idade da segunda mulher:");
			idadeMulher2 = sc.nextInt();

			if (idadeHomem1 == idadeHomem2 || idadeMulher1 == idadeMulher2) {
				System.out.println("Não é possivel digitar valores repetidos!");

			} else if ((idadeHomem1 > idadeHomem2) && (idadeMulher1 > idadeMulher2)) {
				System.out.println("A soma de idades do homem mais velho com a mulher mais nova é de "
						+ (idadeHomem1 + idadeMulher2) + ".");

			} else if ((idadeHomem1 < idadeHomem2) && (idadeMulher1 > idadeMulher2)) {
				System.out.println("A soma de idades do homem mais velho com a mulher mais nova é de "
						+ (idadeHomem2 + idadeMulher2) + ".");

			} else if ((idadeHomem1 > idadeHomem2) && (idadeMulher1 < idadeMulher2)) {
				System.out.println("A soma de idades do homem mais velho com a mulher mais nova é de "
						+ (idadeHomem1 + idadeMulher1) + ".");

			} else if ((idadeHomem1 < idadeHomem2) && (idadeMulher1 < idadeMulher2)) {
				System.out.println("A soma de idades do homem mais velho com a mulher mais nova é de "
						+ (idadeHomem2 + idadeMulher1) + ".");

			}
			sc.close();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
