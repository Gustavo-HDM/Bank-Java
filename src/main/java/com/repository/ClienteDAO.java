package com.repository;

import java.util.List;

import com.model.Cliente;

public interface ClienteDAO {
	public void create(Cliente cliente);
	public List<Cliente> readAll();
	public void delete(String cpf);
	public void update(Cliente cliente, String cpf);
}
