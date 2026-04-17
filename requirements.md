# 📚 Projeto: Sistema de Biblioteca em Java

## 🎯 Objetivo
Desenvolver um sistema de biblioteca que permita:
- Cadastrar livros e usuários.
- Realizar empréstimos e devoluções.
- Consultar livros disponíveis.
- Armazenar dados em **SQLite**.
- Ter uma interface gráfica simples (JavaFX ou Swing).

---

## 🧩 Módulos do Projeto

### 1. **Módulo de Modelo (Domain)**
- Classes que representam entidades do sistema:
  - `Livro`
  - `Usuario`
  - `Funcionario` (herda de `Usuario`)
  - `Emprestimo`

### 2. **Módulo de Persistência (DAO)**
- Responsável pela comunicação com o banco SQLite.
- Classes:
  - `LivroDAO`
  - `UsuarioDAO`
  - `EmprestimoDAO`

### 3. **Módulo de Negócio (Service)**
- Contém regras de negócio:
  - Um usuário pode pegar no máximo **3 livros**.
  - Prazo de devolução: **15 dias**.
  - Funcionários podem cadastrar livros e usuários.
  - Usuários comuns apenas realizam empréstimos.

### 4. **Módulo de Interface (GUI)**
- Tela inicial com opções:
  - Cadastrar Livro
  - Cadastrar Usuário
  - Realizar Empréstimo
  - Listar Livros Disponíveis
- Implementado com **JavaFX** ou **Swing**.

---

## ⚙️ Regras de Negócio Detalhadas

- **Cadastro de Livros:** Apenas funcionários podem cadastrar.
- **Cadastro de Usuários:** Funcionários podem cadastrar novos usuários.
- **Empréstimos:**
  - Usuário só pode pegar até 3 livros simultaneamente.
  - O sistema registra a data do empréstimo e calcula a data limite de devolução.
- **Devoluções:** Atualiza o status do livro para "disponível".
- **Consulta:** Listar todos os livros disponíveis e emprestados.

---

## 🧪 Exemplos de Entrada e Saída

### Exemplo 1: Cadastro de Livro
**Entrada:**
```
Título: "Clean Code"
Autor: "Robert C. Martin"
ISBN: "9780132350884"
```

**Saída esperada:**
```
Livro "Clean Code" cadastrado com sucesso!
```

---

### Exemplo 2: Empréstimo
**Entrada:**
```
Usuário: João Silva
Livro: "Clean Code"
```

**Saída esperada:**
```
Empréstimo realizado!
Usuário: João Silva
Livro: Clean Code
Data de devolução: 01/05/2026
```

---

### Exemplo 3: Listar Livros
**Saída esperada:**
```
Livros disponíveis:
1. Clean Code - Robert C. Martin
2. Effective Java - Joshua Bloch
```

---

## 🏛️ Conceitos de OOP Aplicados

- **Abstração:**  
  Classes representam conceitos reais (Livro, Usuário, Empréstimo).
  
- **Encapsulamento:**  
  Atributos privados com métodos `get` e `set` controlam acesso.

- **Herança:**  
  `Funcionario` herda de `Usuario`, mas possui permissões extras.

- **Polimorfismo:**  
  Métodos como `exibirInfo()` se comportam diferente em `Usuario` e `Funcionario`.

---

## 🔗 Links para Estudo

- [Documentação oficial do Java](https://docs.oracle.com/javase/tutorial/)
- [Introdução ao JavaFX](https://openjfx.io/)
- [SQLite Tutorial](https://www.sqlitetutorial.net/)
- [Fundamentos de OOP em Java - GeeksforGeeks](https://www.geeksforgeeks.org/fundamentals-of-object-oriented-programming-in-java/)
- [DAO Pattern em Java - Baeldung](https://www.baeldung.com/java-dao-pattern)

---

## 🚀 Próximos Passos

1. Criar o banco SQLite com tabelas `livros`, `usuarios`, `emprestimos`.
2. Implementar as classes modelo (`Livro`, `Usuario`, etc.).
3. Criar os DAOs para persistência.
4. Implementar regras de negócio no módulo `Service`.
5. Construir a interface gráfica com JavaFX ou Swing.
6. Testar com os exemplos de entrada/saída.

---

👉 Minha sugestão: começa com **JavaFX** para a GUI, pois é mais moderno e flexível que Swing. Assim, já praticas OOP, persistência e interface gráfica de forma integrada.  

Queres que eu te ajude a montar também um **diagrama UML simplificado** para visualizar as relações entre as classes?