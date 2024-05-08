package com.controller;

import java.util.Map;

import com.model.Account;
import com.service.AccountService;
import com.service.impl.AccountServiceImpl;

public class AccountController {

	private AccountService accountService = new AccountServiceImpl();
	
	public void create(Account account) {
		accountService.create(account);
	}
	
	public Map<String, Account> readAll() {
		return accountService.readAll();
	}
	
	public void delete(String key) {
		accountService.delete(key);
	}
	
	public void update(Account account, String key) {
		accountService.update(account, key);
	}
}
