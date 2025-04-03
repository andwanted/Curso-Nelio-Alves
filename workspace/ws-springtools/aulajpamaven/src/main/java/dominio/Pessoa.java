package dominio;

import java.io.Serializable;

public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String pessoa;
	private String email;
	
	public Pessoa() {
		
	}

	public Pessoa(Integer id, String pessoa, String email) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", pessoa=" + pessoa + ", email=" + email + "]";
	}
	
	
	
}
