package com.model;

public class CurrentAccount extends Account{

	public CurrentAccount() {}
	
	public CurrentAccount(int agency, Double balance, String cpf) {
		super(agency, balance, cpf);
	}
	
	public CurrentAccount(Double balance) {
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
		return AccountType.CORRENTE;
	}
}
