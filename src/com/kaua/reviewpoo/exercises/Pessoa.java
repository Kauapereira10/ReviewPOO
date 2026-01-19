package com.kaua.reviewpoo.exercises;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		setIdade(idade);
		this.sexo = sexo;
	}
	
	public void fazerAniversario() {
		setIdade(getIdade() + 1);
		System.out.println("Feliz Aniversario, " + getNome());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
	    if (idade >= 0) {
	        this.idade = idade;
	    }
	}

	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
