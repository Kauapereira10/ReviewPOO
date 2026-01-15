package com.kaua.reviewpoo.model;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;
	
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if	(l1.getCategoria().equals(l2.getCategoria()) && !l1.getNome().equals(l2.getNome())) {
			this.aprovado = true;
			this.setDesafiado(l1);
			this.setDesafiante(l2);
			System.out.println("Luta marcada:");
			System.out.println(l1.getNome() + " VS " + l2.getNome());
		}else {
			this.aprovado = false;
			this.setDesafiado(null);
			this.setDesafiante(null);
			System.out.println("Luta nao pode ser marcada.");
		}
	}
	
	public void lutar() {
		
		if (aprovado) {
			
			System.out.println("### DESAFIADO ###");
			this.getDesafiado().apresentar();
			System.out.println("### DESAFIANTE ###");
			this.getDesafiante().apresentar();
			
			Random aleatorio = new Random();
			int vencedor  = aleatorio.nextInt(3);
			switch (vencedor ) {
				case 0 :
					System.out.println("Epatou!");
					this.getDesafiado().empatarLuta();
					this.getDesafiante().empatarLuta();
					
					break;
				case 1 :
					System.out.println("Desafiado Ganhou!!");
					this.getDesafiado().ganharLuta();
					this.getDesafiante().perderLuta();
					
					break;
				case 2 :
					System.out.println("Desafiante Ganhou!!");
					this.getDesafiante().ganharLuta();
					this.getDesafiado().perderLuta();
					
					break;
				
			}
		
		
		}else {
			System.out.println("A luta nao pode acontecer");
		}
	}
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
}
