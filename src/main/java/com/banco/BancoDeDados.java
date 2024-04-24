package com.banco;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import com.model.Cliente;
import com.model.Conta;
import com.model.Funcionario;
//import com.model.Pessoa;

public class BancoDeDados{

	private List<Cliente> listaCliente = new ArrayList<Cliente>();
	private List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
	private List<Conta> listaContas = new ArrayList<Conta>();
	
	public List<Cliente> getListaCliente() {
		return listaCliente;
	}
	public List<Funcionario> getListaFuncionario() {
		return listaFuncionario;
	}
	public List<Conta> getListaContas() {
		return listaContas;
	}
	
//	List<Cliente> listaCliente = new ArrayList<>();
//	List<Funcionario> listaFuncionario = new ArrayList<>();
//	List<Conta> listaContas = new ArrayList<>();
	//USAR LISTAS PARA CLIENTE E FUNCIONARIO OU PARA PESSOA?
	//List<Pessoa> listaPessoas = new ArrayList<>();
}
