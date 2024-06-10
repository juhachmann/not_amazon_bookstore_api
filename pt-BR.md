
<h1 align="center">
  <br>
  <img src="https://github.com/juhachmann/simple_bookstore_api/blob/main/logo2.png" alt="Logo"> 
  <br>
  (Not Amazon) Bookstore API
  <br>
</h1>

<h4 align="center">Uma simples api de livraria construída com Spring Boot</h4>

<p align="center">
  <a href="#features">Features</a> •
  <a href="#instalação">Instalação</a> •
  <a href="#endpoints">Endpoints</a> •
  <a href="#créditos">Créditos</a> •
  <a href="README.md">English</a> •
</p>

> Este projeto é ideal se você precisa de uma api pronta para uso para começar os seus projetos de frontend. Também pode ser útil se você quer um ponto de partida para a´aprender e brincar com o Spring Boot para construir apis REST

## Features

* Endpoints para CRUD e filtro de busca
  - Cria, leia, edite e delete livros
* Endpoints para ajuste de preço
  - Ajuste o preço dos livros
* DataSource de teste
  - Você pode adicionar qualquer outro datasource ou continuar com o padrão (sem persistência de dados)
* UI Pronta-Para-Uso
  - UI básica feita com PHP puro, ideal para iniciantes aprendendo a lidar com requisições a APIs
* Idioma UI: Português (PT-BR)

<div align="center">
  <img src="https://github.com/juhachmann/simple_bookstore_api/blob/main/demo01.png" width="70%" height="70%" alt="Home">
</div>


## Instalação

Antes de começar, você precisa instalar os seguintes projetos na sua máquina:
- [Java SDK 8+](https://openjdk.org/projects/jdk/17/)
- [Maven](https://maven.apache.org/)
- [PHP 8+](https://www.php.net/)
- [php-curl](https://www.php.net/)
- [lib-curl](https://curl.se/)

Após isto, do seu terminal de comando:

```bash
# Clone este repositório
$ git clone https://github.com/juhachmann/not_amazon_bookstore_api

# Entre no repositório local
$ cd not_amazon_bookstore_api

# Execute o script bash
$ ./bookstore.sh
```

Abra seu navegador e veja o projeto em **_localhost:8000_**


Alternativamente, você pode servir o backend e o frontend separados:

```bash
# Entre no diretório do backend
$ cd not_amazon_bookstore_api/backend

# Instale e sirva o backend
$ mvn spring-boot:run

# Abra outro terminal de comando

# Entre no diretório do frontend
$ cd not_amazon_bookstore_api/frontend

# Sirva o frontend
$ php -S localhost:8000
```

Ou abra os projetos e execute a partir de suas IDEs favoritas

## Endpoints

| Método | Endpoint | Descrição | Request Body | 
|------|-------|-----------|-----|
| POST | /books | criar novo livro | [Book](#Book) (sem "id")| 
| GET | /books | ver todos os livros |  |
| GET | /books?contains= | filtrar por contem |  | 
| GET | /books?author= | filtrar por autor | | 
| GET | /books?title= | filtrar por titulo | |
| GET | /books?isbn= | filtrar por ISBN  | 
| GET | /books/{id} | filtrar por id | | 
| PUT | /books/{id} | atualizar livro | [Book](#Book) (sem "id") | 
| DELETE | /books/{id} | deletar livro | | 
| DELETE | /books | deletar TODOS os livros | | 
| PUT | /reprices/{rate} | reajustar todos os preços  | | 
| PUT | /reprices/{rate}/books/{id} | reajustar preço  | |

### Book

```json
{
  "id" : 1,
  "isbn": "isbn",
  "author": "Author Name",
  "title": "Book Title",
  "publisher": "Publisher Name",
  "price": 100.99,
  "imageUrl": "image/url.png"
}
```

### curl para endpoints

```bash
# Ajuste a URL base e a porta se necessário

curl -XGET 'localhost:8081/books'

curl -XGET 'localhost:8081/books?contains='

curl -XGET 'localhost:8081/books?author='

curl -XGET 'localhost:8081/books?title='

curl -XGET 'localhost:8081/books?isbn='

curl -XGET 'localhost:8081/books/{id}'

curl -XDELETE 'localhost:8081/books'

curl -XDELETE 'localhost:8081/books/{id}'

curl -XPUT 'localhost:8081/reprices/{rate}'

curl -XPUT 'localhost:8081/reprices/{rate}/books/{id}'

curl -XPUT -H "Content-type: application/json" -d '{
	"isbn" : "isbn",
	"author" : "Author Name",
	"title" : "Book Title",
	"publisher" : "Publisher Name",
	"price" : 100.99,
	"imageUrl" : "image/url.png"
}' 'localhost:8081/books/id'

curl -XPOST -H "Content-type: application/json" -d '{
	"isbn" : "isbn",
	"author" : "Author Name",
	"title" : "Book Title",
	"publisher" : "Publisher Name",
	"price" : 100.99,
	"imageUrl" : "image/url.png"
}' 'localhost:8081/books'
```

## Créditos

Este software usa os seguintes projetos e ferramentas:

- [SpringBoot](https://spring.io/projects/spring-boot)
- [CurlBuilder](https://curlbuilder.com)
- [CodeBeautify](https://codebeautify.org/curl-to-php-online)
- [Bootstrap](https://getbootstrap.com/)

> Desenvolvido como exercício de aprendizagem na disciplina: Serviços Web / Curso Técnico em Desenvolvimento de Sistemas / Instituto Federal de Santa Catarina / 2023.1
