package com.gui;

import java.util.Scanner;

public class GuiMenu {
	
	Telas tela = new Telas();
	Scanner scan = new Scanner(System.in);

	public void menuPrincipal() {
		
		tela.telaPrincipal();
		int opt = scan.nextInt();
		
		switch (opt) {
		case 1: {
			GuiCliente guiCliente = new GuiCliente();
			guiCliente.menuCliente();
			break;
		}
		case 2: {
			GuiFuncionario guiFunc = new GuiFuncionario();
			guiFunc.menuFuncionario();
			break;
		}
		case 3: {
			
			break;
		}
		default:
			System.out.println("Opção Inválida, retornando ao menu principal");
		}
		scan.close();
	}
}
