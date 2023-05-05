package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String args[]) {
		
		int num;
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite um numero: ");
			num = sc.nextInt();
			
			num = num - 1;
			
			System.out.println("O antecessor do numero digitado e"+ num);
			sc.close();	
			
		} catch (Exception e) {
			System.out.println("Favor inserir um numero valido " + e);
		}
	}
}
