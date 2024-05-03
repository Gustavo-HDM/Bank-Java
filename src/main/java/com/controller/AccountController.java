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
	
	public Map<Account, String> readAll() {
		return accountService.readAll();
	}
}
