# Worker Spring

Projeto desenvolvido em Java com Spring Boot com foco no estudo de
composição de objetos, relacionamentos entre entidades e persistência
de dados com JPA/Hibernate.

## 🎯 Objetivo

O projeto foi desenvolvido durante os estudos de Java e Spring Boot,
com foco principalmente no conceito de composição de objetos e na
modelagem de entidades relacionadas.

## 🛠️ Tecnologias

- Java 25
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- H2 Database

## 📚 Conceitos praticados

- Programação Orientada a Objetos
- Composição de objetos
- Relacionamento entre entidades
- `@OneToMany`
- `@ManyToOne`
- JPA/Hibernate
- DTOs
- Repositories
- REST Controllers
- `CommandLineRunner`
- Persistência de dados

## 🏗️ Estrutura

O projeto possui entidades como:

- `Worker`
- `Department`
- `HourContract`

Um `Worker` pertence a um `Department` e possui uma coleção de
`HourContract`.

## 🔗 Endpoint

Consulta a renda de um trabalhador em determinado ano e mês:

```http
GET /workers/{id}/income/{year}/{month}