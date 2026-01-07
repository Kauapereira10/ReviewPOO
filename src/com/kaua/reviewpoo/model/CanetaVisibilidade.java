package com.kaua.reviewpoo.model;

public class CanetaVisibilidade {
	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	private boolean tampada;
	
	public void  status() {
		System.out.println("Cor da caneta: " + this.cor);
		System.out.println("Modelo da caneta: " + this.modelo);
		System.out.println("Ponta da caneta: " + this.ponta);
		System.out.println("Carga da caneta: " + this.carga);
		System.out.println("Caneta esta tampada: " + this.tampada);
	}
	
	public void rabiscar() {
		if(tampada == true) {
			System.out.println("Eu nao posso rabiscar, porque a caneta esta tampada.");
		}else {
			System.out.println("Estou rabiscando!");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
}
