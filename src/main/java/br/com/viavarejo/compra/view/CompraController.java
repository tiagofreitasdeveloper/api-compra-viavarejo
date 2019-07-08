package br.com.viavarejo.compra.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.viavarejo.compra.domain.calculojuros.CalculoJuros;
import br.com.viavarejo.compra.domain.model.Compra;

@RestController
public class CompraController {
	
	@Autowired
	private CalculoJuros calculoJuros;
	
	@PostMapping(path = "/comprar" , produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String comprar(@RequestBody Compra compra) {
		
		return this.calculoJuros.calcular(compra.getProduto().getValor(), compra.getCondicaoPagamento().getQtdeParcelas());
	
	}
	
}
