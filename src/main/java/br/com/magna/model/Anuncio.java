package br.com.magna.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuncio {
	
	private Long id;
	private int margemLucro;
	private BigDecimal precoVenda;
	private int margemDesconto;
	private LocalDate dataCadastro;
	private Produto produto;
	private Usuario usuario;
	
	public int getMargemLucro() {
		return margemLucro;
	}
	public void setMargemLucro(int margemLucro) {
		this.margemLucro = margemLucro;
	}
	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}
	public int getMargemDesconto() {
		return margemDesconto;
	}
	public void setMargemDesconto(int margemDesconto) {
		this.margemDesconto = margemDesconto;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
