package com.kaua.reviewpoo.test;

import com.kaua.reviewpoo.model.Celular;

public class CelularTest {
	public static void main(String[] args) {
		
        Celular celular = new Celular();

        System.out.println("=== TESTE 1: Ligar celular ===");
        celular.ligar();
        celular.abrirMenu();

        System.out.println("\n=== TESTE 2: Ajustar volume ===");
        celular.aumentarVolume();
        celular.aumentarVolume();
        celular.diminuirVolume();

        System.out.println("\n=== TESTE 3: Modo mudo ===");
        celular.ligarMudo();
        celular.desligarMudo();

        System.out.println("\n=== TESTE 4: Fechar menu ===");
        celular.fecharMenu();

        System.out.println("\n=== TESTE 5: Desligar celular ===");
        celular.desligar();
        celular.abrirMenu(); 
	
	}
}
