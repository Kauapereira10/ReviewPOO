package com.kaua.reviewpoo.test;

import com.kaua.reviewpoo.model.Caneta;

public class CanetaTest01 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.modelo = "Pique";
		c1.ponta = 0.5;
		c1.carga  = 90;
		
		c1.tampar();
		c1.rabiscar();
		c1.status();

		System.out.println("-------------------");
		
	}
}
