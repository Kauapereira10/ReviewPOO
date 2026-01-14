package com.kaua.reviewpoo.exercises;

import com.kaua.reviewpoo.interfaces.Pagamento;

public class PagamentoPix implements Pagamento {
	private String chavePix;
	private double valorSaldo;
	
	
	
	public PagamentoPix(String chavePix, double valorSaldo) {
		this.chavePix = chavePix;
		setValorSaldo(valorSaldo);
	}



	@Override
	public boolean pagar(double valor) {
		if(this.valorSaldo >= valor) {
			setValorSaldo(getValorSaldo() - valor);
			System.out.println("Pagamento de R$ " + valor + " realizado via Pix para a chave: " + chavePix);
			return true;
		}else {
			System.out.println("Pagamento negado: Saldo insuficiente na conta Pix.");
		}
		return false;
	}



	public String getChavePix() {
		return chavePix;
	}



	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}



	public double getValorSaldo() {
		return valorSaldo;
	}



	public void setValorSaldo(double valorSaldo) {
		if(valorSaldo < 0 ) {
			System.out.println("O saldo inicial precisa ser maior que R$ 0");
		}
		this.valorSaldo = valorSaldo;
	}
	
	
}
