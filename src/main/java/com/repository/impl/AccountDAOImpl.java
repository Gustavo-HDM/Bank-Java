package com.repository.impl;

import java.util.HashMap;
import java.util.Map;

import com.model.Account;
import com.repository.AccountDAO;

public class AccountDAOImpl implements AccountDAO{

	private static Map<Account, String> accountHash = new HashMap<>();
	
	
	@Override
	public void create(Account account, String cpf) {
		accountHash.put(account, cpf);
	}
	
	@Override
	public Map<Account, String> readAll() {
		return accountHash;
	}

	@Override
	public void delete(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Account account, String cpf) {
		// TODO Auto-generated method stub
		
	}

	
}
