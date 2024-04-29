package com.study;

public enum DiaSemana {

	SEGUNDA("SE", 0), TERCA("TE", 1), QUARTA("QUA", 2), QUINTA("QUI", 3), SEXTA("SEX", 4), SABADO("SA", 5), DOMINGO("DO", 6);

	private String abrev;
	private int index;
	
	DiaSemana(String abrev, int index) {
		this.abrev = abrev;
		this.index = index;
	}

	public String getAbrev() {
		return abrev;
	}

	public int getIndex() {
		return index;
	}
	
	
}
