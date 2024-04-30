package com.repository;

import java.util.Map;

import com.model.Account;

public interface AccountDAO extends GenericDAO<Account, String, Map<Account, String>>{}