# Sistema de Campeonato de Futsal

**Autor:** Ronald Matheus Viana Lopes  
**Matrícula:** 541492  
**Disciplina:** Sistemas Distribuídos  
**Período:** 2025.1  

## 📋 Descrição do Projeto

Este projeto consiste em um sistema distribuído simulado de gerenciamento de partidas de futsal, implementado em Java. Ele utiliza conceitos de:

- Programação orientada a objetos (POO)
- Sockets TCP para comunicação cliente-servidor
- Streams personalizados (`ResultadoOutputStream` e `ResultadoInputStream`) para serialização manual de objetos
- Classes POJO para representar dados das partidas

## ⚙️ Estrutura do Projeto

- `TimeFutsal.java`: Superclasse que representa um time de futsal.
- `Atleta.java` e `Arbitro.java`: Subclasses de `TimeFutsal`.
- `Resultado.java`: Classe que representa o resultado de uma partida entre dois times.
- `ResultadoOutputStream.java`: Classe de saída personalizada que envia objetos `Resultado` por um `OutputStream`.
- `ResultadoInputStream.java`: Classe de entrada personalizada que lê objetos `Resultado` de um `InputStream`.
- `Servidor.java`: Espera conexões e recebe resultados de partidas do cliente.
- `Cliente.java`: Envia resultados de partidas para o servidor.
- `TestesStreams.java`: Teste local para validar leitura e gravação de resultados com as streams personalizadas.

## 🧪 Execução

### 1. Compilação
Compile todos os arquivos:
```bash
javac *.java
```

### 2. Execução local (teste de stream):
```bash
java TestesStreams
```

### 3. Execução do servidor:
Em um terminal:
```bash
java Servidor
```

### 4. Execução do cliente:
Em outro terminal:
```bash
java Cliente
```

## 📈 Exemplo de Saída
```text
Equipe A,3,Equipe B,2
Equipe B,1,Equipe A,4
Equipe A 3 x 2 Equipe B
Equipe B 1 x 4 Equipe A
```

## ✅ Requisitos Atendidos

- [x] Classes POJO para modelar o domínio
- [x] Streams personalizadas (Input e Output)
- [x] Serialização manual de objetos `Resultado`
- [x] Comunicação cliente-servidor via Sockets TCP
- [x] Envio e recebimento de dados usando as streams implementadas

## 📚 Observações

O projeto pode ser estendido para incluir funcionalidades como:
- Armazenamento em arquivos
- Interface gráfica
- Ranking de times
- Persistência de dados com banco de dados
