package exerciciosManzano;

import java.util.Scanner;

public class Temporizador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos minutos no temporizador: ");
		int min = sc.nextInt();

		System.out.println("Digite quantos segundos no temporizador: ");
		int seg = sc.nextInt();

		if (min <= 60 || seg <= 60) {

			do {
				System.out.println(min + " : " + seg);
				seg--;
			} while (seg > -1);

			min--;

			for (int i = min; i > -1; i--) {
				for (int j = 59; j > -1; j--) {
					System.out.println(i + " : " + j);
				}
			}

		} else {
			System.out.println("Erro: os minutos ou segundos não podem ser maiores que 59");
		}

		sc.close();
	}

}
