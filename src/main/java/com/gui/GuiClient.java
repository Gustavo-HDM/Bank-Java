package com.gui;

import java.util.Scanner;

import com.controller.ClientController;
import com.model.Client;

public class GuiClient {

	Scanner scan = new Scanner(System.in);
	GuiMenu mainMenu = new GuiMenu();
	ClientController controller = new ClientController();
	
	public void clientMenu() {

		System.out.println("\nMenu Clientes\n" + "[1] Adicionar\n" + "[2] Consultar\n" + "[3] Voltar");
		int opt = scan.nextInt();

		switch (opt) {
		case 1: {
			Client client = new Client();
			System.out.println("Preencha os dados a baixo para adicionar um novo cliente\n");
			System.out.print("Nome: ");
			client.setName(scan.next());
			System.out.print("Idade: ");
			client.setAge(scan.nextInt());
			System.out.print("Cpf: ");
			client.setCpf(scan.next());
			System.out.print("Cidade: ");
			client.setCity(scan.next());
			controller.create(client);
			System.out.println("\nCadastro realizado com sucesso");
			clientMenu();
			break;
		}
	
		case 2: {
			listing();
			clientMenu();
			break;
		}

		case 3: {
			mainMenu.mainMenu();;
			break;
		}

		default:
			System.out.println("Opcao invalida\n");
			clientMenu();
		}
	}

	private void listing() {
		for (Client client : controller.readAll()) {
			System.out.println(client.toString());
		}
	}
}