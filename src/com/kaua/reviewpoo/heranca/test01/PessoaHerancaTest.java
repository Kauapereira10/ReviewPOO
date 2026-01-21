package com.kaua.reviewpoo.heranca.test01;

public class PessoaHerancaTest {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Kaua");
		p2.setNome("Joao");
		p3.setNome("Thomas");
		p4.setNome("Benjamin");
		
		p1.setIdade(18);
		p2.setIdade(28);
		p3.setIdade(38);
		p4.setIdade(8);
		
		p2.setCurso("ADS");
		p3.setSalario(1.2333);
		
		p2.cancelarMatricula();
		p3.fazerAniversario();
		p4.mudarTrabalho();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
}
