package com.kaua.reviewpoo.polimorfismoSobreposicao;

public class Canguru extends Mamifero{
	
	public Canguru(double peso, double idade, int membros, String cor) {
		super(peso, idade, membros, cor);
	}

	
	@Override
	public void locomover() {
		System.out.println("Pulando");
	}


	public void usarBolsa() {
		System.out.println("Usando bolsa.");
	}
}
