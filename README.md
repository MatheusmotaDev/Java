<div align="center">

  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original-wordmark.svg" alt="Java Logo" width="120" height="120" />

  # ☕ Trilha & Estudos de Java
  
  **Um repositório autoral com anotações, algoritmos, exercícios práticos e evolução contínua em Java — dos fundamentos da linguagem à Programação Orientada a Objetos.**

  <p>
    <a href="#-sobre-o-projeto">Sobre</a> •
    <a href="#-estrutura-de-pastas">Estrutura</a> •
    <a href="#-conteúdos-praticados">Conteúdos</a> •
    <a href="#-como-executar">Como Executar</a> •
    <a href="#-autor">Autor</a>
  </p>

  <p>
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
    <img src="https://img.shields.io/badge/VS_Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white" alt="VS Code" />
    <img src="https://img.shields.io/badge/Status-Em_Constante_Evolução-2ea44f?style=for-the-badge" alt="Status" />
    <img src="https://img.shields.io/badge/Paradigmas-Estruturado_%7C_POO-blueviolet?style=for-the-badge" alt="Paradigmas" />
  </p>

</div>

---

## 📌 Sobre o Projeto

Este espaço foi estruturado por **[Matheus Alves](https://github.com/MatheusmotaDev)** para registrar sua jornada de aprendizado e consolidação da linguagem **Java**. Aqui estão reunidos desafios de lógica, simulados práticos de prova, manipulação de estruturas em memória e projetos de POO.

Cada exercício foi escrito como uma unidade independente, permitindo leitura do código-fonte, compreensão do algoritmo e execução direta no terminal.


---

## 📂 Estrutura de Pastas

Organização visual do repositório por tópicos de aprendizado:

```text
Java/
├── 📁 java-basico/           # Fundamentos: tipos primitivos, variáveis e tomadas de decisão (if/else/switch)
├── 📁 Loops/                 # Laços de repetição (for, while, do-while), menus interativos e validações
├── 📁 loops_aninhados/       # Laços dentro de laços, geração de matrizes visuais e padrões de repetição
├── 📁 matriz_vetor/          # Estruturas de dados em array: vetores unidimensionais e matrizes 2D
├── 📁 funcoes/               # Modularização: métodos estáticos, passagem de parâmetros e retornos
├── 📁 recursao/              # Resolução recursiva de problemas e sequências numéricas
├── 📁 busca/                 # Algoritmos clássicos de busca e varredura em coleções
├── 📁 poo/                   # Programação Orientada a Objetos
│   ├── 📁 basico/            # Primeiras classes, atributos, construtores e instâncias
│   └── 📁 metodos/           # Regras de negócio encapsuladas (ex: Conta Bancária com saque/depósito)
├── 📁 prova-*/               # Desafios cronometrados e baterias de testes práticos de fixação
│   ├── 📁 prova-basica1/
│   ├── 📁 prova_loops1/
│   ├── 📁 prova_loops2/
│   ├── 📁 prova-funcoes1/
│   └── 📁 prova-funcoes2/
├── 📁 relembrar/             # Revisão contínua e fixação de conceitos anteriores
└── 📁 projetos-java/         # Espaço reservado para projetos e mini-aplicações completas
```

---

## 🎯 Conteúdos Praticados

| Módulo | Foco Técnico | Destaques |
| :--- | :--- | :--- |
| **`java-basico`** | Entrada/Saída & Condicionais | Leitura com `Scanner`, formatação de strings e lógica de desvio (`if`/`else`). |
| **`Loops`** | Repetição & Fluxo de Controle | Controle de fluxo, laços de validação (`do-while`), cálculos acumuladores e contadores. |
| **`loops_aninhados`** | Laços Combinados | Padrões de asteriscos, tabuadas completas e simulação de grids. |
| **`matriz_vetor`** | Arrays & Grids | Alocação de vetores, matrizes multidimensionais e varreduras bidimensionais. |
| **`funcoes`** | Modularização & Reuso | Funções puras, conversões monetárias, cálculos de taxas e manipulação de texto. |
| **`recursao`** | Algoritmos Recursivos | Quebra de problemas em subproblemas e condições de parada. |
| **`busca`** | Algoritmos de Pesquisa | Busca linear em vetores e localização de elementos. |
| **`poo`** | Paradigma Orientado a Objetos | Modelagem de entidades do mundo real, estados (`atributos`) e comportamentos (`métodos`). |
| **`provas & desafios`** | Fixação de Conhecimento | Resoluções sob cenários reais de avaliação e lógica aplicada. |

---

## 🚀 Como Executar Localmente

### Pré-requisitos

- **JDK 17** ou superior instalado ([Download OpenJDK / Oracle](https://adoptium.net/))
- Terminal (PowerShell, Bash ou Git Bash) ou uma IDE como VS Code / IntelliJ IDEA

Confira sua versão instalada:
```bash
java -version
javac -version
```

### 1. Clonar o Repositório

```bash
git clone https://github.com/MatheusmotaDev/Java.git
cd Java
```

### 2. Compilar e Executar um Exercício

Como os arquivos estão organizados em pacotes correspondentes às pastas, a forma recomendada de execução a partir da raiz do projeto é:

**No Windows (PowerShell):**
```powershell
# Cria a pasta de saída, compila apontando o pacote e executa
New-Item -ItemType Directory -Force .build | Out-Null
javac -d .build .\matriz_vetor\CampoMinado.java
java -cp .build matriz_vetor.CampoMinado
```

**No Linux / macOS (Bash):**
```bash
mkdir -p .build
javac -d .build matriz_vetor/CampoMinado.java
java -cp .build matriz_vetor.CampoMinado
```

### 3. Compilação Global de Verificação

Para auditar e compilar todos os arquivos do projeto de uma só vez validando tipos e sintaxe:

```powershell
Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName } | Out-File -Encoding ascii sources.txt
javac -Xlint:all -d .build "@sources.txt"
Remove-Item sources.txt
```

---

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** Java (JDK 17+)
- **Editor / IDE:** Visual Studio Code (com *Extension Pack for Java*)
- **Versionamento:** Git & GitHub

---

## 👨‍💻 Autor

Feito por **Matheus Alves**.

<p>
  <a href="https://github.com/MatheusmotaDev">
    <img src="https://img.shields.io/badge/GitHub-MatheusmotaDev-181717?style=flat-square&logo=github" alt="GitHub Profile" />
  </a>
  <a href="mailto:matheusmota.webdev@gmail.com">
    <img src="https://img.shields.io/badge/Email-matheusmota.webdev%40gmail.com-D14836?style=flat-square&logo=gmail&logoColor=white" alt="Email" />
  </a>
</p>

---

<div align="center">
  <sub>⭐ Se este repositório te ajudou ou serviu de inspiração em seus estudos de Java, deixe uma estrela!</sub>
</div>
