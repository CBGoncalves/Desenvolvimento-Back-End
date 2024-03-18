package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			int codigo, senha;

			System.out.println("Digite o código do usuário:");
			codigo = sc.nextInt();
			
			if (codigo != 1234) {
				System.out.println("Usuário inválido.");
				
			} else {
				System.out.println("Digite a senha:");
				senha = sc.nextInt();
				
				if (senha != 9999) {
					System.out.println("Senha incorreta.");
				} else {
					System.out.println("Acesso permitido.");
				}
			}

			sc.close();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}

	}

}
