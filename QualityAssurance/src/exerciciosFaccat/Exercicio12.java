package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			int Fahrenheit, Celsius;

			System.out.println("Digite a temperatura em Fahrenheit: ");
			Fahrenheit = sc.nextInt();

			Celsius = (Fahrenheit - 32) * 5 / 9;
			
			System.out.println("Temperatura convertida em Grau Celsius: " + Celsius + "°C");

			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu em erro: " + e);
		}

	}

}
