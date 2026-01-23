package com.kaua.reviewpoo.polimorfismo.sobrecarga;

public abstract class Animal {
	private double peso;
	private double idade;
	private int membros;
	
	public Animal(double peso, double idade, int membros) {
		this.peso = peso;
		this.idade = idade;
		this.membros = membros;
	}
	
	public abstract void emitirSom();
	
	@Override
	public String toString() {
		return "Animal [peso=" + getPeso() + ", idade=" + getIdade() + ", membros=" + getMembros() + "]";
	}
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
