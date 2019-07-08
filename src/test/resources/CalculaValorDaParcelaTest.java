import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculaValorDaParcelaTest {
	
	@Test
	public void divideValorProdutoPorDez() {
		
		Double valorProduto = 1000.00;
		
		int quantidadeParcelas = 10;
		
		double parcela = valorProduto / quantidadeParcelas;
		
		assertEquals(100.0, parcela, 0000);
		
	}
	
	public static void main(String[] args) {
		
		double cf = Math.abs( Math.pow(1/2, 3));
		
		System.out.println(cf);
	
	}
	
	@Test
	public void quantidadeParcelaMaiorQueSeis() {
		
		double taxaSelic = 1.23;
		
		Double valorProduto = 1000.00;
		
		int quantidadeParcelas = 10;
		
		
		
	}
	
}
