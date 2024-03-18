/*Para  o  enunciado  a  seguir  foi  elaborado  um  algoritmo  em  Português
 *Estruturado  que contém erros, identifique os erros no algoritmo apresentado abaixo:
 *
 *Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) 
 *de uma pessoa, calcule e mostre seu peso ideal, utilizando as seguintes fórmulas: 
 *
 *	- para sexo masculino:  peso ideal = (72.7 * altura) - 58 
 *	- para sexo feminino:  peso ideal = (62.1 * altura) - 44.7 
 *	inicio 
 *		ler nome 
 *		ler sexo 
 *		se sexo = M então 
 *			peso_ideal < (72.7 * altura) - 58 
 *		senão 
 *			peso_ideal < (62.1 * altura) – 44.7
 *  	fim_se 
 *  	escrever  peso_ideal 
 *	fim 
 * */

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			String nome;
			char sexo;
			double altura, pesoIdeal;
			
			System.out.println("Digite seu nome:");
			nome = sc.next();
			
			System.out.println("Digite o seu sexo:");
			sexo = sc.next().charAt(0);
			
			System.out.println("Digite sua altura:");
			altura = sc.nextDouble();
			
			if ((sexo == 'm') || (sexo == 'M')) {
				pesoIdeal = 72.2 * altura - 58;
				System.out.printf("O peso ideal do(a) " + nome + " é de " + pesoIdeal + " kg.");
				
			} else if ((sexo == 'f') || (sexo == 'F')) {
				pesoIdeal = 72.2 * altura - 44.7;
				System.out.printf("O peso ideal do(a) " + nome + " é de " + pesoIdeal + " kg.");
			} else {
				System.out.println("Digite um sexo válido!");
			}
			
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: "+e);
		}
		

	}

}
