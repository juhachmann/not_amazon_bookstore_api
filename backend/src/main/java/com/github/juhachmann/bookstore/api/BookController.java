package com.github.juhachmann.bookstore.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	private final BookService service = new BookService();

	@RequestMapping(value="adicionar_livro", method=RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Book adicionarLivro(@RequestBody Book book) {
		return service.adicionarLivro(book);
	}
	
	@RequestMapping(value="get_all", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getAll() {
		return service.getAll();
	}
	
	@RequestMapping(value="get_por_isbn", method=RequestMethod.GET,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Book getPorIsbn(@RequestBody int isbn) {
		return service.getPorIsbn(isbn);
	}
	
	@RequestMapping(value="get_por_autor", method=RequestMethod.GET,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getPorAutor(@RequestBody String autor) {
		return service.getPorAutor(autor);
	}
	
	@RequestMapping(value="get_por_titulo", method=RequestMethod.GET,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getPorTitulo(@RequestBody String titulo) {
		return service.getPorTitulo(titulo);
	}
	
	@RequestMapping(value="get_todos_contendo", method=RequestMethod.GET,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<List<Book>> getTodosContendo(@RequestBody String titulo) {
		return service.getTodosContendo(titulo);
	}
	
	@RequestMapping(value="get_por_isbn_dto", method=RequestMethod.GET,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public BookDTO getPorIsbnDTO(@RequestBody int isbn) {
		return service.getPorIsbnDTO(isbn);
	}
	
	@RequestMapping(value="get_all_dto", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BookDTO> getAllDTO() {
		return service.getAllDTO();
	}
	
	@RequestMapping(value="reajustar_preco_por_id", method=RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Book reajustarPrecoPorId(@RequestBody int id, int taxa) {
		return service.reajustarPrecoPorId(id, taxa);
	}
	
	@RequestMapping(value="reajustar_preco", method=RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> reajustarPreco(@RequestBody int taxa) {
		service.reajustarPreco(taxa);
		return service.getAll();
	}
	
	@RequestMapping(value="delete_por_id", method=RequestMethod.DELETE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deletePorId(@RequestBody int id) {
		service.deletePorId(id);
	}
	
	@RequestMapping(value="delete_all", method=RequestMethod.DELETE)
	public void deleteAll() {
		service.deleteAll();
	}

}
