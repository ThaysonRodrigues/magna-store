package br.com.magna.model;

import java.time.LocalDate;

public class Usuario {
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private String path;
	private LocalDate dataCadastro;
	private CategoriaUsuario categoria;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public CategoriaUsuario getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaUsuario categoria) {
		this.categoria = categoria;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
}
