package com.gui;

import java.util.Scanner;

public class GuiMenu {

	Scanner scan = new Scanner(System.in);

	public void mainMenu() {

		System.out.println("\nEscolha uma opção a baixo\n" + "[1] Cliente\n" + "[2] Funcionários\n" + "[3] Contas\n" + "[4] Sair");
		int opt = scan.nextInt();

		switch (opt) {
		case 1: {
			GuiClient guiClient = new GuiClient();
			guiClient.clientMenu();
			break;
		}
		case 2: {
			GuiEmployee guiFunc = new GuiEmployee();
			guiFunc.employeeMenu();
			break;
		}
		case 3: {
			GuiAccount guiAccount = new GuiAccount();
			guiAccount.accountMenu();
			break;
		}
		case 4: {
			System.out.println("Saindo do sistema");
			break;
		}
		default:
			System.out.println("Opção Inválida");
			mainMenu();
		}
	}
}
