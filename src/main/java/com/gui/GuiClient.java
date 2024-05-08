package com.gui;

import java.util.Scanner;

import com.controller.ClientController;
import com.model.Client;

public class GuiClient {

	Scanner scan = new Scanner(System.in);
	GuiMenu mainMenu = new GuiMenu();
	ClientController controller = new ClientController();
	
	public void clientMenu() {

		System.out.println("\nMenu Clientes\n[1] Adicionar\n[2] Consultar\n[3] Alterar\n[4] Excluir\n[5] Voltar");
		int opt = scan.nextInt();

		switch (opt) {
		case 1: {
			add();
			clientMenu();
			break;
		}
	
		case 2: {
			listing();
			clientMenu();
			break;
		}

		case 3: {
			update();
			clientMenu();
			break;
		}
		
		case 4: {
			delete();
			clientMenu();
			break;
		}
		
		case 5: {
			mainMenu.mainMenu();;
			break;
		}

		default:
			System.out.println("Opcao invalida\n");
			clientMenu();
		}
	}
	
	private void add() {
		Client client = new Client();
		System.out.println("Preencha os dados a baixo\n");
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
	}

	private void listing() {
		int i = 1;
		for (Client client : controller.readAll()) {
			System.out.println("\n[" + i + "]" + client.toString());
			i++;
		}
	}
	
	private void update() {
		listing();
		System.out.print("Selecione um cliente que deseja alterar: ");
		int resp = scan.nextInt();
		Client client = controller.readAll().get(resp - 1);
		String key = client.getCpf();
		
		System.out.println("Preencha os dados a baixo\n");
		System.out.print("Nome: ");
		client.setName(scan.next());
		System.out.print("Idade: ");
		client.setAge(scan.nextInt());
		System.out.print("Cpf: ");
		client.setCpf(scan.next());
		System.out.print("Cidade: ");
		client.setCity(scan.next());
		controller.update(client, key);
		System.out.println("\nCliente alterado com sucesso");
	}
	
	private void delete() {
		listing();
		System.out.print("Selecione um cliente para ser removido: ");
		int resp = scan.nextInt();
		Client client = controller.readAll().get(resp - 1);
		String key = client.getCpf();
		controller.delete(key);
		System.out.println("\nCliente removido com sucesso");
	}
}