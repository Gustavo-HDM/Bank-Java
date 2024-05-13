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
		
		clientList.removeIf(client -> client.getCpf().equals(key));
		
//		for (Client client : clientList) {
//			if(client.getCpf().equals(key)) {
//				clientList.remove(client);
//			}
//		}
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
		
//		for (int i = 0; i < clientList.size(); i++) {
//			Client clientListed = clientList.get(i);
//			if(clientListed.getCpf().equals(key)) {
//				clientList.set(i, client);
//			}
//		}
//	}

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
