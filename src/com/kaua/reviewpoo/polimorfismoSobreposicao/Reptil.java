package com.kaua.reviewpoo.polimorfismoSobreposicao;

public class Reptil extends Animal{
	private String corEscama;

	public Reptil(double peso, double idade, int membros, String corEscama) {
		super(peso, idade, membros);
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Esta rastejando.");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo inseto.");
	}

	@Override
	public void emitirSom() {
		System.out.println("crasseddfe");
	}
	
	
	
}
