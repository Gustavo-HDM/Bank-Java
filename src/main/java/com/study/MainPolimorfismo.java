package com.study;

public class MainPolimorfismo {

	public static void main(String[] args) {
		Impostos[] impostos = new Impostos[2];
		impostos[0] = new ICMS();
		impostos[1] = new ISS();
		
		double produto = 255;
		
		for(int i = 0; i < impostos.length; i++) {
			System.out.println(impostos[i].calcularImposto(produto));
		}
	}
}
