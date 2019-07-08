package br.com.viavarejo.compra.domain.model;

public class Produto {

	private long codigo;
	
	private String nome;
	
	private Double valor;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public Produto(long codigo, String nome, Double valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}

	public long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
}
