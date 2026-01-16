package com.kaua.reviewpoo.exercises;

public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, int ano) {
		setTitulo(titulo);
		setAutor(autor);
		setAno(ano);
		this.disponivel = true;
	}

	public void emprestar() {
		if(this.disponivel) {
			disponivel = false;
		}else {
			System.out.println("Aviso: O livro '"+titulo+"' ja esta reservado!");
		}
	}
	
	public void devolver() {
		disponivel = true;
	}
	
	public void mostrarInfo() {
		String status = disponivel ? "Disponivel" : "Emprestado";
		System.out.println("Livro: " + titulo + " | Autor: " + autor + " | Ano: " + ano + " | Status: " + status);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}


	
}
