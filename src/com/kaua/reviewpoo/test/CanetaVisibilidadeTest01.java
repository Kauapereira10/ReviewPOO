package com.kaua.reviewpoo.test;

import com.kaua.reviewpoo.model.CanetaVisibilidade;

public class CanetaVisibilidadeTest01 {
	public static void main(String[] args) {
		CanetaVisibilidade c1 = new CanetaVisibilidade();
		
		c1.modelo = "BIC";
		c1.cor = "Preto"; 
		//c1.ponta = 0.5;
		c1.tampar();
		
		c1.status();
		
	}
}
