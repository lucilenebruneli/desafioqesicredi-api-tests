# Desafio QE Sicredi

Este projeto foi desenvolvido como parte de um desafio técnico para a posição de QE, com foco na automação de testes de API.

O objetivo é validar endpoints de uma API REST, cobrindo cenários positivos, negativos e autenticação.

---

## Tecnologias utilizadas

- Java 21
- Maven
- JUnit 5
- RestAssured

---

## Estrutura do projeto

src
 └── test
 └── java
 ├── base
 │     └── BaseTest.java
 ├── services
 │     ├── ProductService.java
 │     ├── AuthService.java
 │     └── TokenManager.java
 └── tests
 ├── ProductTest.java
 └── AuthTest.java

### Descrição das camadas

- *base*: configuração inicial da API
- *services*: comunicação com os endpoints
- *tests*: cenários de teste

---

## Cenários de teste

### Cenários positivos
- Listar produtos
- Buscar produto por ID
- Criar produto

### Cenários negativos
- Produto inexistente (404)
- Acesso sem autenticação (401)

### Autenticação
- Login via API
- Captura de token
- Reutilização com TokenManager

---

## Boas práticas aplicadas

- Separação de responsabilidades
- Reutilização de código
- Uso de @BeforeEach
- Código limpo e organizado
- Uso de Bearer Token

---

## Observação

A API utilizada não possui endpoints protegidos para produtos.  
O uso de token foi implementado para demonstrar conhecimento em autenticação.


## Pré-requisitos

- Java 21
- Maven
- IntelliJ IDEA
- Git

---

## Como executar

### 1. Clonar o repositório

```bash
git clone https://github.com/seu-usuario/desafio-qa-api-tests.git
