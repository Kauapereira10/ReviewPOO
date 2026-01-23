package com.kaua.reviewpoo.miniprojetos.sistemafuncionarios;

public class FuncionarioPJ extends Funcionario{
	private double valorHora;
	private double horasTrabalhadas;

	public FuncionarioPJ(String nome, double valorHora, double horasTrabalhadas) {
		super(nome);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double calcularSalario() {
		return getValorHora() * getHorasTrabalhadas();
	}
	
	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}


	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	
}
