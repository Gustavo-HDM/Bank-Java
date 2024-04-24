package com.gui;

import java.util.Scanner;

import com.model.Cliente;
import com.model.Conta;
import com.model.ContaCorrente;
import com.model.ContaPoupanca;
import com.repository.impl.ClienteDAOImpl;

public class GuiCliente {
	
	Telas tela = new Telas();
	Scanner scan = new Scanner(System.in);
	ClienteDAOImpl bancoDados = new ClienteDAOImpl();
	Cliente cliente = new Cliente();
	Conta conta;
	
	public void menuCliente() {
	
		tela.telaCliente();
		int opt = scan.nextInt();
		
		switch (opt) {
		case 1: {
			System.out.println("Preencha os dados a baixo para adicionar um novo cliente" + "\n");
			System.out.println("Nome: ");
			cliente.setNome(scan.next());
			System.out.println("Idade: ");
			cliente.setIdade(scan.nextInt());
			System.out.println("Cpf: ");
			cliente.setCpf(scan.next());
			System.out.println("Cidade: ");
			cliente.setCidade(scan.next());
			System.out.println("Qual o tipo de conta?\n" + 
								"[1] Conta Corrente\n" +
								"[2] Conta Poupança");
			int respConta = scan.nextInt();
			switch (respConta) {
			case 1: {
				conta = new ContaCorrente();
				cliente.definirTipoConta(conta);
				break;
			}
			case 2: {
				conta = new ContaPoupanca();
				cliente.definirTipoConta(conta);
				break;
			}
			
			default:
				System.out.println("Resposta Inválida: voltando ao inicio\n");
			}
			
				
			
			bancoDados.getListaCliente().add(cliente);
			System.out.println("Cadastro realizado com sucesso");
			menuCliente();
			break;
		}
		
		case 2: {
			for (int i = 0; i < bancoDados.getListaCliente().size(); i++) {
				cliente = bancoDados.getListaCliente().get(i);
				System.out.println("\nCliente " + (i + 1));
				System.out.print(cliente.toString());;
			}
			menuCliente();
			break;
		}
		case 3: {
			
			System.out.println("Selecione um cliente\n");
			for (int i = 0; i < bancoDados.getListaCliente().size(); i++) {
				String clienteNome = bancoDados.getListaCliente().get(i).getNome();
				System.out.println("[" + (i + 1) + "]" + clienteNome + "\n");
			}
			
			int respCliente = scan.nextInt();
			if(respCliente <= bancoDados.getListaCliente().size()) {
				
				cliente = bancoDados.getListaCliente().get(respCliente - 1);
				System.out.println("Cliente selecionado: " + cliente.getNome());
				System.out.println("Agência");
				conta.setAgencia(scan.nextInt());
				System.out.println("Saldo: ");
				conta.setSaldo(scan.nextDouble());
				cliente.setConta(conta);
				System.out.println(cliente.toString());
				menuCliente();
			}
			break;
		}
		
		case 4: {
			GuiMenu contMenu = new GuiMenu();
			contMenu.menuPrincipal();
			break;
		}
		
		default:
			System.out.println("Opção Inválida, retornando ao menu cliente");
			menuCliente();
		}
		scan.close();
	}
	
}
