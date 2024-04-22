package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Cliente;
import com.tela.Telas;

public class ControllerCliente {
	
	Telas tela = new Telas();
	Scanner scan = new Scanner(System.in);
	List<Cliente> listaCliente = new ArrayList<>();
	
	public void menuCliente() {
	
		Cliente cliente = new Cliente();
		tela.telaCliente();
		int opt = scan.nextInt();
		
		switch (opt) {
		case 1: {
			System.out.println("Preencha os dados a baixo para adicionar um novo cliente" + "\n" +
								"(Banco de dados não implementado os dados preenchidos irão sobrescrever os antigos)");
			System.out.println("Nome: ");
			cliente.setNome(scan.next());
			System.out.println("Idade: ");
			cliente.setIdade(scan.nextInt());
			System.out.println("Cpf: ");
			cliente.setCpf(scan.next());
			System.out.println("Cidade: ");
			cliente.setCidade(scan.next());
			
			System.out.println("Qual o status da conta?");
			System.out.println("[1] Padrão" + "\n" +
							   "[2] Gold" + "\n" +
							   "[3] Platinum" + "\n" +
							   "[4] Diamante");
			int resp = scan.nextInt();
			switch (resp) {
				case 1:
					cliente.setContaStatus("Padrão");
					break;
				case 2:
					cliente.setContaStatus("Gold");
					break;
				case 3:
					cliente.setContaStatus("Platinum");
					break;
				case 4:
					cliente.setContaStatus("Diamante");
					break;
				default:
					System.out.println("Erro no cadastro: Resposta inválida, retornando ao menu");
					menuCliente();
					break;
				}
			listaCliente.add(cliente);
			System.out.println("Cadastro realizado com sucesso");
			menuCliente();
			break;
		}
		case 2: {
			for (int i = 0; i < listaCliente.size(); i++) {
				cliente = listaCliente.get(i);
				System.out.println("Cliente " + (i + 1) + "\n");
				cliente.consultar();
			}
			menuCliente();
			break;
		}
		
		case 3: {
			ControllerMenu contMenu = new ControllerMenu();
			contMenu.menuPrincipal();
			break;
		}
		default:
			System.out.println("Opção Inválida, retornando ao menu cliente");
			
		}
		scan.close();
	}
	
}
