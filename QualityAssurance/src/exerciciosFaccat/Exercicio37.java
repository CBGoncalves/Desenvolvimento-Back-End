package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			double precoMorangos, precoMacas, quantidadeMorangos, quantidadeMacas, valorTotal, desconto;

			System.out.println("Digite a quantidade em KG de morangos:");
			quantidadeMorangos = sc.nextDouble();
			System.out.println("Digite a quantidade em KG de maçãs:");
			quantidadeMacas = sc.nextDouble();

			if (quantidadeMorangos < 5) {
				precoMorangos = quantidadeMorangos * 2.50;
			} else {
				precoMorangos = quantidadeMorangos * 2.20;
			}
			if (quantidadeMacas < 5) {
				precoMacas = quantidadeMacas * 1.80;
			} else {
				precoMacas = quantidadeMacas * 1.50;
			}
			valorTotal = precoMorangos + precoMacas;
			if (quantidadeMorangos + quantidadeMacas > 8 || valorTotal > 25) {
				desconto = valorTotal * 0.10;
				valorTotal = valorTotal - desconto;

			}
			System.out.println("Valor total é de R$" + valorTotal);

			sc.close();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
