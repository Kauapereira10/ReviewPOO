package com.kaua.reviewpoo.exercises;

import com.kaua.reviewpoo.interfaces.Pagamento;

public class PagamentoCartao implements Pagamento{
	private String numeroCartao;
	private String nomeTitular;
	private double limiteDisponivel;
	
	
	public PagamentoCartao(String numeroCartao, String nomeTitular, double limiteDisponivel) {
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		setLimiteDisponivel(limiteDisponivel);
	}



	@Override
	public boolean pagar(double valor) {
		if(this.limiteDisponivel  >= valor) {
			setLimiteDisponivel(getLimiteDisponivel() - valor);
			System.out.println("Pagamento de R$ " + valor + " aprovado no cartão de " + nomeTitular);
			return true;
			
		}else {
			System.out.println("Pagamento negado: Limite insuficiente no cartão.");
			return false;
		}
		
	}



	public String getNumeroCartao() {
		return numeroCartao;
	}



	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}



	public String getNomeTitular() {
		return nomeTitular;
	}



	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}



	public double getLimiteDisponivel() {
		return limiteDisponivel;
	}



	public void setLimiteDisponivel(double limiteDisponivel) {
		if(limiteDisponivel <= 0) {
			System.out.println("Valor precisa ser maior que R$ 0");
			 return;
		}
		this.limiteDisponivel = limiteDisponivel;
	}
	
	
	
	
	
}
