package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			int valorA, valorB;
			
			System.out.println("Digite o valor A: ");
			valorA = sc.nextInt();
			
			System.out.println("Digite o valor B: ");
			valorB = sc.nextInt();
			
			if (valorA == valorB) {
				System.out.println("Os valores não podem ser iguais!");
			} else if(valorA > valorB) {
				System.out.println("Valores em ordem crescente: "+valorA+", "+valorB);
			} else {
				System.out.println("Valores em ordem crescente: "+valorB+", "+valorA);
			}
			
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: "+e);
		}

	}

}
