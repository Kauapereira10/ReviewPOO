package com.kaua.reviewpoo.exercises;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	private boolean emEstoque;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		setQuantidade(quantidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		if (preco <= 0) {
			System.out.println("O preço não pode ser menor ou igual a R$0");
			return;
		}
		this.preco = preco;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade < 0) {
			quantidade = 0;
		}
		this.quantidade = quantidade;
		this.emEstoque = quantidade > 0;
	}

	public boolean isEmEstoque() {
		return this.emEstoque;
	}

	public void vender(int qnt) {
		if (qnt < 0) {
			System.out.println("Quantidade inválida para venda.");
			return;
		}

		if (getQuantidade() < qnt) {
			System.out.println("Estoque insuficiente para venda.");
		} else {
			this.setQuantidade(getQuantidade() - qnt);
			System.out.println(qnt + " unidade(s) vendida(s)!");
		}
	}

	public void repor(int qnt) {
		if (qnt < 0) {
			System.out.println("Quantidade invalida para reposiçao!");
			return;
		}
		setQuantidade(getQuantidade() + qnt);
		System.out.println(qnt + " unidades adicionadas ao estoque!");
	}

	public void informacacoes() {
		System.out.println("Nome: " + getNome());
		System.out.println("Preço: R$ " + getPreco());
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Em estoque? " + isEmEstoque());
	}
}
