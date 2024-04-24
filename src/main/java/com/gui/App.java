package com.gui;

import com.model.Cliente;
import com.repository.impl.ClienteDAOImpl;

public class App {

	public static void main(String[] args) {
//		GuiMenu guiMenu = new GuiMenu();
//		guiMenu.menuPrincipal();

		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		ClienteDAOImpl bancoDados = new ClienteDAOImpl();

		cliente1.setNome("Gustavo");
		cliente2.setNome("Guilherme");
		bancoDados.getListaCliente().add(cliente1);
		bancoDados.getListaCliente().add(cliente2);
		
		listagem();
		//TODO ver como fazer funcionar pelo metodo abaixo
		
		// 
	}

	public static void listagem() {
		ClienteDAOImpl bancoDados = new ClienteDAOImpl();
		for (Cliente cliente : bancoDados.getListaCliente()) {
			System.out.println(cliente.toString());
		}
	}
}
