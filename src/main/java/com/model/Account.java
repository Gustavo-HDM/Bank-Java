package com.model;

public abstract class Account {

	private int agency = 0000;
	private Double balance = 0.00;
	private String cpf;
	
	public Account() {}
	
	public Account(int agency, Double balance, String cpf) {
		super();
		this.agency = agency;
		this.balance = balance;
		this.cpf = cpf;
	}
	
	public int getAgency() {
		return agency;
	}
	public void setAgency(int agency) {
		this.agency = agency;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
}
