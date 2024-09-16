<h1>TODO List - Desafio Backend Junior</h1>

API para gerenciar tarefas (CRUD) que faz parte desse desafio para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

O projeto foi elaborado com a ajuda do video da <b>Giuliana Bezerra</b>, na qual teve uma didática incrível explicando conceitos importantes como SOLID, API Rest, Testes unitários e documentação!

<h2>Tecnologias</h2>

<li>Spring Boot</li>
<li>Spring MVC</li>
<li>Spring Data JPA</li>
<li>SpringDoc OpenAPI 3</li>
<li>Mysql</li>

<h2>Práticas adotadas</h2>
<li>SOLID, DRY, YAGNI, KISS</li>
<li>API REST</li>
<li>Consultas com Spring Data JPA</li>
<li>Injeção de Dependências</li>
<li>Tratamento de respostas de erro</li>
<li>Geração automática do Swagger com a OpenAPI 3</li>

<h2>Como Executar</h2>
<h4>Clonar repositório git</h4>
<h4>Construir o projeto:</h4>
<code>$ ./mvnw clean package</code>

<h4>Executar a aplicação:</h4>
<code>$ java -jar target/todolist-0.0.1-SNAPSHOT.jar</code><br><br>

A API poderá ser acessada em localhost:8080.<br><br> 
O Swagger poderá ser visualizado em localhost:8080/swagger-ui.html

<h2>API Endpoints</h2>
Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta Insomia:<br>

<h3>Criar Tarefa</h3>
POST localhost:8080/todos<br><br>
JSON (Body): <br><br>

```javascript
{
 "nome":"Todo 1", 
 "descricao":"Desc Todo 1", 
 "prioridade":1,
 "realizado":false
}
```

RESULTADO:
```javascript
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

<h3>Listar Tarefas</h3>
GET localhost:8080/todos<br><br>

```javascript
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

<h3>Atualizar Tarefa</h3>
PUT localhost:8080/todos/1<br><br>
JSON (Body): <br><br>

```javascript
{ 
    "nome":"Todo 1", 
    "descricao":"Desc Todo 1", 
    "prioridade":1, 
    "realizado":false
} 
```
RESULTADO:
```javascript
[
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]

```
<h3>Remover Tarefa</h3>
http DELETE :8080/todos/1<br><br>

```javascript
[ ]
```