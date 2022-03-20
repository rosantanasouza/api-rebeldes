# API Star Wars Rebeldes

API construída para entrega do projeto final do módulo de Desenvolvimento Web com Java do projeto 
[Santander Coders web](https://app.becas-santander.com/pt/program/bolsas-santander-tecnologia-santander-coders-web-full-stack-2021)
em parceria com a [Let's Code](https://letscode.com.br/).

## Tecnologias utlizadas

- Java (JDK 17)
- Maven (Gerenciador de dependências)
- Spring (Framework)
- Lombok (Dependendencia ultilizada para redução e facilitação de código. )
- Insomnia (Software utilizado para executar requisições na API)
- IDE utilizada: Itellij IDEA da JetBrains


## Rodando localmente

Iniciando a API

```bash
Dentro da pasta raiz do projeto execute o prompt de comando
  
  mvn spring-boot:run
```


## Endpoints

- Listar Rebeldes:[METHOD: GET] localhost:8080/rebelde/listar-rebeldes
<br/>
<br/>
<br/>
- Adicionar Rebelde:[METHOD: POST] localhost:8080/rebelde/add-rebelde

```bash
Exemplo de envio via POST para adicionar rebelde
  
 {
    "id": 1,
    "name": "Rodrigo",
    "age": 28,
    "genre": "Masculino",
    "currentLocationDTO": {
        "latitude": 14500,
        "longitude": 4000,
        "nameGalaxy": "Pegasus"
    },
    "inventory": [
        "Pistola",
        "Munição de pistola"
    ]
}
```
<br/>
- Alterar Rebelde existente na lista: [METHOD: PUT] localhost:8080/rebelde/update-rebelde/1

O número {1} na rota da requisição acima é o id do rebelde existente na lista.

```bash
Exemplo de envio via PUT para alterar rebelde existente. 
Ao final da rota, adicionar o id do rebelde existente na lista.

(Exemplo do rebelde existente com algumas modificações.)

{
    "id": 1,
    "name": "Rodrigo",
    "age": 30,
    "genre": "Masculino",
    "currentLocationDTO": {
        "latitude": 16500,
        "longitude": 5000,
        "nameGalaxy": "Fenix"
    },
    "inventory": [
        "Adaga",
        "Escudo"
    ]
}
```
<br/>
- Deletar rebelde da lista: [METHOD: DELETE] localhost:8080/rebelde/delete-rebelde/1

O número {1} na rota da requisição acima é o id do rebelde que será deletado da lista.

















