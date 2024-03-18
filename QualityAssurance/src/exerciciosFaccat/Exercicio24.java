package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			double salarioFixo, valorVendas, comissao, resultado, comissaoFinal, valor;

			System.out.println("Digite o salário fixo do funcionário:");
			salarioFixo = sc.nextDouble();
			System.out.println("Digite o valor das vendas efetuadas:");
			valorVendas = sc.nextDouble();

			if (valorVendas <= 1500.0) {
				comissao = valorVendas * 0.03;
				resultado = comissao + salarioFixo;
				System.out.println("O valor final é de R$" + resultado + " reais.");

			} else if (valorVendas > 1500.0) {
				valor = valorVendas - 1500.0;
				comissao = 45;
				comissaoFinal = valor * 0.05;
				resultado = comissao + comissaoFinal + salarioFixo;
				System.out.println("O valor final é de R$" + resultado + " reais.");
			}
			
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: "+e);
		}

	}

}
