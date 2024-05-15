package com.gui;

import java.util.Scanner;

import com.controller.EmployeeController;
import com.model.Employee;

public class GuiEmployee {

	Scanner scan = new Scanner(System.in);
	GuiMenu mainMenu = new GuiMenu();
	EmployeeController controller = new EmployeeController();

	public void employeeMenu() {

		System.out.println("\nMenu Funcionario\n[1] Adicionar\n[2] Consultar\n[3] Alterar\n[4] Excluir\n[5] Voltar");
		int opt = scan.nextInt();

		switch (opt) {
		case 1: {
			add();
			employeeMenu();
			break;
		}
		case 2: {
			listing();
			employeeMenu();
			break;
		}

		case 3: {
			update();
			employeeMenu();
			break;
		}
		
		case 4: {
			delete();
			employeeMenu();
		}
		default:
			System.out.println("Opcao Inválida");
			employeeMenu();
		}
	}

	private void add() {
		Employee employee = new Employee();
		System.out.println("Preencha os dados a baixo para adicionar um novo funcionario" + "\n");
		System.out.print("Nome: ");
		employee.setName(scan.next());
		System.out.print("Idade: ");
		employee.setAge(scan.nextInt());
		System.out.print("Cpf: ");
		employee.setCpf(scan.next());
		System.out.print("Cidade: ");
		employee.setCity(scan.next());
		System.out.print("Função: ");
		employee.setFunction(scan.next());
		System.out.print("Salario: ");
		employee.setSalary(scan.nextDouble());
		System.out.println("Qual o seu status?");
		System.out.println("[1] Ativo" + "\n" + "[2] Inativo");
		int resp = scan.nextInt();
		if (resp == 1) {
			employee.setStatus(true);
		} else if (resp == 2) {
			employee.setStatus(false);
		} else {
			System.out.println("Erro no cadastro: Resposta inválida, retornando ao menu");
			employeeMenu();
		}
		controller.create(employee);
		System.out.println("\nCadastro realizado com sucesso");
	}
	
	private void listing() {
		int i = 1;
		for (Employee employee : controller.readAll())
			System.out.println("\n[" + i + "]" + employee.toString());
		i++;
	}
	
	private void update() {
		listing();
		System.out.println("Selecione um funcionario que deseja alterar: ");
		int resp = scan.nextInt();
		Employee employee = controller.readAll()[resp - 1];
		String key = employee.getCpf();
		
		System.out.println("Preencha os dados a baixo para adicionar um novo funcionario" + "\n");
		System.out.print("Nome: ");
		employee.setName(scan.next());
		System.out.print("Idade: ");
		employee.setAge(scan.nextInt());
		System.out.print("Cpf: ");
		employee.setCpf(scan.next());
		System.out.print("Cidade: ");
		employee.setCity(scan.next());
		System.out.print("Função: ");
		employee.setFunction(scan.next());
		System.out.print("Salario: ");
		employee.setSalary(scan.nextDouble());
		System.out.println("Qual o seu status?");
		System.out.println("[1] Ativo" + "\n" + "[2] Inativo");
		int respStatus = scan.nextInt();
		if (respStatus == 1) {
			employee.setStatus(true);
		} else if (respStatus == 2) {
			employee.setStatus(false);
		} else {
			System.out.println("Erro no cadastro: Resposta inválida, retornando ao menu");
			employeeMenu();
		}
		controller.update(employee, key);
		System.out.println("Funcionario alterado com sucesso");
	}
	
	private void delete() {
		listing();
		System.out.println("Selecione um funcionario para ser removido: ");
		int resp = scan.nextInt();
		Employee employee = controller.readAll()[resp - 1];
		String key = employee.getCpf();
		controller.delete(key);
		System.out.println("\nFuncionario removido com sucesso");
	}
	
}