package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			int inicio = 0, fim = 0, duracao;
			
			while ((inicio < 0) || (inicio > 23)) {
				System.out.println("Digite o horario de inicio do jogo: ");
				inicio = sc.nextInt();
			}
			while ((fim < 0) || (fim > 23)) {
				System.out.println("Digite o horario do fim do jogo: ");
				fim = sc.nextInt();
			}
			
			duracao = inicio - fim;
			
			if (duracao < 0) {
				duracao = duracao * -1;
				System.out.println("Duração do jogo: "+duracao);
			} else if (duracao > 0) {
				duracao = 24 - duracao;
				System.out.println("Duração do jogo: "+duracao);
			}
			
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: "+e);
		}

	}

}
