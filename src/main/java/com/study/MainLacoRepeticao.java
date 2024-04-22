package com.study;

import java.util.ArrayList;
import java.util.List;

import com.model.Cliente;

public class MainLacoRepeticao {

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<>();
		Cliente c1 = new Cliente("Gustavo");
		Cliente c2 = new Cliente("Antonio");
		Cliente c3 = new Cliente("Rodrigo");
		Cliente c4 = new Cliente("Marques");
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		
		for(int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			System.out.println(cliente.getNome());
		}
		
		System.out.println("\nfor each\n");
		
		for(Cliente cliente : clientes) {
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
