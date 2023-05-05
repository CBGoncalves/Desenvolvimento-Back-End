package introducao;

import java.util.Scanner;

public class Calculadora {
	Scanner Sc =new Scanner (System.in);
	long n1 = 51, n2 = 666, op;

	public void conta() {

		System.out.print(" Escolha uma opção: \n 1 - soma \n 2 - subtração\n 3 - divisão \n 4 - multiplicação: ");
		op = Sc.nextLong();
	
	}

}
