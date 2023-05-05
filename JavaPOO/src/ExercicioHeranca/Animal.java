package ExercicioHeranca;

public abstract class Animal {
	
	private double peso = 0;
	private boolean andando = false;
	private boolean som = false;
	
	public void locomover() {
		andando = true;
		if(andando == true) {
			System.out.println("O animal está andando....");
		}
	}
	
	public void emitirSom() {
		som = true;
		if(som == true) {
			System.out.println("O animal está emitindo som...");
		}
	}
	
	public double getPeso() {	
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
