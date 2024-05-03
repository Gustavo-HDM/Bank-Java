package com.repository.impl;

import java.util.HashMap;
import java.util.Map;

import com.model.Account;
import com.repository.AccountDAO;

public class AccountDAOImpl implements AccountDAO{

	private static Map<Account, String> accountHash = new HashMap<>();
	
	@Override
	public void create(Account object) {
		accountHash.put(object, object.getCpf());
		
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
	
	//REVER SE TEM ALGUMA FORMA MAIS OTIMIZADA
	

	
}
