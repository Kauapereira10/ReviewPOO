package com.kaua.reviewpoo.model;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
		setVitorias(vitorias);
		setDerrotas(derrotas);
		setEmpates(empates);
	}
	
	public void apresentar() {
	    System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + getNome() + "!");
	    System.out.println("Nacionalidade: " + getNacionalidade());
	    System.out.println("Idade: " + getIdade() + " anos");
	    System.out.println("Altura: " + getAltura() + "m");
	    System.out.println("Peso: " + getPeso() + "kg");
	    System.out.println("Categoria: " + getCategoria());
	    System.out.println("Recorde: " + getVitorias() + " Vitórias, " + getDerrotas() + " Derrotas, " + getEmpates() + " Empates");
	    System.out.println("Prepare-se, porque esse lutador promete dar show!\n");
	}

	public void status() {
	    System.out.println("Status do Lutador: " + getNome());
	    System.out.println("Categoria: " + getCategoria());
	    System.out.println("Vitórias: " + getVitorias());
	    System.out.println("Derrotas: " + getDerrotas());
	    System.out.println("Empates: " + getEmpates());
	    System.out.println("💪 Lutador pronto para o próximo combate!\n");
	}

	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1); 
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() +1 );
	}
 	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	
	private void setCategoria() {
		if(getPeso() < 52.2) {
			this.categoria = "Inválido";
		}else if(getPeso() <= 70.3) {
			this.categoria = "Leve";
		}else if(getPeso() <= 83.9) {
			this.categoria = "Medio";
		}else if(getPeso() <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
	}
	
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
}
