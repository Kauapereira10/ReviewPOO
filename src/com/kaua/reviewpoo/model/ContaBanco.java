package com.kaua.reviewpoo.model;

public class ContaBanco {
	private int numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	public void abrirConta(String t) {
		setTipo(t);
		setStatus(true);
		if("CC".equals(t)) {
			this.setSaldo(50);
			System.out.println("Conta Corrente Aberta com sucesso!");
		}else if ("CP".equals(t)){
			this.setSaldo(150);
			System.out.println("Conta Poupança Aberta com sucesso!");
		}
		
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("A conta esta com dinheiro");
		}else if(this.getSaldo() < 0) {
			System.out.println("Conta em débito");
		}else {
			setStatus(false);
			System.out.println("Conta fechada");
		}
		
	}
	
	public void depositar(double valor) {
		if(valor <= 0){
		    System.out.println("Valor inválido");
		    return;
		}
		if (contaAtiva()) {
			setSaldo(getSaldo() + valor);
			System.out.println("Valor depositado foi R$ " + valor + ", saldo atual R$ " + getSaldo());
		}else {
			System.out.println("Impossivel depositar");
		}
	}
	
	public void sacar(double valor) {
		if(valor <= 0){
		    System.out.println("Valor inválido");
		    return;
		}

		if(contaAtiva() && temSaldo(valor)) {
			setSaldo(getSaldo() - valor); 
			System.out.println("Valor do saque foi R$ " + valor);
		}else {
			 System.out.println("Saldo insuficiente");
		}
	}
	
	public void pagarTaxa() {
		int valor = 0;
		
		if("CC".equals(getTipo())) {
			valor = 12;
		}else if("CP".equals(getTipo())) {
			valor = 20;
		}
		if(contaAtiva() && temSaldo(valor)) {
			setSaldo(getSaldo() - valor); 
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void mostrarInformacoes() {
	    System.out.println("----- CONTA BANCÁRIA -----");
	    System.out.println("Número da Conta: " + numConta);
	    System.out.println("Dono: " + dono);
	    System.out.println("Tipo: " + tipo);
	    System.out.println("Saldo: R$ " + saldo);
	    System.out.println("Status: " + (status ? "Ativa" : "Fechada"));
	}

	private boolean contaAtiva() {
		return status;
		
	}
	
	private boolean temSaldo(double valor) {
		return saldo >= valor;
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean b) {
		this.status = b;
	}
	
	
}
