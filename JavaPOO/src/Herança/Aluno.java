package Herança;

public class Aluno extends Pessoa {
	
	private long ra;
	private String curso;
	
	public void entregarAtividade() {
		
		System.out.println("atividade entrege com sucesso");
	}

	public long getRa() {
		return ra;
	}

	public void setRa(long ra) {
		this.ra = ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public void marcarPresenca() {
		// TODO Auto-generated method stub
		
	}
	

}
