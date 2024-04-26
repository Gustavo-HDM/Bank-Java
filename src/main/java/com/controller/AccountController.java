package com.controller;

import java.util.HashMap;

import com.model.Account;
import com.service.AccountService;
import com.service.impl.AccountServiceImpl;

public class AccountController {

	private AccountService accountService = new AccountServiceImpl();
	
	public void create(Account account, String cpf) {
		accountService.create(account, cpf);
	}
	
	public HashMap<Account, String> readAll() {
		return accountService.readAll();
	}
}
