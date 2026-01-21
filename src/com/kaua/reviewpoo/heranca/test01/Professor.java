package com.kaua.reviewpoo.heranca.test01;

public class Professor extends Pessoa{
	private String especialidade;
	private double salario;
	
	public void receberAumento(int valor) {
		setSalario(getSalario() + valor);
		System.out.println("Meu aumento de salario foi R$ " + valor);
		System.out.println("Salario atual R$ " + getSalario());
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
