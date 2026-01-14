package com.kaua.reviewpoo.exercisesTest;

import com.kaua.reviewpoo.exercises.PagamentoCartao;
import com.kaua.reviewpoo.exercises.PagamentoPix;
import com.kaua.reviewpoo.exercises.Pedido;
import com.kaua.reviewpoo.interfaces.Pagamento;

public class SistemaPedidosTest {
	public static void main(String[] args) {
		Pedido meuPedido = new Pedido(123, 55.00);
		System.out.println("Pedido criado: ID " + meuPedido.getId() + " | Valor: R$ " + meuPedido.getValorTotal());
		
		Pagamento formaPagamento;
		
		System.out.println("\n--- Tentando pagar com Cartão ---");
		formaPagamento = new PagamentoCartao("1234-5678", "João Silva", 500.00);
		
		realizarProcessoPagamento(meuPedido, formaPagamento);
		
		System.out.println("\n--- Tentando pagar outro pedido com Pix ---");
        Pedido outroPedido = new Pedido(102, 100.00);
        formaPagamento = new PagamentoPix("joao@email.com", 50.00);
        
        realizarProcessoPagamento(outroPedido, formaPagamento);
		
	}
	
	public static void realizarProcessoPagamento(Pedido pedido, Pagamento meioDePagamento) {
		if(meioDePagamento.pagar(pedido.getValorTotal())) {
			pedido.marcarComoPago();
			System.out.println("Status final: " + (pedido.isPago() ? "Pago" : "Pedente"));
			
		}else {
			System.out.println("Erro: Não foi possível processar o pagamento do pedido " + pedido.getId());
		}
		
		System.out.println("Status final: " + (pedido.isPago() ? "Pago" : "Pedente"));
	}
}
