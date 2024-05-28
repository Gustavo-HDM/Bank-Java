package com.service.impl;

import java.util.List;

import com.model.Client;
import com.repository.ClientDAO;
import com.repository.impl.ClientDAOImpl;
import com.service.ClientService;

import exceptions.CpfLengthException;

public class ClientServiceImpl implements ClientService {

	private ClientDAO clientDAO = new ClientDAOImpl();

	@Override
	public void create(Client client) throws CpfLengthException {
		if (client.getCpf().length() != 11) {
			throw new CpfLengthException("O CPF deve conter 11 digitos");
		}
		this.clientDAO.create(client);
	}

	@Override
	public List<Client> readAll() {
		return clientDAO.readAll();
	}

	@Override
	public void delete(String cpf) {
		this.clientDAO.delete(cpf);
	}

	@Override
	public void update(Client cliente, String cpf) {
		this.clientDAO.update(cliente, cpf);

	}

	@Override
	public Client read(String key) {
		return this.clientDAO.read(key);
	}
}
