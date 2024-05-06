package com.study;

public class ICMS implements Impostos {

	private static final double PERC_IMP = 2;
	
	
	@Override
	public double calcularImposto(double valorProduto) {
		System.out.println("ICMS");
		return valorProduto * (1 + (PERC_IMP / 100));
	}
}
