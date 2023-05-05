package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			double valor, total;
			int macas;
			
			System.out.println("Digite o quantidade de maças que deseja comprar: ");
			macas = sc.nextInt();
			
			if (macas < 1) {
				System.out.println("Por favor, digite uma quantidade valida");
			} else if (macas < 12) {
				valor = 1.30;
				total = macas * valor;
				System.out.printf("O valor total a pagar por " + macas + " é: R$ %.2f", total);
			} else {
				System.out.printf("O valor total a pagar por " + macas + " é: R$", macas ,",00");
			}
			
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Digite somente números inteiros: "+e);
		}
	}

}
