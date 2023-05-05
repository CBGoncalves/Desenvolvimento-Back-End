package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a primeira nota: ");
		nota2 = sc.nextDouble();
		
		media = (nota1+nota2)/2;
		
		if (media < 0) {
			System.out.println("Notas não podem ser menores que zero! Digite notas válidas!");
		} else if(media >= 0 && media < 6){
			System.out.printf("Aluno Reprovado! Média: %.2f"+media);
		} else if (media >= 6 && media <= 10) {
			System.out.printf("Aluno Aprovado! Média: %.2f"+media);
		} else if (media > 10) {
			System.out.printf("Notas não podem ser maiores que 10! Digite notas válidas!");
		}
		
		sc.close();
	}

}
