package exerciciosManzano;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			
			int n1;
			
			System.out.println("Digite um valor:");
			n1 = sc.nextInt();
			
			for (int cont = 0; cont < 11; cont++) {
				System.out.println(cont + "X" + n1 + "=" + n1 * cont);
			}

			sc.close();
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
