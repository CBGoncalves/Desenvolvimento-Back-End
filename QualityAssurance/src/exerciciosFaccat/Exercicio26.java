package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			int estoqueAtual, quantidadeMaxima, quantidadeMinima, quantidadeMedia;

			System.out.println("Digite a quantidade atual do estoque: ");
			estoqueAtual = sc.nextInt();

			System.out.println("Digite a quantidade máxima em estoque: ");
			quantidadeMaxima = sc.nextInt();

			System.out.println("Digite a quantidade mínima em estoque: ");
			quantidadeMinima = sc.nextInt();

			quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

			if (estoqueAtual >= quantidadeMedia) {
				System.out.println("Não efetuar compra.");
			} else {
				System.out.println("Efetuar compra.");
			}

			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
