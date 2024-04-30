package com.service.impl;

import java.util.Map;

import com.model.Account;
import com.repository.AccountDAO;
import com.repository.impl.AccountDAOImpl;
import com.service.AccountService;

public class AccountServiceImpl implements AccountService{

	private AccountDAO accountDAO = new AccountDAOImpl();
	
	@Override
	public void createAccount(Account Object, String key) {
		this.accountDAO.createAccount(Object, key);		
	}

	@Override
	public Map<Account, String> readAll() {
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

	//REVER SE TEM ALGUMA FORMA MAIS OTIMIZADA
	@Override
	public void create(Account object) {
		// TODO Auto-generated method stub
	}

}
