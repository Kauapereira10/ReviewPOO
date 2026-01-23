package com.kaua.reviewpoo.miniprojetos.sistemafuncionarios;

public class FolhaPagamento {
	
	public void pagar(Funcionario f) {
		System.out.println("Pagando funcionario: " + f.getNome());
		System.out.println("Salario: " + f.calcularSalario());
	}
	
	public void pagar(Funcionario f, double bonusExtra) {
		System.out.println("Pagando funcionario: " + f.getNome());
		System.out.println("Salario com bonus: " + (f.calcularSalario() + bonusExtra));
	}
	
	public void pagar(String nomeFuncionario) {
		System.out.println("Processando a folha de pagamento do " + nomeFuncionario);
	}
}
