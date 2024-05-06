package com.study;

public class ISS implements Impostos {

	private static final double PERC_IMP = 0.5;
	

	@Override
	public double calcularImposto(double valorProduto) {
		System.out.println("ISS");
		return valorProduto * (1 + (PERC_IMP / 100));
	}
}
