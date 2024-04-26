package com.study;

public class ListaLigadaMain {

	
	
	public static void main(String[] args) {
		class Node<E> {
		    E dado;         // O dado armazenado no Node
		    Node proximo;     // A conexão para o próximo Node

		    public Node(E dado) {
		        this.dado = dado;
		        this.proximo = null;  // Inicialmente, não temos um próximo Node
		    }
		}
		
		
		
		Node<String> meuNode = new Node<String>("42");
		Node<String> novoNode = new Node<String>("55");
		Node<String> terceiroNode = new Node<String>("10");
		novoNode.proximo = terceiroNode; 
		meuNode.proximo = novoNode;  // Atualiza a conexão para o próximo Node
		
		Node currentNode = meuNode;
		while (currentNode != null) {
		    /*if (currentNode.dado.equals("42")) {
		        System.out.println("Encontrado o Node com valor 42!");
		        break;
		    }*/
			System.out.println(currentNode.dado);
		    currentNode = currentNode.proximo;
		}

		
	}
	
	

}
