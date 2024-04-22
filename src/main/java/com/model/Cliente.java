package com.model;

public class Cliente extends Pessoa{
	
	public Cliente() {}
	
	public Cliente(String nome) {
		super.setNome(nome);
	}
	
	public Cliente(String nome, String cidade, int idade, String cpf) {
		super(nome, cidade, idade, cpf);
	}
	
}
