package com.model;

import com.util.AccountType;

public class PaymentAccount extends Account{

	public Double getPagamento() {
		return pagamento;
	}

	public void setPagamento(Double pagamento) {
		this.pagamento = pagamento;
	}
	
	public PaymentAccount() {}
	
	public PaymentAccount(int agency, Double balance, String cpf) {
		super(agency, balance, cpf);
	}

	private Double pagamento;
	
	@Override
	public AccountType getAccountType() {
		return AccountType.PAGAMENTOS;
	}

}
