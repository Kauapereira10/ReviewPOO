package com.kaua.reviewpoo.heranca.test02;

public class MainHeranca {
	public static void main(String[] args) {
		
		System.out.println("Testando a Classe Visitante");
		Visitante p1 = new Visitante("Kaua", "M", 19);
		System.out.println(p1.toString());
	
		System.out.println();
		
		System.out.println("Testando a Classe Aluno");
		Aluno p2 = new Aluno("Joao", "M", 22, 124, "ADS");
		p2.pagarMensalidade();
		System.out.println(p2.toString());
		
		System.out.println();
		
		System.out.println("Testando a Classe Bolsita");
		Bolsista p3 = new Bolsista("Thomas", "M", 25, 1432, "Educao Fisica",  22.3f);
		p3.pagarMensalidade();
		System.out.println(p3.toString());
		
		
	}
}
