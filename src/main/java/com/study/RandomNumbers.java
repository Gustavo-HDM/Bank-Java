package com.study;

import java.util.Random;

public class RandomNumbers {

	
	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNumber = random.nextInt(1000000);
		String formattedRandomNumber = String.format("%06d", randomNumber);
		System.out.println("Numero aleatorio de 6 digitos: " + formattedRandomNumber);
	}
}
