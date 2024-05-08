package com.gui;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.controller.AccountController;
import com.controller.ClientController;
import com.model.Account;
import com.model.Client;
import com.util.AccountType;

public class GuiAccount {

	Scanner scan = new Scanner(System.in);
	GuiMenu mainMenu = new GuiMenu();
	ClientController controllerClient = new ClientController();
	AccountController controllerAccount = new AccountController();
	List<Account> accountList;
	Account account;

	public void accountMenu() {

		System.out.println("\nEscolha uma opção a baixo\n[1] Associar uma conta a um cliente\n"
				+ "[2] Lista de Contas\n[3] Alterar Informações de Conta\n[4] Excluir Conta\n[5] Voltar");
		int opt = scan.nextInt();

		switch (opt) {
		case 1: {
			add();
			accountMenu();
			break;
		}

		case 2: {
			listing();
			accountMenu();
			break;
		}

		case 3: {
			update();
			accountMenu();
			break;
		}

		case 5: {
			mainMenu.mainMenu();
			break;
		}

		default:
			System.out.println("Opcao Invalida");
			accountMenu();
		}
	}

	private void add() {
		System.out.println("Selecione o tipo da conta:\n[1] Conta Corrente\n[2] Conta Poupanca\n"
				+ "[3] Conta Salario\n[4] Conta Pagamento\n");
		int typeResp = scan.nextInt();

		for (AccountType type : AccountType.values()) {
			if (type.getMenuValue() == typeResp) {
				account = type.getAccountImpl();
				break;
			}
		}
		System.out.println("n da Agencia");
		account.setAgency(scan.nextInt());
		System.out.print("Saldo inicial: ");
		account.setBalance(scan.nextDouble());
		System.out.println("Selecione um cliente para associar a conta: ");
		listingClient();
		int clientIndex = scan.nextInt();
		Client client = controllerClient.readAll().get(clientIndex - 1);
		account.setCpf(client.getCpf());
		controllerAccount.create(account);
	}

	private void listing() {
		for (Map.Entry<String, Account> entry : controllerAccount.readAll().entrySet()) {
			String cpf = entry.getKey();
			account = entry.getValue();
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

	private void update() {
		listing();
		for (Map.Entry<String, Account> entry : controllerAccount.readAll().entrySet()) {
			accountList.add(entry.getValue());
		}
		System.out.println("Selecione uma conta que deseja alterar: ");
		int resp = scan.nextInt();
		Account account = accountList.get(resp - 1);
		String key = account.getCpf();

		System.out.println("Selecione o tipo da conta:\n[1] Conta Corrente\n[2] Conta Poupanca\n"
				+ "[3] Conta Salario\n[4] Conta Pagamento\n");
		int typeResp = scan.nextInt();
		for (AccountType type : AccountType.values()) {
			if (type.getMenuValue() == typeResp) {
				account = type.getAccountImpl();
				break;
			}
		}
		System.out.println("n da Agencia");
		account.setAgency(scan.nextInt());
		System.out.print("Saldo inicial: ");
		account.setBalance(scan.nextDouble());
		System.out.println("Selecione um cliente para associar a conta: ");
		listingClient();
		int clientIndex = scan.nextInt();
		Client client = controllerClient.readAll().get(clientIndex - 1);
		account.setCpf(client.getCpf());
		controllerAccount.update(account, key);
	}
}
