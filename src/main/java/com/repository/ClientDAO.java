package com.repository;

import java.util.List;

import com.model.Client;

public interface ClientDAO {
	public void create(Client client);
	public List<Client> readAll();
	public void delete(String cpf);
	public void update(Client client, String cpf);
}
