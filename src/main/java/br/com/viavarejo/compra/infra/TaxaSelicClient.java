package br.com.viavarejo.compra.infra;

import java.time.LocalDate;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "TaxaSelic", url = "https://api.bcb.gov.br/dados/serie/bcdata.sgs.11/")
public interface TaxaSelicClient {
	
	@GetMapping( "dados?formato=json&dataInicial={dataInicial}&dataFinal={dataFinal}")
	String buscaTaxaSelicMensalPor( @PathVariable("dataInicial") @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate dataInicial
								   ,@PathVariable("dataFinal") @DateTimeFormat(pattern = "dd/MM/yyyy")  LocalDate dataFinal );
}
