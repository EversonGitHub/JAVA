package Serialização;

import java.io.Serializable;

public class Aluno implements Serializable {
	private Long id;
	private String nome;
	private transient String password;
	
	public Aluno(Long id, String n, String p) {
		id = id;
		nome = n;
		password = p;
	}
	
	@Override
	public String toString() {
		return "Aluno - ID:" + id + ".\n Nome:" + nome + ".\n Password:" + password;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}