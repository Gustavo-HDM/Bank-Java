package com.study;

import java.util.ArrayList;
import java.util.List;

import com.model.Client;

public class MainLacoRepeticao {

	public static void main(String[] args) {
		List<Client> clientes = new ArrayList<>();
		Client c1 = new Client("Gustavo");
		Client c2 = new Client("Antonio");
		Client c3 = new Client("Rodrigo");
		Client c4 = new Client("Marques");
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		
		for(int i = 0; i < clientes.size(); i++) {
			Client cliente = clientes.get(i);
			System.out.println(cliente.getNome());
		}
		
		System.out.println("\nfor each\n");
		
		for(Client cliente : clientes) {
			System.out.println(cliente.getNome());
		}
		
		System.out.println("\nfor each lambda\n");
		
		clientes.forEach(cliente -> {System.out.println(cliente.getNome());});
		
		
		int contador = 1;
		
		do {
			System.out.println("DO while");
			System.out.println(contador);
			contador++;
		} while (contador <= 10);
		
		while(contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		
		
		
	}
	
}
