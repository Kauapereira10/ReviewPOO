package com.kaua.reviewpoo.miniprojetos.assistindovideo;

public class Visualizacao {
	private YoutubeUsuario espectador;
	private Video filme;
	public Visualizacao(YoutubeUsuario espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.viuMaisUm();
		this.filme.setViews(this.filme.getViews() + 1);
		this.filme.play();
	}
	
	public void  avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float porc) {
		int tot = 0;
		if(porc <= 20) {
			tot =3;
		}else if(porc <=50) {
			tot = 5;
		}else if(porc <= 80) {
			tot = 8;
		}else {
			tot = 10;
		}
		this.filme.setAvaliacao(tot);
	}
	public YoutubeUsuario getEspectador() {
		return espectador;
	}
	public void setEspectador(YoutubeUsuario espectador) {
		this.espectador = espectador;
	}
	public Video getFilme() {
		return filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}
	@Override
	public String toString() {
		return "Visualizacao [espectador=" + this.getEspectador() + ", filme=" + this.getFilme() + "]";
	}
	
	
}
