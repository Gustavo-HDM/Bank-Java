package com.gui;

import java.util.Map;
import java.util.Scanner;

import com.controller.AccountController;
import com.controller.ClientController;
import com.model.Account;
import com.model.Client;
import com.model.CurrentAccount;
import com.model.SavingsAccount;

public class GuiAccount {

	Scanner scan = new Scanner(System.in);
	GuiMenu mainMenu = new GuiMenu();
	ClientController controllerClient = new ClientController();
	AccountController controllerAccount = new AccountController();
	Account account;

	public void accountMenu() {

		System.out.println("\nEscolha uma opção a baixo\n" + "[1] Associar uma conta a um cliente\n"
				+ "[2] Lista de Contas\n" + "[3] Voltar");
		int opt = scan.nextInt();

		switch (opt) {
		case 1: {
			System.out.println("Selecione o tipo da conta:\n" + "[1] Conta Corrente\n" + "[2] Conta Poupanca\n");
			int typeResp = scan.nextInt();
			if (typeResp == 1) {
				account = new CurrentAccount();
			} else if (typeResp == 2) {
				account = new SavingsAccount();
			} else {
				System.out.println("Resposta inválida");
				accountMenu();
			}
			System.out.println("n da Agencia");
			account.setAgency(scan.nextInt());
			System.out.print("Saldo inicial: ");
			account.setBalance(scan.nextDouble());
			System.out.println("Selecione um cliente para associa a conta: ");
			listingClient();
			int clientIndex = scan.nextInt();
			Client client = controllerClient.readAll().get(clientIndex - 1);
			controllerAccount.create(account, client.getCpf());
			accountMenu();
			break;
		}

		case 2: {
			listing();
			accountMenu();
			break;
		}
		
		case 3: {
			mainMenu.mainMenu();
			break;
		}

		default:
			System.out.println("Opcao Invalida");
			accountMenu();
		}
	}

	private void listing() {
		for (Map.Entry<Account, String> entry : controllerAccount.readAll().entrySet()) {

			account = entry.getKey();
			String cpf = entry.getValue();

			System.out.print("\n" + account.toString() + "\nCliente associado a conta: ");
			for (Client client : controllerClient.readAll()) {
				if (client.getCpf().equals(cpf)) {
					System.out.println(client.toString() + "\n-----------------------------------------");
				}
			}

		}
	}

	private void listingClient() {
		int i = 1;
		for (Client client : controllerClient.readAll()) {
			System.out.println("[" + i + "]" + client.getName() + "\n");
			i++;
		}
	}
}
