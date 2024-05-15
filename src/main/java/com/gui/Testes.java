package com.gui;

import java.util.Arrays;

public class Testes {

	public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5}; // Exemplo de vetor

        int posicaoParaRemover = 2; // Posição do elemento a ser removido (índice 2 no exemplo)

        // Verifica se a posição é válida
        if (posicaoParaRemover >= 0 && posicaoParaRemover < vetor.length) {
            // Desloca os elementos à frente da posição para trás
            for (int i = posicaoParaRemover; i < vetor.length - 1; i++) {
                vetor[i] = vetor[i + 1];
            }

            // Reduz o tamanho do vetor em 1
            vetor = Arrays.copyOf(vetor, vetor.length - 1);

            // Imprime o vetor após a remoção
            System.out.println(Arrays.toString(vetor));
        } else {
            System.out.println("Posição inválida!");
        }
    }
	
}
