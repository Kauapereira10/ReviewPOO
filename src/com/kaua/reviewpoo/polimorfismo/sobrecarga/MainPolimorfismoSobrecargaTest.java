package com.kaua.reviewpoo.polimorfismo.sobrecarga;

public class MainPolimorfismoSobrecargaTest {

    public static void main(String[] args) {

        System.out.println("=== TESTE DE POLIMORFISMO ===\n");

        // Polimorfismo por herança e sobrescrita
        Animal mamifero = new Mamifero(87, 10, 4, "Marrom");
        Animal lobo = new Lobo(24, 2, 4, "Branco");
        Animal cachorro = new Cachorro(10, 6, 4, "Preto");

        System.out.println(">>> Sons emitidos:");
        mamifero.emitirSom();
        lobo.emitirSom();
        cachorro.emitirSom();

        System.out.println("\n>>> Testes de reação do cachorro:");

        Cachorro dog = (Cachorro) cachorro; // casting intencional

        dog.reagir("ola");
        dog.reagir("vai embora");

        dog.reagir(9, 30);
        dog.reagir(20, 0);

        dog.reagir(true);
        dog.reagir(false);

        dog.reagir(3, 8.5);
        dog.reagir(7, 12.0);

        System.out.println("\n=== FIM DOS TESTES ===");
    }
}
