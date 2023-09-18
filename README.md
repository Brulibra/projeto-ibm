# Projeto IBM

## Projeto desenvolvido como parte da entrega final do Bootcamp IBM, realizado entre 11 e 16 de Setembro de 2023.

---

### Objetivo

💡Aplicar os conhecimentos adquiridos em Springboot e Java durante o Boot Camp e exponham essa mesma regra de negócio em API Rest.

```jsx
Endpoints:

POST /jogador
Body: {nome: “Nome Sobrenome”}
Retorno esperado: 2xx OK com body vazio

GET /times
Retorno esperado: 2xx OK com body:
{
“time1”: [“Nome Sobrenome”, “Nome Sobrenome”, “Nome Sobrenome”],
“time2”: [“Nome Sobrenome”, “Nome Sobrenome”]
}

DELETE /jogador/all
Retorno esperado: 2xx OK com body vazio
```

---

**Requisitos:**

- [x]  Esvaziar a base de dados ao chamar `DELETE`
- [x]  `POST` incluí jogadores de um em um
- [x]  A Aplicação deve subir sem nenhuma dependência externa
- [ ]  `GET` traz os times até o momento com jogadores já recebidos

**Desejáveis:**

- [ ]  Hospedar projeto em serviço de cloud
- [ ]  Fazer frontend com React ou Angular

---

## Próximos Passos

- Corrigir endpoint `GET`
    - **Sempre que um jogador é inserido no *database* um novo time é gerado**
    - `Solução:` Varrer o banco de dos existente antes de salvar Jogador
    - `Problema Encontrado:` Tipo de dados
    - `Possíveis soluções:` Querry, ManyToMany, buscar por nome do time
- Adicionar validações no backend
    - Usuário digitou apenas nome
    - Usuário digitou números
    - Jogador tem mais de um sobrenome
    - Mais de dois jogadores com sobrenome iguais
- Finalizar testes backend
- Hospedar em serviço de cloud
- Fazer frontend

---

Projeto desenvolvido por [Bruna de Paula](https://www.linkedin.com/in/brunadpaula/)