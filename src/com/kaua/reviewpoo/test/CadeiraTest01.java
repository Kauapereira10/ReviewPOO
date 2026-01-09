package com.kaua.reviewpoo.test;

import com.kaua.reviewpoo.model.Cadeira;

public class CadeiraTest01 {
	public static void main(String[] args) {
		 Cadeira cadeira = new Cadeira(
		            "Cadeira Escritório",
		            60.0,
		            120.0,
		            true,
		            true,
		            "Couro sintético",
		            false);
		 
		 cadeira.status();
		 cadeira.limpo();
		 
	}
}
