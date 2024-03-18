package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			double precoGasolina = 3.30, precoAlcool = 2.90, total;
			char tipoCombuistivel;

			System.out.println("Digite quantos litros de combustível você abasteceu:");
			double quantcombust = sc.nextDouble();
			System.out.println("Digite o tipo de combustivel (A para Alcool, G para Gasolina).");
			tipoCombuistivel = sc.next().charAt(0);

			if ((tipoCombuistivel == 'a') || (tipoCombuistivel == 'A')) {
				if (quantcombust <= 20) {
					total = quantcombust * precoAlcool * 0.97;
					System.out.println("Total a ser pago é de R$ " + total + ".");

				} else {
					total = quantcombust * precoAlcool * 0.95;
					System.out.println("Total a ser pago é de R$ " + total + ".");

				}
			} else if ((tipoCombuistivel == 'g') || (tipoCombuistivel == 'G')) {
				if (quantcombust <= 20) {
					total = quantcombust * precoGasolina * 0.96;
					System.out.println("Total a ser pago é de R$ " + total + ".");

				} else {
					total = quantcombust * precoGasolina * 0.94;
					System.out.println("Total a ser pago é de R$ " + total + ".");

				}

			} else {
				System.out.println("Tipo de combustível inválido.");
			}

			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
