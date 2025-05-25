# 🚦 Desafio de Controle de Fluxo em Java

Este projeto é um exercício prático para aplicar conceitos de **controle de fluxo**, **tratamento de exceções** e **entrada de dados em Java**.  
O programa solicita dois números inteiros ao usuário e, em seguida, imprime uma sequência de números com base na diferença entre eles.

---

## 📝 Descrição do Desafio

O sistema deve seguir as seguintes regras:

- Receber **dois números inteiros como parâmetros via terminal**.
- Calcular a quantidade de interações (`for`) subtraindo o primeiro número do segundo.
- Imprimir no console os números incrementados, de 1 até a quantidade calculada.

**Exemplo:**  
Se os parâmetros forem `12` e `30`, o sistema deve realizar `18` iterações, imprimindo:

Imprimindo o número 1<br>
Imprimindo o número 2<br>
...<br>
Imprimindo o número 18
- Se o **primeiro parâmetro for maior que o segundo**, o sistema deve lançar uma exceção customizada chamada `ParametrosInvalidosException` com a mensagem:  
  **"O segundo parâmetro deve ser maior que o primeiro"**

---

## ✨ Funcionalidades

- **Entrada de Dados:** Recebe dados do usuário diretamente pelo terminal.
- **Validação de Parâmetros:** Verifica se os números fornecidos atendem à lógica de negócio.
- **Exceção Customizada:** Utiliza uma classe de exceção própria (`ParametrosInvalidosException`) para um tratamento de erros mais específico.
- **Controle de Fluxo:** Usa um laço `for` para realizar as iterações e um `if` para a validação.
- **Tratamento de Erros:** Utiliza um bloco `try-catch` para capturar a exceção e informar o usuário de maneira amigável.

---

## 🛠️ Tecnologias Utilizadas

- Java (JDK 23 )
- `Scanner` API para entrada de dados via terminal

---

- **Contador.java:** Classe principal que contém o método `main` e toda a lógica de contagem e validação.
- **ParametrosInvalidosException.java:** Classe que define a exceção customizada do projeto.

---

## 🚀 Como Executar o Projeto

Para compilar e executar este projeto, você precisará ter o **Java Development Kit (JDK)** instalado em sua máquina.

1. Clone o repositório ou baixe os arquivos para um diretório de sua preferência.
2. Abra o terminal e navegue até a pasta `src` do projeto.
3. Compile os arquivos `.java` com o seguinte comando:

```bash
javac Contador.java ParametrosInvalidosException.java

$ java Contador
Digite o primeiro parâmetro
10
Digite o segundo parâmetro
15
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5

