package com.model;

public class ContaCorrente extends Conta{

	private static final String TIPO_CONTA = "Conta Corrente";
	
	public ContaCorrente() {}
	
	public ContaCorrente(int agencia, Double saldo, Cliente cliente) {
		super(agencia, saldo, cliente);
	}
	
	
	public ContaCorrente(Double saldo) {
		super.setSaldo(saldo);;
	}

	@Override
	public String toString() {
		return "Tipo Conta : " + this.TIPO_CONTA;
	}
}
