package com.model;

import com.util.AccountType;

public class SavingsAccount extends Account{

	private Double rendMensal;
	
	public Double getRendMensal() {
		return rendMensal;
	}
	
	public void setRendMensal(Double rendMensal) {
		this.rendMensal = rendMensal;
	}
	
	public SavingsAccount() {}
	
	public SavingsAccount(int agency, Double balance, String cpf) {
		super(agency, balance, cpf);
	}

	public SavingsAccount(Double balance) {
		super.setBalance(balance);
	}

	@Override
	public String toString() {
		return 	"Agencia: " + super.getAgency() +
				"\nSaldo atual: " + super.getBalance() +
				"\nTipo Conta : " + getAccountType().name();
	}

	@Override
	public AccountType getAccountType() {
		return AccountType.POUPANCA;
	}


}