package exemplo;

public class ExemploVetor01 {

	public static void main(String[] args) {
		
		// Criando arrays de diferentes tipos de dados e atribuindo valores
		String [] nome = {"Carlos", "Jailson", "Rafael", "Denis", "Erick", "Daniel"};
		int [] numeros = {12,3,5,6,7};
		boolean [] metas = {false, true, true, false};
		
		// Imprimindo valores de acordo com a posicao no array
		System.out.println(nome[1]+" "+nome[4]);
		System.out.println(numeros[3]);
		
		// Atribuindo valores a uma posicao do array
		nome[3] = "Thomaz";
		System.out.println(nome[3]);
		
		// Exibindo tamanho do array a partir da propriedade .length
		System.out.println(nome.length);
		System.out.println(numeros.length);
		
		
		/* imprimindo os valores do vetor a partir do tamanho, enquanto o contador "i"
		 * for menor que o tamanho do array "numeros" ele vai adicionar 1 ao contador e
		 * imprimir um valor do array, de acordo com o valor atual do contador
		 */
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		// imprimindo a quantidade de valores verdadeiros dentro do array metas
		int contador = 0;
		for (int i = 0; i < metas.length; i++) {
			if(metas[i] == true) {
				contador ++;
			}
		}
		System.out.println(contador);
		
		// for-each: percorre o array inteiro
		for (boolean b : metas) {
			System.out.println(b);
		}
	}

}
