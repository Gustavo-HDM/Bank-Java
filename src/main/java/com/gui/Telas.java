package com.gui;

public class Telas {

	public void telaPrincipal() {
		System.out.println("\nEscolha uma opção a baixo\n"+
							"[1] Cliente\n" +
							"[2] Funcionários\n" +
							"[3] Sair");
	}
	
	public void telaCliente() {
		System.out.println("\nMenu Clientes\n" +
							"[1] Adicionar\n" +
							"[2] Consultar\n" +
							"[3] Definir valores da Conta\n" +
							"[4] Voltar");
	}
	public void telaFuncionario() {
		System.out.println("\nMenu Funcionario" + "\n" +
							"[1] Adicionar" + "\n" +
							"[2] Consultar" + "\n" +
							"[3] Voltar");
	}
}
