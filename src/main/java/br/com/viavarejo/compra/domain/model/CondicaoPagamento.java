package br.com.viavarejo.compra.domain.model;

public class CondicaoPagamento {

	private Double valorEntrada;
	
	private int qtdeParcelas;
	
	public CondicaoPagamento() {
		// TODO Auto-generated constructor stub
	}

	public CondicaoPagamento(Double valorEntrada, int qtdeParcelas) {
		this.valorEntrada = valorEntrada;
		this.qtdeParcelas = qtdeParcelas;
	}

	public Double getValorEntrada() {
		return valorEntrada;
	}

	public int getQtdeParcelas() {
		return qtdeParcelas;
	}

	public void setValorEntrada(Double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	public void setQtdeParcelas(int qtdeParcelas) {
		this.qtdeParcelas = qtdeParcelas;
	}
	
	
}
