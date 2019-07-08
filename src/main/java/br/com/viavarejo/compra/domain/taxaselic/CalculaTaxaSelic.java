package br.com.viavarejo.compra.domain.taxaselic;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.viavarejo.compra.domain.model.TaxaSelic;
import br.com.viavarejo.compra.infra.TaxaSelicClient;

@Component
public class CalculaTaxaSelic {
	
	@Autowired
	private TaxaSelicClient taxaSelicMensalClient;
	
	public double calcularAcumuladoDoMes() {
		
		List<TaxaSelic> taxasDiarias = this.obterTaxaSelicMensal();
		
		return taxasDiarias.stream().mapToDouble(TaxaSelic::getValor).sum();
		
	}
	
	private List<TaxaSelic> obterTaxaSelicMensal() {
		
		LocalDate dataAnterior = LocalDate.now().minusDays(30);
		
		String taxaSelicMensal = this.taxaSelicMensalClient.buscaTaxaSelicMensalPor(dataAnterior, LocalDate.now());
		
		return convertJsonToTaxaSelicObject(taxaSelicMensal);
		
	}
	
	private List<TaxaSelic> convertJsonToTaxaSelicObject(String taxaSelicMensal) {
		
		try {
		
			ObjectMapper taxaSelicMensalFormated = new ObjectMapper();
			return taxaSelicMensalFormated.readValue(taxaSelicMensal, List.class);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
}
