package com.repository.impl;

import java.util.HashMap;
import java.util.Map;

import com.model.Account;
import com.repository.AccountDAO;

public class AccountDAOImpl implements AccountDAO{

	private static Map<String, Account> accountMap = new HashMap<>();
	
	@Override
	public void create(Account object) {
		accountMap.put(object.getCpf(), object);
		
	}
	
	@Override
	public Map<String, Account> readAll() {
		return accountMap;
	}

	@Override
	public void delete(String key) {
		for (Account account : accountMap.values()) {
			if(account.getCpf().equals(key)) {
				accountMap.remove(key);
			}
		}
	}

	@Override
	public void update(Account account, String key) {
			Account accountListed = accountMap.get(key);
			if(accountListed.getCpf().equals(key)) {
				Account accountOld = accountMap.get(key);
				Account accountNew = account;
				accountMap.put(accountOld.getCpf(), accountNew);
			}
	}
	
}
