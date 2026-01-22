package com.kaua.reviewpoo.polimorfismoSobreposicao;

public class Mamifero extends Animal {
	private String cor;

	public Mamifero(double peso, double idade, int membros, String cor) {
		super(peso, idade, membros);
		this.cor = cor;
	}

	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");	
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Mamifero");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
