package com.kaua.reviewpoo.polimorfismo.sobrescrita;

public class Ave extends Animal{
	private String corPenal;

	public Ave(double peso, double idade, int membros, String corPenal) {
		super(peso, idade, membros);
		this.corPenal = corPenal;
	}

	public String getCorPenal() {
		return corPenal;
	}

	public void setCorPenal(String corPenal) {
		this.corPenal = corPenal;
	}

	@Override
	public void locomover() {
		System.out.println("Estou voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Estou comendo minhoca");
	}

	@Override
	public void emitirSom() {
		System.out.println("piu piu");
	}
	
	public void fazerNinho() {
		System.out.println("Fazendo ninho!");
	}
	
}
