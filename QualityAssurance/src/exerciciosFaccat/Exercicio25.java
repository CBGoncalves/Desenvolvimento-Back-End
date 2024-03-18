package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			double conta, saldoAtual, saldo = 0, debito = 0, credito = 0;

			System.out.println("Digite o número da conta:");
			conta = sc.nextDouble();

			System.out.println("Digite o saldo da conta:");
			saldo = sc.nextDouble();

			System.out.println("Digite o valor de débito:");
			debito = sc.nextDouble();

			System.out.println("Digite o valor de crédito:");
			credito = sc.nextDouble();

			saldoAtual = saldo - debito + credito;

			if (saldoAtual >= 0) {
				System.out.println("Saldo positivo!");
			} else {
				System.out.println("Saldo negativo!");

			}
			
			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
