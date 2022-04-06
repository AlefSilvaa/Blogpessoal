package com.generatio.blogpessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "o campo nome dever ser preenchido")
	@Size
	private String nome;

	@NotBlank(message = "o campo nome dever ser preenchido")
	@Size
	private String usuario;

	@NotBlank(message = "o campo nome dever ser preenchido")
	@Size
	private String senha;

	@NotBlank(message = "o campo nome dever ser preenchido")
	@Size
	private String foto;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE) 
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Postagem> getProduto() {
		return postagem;
	}

	public void setProduto(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
	

}
