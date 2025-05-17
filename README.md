# ATIVIDADE1-Servidor-APIREST-FrontEnd  
## Projeto Manhwa Collection (REST + GraphQL)

Escolha entre a versão REST ou GraphQL para desenvolvimento. Ambas as versões utilizam o H2 Database por padrão.

## 🌟 Pré-requisitos Comuns
Antes de começar, certifique-se de ter os seguintes pré-requisitos instalados:

- Java 17+
- Maven 3.8+

## 🔄 Como Executar (Ambas Versões)

### 1. Clone o repositório
Primeiro, faça o clone do repositório para sua máquina local:
```bash
git clone <URL do repositório>
cd nome-do-repositorio
```
### 2. Executando a versão REST ou GraphQL
Escolha a versão que você deseja executar.

### 2.1 Versão REST
Para rodar o backend da versão REST, execute os seguintes comandos:
```
cd rest
./mvnw spring-boot:run
```
Após o servidor iniciar, abra o front-end (diretório rest-frontend) e clique no arquivo index.html para abrir no navegador. 

### 2.2 Versão GraphQL
Para rodar o backend da versão GraphQL, execute os seguintes comandos:
```
cd graphql
./mvnw spring-boot:run
```
Após o servidor iniciar, abra o front-end (diretório graphql-frontend) e clique no arquivo index.html para abrir no navegador. 
