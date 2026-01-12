package com.kaua.reviewpoo.test;

import com.kaua.reviewpoo.model.ContaBanco;

public class ContaBancoTest {
	public static void main(String[] args) {
		 System.out.println("=========== TESTE CONTA BANCÁRIA ===========");

	        ContaBanco p1 = new ContaBanco();
	        p1.setNumConta(1111);
	        p1.setDono("Kauã");
	        p1.abrirConta("CC");

	        ContaBanco p2 = new ContaBanco();
	        p2.setNumConta(2222);
	        p2.setDono("Creuza");
	        p2.abrirConta("CP");

	        System.out.println("\n--- ESTADO INICIAL ---");
	        p1.mostrarInformacoes();
	        p2.mostrarInformacoes();

	        System.out.println("\n--- OPERAÇÕES ---");
	        
	        p1.depositar(100);
	        p1.sacar(30);
	        p1.pagarTaxa();

	        p2.depositar(200);
	        p2.sacar(50);
	        p2.pagarTaxa();

	        System.out.println("\n--- ESTADO FINAL ---");
	        p1.mostrarInformacoes();
	        p2.mostrarInformacoes();

	        System.out.println("=========== FIM DO TESTE ===========");
	}
}
