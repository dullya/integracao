# 🌐 Integração de Backend e Frontend com Java

## 📌 Sobre o Projeto

Este projeto tem como objetivo demonstrar a integração entre um **backend desenvolvido em Java com Spring Boot** e um **frontend construído com HTML, CSS e JavaScript**.

A aplicação simula uma comunicação real entre cliente e servidor utilizando requisições HTTP e consumo de API REST, retornando dados em formato JSON e exibindo dinamicamente na interface.

## 🎯 Objetivo

Desenvolver uma aplicação web que:

- Exponha uma API REST utilizando Spring Boot
- Consuma os dados via JavaScript (Fetch API)
- Atualize dinamicamente a interface do usuário
- Demonstre organização em camadas (Controller, Service, Model)



## 🛠️ Tecnologias Utilizadas

### 🔙 Backend
- Java 17+
- Spring Boot
- Maven
- API REST

### 🎨 Frontend
- HTML5
- CSS3
- JavaScript (Fetch API)


## 🏗️ Arquitetura

O projeto segue o padrão MVC:

- **Controller** → Responsável por expor os endpoints da API
- **Service** → Contém as regras de negócio
- **Model** → Representação dos dados
- **Frontend** → Interface responsável por consumir a API


## 📂 Estrutura do Projeto

backend/
├── controller/
├── service/
├── model/
└── resources/

frontend/
├── index.html
├── style.css
└── app.js


## 🔄 Como Funciona a Integração

1. O usuário interage com a interface web.
2. O JavaScript envia uma requisição HTTP para o backend.
3. O Spring Boot processa a requisição.
4. O backend retorna os dados em formato JSON.
5. O frontend exibe os dados dinamicamente na tela.


## 🚀 Como Executar o Projeto

### 🔹 Executando o Backend

No terminal, dentro da pasta do projeto:

./mvnw spring-boot:run

Ou execute a classe principal pelo IntelliJ.

O servidor estará disponível em:

http://localhost:8080

🔹 Executando o Frontend

Abra o arquivo:

index.html

Diretamente no navegador.

📌 Exemplo de Endpoint

GET /api/mensagem

🔹 Exemplo de Resposta
{
  "mensagem": "Dados do Back-End Spring Boot"
}

📸 Preview

<img width="1255" height="484" alt="image" src="https://github.com/user-attachments/assets/da521369-9373-4b27-89f4-3aebd47909c1" />
