package com.kaua.reviewpoo.exercisesTest;

import com.kaua.reviewpoo.exercises.Livro2;
import com.kaua.reviewpoo.exercises.Pessoa;

public class PessoaTest {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Kauã", 19, "Masculino");

		Livro2 livro1 = new Livro2("Java: Como Programar", "Deitel", 850, 0, p1);

		System.out.println("----- DETALHES INICIAIS -----");
		livro1.detalhes();

		System.out.println("\n----- Abrindo o livro -----");
		livro1.abrir();

		System.out.println("\n----- Folheando para a página 100 -----");
		livro1.folhear(100);

		System.out.println("\n----- Avançando 1 página -----");
		livro1.avancarPage();

		System.out.println("\n----- Avançando mais 1 página -----");
		livro1.avancarPage();

		System.out.println("\n----- Voltando 50 páginas -----");
		livro1.voltarPage(50);

		System.out.println("\n----- Fechando o livro -----");
		livro1.fechar();

		System.out.println("\n----- DETALHES FINAIS -----");
		livro1.detalhes();
	}
}
