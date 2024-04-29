package com.study;

public class MainEnum {

	public static void main(String[] args) {
		String abrev = "QUI";
		DiaSemana dia = getWeekName(abrev);
        System.out.println("Hoje é " + dia);
        System.out.println("Hoje é " + dia.getAbrev());
        System.out.println("Hoje é " + dia.getIndex());
	}
	
	private static DiaSemana getWeekName(String abrev) {
		for(DiaSemana dia : DiaSemana.values()) {
			if(dia.getAbrev().equals(abrev)) {
				return dia;
			}
		}
		return null;
	}
}
