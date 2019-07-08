package br.com.viavarejo.compra.domain.calculojuros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.viavarejo.compra.domain.taxaselic.CalculaTaxaSelic;

@Service
public class CalculoJuros {

	@Autowired
	private CalculaTaxaSelic calculaTaxaSelic;
	
	//implementar o calculo de juros apartir da sexta parcela
	public String calcular(Double valorProduto, int quantidadeParcelas) {
		
		double taxaAcumaldaDoMes = this.calculaTaxaSelic.calcularAcumuladoDoMes();
		
		return null;
	}
	
	
}
