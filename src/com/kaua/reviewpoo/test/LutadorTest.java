package com.kaua.reviewpoo.test;

import com.kaua.reviewpoo.model.Luta;
import com.kaua.reviewpoo.model.Lutador;

public class LutadorTest {
	public static void main(String[] args) {
		Lutador[] lutadores = new Lutador[3];
		lutadores[0] = new Lutador("Kaua", "Brasileira", 24, 1.80, 82.0, 8, 3, 2);
        lutadores[1] = new Lutador("Joao", "Mexicano", 22, 1.82, 82.0, 5, 1, 4);
        lutadores[2] = new Lutador("Thoma", "Italiano", 28, 1.75, 75.0, 2, 5, 4);
        
        System.out.println("=== STATUS INICIAL DOS LUTADORES ===");
        for (Lutador l : lutadores) {
			l.status();
		}
        
        System.out.println("\n=== REALIZANDO LUTA ENTRE LUTADORES ===");
        for (int i = 0; i < lutadores.length; i++) {
			for (int j = 0; j < lutadores.length; j++) {
				Luta luta = new Luta();
				luta.marcarLuta(lutadores[i], lutadores[j]);
				luta.lutar();
			}
		}
		
        System.out.println("\n=== STATUS FINAL DOS LUTADORES ===");
        for (Lutador l : lutadores) {
            l.status();
        }
		
	}
}	
