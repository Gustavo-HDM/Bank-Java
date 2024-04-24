package com.service;

import java.util.List;

import com.model.Cliente;

public interface ClienteService {

	public void create(Cliente cliente);
	public List<Cliente> readAll();
	public void delete(String cpf);
	public void update(Cliente cliente, String cpf);
	
}
