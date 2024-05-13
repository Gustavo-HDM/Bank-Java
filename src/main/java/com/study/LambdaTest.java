package com.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.model.Client;

public class LambdaTest {

	
	
	public static void main(String[] args) {
		Client client = new Client("Gustavo", "Maringá", 27, "4545454545");
		Client client2 = new Client("Gustavo2", "Maringá", 30, "4545454545");
		Client client3 = new Client("Gustavo3", "Maringá", 32, "4545454545");
		Client client4 = new Client("Gustavo4", "Maringá", 40, "4545454545");
		
		List<Client> listaClientes = new ArrayList<>(Arrays.asList(client, client2, client3, client4));
		List<Client> listaClientes2 = listaClientes.stream().filter(cliente -> cliente.getAge() > 30).toList();
		
		listaClientes.forEach(cliente -> {
			System.out.println(cliente.getName());
		});
		System.out.println("----------------------------------");
		listaClientes2.forEach(cliente -> {
			System.out.println(cliente.getName());
		});
	}
}
