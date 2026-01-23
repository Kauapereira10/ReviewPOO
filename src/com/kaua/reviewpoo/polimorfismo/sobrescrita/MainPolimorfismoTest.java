package com.kaua.reviewpoo.polimorfismo.sobrescrita;

public class MainPolimorfismoTest {
	public static void main(String[] args) {
		System.out.println("Teste Mamifero");
		Mamifero m = new Mamifero(24.3, 10, 4 , "azul");
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		System.out.println();
		
		System.out.println("Teste Reptil");
		Reptil r = new Reptil(8.3, 2, 4 , "Preta");
		r.locomover();
		r.alimentar();
		r.emitirSom();
		
		System.out.println();
		
		System.out.println("Teste Peixe");
		Peixe p = new Peixe(10.3, 1, 2, "branco");
		p.locomover();
		p.alimentar();
		p.emitirSom();
		p.soltarBolha();
	}
}
