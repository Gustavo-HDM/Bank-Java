package com.repository.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.model.Account;
import com.repository.AccountDAO;

public class AccountDAOImpl implements AccountDAO{

	private static Map<String, Account> accountMap = new HashMap<>();
	
	@Override
	public void create(Account object) {
		Random random = new Random();
		int randomNumber = random.nextInt(100000);
		String id = String.format("%06d", randomNumber);
		accountMap.put(id, object);
		
	}
	
	@Override
	public Map<String, Account> readAll() {
		return accountMap;
	}

	
	//TODO Ajeitar
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

	@Override
	public Account read(String key) {
		for (Account account : accountMap.values()) {
			if(account.getCpf().equals(key)) {
				return accountMap.get(key);
			}
		}
		return null;
	}
}
