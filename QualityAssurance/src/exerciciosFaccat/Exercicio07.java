package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int anos, meses, dias, totalDias;

		System.out.println("Digite a sua idade em:");

		System.out.println("Anos - ");
		anos = sc.nextInt();

		System.out.println("Meses - ");
		meses = sc.nextInt();

		System.out.println("Dias - ");
		dias = sc.nextInt();

		totalDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Sua idade total em dias é de "+ totalDias +" dias");
		
		sc.close();

	}
}
