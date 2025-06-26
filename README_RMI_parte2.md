# Sistema de Campeonato de Futsal - Versão RMI

**Autor:** Ronald Matheus Viana Lopes 
**Matrícula:** 541492 
**Disciplina:** Sistemas Distribuídos 
**Período:** 2025.1 

---

## 📋 Descrição

Este projeto é uma reimplementação do trabalho anterior (baseado em sockets) utilizando **Java RMI (Remote Method Invocation)**. O objetivo é demonstrar comunicação remota orientada a objetos entre cliente e servidor, com serialização de objetos e chamadas de métodos remotos.

---

## ✅ Requisitos Atendidos

- ✅ Interface remota `ConsultaRemota.java`
- ✅ Implementação remota `ConsultaRemotaImpl.java`
- ✅ 4 métodos remotos:
  - `listarResultados()`
  - `consultarPlacar(time1, time2)`
  - `adicionarResultado(Resultado)`
  - `listarTimes()`
- ✅ Objetos serializáveis (`Resultado` e `TimeFutsal`)
- ✅ Modelo orientado a objetos com:
  - 4 POJOs (`Resultado`, `TimeFutsal`, `Arbitro`, `Atleta`)
  - Herança (`Atleta`/`Arbitro` herdam de `Pessoa`)
  - Agregação ("tem-um") em `Resultado` e `TimeFutsal`
- ✅ Representação externa via serialização Java
- ✅ Passagem por valor e referência via RMI

---

## 📁 Estrutura dos Arquivos

- `ConsultaRemota.java` – Interface remota com os métodos acessíveis via rede
- `ConsultaRemotaImpl.java` – Implementação dos métodos remotos
- `ServidorRMI.java` – Inicializa o RMI Registry e registra o serviço
- `ClienteRMI.java` – Cliente que acessa remotamente o serviço e oferece menu de interação
- `Resultado.java` – Entidade que representa um placar de jogo (serializável)
- `TimeFutsal.java` – Entidade que representa um time de futsal (serializável)
- (Opcional) `Pessoa.java`, `Arbitro.java`, `Atleta.java` – para reforçar herança

---

## 🧪 Como Executar

### 1. Compile tudo:

```bash
javac *.java
```

### 2. Em um terminal, inicie o RMI Registry:

```bash
rmiregistry
```

> Deixe este terminal aberto. Não feche.

### 3. Em outro terminal, inicie o servidor:

```bash
java ServidorRMI
```

### 4. Em outro terminal, inicie o cliente:

```bash
java ClienteRMI
```

---

## 📈 Exemplo de uso (Cliente)

```
--- Menu Cliente RMI ---
1. Listar Resultados
2. Consultar Placar
3. Adicionar Resultado
4. Listar Times
0. Sair
```

---

## 🧠 Observações

- Todo o transporte de objetos ocorre por RMI com `Serializable`
- Os dados são mantidos em memória
- Pode ser facilmente estendido para usar banco de dados ou arquivos
- A estrutura segue princípios sólidos de orientação a objetos

---

## 📚 Conclusão

Este projeto atende a todos os requisitos funcionais e técnicos do Trabalho 2 da disciplina de Sistemas Distribuídos, utilizando Java RMI de forma clara, modular e funcional.
