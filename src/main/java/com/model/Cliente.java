package com.model;

public class Cliente extends Pessoa{
	
//	private Conta conta;
//	
//	public Conta getConta() {
//		return conta;
//	}
//
//	public void setConta(Conta conta) {
//		this.conta = conta;
//	}

	public Cliente() {}
	
	public Cliente(String nome) {
		super.setNome(nome);
	}
	
	public Cliente(String nome, String cidade, int idade, String cpf) {
		super(nome, cidade, idade, cpf);
	}

//	public void definirTipoConta(Conta conta) {
//		this.conta = conta;
//	}
	
	@Override
	public String toString() {
		
//		String tipoConta = (conta instanceof ContaCorrente)
//				? "Conta Corrente" : "ContaPoupança";
		
		return "\nNome: " + super.getNome() +
				"\nIdade: " + super.getIdade() +
				"\nCPF: " + super.getCpf() +
				"\nCidade: " + super.getCidade();
//				+
//				"\nTipo de Conta: " + tipoConta +
//				"\nAgência: " + this.conta.getAgencia() +
//				"\nSaldo " + this.conta.getSaldo() + "\n";
				
	}
}
