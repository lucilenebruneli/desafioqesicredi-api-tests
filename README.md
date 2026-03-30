# Desafio QE Sicredi

Este projeto foi desenvolvido como parte de um **desafio técnico** para a posição de QE, com foco na **automação de testes de API**.

O objetivo é validar endpoints de uma API REST, cobrindo **cenários positivos, negativos e autenticação**.

---

## Tecnologias utilizadas

- **Java 21**  
- **Maven**  
- **JUnit 5**  
- **RestAssured**  
- **Allure Framework** (relatórios de teste)  

---

## Estrutura do Projeto

'''text
src
└── test
└── java
├── base
│ └── BaseTest.java
├── services
│ ├── ProductService.java
│ ├── AuthService.java
│ └── TokenManager.java
└── tests
├── ProductTest.java
└── AuthTest.java


### Descrição das camadas

- **base**: configuração inicial da API  
- **services**: comunicação com os endpoints  
- **tests**: cenários de teste  

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
- Reutilização com `TokenManager`  

> ⚠️ Observação: A API utilizada não possui endpoints protegidos para produtos.  
> O uso de token foi implementado para demonstrar conhecimento em autenticação.

---

## Boas práticas aplicadas

- Separação de responsabilidades  
- Reutilização de código  
- Uso de `@BeforeEach` para setup  
- Código limpo e organizado  
- Uso de Bearer Token  

---

## Pré-requisitos

- **Java 21**  
- **Maven**  
- **IntelliJ IDEA**  
- **Git**  
- **Allure Commandline** (para geração de relatórios)  

---

## Como executar

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/lucilenebruneli/desafioqesicredi-api-tests.git

2️⃣ Rodar os testes com Maven
mvn clean test

3️⃣ Gerar e visualizar relatório Allure
Instalação do Allure
Baixe o Allure Commandline para Windows no site oficial:
Allure Framework
Extraia em uma pasta, por exemplo: C:\allure
Configure as variáveis de ambiente:
ALLURE_HOME = C:\allure
Adicione C:\allure\bin ao Path
Teste no terminal:
allure --version

Deve retornar a versão instalada.

Gerar o relatório

Após rodar os testes com Maven:

allure serve target/allure-results
Isso abrirá o relatório no navegador
Mostra detalhes dos testes, requests, responses e status de cada cenário
Dicas para Allure
Para capturar requests/responses no relatório:
given().filter(new AllureRestAssured())
Para adicionar steps, descrição e gravidade:
@Step("Descrição do passo")
@Description("Descrição detalhada do teste")
@Severity(SeverityLevel.CRITICAL)

Esses elementos vão aparecer diretamente no relatório, facilitando análise.


