# 📝 ToDo - Gerenciador de Tarefas em Java

Projeto desenvolvido durante uma live, com o objetivo de praticar e demonstrar conceitos fundamentais de programação orientada a objetos (POO) em Java, como enumerações, organização em pacotes (`controllers` e `models`) e uso de listas dinâmicas.

## 🚀 Funcionalidades

- ✅ **Listar tarefas**
- ➕ **Adicionar nova tarefa**
- 🏁 **Concluir tarefa existente**
- ❌ **Remover tarefa da lista**

## 🧱 Estrutura do Projeto

```
ToDo/
├── src/
│   ├── controllers/
│   │   ├── Menu.java              # Interface de interação com o usuário
│   │   ├── SituacaoEnnum.java     # Enum com os estados possíveis de uma tarefa
│   │   └── Tarefa.java            # Classe que representa uma tarefa
│   ├── models/
│   │   └── GerenciadorDeTarefas.java # Lógica para manipular a lista de tarefas
│   └── Main.java                  # Ponto de entrada do programa
├── out/                           # Compilados
├── readme.md
```

## 💡 Tecnologias Utilizadas

- Java 17+
- IDE: IntelliJ IDEA
- Execução via terminal ou IDE

## 🛠 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/ToDo.git
   cd ToDo
   ```

2. Compile os arquivos:
   ```bash
   javac -d out src/**/*.java
   ```

3. Execute o programa:
   ```bash
   java -cp out Main
   ```

## 🎥 Live

Projeto desenvolvido **ao vivo**! Confira a gravação aqui: *https://youtube.com/live/vMcz0Y8Uxwo?feature=share*

## 🧠 Aprendizados

- Organização de código com pacotes
- Utilização de `enum` para representar estados
- Manipulação de listas com `ArrayList`
- Criação de menus interativos via console

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar, modificar e compartilhar!
