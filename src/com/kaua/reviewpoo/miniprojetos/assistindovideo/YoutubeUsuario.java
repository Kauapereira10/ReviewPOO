package com.kaua.reviewpoo.miniprojetos.assistindovideo;

public class YoutubeUsuario extends Pessoa{
	private String login;
	private int totalAssistido;

	public YoutubeUsuario(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totalAssistido = 0;
	}


	public void viuMaisUm() {
		this.totalAssistido++;
		this.ganharExp(1);
	}
	
	
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotalAssistido() {
		return totalAssistido;
	}

	public void setTotalAssistido(int totalAssistido) {
		this.totalAssistido = totalAssistido;
	}
	
}
