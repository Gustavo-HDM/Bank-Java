package com.service;

import java.util.List;

import com.model.Client;

public interface ClientService {

	public void create(Client cliente);
	public List<Client> readAll();
	public void delete(String cpf);
	public void update(Client cliente, String cpf);
	
}
