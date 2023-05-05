package ExercicioHeranca;

public class Cachorro extends Animal {
	
	private String cor;
	private double comprimentoPelo;
	private boolean andando = false;
	private boolean som = false;
	
	// Aplicando sobreposicao
	@Override
	public void locomover() {
		andando = true;
		if(andando == true) {
			System.out.println("Correndo....");
		}
	}
	// Aplicando sobreposicao
	@Override
	public void emitirSom() {
		som = true;
		if(som == true) {
			System.out.println("Latindo...");
		}
	}
	
	public String getCor() {	
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getComprimentoPelo() {
		return comprimentoPelo;
	}
	
	public void setComprimentoPelo(double comprimentoPelo) {
		this.comprimentoPelo = comprimentoPelo;
	}
}
