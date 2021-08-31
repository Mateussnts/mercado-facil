package com.ufcg.psoft.mercadofacil.model.deliveryStrategy;


import com.ufcg.psoft.mercadofacil.model.Carrinho;

public class Retirada implements EntregaStrategy{

	@Override
	public double calculaEntrega(int distancia, Carrinho carrinho) {
		double valorFinal = 0.0;
		if(carrinho.getTipoProdutos().equals("Refrigeracao")) {
			valorFinal = distancia + 30;
		
		}else if(carrinho.getTipoProdutos().equals("Fragil")) {
			valorFinal = distancia + 20;
		
		}else if(carrinho.getTipoProdutos().equals("Comum")) {
			valorFinal = distancia + 10;
		}
		return valorFinal;
	}
}
