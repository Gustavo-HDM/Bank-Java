package com.model;

import com.util.AccountType;

public class SalaryAccount extends Account{

	private Double salary;
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public SalaryAccount() {}
	
	public SalaryAccount(int agency, Double balance, String cpf) {
		super(agency, balance, cpf);
	}

	@Override
	public String toString() {
		return 	"Agencia: " + super.getAgency() +
				"\nSaldo atual: " + super.getBalance() +
				"\nTipo Conta : " + getAccountType().name();
	}

	@Override
	public AccountType getAccountType() {
		return AccountType.SALARIO;
	}

}
