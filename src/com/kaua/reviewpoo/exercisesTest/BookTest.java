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
		book01.openBook = true;
		
		book01.status();
		book01.read();
		book01.writedown();
		
	}
}
