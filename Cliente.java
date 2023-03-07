package br.com.banco;

import java.util.Calendar;

public class Cliente {
	private String nome;
	private String endereco;
	private String data;

	
	public Cliente(String nome, String endereco, String data) {

		this.nome = nome;
		this.endereco = endereco;
		this.data = data;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	


}
