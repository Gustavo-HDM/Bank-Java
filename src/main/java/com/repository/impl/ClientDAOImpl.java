package com.repository.impl;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import com.model.Client;
import com.repository.ClientDAO;

public class ClientDAOImpl implements ClientDAO{

	private List<Client> clientList = new ArrayList<Client>();

	public List<Client> getClientList() {
		return clientList;
	}

	@Override
	public void create(Client client) {
		this.clientList.add(client);
	}

	@Override
	public List<Client> readAll() {
		return clientList;
	}

	@Override
	public void delete(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Client cliente, String cpf) {
		// TODO Auto-generated method stub
		
	}

//	List<Cliente> listaCliente = new ArrayList<>();
//	List<Funcionario> listaFuncionario = new ArrayList<>();
//	List<Conta> listaContas = new ArrayList<>();
	//USAR LISTAS PARA CLIENTE E FUNCIONARIO OU PARA PESSOA?
	//List<Pessoa> listaPessoas = new ArrayList<>();
}
