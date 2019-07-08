package br.com.viavarejo.compra.domain.model;

public class Compra {

	private Produto produto;
	
	private CondicaoPagamento condicaoPagamento;
	
	public Compra() {
		// TODO Auto-generated constructor stub
	}
	
	public Compra(Produto produto, CondicaoPagamento condicaoPagamento) {
		this.produto = produto;
		this.condicaoPagamento = condicaoPagamento;
	}

	public Produto getProduto() {
		return produto;
	}

	public CondicaoPagamento getCondicaoPagamento() {
		return condicaoPagamento;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setCondicaoPagamento(CondicaoPagamento condicaoPagamento) {
		this.condicaoPagamento = condicaoPagamento;
	}
	
	
	
}
