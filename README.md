TODO List
Desafio Backend Junior

API para gerenciar tarefas (CRUD) que faz parte desse desafio para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

O projeto foi elaborado com a ajuda do video da Giuliana Bezerra, na qual teve uma didática incrível explicando conceitos importantes como SOLID, API Rest, Testes unitários e documentação!

Tecnologias
Spring Boot
Spring MVC
Spring Data JPA
SpringDoc OpenAPI 3
Mysql
Práticas adotadas
SOLID, DRY, YAGNI, KISS
API REST
Consultas com Spring Data JPA
Injeção de Dependências
Tratamento de respostas de erro
Geração automática do Swagger com a OpenAPI 3
Como Executar
Clonar repositório git
Construir o projeto:
$ ./mvnw clean package
Executar a aplicação:
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
A API poderá ser acessada em localhost:8080. O Swagger poderá ser visualizado em localhost:8080/swagger-ui.html

API Endpoints
Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta Insomia:

Criar Tarefa
POST localhost:8080/todos
JSON (Body): 
{ 
    "nome":"Todo 1", 
    "descricao":"Desc Todo 1", 
    "prioridade":1, 
    "realizado":false
}

RESULTADO:
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]

Listar Tarefas
GET localhost:8080/todos

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]

Atualizar Tarefa
PUT localhost:8080/todos/1
JSON (Body): 
{ 
    "nome":"Todo 1", 
    "descricao":"Desc Todo 1", 
    "prioridade":1, 
    "realizado":false
} 

RESULTADO:
[
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]

Remover Tarefa
http DELETE :8080/todos/1

[ ]
