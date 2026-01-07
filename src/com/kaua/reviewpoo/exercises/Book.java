package com.kaua.reviewpoo.exercises;

public class Book {
	//Attributes
	public String author;
	public String publisher;
	public String nameBook;
	public int pages;
	public double price;
	public String caracteristics;
	public String launch;
	public String language;
	public String coverType;
	public boolean openBook;
	
	
	//Mutates 
	public void bookOpen() {
		this.openBook = true;
	}
	
	public void bookClose() {
		this.openBook = false;
	}
	
	public void read() {
		if(openBook == true) {
			System.out.println("I'm reading the book");
		}else {
			System.out.println("I can't reanding the book, because the book it's close");
		}
	}
	
	public void writedown() {
		if(this.openBook == true) {
			System.out.println("taking notes...");
		}else {
			System.out.println("I need to open book the book to take notes.");
		}
	}
	
	public void status() {
		System.out.println("____________________");
		
		System.out.println("Name Author: " + this.author);
		System.out.println("Name Publisher: " + this.publisher);
		System.out.println("Name Book: " + this.nameBook);
		System.out.println("Pages: " + this.pages);
		System.out.println("Price: R$ " + this.price);
		System.out.println("Caracteristics: " + this.caracteristics);
		System.out.println("Launch: " + this.launch);
		System.out.println("Language: " + this.language);
		System.out.println("Cover Type: " + this.coverType);
		
		System.out.println("____________________");
	}
}
