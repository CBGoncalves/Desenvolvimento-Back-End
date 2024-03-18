public class Emp {
	private int idusuario;
	private String nome, senha, email, pais;

	public int getId() {
		return idusuario;
	}

	public void setId(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return senha;
	}

	public void setPassword(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return pais;
	}

	public void setCountry(String pais) {
		this.pais = pais;
	}

}