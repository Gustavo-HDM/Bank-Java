package com.repository;

import java.util.Map;

import com.model.Account;

//TODO colocar a key como um id da conta, não com o cpf
public interface AccountDAO extends GenericDAO<Account, String, Map<String, Account>>{}