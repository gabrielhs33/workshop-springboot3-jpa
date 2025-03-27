<h1 align="center">🌱 Workshop Spring Boot 3 + JPA</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Spring_Boot-3.1.5-6DB33F?style=flat&logo=springboot&logoColor=white" alt="Spring Boot 3">
  <img src="https://img.shields.io/badge/Java-17-%23ED8B00?logo=openjdk&logoColor=white" alt="Java 17">
  <img src="https://img.shields.io/badge/JPA-Hibernate-59666C?logo=hibernate&logoColor=white" alt="JPA Hibernate">
</p>

<p align="center">Projeto desenvolvido durante curso de Java, implementando CRUD completo com Spring Boot 3, JPA/Hibernate e banco de dados relacional.</p>

<h2>🚀 Tecnologias Principais</h2>

<div align="center">
  <table>
    <tr>
      <td align="center">
        <img src="https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg" width="80" alt="Spring">
        <br>Spring Boot 3
      </td>
      <td align="center">
        <img src="https://hibernate.org/images/hibernate-logo.svg" width="80" alt="Hibernate">
        <br>Hibernate 6
      </td>
      <td align="center">
        <img src="https://www.mysql.com/common/logos/logo-mysql-170x115.png" width="80" alt="MySQL">
        <br>MySQL
      </td>
    </tr>
  </table>
</div>

<h2>📂 Estrutura do Projeto (Maven)</h2>

<pre>
workshop-springboot3-jpa/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── workshop/
│   │   │               ├── config/
│   │   │               ├── controllers/
│   │   │               ├── entities/
│   │   │               ├── repositories/
│   │   │               ├── services/
│   │   │               └── WorkshopApplication.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   │
│   └── test/                 # Testes unitários
│
├── pom.xml                   # Dependências Maven
└── .gitignore
</pre>

<h2>🔧 Configuração</h2>

<ol>
  <li>Configure o banco de dados no <code>application.properties</code>:
    <pre><code>spring.datasource.url=jdbc:mysql://localhost:3306/workshop
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true</code></pre>
  </li>
  <li>Instale as dependências:
    <pre><code>mvn clean install</code></pre>
  </li>
</ol>

<h2>🛠 Endpoints Implementados</h2>

<div>
  <h3>User Resource</h3>
  <ul>
    <li><code>GET /users</code> - Lista todos usuários</li>
    <li><code>GET /users/{id}</code> - Busca usuário por ID</li>
    <li><code>POST /users</code> - Cria novo usuário</li>
    <li><code>DELETE /users/{id}</code> - Remove usuário</li>
    <li><code>PUT /users/{id}</code> - Atualiza usuário</li>
  </ul>
  
  <h3>Order Resource</h3>
  <ul>
    <li><code>GET /orders</code> - Lista todos pedidos</li>
    <li><code>GET /orders/{id}</code> - Busca pedido por ID</li>
    <li><code>POST /orders</code> - Cria novo pedido</li>
  </ul>
</div>


<h2>🧪 Testando a API</h2>

<p>Use o Postman ou crie requisições HTTP:</p>

<pre><code>// Criar usuário
POST /users
{
  "name": "Maria Silva",
  "email": "maria@gmail.com",
  "phone": "11987654321"
}

// Buscar pedidos
GET /orders/1
</code></pre>

<h2>📦 Dependências Maven</h2>


<ul>
  <li><code>spring-boot-starter-web</code></li>
  <li><code>spring-boot-starter-data-jpa</code></li>
  <li><code>mysql-connector-java</code></li>
  <li><code>spring-boot-devtools</code></li>
  <li><code>spring-boot-starter-test</code></li>
</ul>


<p align="center">
  Desenvolvido por <a href="https://github.com/gabrielhs33">Gabriel Henrique</a> durante curso de Java
</p>
