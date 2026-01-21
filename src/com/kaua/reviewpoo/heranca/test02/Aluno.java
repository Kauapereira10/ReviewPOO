package com.kaua.reviewpoo.heranca.test02;

public class Aluno extends Pessoa{
	private int matricula;
	private String curso;
	
	public Aluno(String nome, String sexo, int idade, int matricula, String curso) {
		super(nome, sexo, idade);
		this.matricula = matricula;
		this.curso = curso;
	}

	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno " + this.nome);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
