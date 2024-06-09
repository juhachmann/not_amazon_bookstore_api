package com.github.juhachmann.bookstore.api;

public class BookDTO {

	private String titulo;
	private String autor;
	private String editora;
	private double preco;
	
	public BookDTO(String titulo, String autor, String editora, double preco) {
		//super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}

	public double getPreco() {
		return preco;
	}
	
	
	
	
}
