package com.kaua.reviewpoo.polimorfismo.sobrescrita;

public class Peixe extends Animal{
	private String corEscamal;

	public Peixe(double peso, double idade, int membros, String corEscamal) {
		super(peso, idade, membros);
		this.corEscamal = corEscamal;
	}

	public String getCorEscamal() {
		return corEscamal;
	}

	public void setCorEscamal(String corEscamal) {
		this.corEscamal = corEscamal;
	}

	@Override
	public void locomover() {
		System.out.println("Estou nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Estou comendo outro peixe.");
	}

	@Override
	public void emitirSom() {
		System.out.println("nadando");
	}
	
	public void soltarBolha() {
		System.out.println("Soltando bolha");
	}
	
}
