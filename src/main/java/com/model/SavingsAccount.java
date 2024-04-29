package com.model;

public class SavingsAccount extends Account{

	private static final String ACCOUNT_TYPE = "Conta Poupança";

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
				"\nTipo Conta : " + SavingsAccount.ACCOUNT_TYPE;
	}
}