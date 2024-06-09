<?php

namespace Models;

/**
 * Classe Livro
 * 
 */

class Livro 
{
    public $id;
    public $isbn;
    public $titulo;
    public $autor;
    public $editora;
    public $imageUrl;
    public $preco;

    
    public function __construct($id, $isbn, $titulo, $autor, $editora, $preco, $imageUrl) {
        $this->id = $id;
        $this->isbn = $isbn;
        $this->titulo = $titulo;
        $this->autor = $autor;
        $this->editora = $editora;
        $this->preco = $preco;
        $this->imageUrl = $imageUrl;
    }

}
