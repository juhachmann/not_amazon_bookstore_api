package com.github.juhachmann.bookstore.api;

import java.util.List;
import java.util.ArrayList;

public class BookService {

	private final List<Book> books = BookDataStore.BOOKS;

	public Book adicionarLivro(Book book) {
		books.add(book);
		return book;
	}
	
	public List<Book> getAll() {
		return books;
	}
	
	public Book getPorIsbn(int isbn) {
		for(Book book : books) {
			if (book.getIsbn() == isbn) {
				return book;
			}
		}
		return null;
	}
	
	public List<Book> getPorAutor(String autor) {
		List<Book> resultadoBusca = new ArrayList<>();
		for(Book book : books) {
			if (book.getAutor().contains(autor)) {
				resultadoBusca.add(book);
			}
		}
		return resultadoBusca;
	}
	
	public List<Book> getPorTitulo(String titulo) {
		List<Book> resultadoBusca = new ArrayList<>();
		for(Book book : books) {
			if (book.getTitulo().contains(titulo)) {
				resultadoBusca.add(book);
			}
		}
		return resultadoBusca;
	}
	
	// Essa aqui ficou redundante pq coloquei contains() nas duas buscas acima
	// Vou modificar esta pra ser uma busca geral (por todos os campos)
	public List<List<Book>> getTodosContendo(String titulo) {
		// Apresenta resultados hierarquizados, primeiro os que correspondem exatamente à busca
		// e depois os que contém o termo de busca
		// Só uma tentativa para fazer algo do tipo
		List<Book> resultadoEquals = new ArrayList<>();
		List<Book> resultadoContains = new ArrayList<>();
		for(Book book : books) {
			if (book.getTitulo().equalsIgnoreCase(titulo)) {
				resultadoEquals.add(book);
			}
			else if (book.getTitulo().contains(titulo)) {
				resultadoEquals.add(book);
			}
		}
		// List<List<Livro>> ??? Deve existir outro tipo q não seja a List par dar conta disto
		List<List<Book>> resultadoBusca = new ArrayList<>();
		resultadoBusca.add(resultadoEquals);
		resultadoBusca.add(resultadoContains);
		return resultadoBusca;
	}
	
	public BookDTO getPorIsbnDTO(int isbn) {
		for(Book book : books) {
			if (book.getIsbn() == isbn) {
				return new BookDTO(book.getTitulo(), book.getAutor(), book.getEditora(), book.getPreco());
			}
		}
		return null;
	}
	
	public List<BookDTO> getAllDTO() {
		List<BookDTO> livrosDTO = new ArrayList<>();
		for(Book book : books) {
			livrosDTO.add(new BookDTO(book.getTitulo(), book.getAutor(), book.getEditora(), book.getPreco()));
		}
		return livrosDTO;
	}
	
	public Book getPorId(int id) {
		for(Book book : books) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}
	
	public Book reajustarPrecoPorId(int id, int taxa) {
		Book book = getPorId(id);
		if (book != null) {
			book.reajustarPreco(taxa);
		}
		return book;
	}
	
	public void reajustarPreco(int taxa) {
		for(Book book : books) {
			book.reajustarPreco(taxa);
		}
	}
		
	public void deletePorId(int id) {
		for(Book book : books) {
			if (book.getId() == id) {
				books.remove(book);
				return;
			}
		}
	}
	
	public void deleteAll() {
		books.clear();
	}
	
}
 
