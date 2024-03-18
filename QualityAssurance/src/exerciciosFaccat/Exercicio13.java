/* O algoritmo a seguir calcula a média ponderada de um aluno a partir de três notas, e
 * por se tratar da média poderada, leva em consideração o peso das três notas, sendo
 * respectivamente pesos 2, 3 e 5.
 * */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			
			double n1, n2, n3, notaFinal;
			
			System.out.println("----- Digite três notas -----");
			
			System.out.println("Nota 1: ");
			n1 = sc.nextDouble();
			
			System.out.println("Nota 2: ");
			n2 = sc.nextDouble();
			
			System.out.println("Nota 3: ");
			n3 = sc.nextDouble();
			
			if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10) {
				System.out.println("Por favor, digite notas entre 0 e 10.");
			} else {
				notaFinal = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
				System.out.printf("A media final é de %.1f", notaFinal);
			}
			
			sc.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro " + e);
		}

	}

}
