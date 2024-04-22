package com.model;

import com.abstracts.Pessoa;

public class Cliente extends Pessoa{

	
	String nome;
	String cidade;
	int idade;
	String cpf;
	String contaStatus;
	static double valorMax = 50000.00;
	static final double VALOR_ENTRADA = 300.00;
	
	//Getters $ Setters
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
	public String getContaStatus() {
		return contaStatus;
	}
	public void setContaStatus(String contaStatus) {
		this.contaStatus = contaStatus;
	}
	
	@Override
	public void consultar() {
		System.out.println("Nome: " + getNome() + "\n" +
						   "Idade: " + getIdade() + "\n" +
						   "Cidade: " + getCidade() + "\n" +
						   "Status da Conta: " + getContaStatus() + "\n" +
						   "Valor Máximo a depositar: " + String.valueOf(valorMax) + "\n" +
						   "Valor de entrada da conta: " + String.valueOf(VALOR_ENTRADA)+ "\n");
	}
}
