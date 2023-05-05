package Herança;

public class Professor extends Pessoa {
	private String diciplina;
	private double salario;
	
	public void aumentarSalario(double x) {
     this.salario+=x;
	}

	public String getDiciplina() {
		return diciplina;
	}

	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
		
	}

	@Override
	public void marcarPresenca() {
		// TODO Auto-generated method stub
		
	}
}
