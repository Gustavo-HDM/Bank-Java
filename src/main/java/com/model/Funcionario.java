package com.model;

public class Funcionario extends Pessoa{
	
	private Double salario;
	private String funcao;
	private boolean status;
	private static final String NACIONALIDADE = "Brasileiro";
	
	public Funcionario() {}
	
	public Funcionario(String nome, String cidade, int idade, String cpf) {
		super(nome, cidade, idade, cpf);
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + super.getNome() + ", idade=" + super.getIdade() + ", cidade=" + super.getCidade() + ", salario=" + salario
				+ ", funcao=" + this.funcao + ", cpf=" + super.getCpf() + ", status=" + this.status + ", Nacionalidade: "+ Funcionario.NACIONALIDADE + "]";
	}
	
	
}
