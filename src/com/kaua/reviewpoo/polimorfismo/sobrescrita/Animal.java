package com.kaua.reviewpoo.polimorfismo.sobrescrita;

public abstract class Animal {
	protected double peso;
	protected double idade;
	protected int membros;
	
	public Animal(double peso, double idade, int membros) {
		this.peso = peso;
		this.idade = idade;
		this.membros = membros;
	}
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getIdade() {
		return idade;
	}
	public void setIdade(double idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	
	
}
