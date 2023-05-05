package Polimorfismo;

public class Sobrecarga {
	int n1=1, n2=3;
	
	// não possui assinatura
	public void soma() {
		System.out.println("A soma e: " + (n1 + n2));
	}

	// mesma classe, mas possui assinatura
	public void soma(int x) {
		this.n1=x;
		System.out.println("A soma e: " + (n1 + n2));
	}
	
	// assinatura diferente pois tipo do parâmetro é diferente
	public void soma(double x) {
		System.out.println("A soma e: " + (x + n2));
	}
	
	public void soma(int x, int y) {
		this.n1=x;
		this.n2=y;
		System.out.println("A soma e: " + (n1 + n2));
		
	}
	
	public void soma(int x, double y) {
		System.out.println("A soma e: " + (x + y));
	}
	
	public void soma(double x, int y) {
		System.out.println("A soma e: " + (x + y));
	}
}
