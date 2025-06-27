# Sistema de Campeonato de Futsal (RMI)

## 📝 Sobre
Este documento explica como compilar e executar o sistema de campeonato de futsal usando Java RMI.

---

## 📋 Pré-requisitos
- Java JDK 8 ou superior instalado  
- Terminal / linha de comando disponível  

---

## 🛠️ Como Executar

### 1. Compilar os arquivos Java
Navegue até o diretório raiz do projeto:

```bash
cd ~/semestre_2025.1/sistemas_distribuidos/SistemaCampeonatoFutsal
Compile todos os arquivos Java para a pasta bin:

bash
javac -d bin src/*.java

2. Iniciar o RMI Registry
Em um terminal novo, dentro do diretório bin, execute:

bash
cd bin
rmiregistry

💡 Mantenha este terminal aberto enquanto o sistema estiver em execução.

3. Iniciar o Servidor RMI
Em outro terminal, dentro do diretório bin, execute:

bash
cd bin
java ServidorRMI

4. Iniciar o Cliente RMI
Em um terceiro terminal, também dentro do diretório bin, execute:

bash
cd bin
java ClienteRMI

🔧 Solução de Problemas
Porta 1099 em uso
Se aparecer o erro Port already in use: 1099:

Verifique os processos do rmiregistry em execução:

bash
ps aux | grep rmiregistry
Encerre o processo que está usando a porta (substitua PID pelo número do processo):

bash
kill -9 PID
Reinicie o rmiregistry.

Timeout na conexão
Se ocorrer timeout ao iniciar o ServidorRMI:

Confirme que o rmiregistry está realmente executando.

Certifique-se de que todos os comandos estão sendo executados dentro do diretório bin.

💻 Comandos Úteis
Comando	Descrição
javac -d bin src/*.java	Compila todo o código fonte
rmiregistry	Inicia o registry do RMI
java ServidorRMI	Inicia o servidor RMI
java ClienteRMI	Inicia o cliente RMI

📚 Estrutura de Arquivos
SistemaCampeonatoFutsal/
├── bin/                     # Arquivos compilados (.class)
├── src/                     # Código fonte (.java)
│   ├── Atleta.java
│   ├── ClienteRMI.java
│   ├── ServidorRMI.java
│   └── ...                  # Demais arquivos
├── README.md                # Este arquivo
└── compilar_e_executar.sh   # Script para compilar e executar
