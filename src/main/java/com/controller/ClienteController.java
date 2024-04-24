package com.controller;

import java.util.List;

import com.model.Cliente;
import com.service.ClienteService;
import com.service.impl.ClienteServiceImpl;

public class ClienteController {

	private ClienteService clienteService = new ClienteServiceImpl();
	
	//CRUD
	//Adicionar
	//Alterar
	//Deletar
	//Atualizar
	
	public void create(Cliente cliente) {
		clienteService.create(cliente);
	}
	
	public List<Cliente> readAll() {
		return clienteService.readAll();
	}
}
