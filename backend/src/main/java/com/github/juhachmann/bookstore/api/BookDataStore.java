package com.github.juhachmann.bookstore.api;

import java.util.ArrayList;
import java.util.List;

class BookDataStore {

    public static final List<Book> BOOKS = new ArrayList<>();

    public static void criarLista() {
        BOOKS.add(new Book(1, 858044, "Clube da Luta", "Chuck Palahniuk", "Leya", 49.90, "https://m.media-amazon.com/images/I/51pWrJSOTcL._AC_UL320_.jpg"));
        BOOKS.add(new Book(2, 853363, "Senhor dos Aneis", "J. R. R. Tolkien", "Martins Fontes", 69.99, "https://m.media-amazon.com/images/I/71ZLavBjpRL._AC_UL320_.jpg"));
        BOOKS.add(new Book(3, 853595, "1984", "George Orwell", "Cia das Letras", 18.95, "https://m.media-amazon.com/images/I/819js3EQwbL._AC_UL320_.jpg"));
        BOOKS.add(new Book(4, 655830, "Lutando na Espanha", "George Orwell", "Biblioteca Azul", 26.90, "https://m.media-amazon.com/images/I/71a6ew-OTiL._AC_UL320_.jpg"));
        BOOKS.add(new Book(5, 852505, "Admirável Mundo Novo", "Aldous Huxley", "Cia das Letras", 35.95, "https://m.media-amazon.com/images/I/61hOp6UFvCL._AC_UL320_.jpg"));
        BOOKS.add(new Book(6, 107963, "O Capital - Volume I", "Karl Marx", "Boitempo", 125, "https://m.media-amazon.com/images/I/61Osbz-dpEL._AC_UL320_.jpg"));
        BOOKS.add(new Book(7, 857326, "Noites Brancas", "Fiódor Dostoievski", "Editora 34", 37.99, "https://m.media-amazon.com/images/I/71F-Uf20+UL._AC_UL320_.jpg"));
        BOOKS.add(new Book(8, 857175, "Quincas Borba", "Machado de Assis", "Garnier", 29.90, "https://m.media-amazon.com/images/I/61Kt3d+mhuL._AC_UL320_.jpg"));
        BOOKS.add(new Book(9, 859571, "Discurso sobre o Colonialismo", "Aimé Césaire", "Veneta", 35.96, "https://m.media-amazon.com/images/I/8183hm3-KgL._AC_UL320_.jpg"));
        BOOKS.add(new Book(10, 857164, "Sobre História", "Eric J. Hobsbawm", "Cia das Letras", 36.90, "https://m.media-amazon.com/images/I/917Aa1S7OZL._AC_UL320_.jpg"));
        BOOKS.add(new Book(11, 855652, "Senhor das Moscas", "William Golding", "Alfaguara", 36.90, "https://m.media-amazon.com/images/I/A1bFiBBPWFS._AC_UL320_.jpg"));
    }

}
