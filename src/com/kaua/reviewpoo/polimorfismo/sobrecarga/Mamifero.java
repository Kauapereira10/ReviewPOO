package com.kaua.reviewpoo.polimorfismo.sobrecarga;

public class Mamifero extends Animal{
	private String cor;

	public Mamifero(double peso, double idade, int membros, String cor) {
		super(peso, idade, membros);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void emitirSom() {
		System.out.println("Som do mamifero");
		
	}
	
	
	
	
}
