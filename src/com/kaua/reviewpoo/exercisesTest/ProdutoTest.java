package com.kaua.reviewpoo.exercisesTest;

import com.kaua.reviewpoo.exercises.Produto;

public class ProdutoTest {
	public static void main(String[] args) {
		Produto lapis = new Produto("Lapis", 0.80, 0);
		
		System.out.println("=== Estado inicial ===");
		lapis.informacacoes();
		
		System.out.println("\n=== Repondo 20 unidades ===");
		lapis.repor(20);
		lapis.informacacoes();
		
		System.out.println("\n=== Vendendo 10 unidades ===");
		lapis.vender(10);
		lapis.informacacoes();
		
		System.out.println("\n=== Tentando vender 15 unidades (estoque insuficiente) ===");
		lapis.vender(15);
		lapis.informacacoes();
		
	}
}
