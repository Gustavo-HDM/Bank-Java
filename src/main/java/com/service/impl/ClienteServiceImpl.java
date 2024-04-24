package com.service.impl;

import java.util.List;

import com.model.Cliente;
import com.repository.ClienteDAO;
import com.repository.impl.ClienteDAOImpl;
import com.service.ClienteService;

public class ClienteServiceImpl implements ClienteService{

	private ClienteDAO clienteDAO = new ClienteDAOImpl();
	
	@Override
	public void create(Cliente cliente) {
		this.clienteDAO.create(cliente);
	}

	@Override
	public List<Cliente> readAll() {
		return clienteDAO.readAll();
	}

	@Override
	public void delete(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Cliente cliente, String cpf) {
		// TODO Auto-generated method stub
		
	}

	
	
}
