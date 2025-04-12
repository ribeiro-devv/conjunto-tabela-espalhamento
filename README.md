# 🧠 Conjuntos (Set) e Tabelas de Espalhamento em Java

Este é um projeto simples com o objetivo de demonstrar o funcionamento interno das estruturas de dados do tipo `Set` em Java, utilizando a lógica de **tabelas de espalhamento (hashing)**.

---

## 📚 Conceitos abordados

- Estrutura de dados `Set` (HashSet)
- Implementação dos métodos `equals()` e `hashCode()`
- Organização e categorização de objetos em tabelas de espalhamento
- Comparação eficiente de objetos
- Importância de seguir o contrato entre `equals()` e `hashCode()`

---

## 🔍 O que esse exemplo mostra?

Neste projeto, temos a classe `Aluno`, que representa um estudante com os atributos `nome` e `matrícula`. A lógica do código mostra que:

- O método `hashCode()` é implementado utilizando a **primeira letra da matrícula** para simular o agrupamento por categoria.
- O método `equals()` compara dois objetos `Aluno` pela matrícula.
- O uso de `Set.contains()` mostra que a busca não percorre toda a lista, e sim apenas os objetos da mesma categoria (ou seja, com o mesmo hash).
- Inserções duplicadas não são permitidas no `Set`.

---

## 🧪 Exemplo de saída:

```bash
rg@2025 = rp@2023
false



## 🧪 Exemplo descomentando outro aluno de mesmo hash

```bash
rg@2025 = rp@2023  
rg@2025 = rs@2024  
false

---

## ⚠️ Observações

> A implementação de `hashCode()` neste exemplo é **didática** e não deve ser usada em projetos reais.  
> Em aplicações reais, é importante usar algoritmos mais robustos para gerar hash codes, evitando colisões desnecessárias.

---

## 🚀 Como rodar

Clone o repositório:

```bash
git clone https://github.com/ribeiro-devv/conjunto-tabela-espalhamento.git

Abra nas sua ide de preferencia e execute o main.
