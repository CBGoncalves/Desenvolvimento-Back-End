package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			double nota1, nota2, media;
			
			System.out.println("Digite a primeira nota: ");
			nota1 = sc.nextDouble();
			
			System.out.println("Digite a primeira nota: ");
			nota2 = sc.nextDouble();
			
			media = (nota1 + nota2) / 2;
			
			if ((media < 0) && (media > 10)) {
				System.out.println("O programa aceita somente números entre 0 e 10");
			} else if (media >= 6) {
				System.out.printf("Aluno Reprovado! Média: %.2f" + media);
			} else {
				System.out.printf("Aluno Aprovado! Média: %.2f" + media);
			}
			
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Digite um valor válido: "+e);
		}
	}

}
