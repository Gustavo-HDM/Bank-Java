package com.model;

public class ContaPoupanca extends Conta {

	private static final String TIPO_CONTA = "Conta Poupança";

	public ContaPoupanca() {
	}

	public ContaPoupanca(int agencia, Double saldo, Cliente cliente) {
		super(agencia, saldo, cliente);
	}

	public ContaPoupanca(Double saldo) {
		super.setSaldo(saldo);
	}

	@Override
	public String toString() {
		return "Tipo Conta : " + this.TIPO_CONTA;
	}
}