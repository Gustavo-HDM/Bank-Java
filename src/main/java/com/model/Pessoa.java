package com.model;

public abstract class Pessoa {

	private String nome;
	private String cidade;
	private int idade;
	private String cpf;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String cidade, int idade, String cpf) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
