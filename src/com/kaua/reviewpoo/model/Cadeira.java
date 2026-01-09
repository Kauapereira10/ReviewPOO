package com.kaua.reviewpoo.model;

public class Cadeira {
		public String modelo;
		private double largura;
		private double altura;
		public boolean presencaBracos;
		private boolean encostos;
		public String material;
		public boolean estaLimpo;
		
		
		 
		public Cadeira(String modelo, double largura, double altura, boolean presencaBracos, boolean encostos,
				String material, boolean estaLimpo) {
			this.modelo = modelo;
			this.largura = largura;
			this.altura = altura;
			this.presencaBracos = presencaBracos;
			this.encostos = encostos;
			this.material = material;
			this.estaLimpo = estaLimpo;
		}

		public String getMaterial() {
			return this.material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public String getModelo() {
			return this.modelo;
		}
		
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public double getLargura() {
			return this.largura;
		}
		
		public void setLargura(double largura) {
			this.largura = largura;
		}
		
		public double getAltura() {
			return this.altura;
		}
		
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		public boolean getPesencaBracos() {
			return this.presencaBracos;
		}
		
		public void setPresencaBracos(boolean presencaBracos) {
			this.presencaBracos = presencaBracos;
		}

		public boolean getEncostos() {
			return encostos;
		}

		public void setEncostos(boolean encostos) {
			this.encostos = encostos;
		}
		
		public void status() {
			System.out.println("SOBRE A CADEIRA:");
			System.out.println("Modelo: " + this.getModelo());
			System.out.println("Largura: " + this.getLargura());
			System.out.println("Altura: " + this.getAltura());
			System.out.println("Presença de Braços: " + this.getPesencaBracos());
			System.out.println("Presença de Encostos: " + this.getEncostos());
		}
		
		public void limpo() {
			if(estaLimpo == true) {
				System.out.println("A cadeira esta limpa, pode sentar.");
			}else {
				System.out.println("A cadeira esta suja, precisa limpar.");
			}
		}

		
}
