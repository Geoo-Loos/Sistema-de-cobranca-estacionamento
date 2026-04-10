# 🚗 Sistema de Cobrança de Estacionamento

Este projeto é uma aplicação Java desenvolvida para gerenciar o fluxo de veículos e automatizar o cálculo de cobranças em um estacionamento. O sistema foca no controle de entrada/saída e na aplicação de tarifas baseadas no tempo de permanência.

## 📋 Funcionalidades Principais

O sistema simula a operação real de um pátio de estacionamento, incluindo:

* **Registro de Fluxo:** Entrada e saída de veículos com captura de data e hora exatas.
* **Cálculo de Permanência:** Lógica para calcular a diferença entre o horário de entrada e saída (usando a API `java.time`).
* **Tabela de Preços:** Implementação de regras de tarifação (ex: valor da primeira hora, frações adicionais ou diárias).
* **Gerenciamento de Vagas:** Controle simplificado de ocupação do pátio.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Manipulação de Tempo:** `LocalDateTime`, `Duration` e `Instant` (API Java 8+).
* **Paradigma:** Orientação a Objetos (POO).

## 🏗️ Estrutura do Projeto

* `src/entities`: Modelagem de objetos como `Veiculo` e `Ticket`.
* `src/services`: Motores de cálculo de tarifa e validação de regras de negócio.
* `src/application`: Interface de console para interação com o usuário e testes do sistema.

## 🚀 Conceitos Aplicados

1.  **Encapsulamento:** Proteção dos dados do veículo e dos horários registrados.
2.  **Tratamento de Exceções:** Validações para evitar saídas registradas antes da entrada ou cálculos com dados nulos.
3.  **Lógica Matemática:** Conversão de milissegundos ou minutos em valores monetários formatados.

## 🏁 Como Executar

1. Clone o repositório:
   ```bash
   git clone [https://github.com/Geoo-Loos/Sistema-de-cobranca-estacionamento.git](https://github.com/Geoo-Loos/Sistema-de-cobranca-estacionamento.git)
