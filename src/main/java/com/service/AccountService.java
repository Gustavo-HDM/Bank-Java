package com.service;

import java.util.Map;

import com.model.Account;

public interface AccountService {
	public void create(Account account, String cpf);
	public Map<Account, String> readAll();
	public void delete(String cpf);
	public void update(Account account, String cpf);
}
