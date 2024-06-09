package com.github.juhachmann.bookstore.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookStoreApi {

	public static void main(String[] args) {
		BookDataStore.criarLista();
		SpringApplication.run(BookStoreApi.class, args);
	}

}
