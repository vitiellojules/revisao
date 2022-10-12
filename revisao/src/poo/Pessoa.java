package poo;

import java.time.LocalDateTime;

public abstract class Pessoa {
	private String nome;
	private LocalDateTime DataNasc;
	private String email;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDateTime getDataNasc() {
		return DataNasc;
	}
	public void setDataNasc(LocalDateTime dataNasc) {
		DataNasc = dataNasc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
