package com.kaua.reviewpoo.exercises;

import com.kaua.reviewpoo.interfaces.Publicacao;

public class Livro2  implements Publicacao{
	private String titulo;
	private String autor;
	private int toPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	
	
	public Livro2(String titulo, String autor, int toPaginas, int pagAtual, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		setToPaginas(toPaginas);
		this.pagAtual = pagAtual;
		this.aberto = false;
		this.leitor = leitor;
	}
	
	public void detalhes() {
	    System.out.println("----- DETALHES DO LIVRO -----");
	    System.out.println("Título: " + this.titulo);
	    System.out.println("Autor: " + this.autor);
	    System.out.println("Total de páginas: " + this.toPaginas);
	    System.out.println("Página atual: " + this.pagAtual);
	    System.out.println("Aberto: " + (this.aberto ? "Sim" : "Não"));
	    System.out.println("Leitor: " + this.leitor.getNome());
	}

	@Override
	public void abrir() {
		if(!this.aberto) {
			setAberto(true);
			System.out.println("Livro aberto.");
		}
		
	}

	@Override
	public void fechar() {
		if(this.aberto) {
			setAberto(false);
			System.out.println("Livro fechado.");
		}
		
	}

	@Override
	public void folhear(int qdtPag) {
		if(isAberto()) {
			if (qdtPag >= 0 && qdtPag <= getToPaginas()) {
				setPagAtual(qdtPag); 
				System.out.println("Folheei até a página " + qdtPag);
			}else {
				System.out.println("Página inválida.");
			}
		} else {
			System.out.println("O Livro esta fechado!");
		}
		
	}

	@Override
	public void avancarPage() {
		if(isAberto() && this.getPagAtual() < this.getToPaginas()) {
			this.setPagAtual(getPagAtual() + 1); 
			System.out.println("Agora estou na página " + (getPagAtual()));
		}
		
	}

	@Override
	public void voltarPage(int voltarPag) {
		if(isAberto()) {
			int novaPagina = getPagAtual() - voltarPag;
			if(novaPagina < 0 ) {
				setPagAtual(0);
			}else {
				setPagAtual(novaPagina);
			}
			
			System.out.println("Agora estou na página " + getPagAtual());
		}
		
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
	public int getToPaginas() {
		return toPaginas;
	}
	public void setToPaginas(int toPaginas) {
		if(toPaginas <= 0) {
			System.out.println("A paginas do livro precisa ser maior que 0");
		}else {
			this.toPaginas = toPaginas;
		}
	}
	
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
}
