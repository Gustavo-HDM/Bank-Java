package com.repository.impl;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import com.model.Client;
import com.repository.ClientDAO;

public class ClientDAOImpl implements ClientDAO{

	private static List<Client> clientList = new ArrayList<Client>();
	
	public List<Client> getClientList() {
		return clientList;
	}

	@Override
	public void create(Client client) {
		ClientDAOImpl.clientList.add(client);
	}

	@Override
	public List<Client> readAll() {
		return clientList;
	}

	@Override
	public void delete(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Client client, String key) {
		// TODO Auto-generated method stub
		
	}

	

//	List<Cliente> listaCliente = new ArrayList<>();
//	List<Funcionario> listaFuncionario = new ArrayList<>();
//	List<Conta> listaContas = new ArrayList<>();
	//USAR LISTAS PARA CLIENTE E FUNCIONARIO OU PARA PESSOA?
	//List<Pessoa> listaPessoas = new ArrayList<>();
}
