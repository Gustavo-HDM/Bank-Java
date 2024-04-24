package com.model;

public abstract class Conta {

	private int agencia = 0000;
	private Double saldo = 0.00;
	private Cliente cliente; //CPF
	
	public Conta() {}
	
	public Conta(int agencia, Double saldo, Cliente cliente) {
		super();
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
