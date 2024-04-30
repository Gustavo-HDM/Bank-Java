package com.service.impl;

import java.util.List;

import com.model.Client;
import com.repository.ClientDAO;
import com.repository.impl.ClientDAOImpl;
import com.service.ClientService;

public class ClientServiceImpl implements ClientService{

	private ClientDAO clientDAO = new ClientDAOImpl();
	
	@Override
	public void create(Client client) {
		this.clientDAO.create(client);
	}

	@Override
	public List<Client> readAll() {
		return clientDAO.readAll();
	}

	@Override
	public void delete(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Client cliente, String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createAccount(Client object, String key) {
		
	}
}
