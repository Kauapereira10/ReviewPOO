package com.kaua.reviewpoo.exercises;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String email, nome;
	private List<Livro> livrosEmprestados;
	
	public Usuario(String nome, String email) {
		setNome(nome);
		setEmail(email);
		this.livrosEmprestados = new ArrayList<>();
	}

	public void pegarLivro(Livro l) {
		if(l.isDisponivel()) {
			l.emprestar();
			livrosEmprestados.add(l);
			System.out.println(nome + " pegou o Livro "  +l.getTitulo());
		}else {
			System.out.println("O livro " + l.getTitulo() + " não está disponível.");
		}
	}
	
	public void devolverLivro(Livro l) {
		if(!l.isDisponivel()) {
			l.devolver();
			livrosEmprestados.remove(l);
			System.out.println(nome + " devolveu o livro: " + l.getTitulo());
		} else {
			System.out.println(nome + " nao possui o livro " + l.getTitulo() + " para devolver.");
		}
	}
	
	public void mostrarLivros() {
		System.out.println("Usuário: " + getNome() + " | Livros: ");
		if(livrosEmprestados.isEmpty()) {
			System.out.println("[Nenhum livro emprestado]");
		} else {
			List<String> titulos = new ArrayList<String>();
			for (Livro l : livrosEmprestados) {
				titulos.add(l.getTitulo());
			}
			System.out.println(titulos);
		}
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
