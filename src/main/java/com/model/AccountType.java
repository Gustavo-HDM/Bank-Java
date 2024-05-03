package com.model;

public enum AccountType {

	CORRENTE(300.0),
	POUPANCA(1000.0),
	SALARIO(1300.0),
	PAGAMENTOS(1.0);
	
	private Double valorMin;
	
	public Double getValorMin() {
		return valorMin;
	}

	AccountType (Double valorMin) {
		this.valorMin = valorMin;
	}
	
}
