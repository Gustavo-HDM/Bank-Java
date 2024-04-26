package com.controller;

import java.util.List;

import com.model.Client;
import com.service.ClientService;
import com.service.impl.ClientServiceImpl;

public class ClientController {

	private ClientService clientService = new ClientServiceImpl();

	public void create(Client client) {
		clientService.create(client);
	}

	public List<Client> readAll() {
		return clientService.readAll();
	}
}
