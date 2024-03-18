package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			int quantidadeHorasTrabalhadas;
			float valorHora, salarioFinal;
			
			System.out.println("Digite a quantidade de horas trabalhadas: ");
			quantidadeHorasTrabalhadas = sc.nextInt();
			
			System.out.println("Digite o valor recebido por cada hora trabalhada: ");
			valorHora = sc.nextFloat();
			
			if (quantidadeHorasTrabalhadas < 161) {
				salarioFinal = quantidadeHorasTrabalhadas * valorHora;
				System.out.printf("O valor a ser recebido é: R$ %.2f" , salarioFinal);
			} else {
				salarioFinal = (160 * valorHora) + (valorHora + valorHora * 50 / 100);
				System.out.printf("O valor a ser recebido é: R$ %.2f" , salarioFinal);
			}
			
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: "+e);
		}
	}

}
