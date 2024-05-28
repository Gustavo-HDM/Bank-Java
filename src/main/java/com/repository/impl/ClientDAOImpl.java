package com.repository.impl;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import com.model.Client;
import com.repository.ClientDAO;

import exceptions.CpfLengthException;

public class ClientDAOImpl implements ClientDAO{

	private static List<Client> clientList = new ArrayList<Client>();
	
	public List<Client> getClientList() {
		return clientList;
	}

	@Override
	public void create(Client client){
		ClientDAOImpl.clientList.add(client);
	}

	@Override
	public List<Client> readAll() {
		return clientList;
	}

	@Override
	public void delete(String key) {
		clientList.removeIf(client -> client.getCpf().equals(key));
	}

	@Override
	public void update(Client client, String key) {
		clientList.replaceAll(clientLambda -> {
		    if (clientLambda.getCpf().equals(key)) {
		        return client;
		    } else {
		        return null;
		    }
		});
		}
		
	@Override
	public Client read(String key) {
		
		for(Client clientListed : clientList) {
			if(clientListed.getCpf().equals(key)) {
				return clientListed;
			}
		}
		return null;
	}
}
