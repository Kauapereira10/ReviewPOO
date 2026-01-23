package com.kaua.reviewpoo.miniprojetos.sistemafuncionarios;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nome;
	List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public Departamento(String nome) {
		this.nome = nome;
	}

	public void adicionarFuncionario(Funcionario f) {
		funcionarios.add(f);
		System.out.println(f.getNome());
	}
	
	public void listarFuncionarios() {
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.toString());
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}	
	
	
}
