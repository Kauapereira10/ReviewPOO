package com.kaua.reviewpoo.exercisesTest;

import com.kaua.reviewpoo.exercises.Book;

public class BookTest {
	public static void main(String[] args) {
		Book book01 = new Book();
		book01.nameBook = "Java POO Avançado";
		book01.author = "Kauã Dev";
		book01.publisher = "DevBooks"; 
		book01.pages = 350;
		book01.price = 79.99;
		book01.language = "Português";
		book01.coverType = "Capa dura";
		book01.caracteristics = "Ilustrado, Edição Especial, Papel reciclado";
		book01.launch = "2026-01-10";
		book01.openBook = false;
		
		book01.status();
		book01.read();
		book01.writedown();
		
		// Objeto book02
		Book book02 = new Book();
		book02.nameBook = "Algoritmos e Estruturas de Dados";
		book02.author = "Ana Souza";
		book02.publisher = "CodeBooks";
		book02.pages = 420;
		book02.price = 99.90;
		book02.language = "Português";
		book02.coverType = "Brochura";
		book02.caracteristics = "Exercícios práticos, Edição 2ª, Conteúdo atualizado";
		book02.launch = "2025-08-15";
		book02.openBook = true;

		book02.status();
		book02.read();
		book02.writedown();

		
		
	}
}
