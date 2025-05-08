# Desafio Backend - API Star Wars

Este projeto implementa uma API de personagens de Star Wars com funcionalidades de busca e gerenciamento de favoritos.

O seu desafio é avaliar a **qualidade** do projeto, propor **melhorias técnicas** e **implementá-las**.

Algumas perguntas que podem orientar sua avaliação:

- A aplicação entrega uma boa **experiência** e **confiabilidade** aos seus usuários?
- O código segue **boas práticas** de desenvolvimento? O que poderia ser melhorado?
- Que testes ou mecanismos você adicionaria para garantir a **robustez** da aplicação?

### Dicas

- Utilize os arquivos `collections.json` (para Insomnia ou Postman) ou `client.rest` ([REST Client](https://github.com/Huachao/vscode-restclient) no VSCode) para facilitar a exploração da API.
- A aplicação contém pontos de melhoria **intencionais**. Identificá-los, sugeri-los e implementá-los faz parte do desafio.

## Funcionalidades

- Listar todos os personagens de Star Wars  
- Buscar personagens por nome  

- Gerenciar personagens favoritos:
  - Adicionar personagem aos favoritos
  - Remover personagem dos favoritos
  - Listar todos os personagens favoritos

## Tecnologias

- Java 17  
- Spring Boot 3.4.4  
- JUnit 5  
- Maven

## Como Começar

### Pré-requisitos

- JDK 17 ou superior  
- Maven 3.9+


### Execução

Construa:
```bash
mvn clean install
```

Execute:
```bash
mvn spring-boot:run
```

Teste:
```bash
mvn test
```

