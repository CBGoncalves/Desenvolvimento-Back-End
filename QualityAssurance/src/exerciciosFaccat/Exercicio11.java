package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			int quantidadeVendas;
			double valorTotalVendas, salarioFixo, comissaoPorVenda, comissaoFixa, percentualVendas, salarioFinal;

			System.out.println("Para o calculo do salário final, digite as seguintes informações");

			System.out.println("Quantos carros foram vendidos: ");
			quantidadeVendas = sc.nextInt();

			System.out.println("Qual foi o valor total em vendas: ");
			valorTotalVendas = sc.nextDouble();

			System.out.println("Salario fixo do funcionario: ");
			salarioFixo = sc.nextDouble();

			System.out.println("Comissão por venda: ");
			comissaoPorVenda = sc.nextDouble();

			if (quantidadeVendas < 0 || valorTotalVendas < 0 || salarioFixo < 0 || comissaoPorVenda < 0) {
				System.out.println("Por favor, digite um valor valido");
			} else {
				comissaoFixa = comissaoPorVenda * quantidadeVendas;
				percentualVendas = valorTotalVendas * 0.05;
				
				salarioFinal = salarioFixo + comissaoFixa + percentualVendas;
				
				System.out.printf("O salario final do funcionario é de R$ %.2f", salarioFinal);
				
			}
			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
