package com.model;

public class ContaCorrente extends Conta{

	public ContaCorrente() {}
	
	public ContaCorrente(int agencia, Double saldo, Cliente cliente) {
		super.setAgencia(agencia);
		super.setSaldo(saldo);
		super.setCliente(cliente);
	}
	
}
