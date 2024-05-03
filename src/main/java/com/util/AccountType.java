package com.util;

import com.model.Account;
import com.model.CurrentAccount;
import com.model.SavingsAccount;

public enum AccountType {

	CORRENTE(300.0, 1) {
		@Override
		public Account getAccountImpl() {
			return new CurrentAccount();
		}
	},
	POUPANCA(1000.0, 2) {
		@Override
		public Account getAccountImpl() {
			return new SavingsAccount();
		}
	},
	SALARIO(1300.0, 3) {
		@Override
		public Account getAccountImpl() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	PAGAMENTOS(1.0, 4) {
		@Override
		public Account getAccountImpl() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	private Double valorMin;
	private int menuValue;
	
	AccountType (Double valorMin, int menuValue) {
		this.valorMin = valorMin;
		this.menuValue = menuValue;
	}
	
	public int getMenuValue() {
		return this.menuValue;
	}
	
	public Double getValorMin() {
		return valorMin;
	}
	
	public abstract Account getAccountImpl();
	
	
}
