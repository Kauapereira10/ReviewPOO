package com.kaua.reviewpoo.heranca.test02;

public abstract class Pessoa {
	protected String nome, sexo;
	protected int idade;
	
	public Pessoa(String nome, String sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	public final void fazerAniversario() {
		setIdade(getIdade() + 1);
		System.out.println("Agora tenhbo " + getIdade() + " anos de idade.");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Dados [nome=" + getNome() + ", sexo=" + getSexo() + ", idadel=" + getIdade() + "]";
	}
	
	
	
}
