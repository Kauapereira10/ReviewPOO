package com.kaua.reviewpoo.exercisesTest;

import com.kaua.reviewpoo.exercises.Livro;
import com.kaua.reviewpoo.exercises.Usuario;

public class LivroEUsuarioTest {
	public static void main(String[] args) {
		Livro l1 = new Livro("1984", "George Orwell", 1949);
        Livro l2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        Livro l3 = new Livro("Harry Potter", "J.K. Rowling", 1997);
        Livro l4 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro l5 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        
        
        Usuario ana = new Usuario("Ana", "ana@email.com");
        Usuario joao = new Usuario("João", "joao@email.com");
        
        System.out.println("--- Início do Teste de Empréstimos ---");
        
        ana.pegarLivro(l1);
        ana.pegarLivro(l3);
        joao.pegarLivro(l2);
        joao.pegarLivro(l4);
        
        System.out.println("\n--- Status dos Usuários ---");
        ana.mostrarLivros();
        joao.mostrarLivros();
	
        System.out.println("\n--- Testando Devolução e Atualização ---");
        ana.devolverLivro(l1);
        
        System.out.println("\n--- Status Final dos Livros na Biblioteca ---");
        l1.mostrarInfo();
        l2.mostrarInfo();
        l3.mostrarInfo();
        l4.mostrarInfo();
        l5.mostrarInfo();
        
        System.out.println("\n--- Status Final da Ana e Joao ---");
        ana.mostrarLivros();
        joao.mostrarLivros();
	
	}
}
