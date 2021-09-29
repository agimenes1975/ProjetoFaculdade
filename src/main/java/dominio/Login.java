package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
	
	public Login(String senha) {
		super();
		this.senha = senha;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matricula;
	private String senha;
	
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
