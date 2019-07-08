package br.com.viavarejo.compra.domain.model;

import java.time.LocalDate;

public class TaxaSelic {

	private LocalDate data;
	
	private double valor;

	public TaxaSelic() {

	}
	
	public TaxaSelic(LocalDate data, double valor) {
		this.data = data;
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}
	
}
