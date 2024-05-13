package com.study;

public class BuscaBinaria {

	public static int buscaBinaria(int[] vetor, int alvo) {
		int loopBinary = 0;
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
        	loopBinary++;
            int meio = (esquerda + direita) / 2;

            if (vetor[meio] == alvo) {
            	System.out.println("Encontrou em " + loopBinary + " loopBinary");
                return meio; // Encontrou o número!
            } else if (vetor[meio] < alvo) {
                esquerda = meio + 1; // Procurar na metade direita
            } else {
                direita = meio - 1; // Procurar na metade esquerda
            }
        }

        return -1; // O número não está no vetor
    }

    public static void main(String[] args) {
        int[] vetor = {1,2,3, 4, 8, 9,11,12,13, 15, 42, 50, 67, 99};
        int alvo = 42;
        int loop = 0;
        for(int i = 0; i < vetor.length; i++) {
        	loop++;
        	if(vetor[i] == 42) {
        		System.out.println("Encontrou em " + loop + " loops");
        	}
        }
        
        int resultado = buscaBinaria(vetor, alvo);

        if (resultado != -1) {
            System.out.println("Encontrou o número " + alvo + " na posição " + resultado);
        } else {
            System.out.println("Número " + alvo + " não encontrado no vetor.");
        }
    }
}
