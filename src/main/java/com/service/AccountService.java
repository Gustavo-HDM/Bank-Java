package com.service;

import java.util.HashMap;

import com.model.Account;

public interface AccountService {
	public void create(Account account, String cpf);
	public HashMap<Account, String> readAll();
	public void delete(String cpf);
	public void update(Account account, String cpf);
}
