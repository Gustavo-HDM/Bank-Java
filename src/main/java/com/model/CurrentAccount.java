package com.model;

public class CurrentAccount extends Account{

	private static final String ACCOUNT_TYPE = "Conta Corrente";
	
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
				"\nTipo Conta : " + CurrentAccount.ACCOUNT_TYPE;
	}
}
