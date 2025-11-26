# Tratamento de Exception

![GitHub Created At](https://img.shields.io/github/created-at/muriloFSaidel/tratamento-de-exception)
![GitHub commit activity](https://img.shields.io/github/commit-activity/t/muriloFSaidel/tratamento-de-exception)
![GitHub last commit](https://img.shields.io/github/last-commit/muriloFSaidel/tratamento-de-exception)
![GitHub top language](https://img.shields.io/github/languages/top/muriloFSaidel/tratamento-de-exception)

# Sobre o projeto

O projeto tratamento nasceu de uma pergunta durante um processo de entrevista e decidi criar um projeto para colocar em prática a idéia de personalizar as respostas das exceções que podem ocorrer, caso haja alguma falha por parte da aplicação durante a sua execução ao invés de textos técnicos e em inglês.
Como simulação, criei este projeto Java com Springboot contendo músicas como objeto relacional para realizar consultas, utilizando JpaRepository como gerenciador de entidades e padrão API Rest como microserviço.

## Screenshots da aplicação

## Postman requests

### Busca com Todas as Canções
![Todas as canções](https://raw.githubusercontent.com/muriloFsaidel/assets/main/tde/allsongs.png)

### Busca uma Canção
![Busca uma Canção](https://raw.githubusercontent.com/muriloFsaidel/assets/main/tde/asong.png)

### Busca uma Canção INVÁLIDA
![Busca uma Canção INVÁLIDA](https://raw.githubusercontent.com/muriloFsaidel/assets/main/tde/aninvalidsong.png)

### Inserindo uma Canção VÁLIDA
![Inserindo uma Canção VÁLIDA](https://raw.githubusercontent.com/muriloFsaidel/assets/main/tde/insertingavalidsong.png)
![Pós Inserindo uma Canção VÁLIDA](https://raw.githubusercontent.com/muriloFsaidel/assets/main/tde/afterinsertingavalidsong.png)

### Inserindo uma Canção INVÁLIDA
![Inserindo uma Canção INVÁLIDA](https://raw.githubusercontent.com/muriloFsaidel/assets/main/tde/insertinganinvalidsong.png)

## Modelo conceitual
![Modelo conceitual](https://raw.githubusercontent.com/muriloFsaidel/assets/main/tde/concept.png)
# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Back end
Pré-requisitos: Java 21

````bash
# clonar repositório
git clone https://github.com/devsuperior/sds1-wmazoni
````

# No Eclipse
 - File->Import->Maven->Existing Maven Projects->Browse...->...tratamento-de-exception->Finish
 - Boot dashboard-> tratamento-de-exception-> botão direito do mouse->(Re)start

# No Postman
- Clique em + para criar uma nova requisição
- GET
	- http://localhost:8080/songs
	- http://localhost:8080/songs/1
	- http://localhost:8080/songs/8
- POST
	- http://localhost:8080/songs
	- Body
	- {"name": "Miss you everyday", "songYear": 2013,"artist": "Lenny Kravitz"}
    - { "name": "Love", "songYear": 2028, "artist": "Lenny Kravitz"}

# Autor

Murilo F Saidel

https://github.com/muriloFsaidel/