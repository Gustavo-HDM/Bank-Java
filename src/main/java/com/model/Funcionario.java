package com.model;

import com.abstracts.Pessoa;

public class Funcionario extends Pessoa{
	
	String nome;
	int idade;
	String cidade;
	Double salario;
	String funcao;


	String cpf;
	boolean status;
	static final String NACIONALIDADE = "Brasileiro";

	//Getters $ Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	//O STATUS PODERIA SER UM SIMPLES STRING, MAS PARA EXPERIMENTAR UTILIZEI UM boolean
	@Override
	public void consultar() {
		String status;
		if (isStatus()) {
			status = "Ativo";
		} else {
			status = "Inativo";
		}
		System.out.println("Nome: " + getNome() + "\n" +
				   "Idade: " + getIdade() + "\n" +
				   "Cidade: " + getCidade() + "\n" +
				   "Função: " + getFuncao() + "\n" +
				   "Status: " + status + "\n" +
				   "Nacionalidade: " + NACIONALIDADE + "\n");
	}
}
