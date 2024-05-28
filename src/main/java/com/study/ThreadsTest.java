package com.study;

public class ThreadsTest {
	
	public static void main(String[] args) {
		
		Thread fazerCafe = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Fazendo Café");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread fritarOvos = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Fritando Ovos");
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		fazerCafe.start();
		fritarOvos.start();
		
		System.out.println("Esperando o Join");
		System.out.println("Esperando o Join");
		
		try {
			fazerCafe.join();
			fritarOvos.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Café da manha está pronto");
	}
}
