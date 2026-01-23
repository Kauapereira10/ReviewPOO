package com.kaua.reviewpoo.miniprojetos.sistemafuncionarios;

public class FuncionarioCLT extends Funcionario {
	private double bonus;
	private double salarioBase;

	public FuncionarioCLT(String nome, double salarioBase, double bonus) {
		super(nome);
		setSalarioBase(salarioBase);
		this.bonus = bonus;
	}

	@Override
	public double calcularSalario() {
		return getSalarioBase() * this.bonus;
	}

	public void setSalarioBase(double salarioBase) {
		if (this.salarioBase < 0) {
			System.out.println("O salario precisa ser maior que R$ 0.");
		} else {
			this.salarioBase = salarioBase;
		}
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
