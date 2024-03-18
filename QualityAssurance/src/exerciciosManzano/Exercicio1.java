package exerciciosManzano;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int contador = 1, tabuada;
		
		System.out.println("Digite o número: ");
		tabuada = sc.nextInt();
		
		while (contador < 11) {
			
			int resultado = tabuada * contador;
			System.out.println(tabuada +" X "+contador+" = "+resultado);
			
			contador ++;
		}
		
		sc.close();
	}
}
