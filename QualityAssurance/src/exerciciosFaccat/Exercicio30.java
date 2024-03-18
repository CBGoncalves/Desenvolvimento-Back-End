package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			int valorA, valorB, valorC;

			System.out.println("Digite o primeiro valor:");
			valorA = sc.nextInt();
			System.out.println("Digite o segundo valor:");
			valorB = sc.nextInt();
			System.out.println("Digite o terceiro valor:");
			valorC = sc.nextInt();
			
			if ((valorA == valorB) || (valorA == valorC) || (valorB == valorC)) {
				System.out.println("Não é possivel digitar valores repetidos!");
				
			} else if ((valorA > valorB) && (valorA > valorC) && (valorB > valorC)) {
				System.out.println(valorC + ", " + valorB + ", " + valorA);
				
			} else if ((valorA > valorB) && (valorA > valorC) && (valorC > valorB)) {
				System.out.println(valorB + ", " + valorC + ", " + valorA);
				
			} else if ((valorB > valorA) && (valorB > valorC) && (valorA > valorC)) {
				System.out.println(valorC + ", " + valorA + ", " + valorB);
				
			} else if ((valorB > valorA) && (valorB > valorC) && (valorC > valorA)) {
				System.out.println(valorA + ", " + valorC + ", " + valorB);
				
			} else if ((valorC > valorA) && (valorC > valorB) && (valorA > valorB)) {
				System.out.println(valorB + ", " + valorA + ", " + valorC);
				
			} else if ((valorC > valorA) && (valorC > valorB) && (valorB > valorA)) {
				System.out.println(valorA + ", " + valorB + ", " + valorC);
			}
			
			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
