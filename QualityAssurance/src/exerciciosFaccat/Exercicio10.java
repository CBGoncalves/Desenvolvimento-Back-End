package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			double custoFabrica, percenDistribuidor, impostos, valorFinal;
			
			System.out.println("Qual é o custo de fabrica do automóvel: ");
			custoFabrica = sc.nextDouble();
			
			if (custoFabrica <= 0) {
				System.out.println("Porfavor, digite um valor maior que 0");
			} else{
				percenDistribuidor = custoFabrica * 0.28;
				impostos = custoFabrica * 0.45;
				
				valorFinal = custoFabrica + percenDistribuidor + impostos;
				
				System.out.printf("O valor final do veículo é de R$ %.2f", valorFinal);
				
			}
			sc.close();				
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: "+e);
		}


	}

}
