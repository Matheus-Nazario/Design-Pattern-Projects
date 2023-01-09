# Design Pattern Projects

É um projeto com algumas soluções típicas para problemas comuns no desenvolvimento de software, projetos pré-fabricados que você pode personalizar para resolver um problema de design recorrente em seu código, trabalhando as 3 estruturas principais do "Gang of Four”.

<h3>🔺Criacional;</h3>

<h3>🔺Estrutural;</h3>

<h3>🔺Comportamental.</h3>
--------------------------------------------------------------------------------------------------------------------------------------------------
<h2> Criacional: </h2> 

* Factory Method: 
```
Resolve o problema de criar objetos de produtos sem especificar suas classes concretas.

O Factory Method define um método, que deve ser usado para criar objetos em vez da chamada direta ao construtor (operador new). As subclasses podem substituir esse método para alterar a classe de objetos que serão criados.

```

* Abstract Factory:
```
Abstract Factory é um padrão de projeto criacional que permite produzir famílias de objetos relacionados sem especificar suas classes concretas.
```

* Builder
```
Builder é um padrão de design criacional que permite construir objetos complexos passo a passo. O padrão permite produzir diferentes tipos e representações de um objeto usando o mesmo código de construção.
```

* Singleton
```
Singleton é um padrão de design criacional que permite garantir que uma classe tenha apenas uma instância, enquanto fornece um ponto de acesso global a essa instância.
```
<h2> Estrutural:</h2> 

* Adapter
```
Adapter é um padrão de design estrutural que permite que objetos com interfaces incompatíveis colaborem.
```
* Facade
```
Facade é um padrão de projeto estrutural que fornece uma interface simplificada para uma biblioteca, uma estrutura ou qualquer outro conjunto complexo de classes.
```
* Bridge
```
Bridge é um padrão de projeto estrutural que permite dividir uma grande classe ou um conjunto de classes estreitamente relacionadas em duas hierarquias separadas — abstração e implementação — que podem ser desenvolvidas independentemente uma da outra.
```
<h2> Comportamental: </h2> 

* Chain of Responsibility:
```
Chain of Responsibility é um padrão de design comportamental que permite passar solicitações por uma cadeia de manipuladores. Ao receber uma solicitação, cada manipulador decide processar a solicitação ou passá-la para o próximo manipulador na cadeia.
```

## Pré-requisitos

*   Java 11
*   Maven 3.8.1 ou superior


### Clonando o serviço

```sh
 git clone https://github.com/Matheus-Nazario/Working-Design-Pattern.git
```

### Executando o serviço

Na pasta raiz do projeto executar o comando:
```sh
    java -jar ./target/*.jar
```
