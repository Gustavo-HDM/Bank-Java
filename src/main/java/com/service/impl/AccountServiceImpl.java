package com.service.impl;

import java.util.Map;

import com.model.Account;
import com.repository.AccountDAO;
import com.repository.impl.AccountDAOImpl;
import com.service.AccountService;

public class AccountServiceImpl implements AccountService{

	private AccountDAO accountDAO = new AccountDAOImpl();
	
	@Override
	public void create(Account object) {
		this.accountDAO.create(object);		
	}
	@Override
	public Map<String, Account> readAll() {
		return accountDAO.readAll();
	}

	@Override
	public void delete(String key) {
		accountDAO.delete(key);
	}

	@Override
	public void update(Account account, String key) {
		accountDAO.update(account, key);
	}
	@Override
	public Account read(String key) {
		// TODO Auto-generated method stub
		return null;
	}
}
