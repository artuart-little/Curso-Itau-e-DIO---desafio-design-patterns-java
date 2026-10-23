# 🚀 Desafio DIO & Itaú: Padrão de Projeto Observer em Java

Este repositório contém a minha solução para o desafio prático final do bootcamp de **Java e IA promovido pela DIO em parceria com o Itaú**. O objetivo deste projeto é aplicar Padrões de Projeto (Design Patterns) na prática, criando uma solução simples, funcional e que reflita cenários do mundo real.

## 📌 Sobre o Projeto

Para este desafio, decidi implementar o padrão **Observer (Comportamental)** adaptado para uma realidade do meu dia a dia acadêmico e de liderança de comunidades de tecnologia na universidade: um **Notificador de Workshops Tech**.

O padrão Observer define uma relação de "um-para-muitos". Quando o estado de um objeto principal (Subject) muda, todos os seus dependentes (Observers) são notificados automaticamente.

Neste cenário:
- **O Subject (ComunidadeTech):** É o hub de tecnologia que agenda novos workshops.
- **Os Observers (Inscritos):** São os alunos inscritos para receber notificações de novos eventos.

Assim que um novo workshop é agendado, o sistema percorre a lista de alunos inscritos e dispara o aviso automaticamente, eliminando a necessidade de verificar manualmente quem deve ser notificado.

## 🛠️ Tecnologias Utilizadas
- **Java Puro (Standard Edition):** Foco exclusivo na lógica de Orientação a Objetos e Design Patterns, sem a sobrecarga de frameworks externos.

## 📂 Estrutura do Código

A lógica foi construída baseada em interfaces para garantir o baixo acoplamento:
1. `Inscrito` (Interface Observer): Define o contrato `atualizar()`.
2. `ComunidadeTech` (Interface Subject): Define o contrato de gerenciamento (`adicionar`, `remover` e `notificar`).
3. `Aluno` (Concrete Observer): Implementa o inscrito real que recebe a mensagem.
4. `ComunidadeEmbaixadores` (Concrete Subject): Gerencia a lista de alunos e dispara as notificações quando o método `agendarWorkshop()` é chamado.

## 💻 Como Executar
1. Clone este repositório.
2. Compile o arquivo principal: `javac Main.java`
3. Execute a aplicação: `java Main`

---
*Projeto desenvolvido como parte da trilha de Java e Inteligência Artificial da Digital Innovation One (DIO) + Itaú.*