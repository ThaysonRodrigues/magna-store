package br.com.magna.model;

import java.time.LocalDate;

public class CategoriaUsuario {

	private Long id;
	private String nome;
	private LocalDate dataCadastro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeCategoria() {
		return nome;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nome = nomeCategoria;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}	
}
