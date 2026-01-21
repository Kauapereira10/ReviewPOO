package com.kaua.reviewpoo.heranca.test02;

public class Bolsista extends Aluno{
	private float bolsa;
	
	public Bolsista(String nome, String sexo, int idade, int matricula, String curso, float bolsa) {
		super(nome, sexo, idade, matricula, curso);
		this.bolsa = bolsa;
	}

	public void renovarBolsa() {
		System.out.println("Renovando a bolsa do " + this.nome);
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do bolsista " + this.nome);
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
}
