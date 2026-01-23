package com.kaua.reviewpoo.miniprojetos.sistemafuncionarios;

public abstract class Funcionario {
	private String nome;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}

	public abstract double calcularSalario();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + this.getNome() + "]";
	}

	
	
}
