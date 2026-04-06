Projeto de CRUD utilizando Spring Boot e RESTful APIs.

Exemplos de testes Endpoint:

POST em JSON:
localhost:8080/produtos
{
    "nome": "produto1",
    "descricao": "usb 2.0",
    "preco": 19.99,
    "status": "DISPONIVEL"
}

PUT em JSON:
localhost:8080/produtos
{
    "nome": "produto1",
    "descricao": "usb 2.0",
    "preco": 19.99,
    "status": "ESGOTADO"
}

GET para listar todos os produtos:
localhost:8080/produtos

GET para listar um produto por id:
localhost:8080/produtos/{id}

DELETE
localhost:8080/produtos/{id}
