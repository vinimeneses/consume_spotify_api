# Projeto de Integração com a API do Spotify

Este projeto é uma aplicação Spring Boot que integra com a API do Spotify para buscar informações sobre álbuns. A aplicação foi desenvolvida em Java e utiliza o Maven como ferramenta de gerenciamento de projeto.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação usada para desenvolver a aplicação.
- **Spring Boot**: Framework usado para facilitar o desenvolvimento de aplicações Java.
- **Spotify API**: API usada para buscar informações sobre álbuns.

## Funcionalidades

A aplicação possui um endpoint REST que permite buscar informações sobre álbuns do Spotify. O endpoint é `/spotify/api/albums` e retorna uma lista de álbuns.

## Configuração

As credenciais de autenticação para a API do Spotify são configuradas através de variáveis de ambiente. As variáveis `CLIENT_ID` e `CLIENT_SECRET` devem ser definidas com os valores correspondentes.

## Execução

Para executar a aplicação, você pode usar o comando `mvn spring-boot:run` no diretório raiz do projeto.
Se divirta testando isso.
