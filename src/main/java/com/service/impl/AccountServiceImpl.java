package com.service.impl;

import java.util.HashMap;

import com.model.Account;
import com.repository.AccountDAO;
import com.repository.impl.AccountDAOImpl;
import com.service.AccountService;

public class AccountServiceImpl implements AccountService{

	private AccountDAO accountDAO = new AccountDAOImpl();
	
	@Override
	public void create(Account account, String cpf) {
		this.accountDAO.create(account, cpf);
	}

	@Override
	public HashMap<Account, String> readAll() {
		return accountDAO.readAll();
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
