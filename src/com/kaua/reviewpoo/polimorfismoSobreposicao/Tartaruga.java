package com.kaua.reviewpoo.polimorfismoSobreposicao;

public class Tartaruga extends Reptil{

	public Tartaruga(double peso, double idade, int membros, String corEscama) {
		super(peso, idade, membros, corEscama);
	}

	@Override
	public void locomover() {
		System.out.println("Andadno lentttooo");
	}
	
	

}
