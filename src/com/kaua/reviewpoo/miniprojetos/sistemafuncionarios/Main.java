package com.kaua.reviewpoo.miniprojetos.sistemafuncionarios;

public class Main {
	public static void main(String[] args) {
		Funcionario kauaCLT = new FuncionarioCLT("Kaua", 1200, 87.50);
		Funcionario joaoPJ = new FuncionarioPJ("Joao", 30.50, 10);
		
		Departamento financeiro = new Departamento("Financeiro");
		Departamento qualidade = new Departamento("Qualidade");
	
		System.out.println("=== Adicionando Funcionario ===");
		financeiro.adicionarFuncionario(kauaCLT);
		qualidade.adicionarFuncionario(joaoPJ);
		
		System.out.println();
		
		System.out.println("=== Listando Financeiro ===");
		financeiro.listarFuncionarios();
		
		System.out.println();
		
		System.out.println("=== Listando Qualidade ===");
		qualidade.listarFuncionarios();
				
		System.out.println();
		
		FolhaPagamento folha = new FolhaPagamento();

		System.out.println("=== Pagando Salario CLT ===");
		folha.pagar(kauaCLT);
		
		System.out.println();
		
		System.out.println("=== Pagando Salario PJ ===");
		folha.pagar(joaoPJ);
		
		
		
	}
}
