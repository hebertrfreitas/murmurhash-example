### Murmurhash Example

Este projeto demonstra como aplicar o algoritmo Murmurhash 
para filtrar progressivamente usuários para uma funcionalidade.

Um post detalhado sobre o cenário proposto 
pode ser visto neste link = https://dev.to/hebertrfreitas/murmurhash-criando-um-rollout-progressivo-via-backend-cba 

## Requisitos

- Java 17
- gradle (opcional)

### Como executar

```shell
./gradlew run
```

Ao executar o projeto o mesmo irá ler um arquivo csv na raiz chamado `users_id_list.csv` que simula uma base de 10000 usuários.

O output do projeto é uma simulação caso você deseje disponibilizar uma funcionalidade para 10% dos seus usuários, 
onde usamos o algoritmo Murmurhash para calcular um percentual sobre cada usuário e identificar se o mesmo vai ou não 
visualizar a funcionalidade.



