package com.kaua.reviewpoo.exercises;

public class Pedido {
	private int id;
	private double valorTotal;
	private boolean pago;
	
	public Pedido(int id, double valorTotal) {
		this.id = id;
		this.valorTotal = valorTotal;
		this.pago = false;
	}
	
	public boolean marcarComoPago() {
		if(this.pago) {
			System.out.println("Pedido ja esta pago");
			return false;
		}
		this.pago = true;
		return true;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
}
