package com.kaua.reviewpoo.polimorfismo.sobrecarga;

public class Lobo extends Mamifero{

	public Lobo(double peso, double idade, int membros, String cor) {
		super(peso, idade, membros, cor);
	}

	@Override
	public void emitirSom() {
		System.out.println("AUUUUU!");
	}

	
	
}
