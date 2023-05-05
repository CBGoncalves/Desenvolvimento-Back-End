package ExercicioHeranca;

public class Arara extends Animal {
	private String cor;
	private boolean andando = false;
	private boolean som = false;
	
	// Aplicando sobreposicao
	@Override
	public void locomover() {
		andando = true;
		if(andando == true) {
			System.out.println("Voando....");
		}
	}
	// Aplicando sobreposicao
	@Override
	public void emitirSom() {
		som = true;
		if(som == true) {
			System.out.println("Falando...");
		}
	}
	
	public String getCor() {	
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
}
