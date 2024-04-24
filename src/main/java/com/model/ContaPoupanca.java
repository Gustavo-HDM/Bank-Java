package com.model;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int agencia, Double saldo, Cliente cliente) {
		super();
		setAgencia(agencia);
		setSaldo(saldo);
		setCliente(cliente);
	}
	
	public ContaPoupanca() {}
	
}
