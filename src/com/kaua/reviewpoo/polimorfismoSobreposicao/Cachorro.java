package com.kaua.reviewpoo.polimorfismoSobreposicao;

public class Cachorro extends Mamifero{

	public Cachorro(double peso, double idade, int membros, String cor) {
		super(peso, idade, membros, cor);
	}

	public void enterrarOsso() {
		System.out.println("Enterrando Osso.");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando Rapo.");
	}
	
	
	
}
