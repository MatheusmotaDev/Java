<div align="center">

```
     ██╗ █████╗ ██╗   ██╗ █████╗
     ██║██╔══██╗██║   ██║██╔══██╗
     ██║███████║██║   ██║███████║
██   ██║██╔══██║╚██╗ ██╔╝██╔══██║
╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║
 ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝
```

# ☕ Estudos da Linguagem Java

**Repositório de exercícios, anotações e experimentos feitos durante meus estudos de Java.**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-brightgreen?style=for-the-badge)
![Atualização](https://img.shields.io/badge/Atualizações-Constantes-blue?style=for-the-badge)

</div>

---

## 📌 Sobre o Repositório

Este repositório reúne exercícios e estudos práticos desenvolvidos ao longo da minha jornada de aprendizado em **Java**. O objetivo é consolidar o conhecimento da linguagem por meio da prática constante, cobrindo desde os fundamentos até tópicos mais avançados.

> 🔄 **Este repositório é atualizado constantemente** conforme novos conteúdos são estudados e novos exercícios são desenvolvidos. Volte sempre para conferir as novidades!

---

## 🛠️ Tecnologias e Ferramentas

| Tecnologia | Descrição |
|---|---|
| ☕ **Java** | Linguagem principal dos exercícios |
| 🔧 **JDK 17+** | Versão recomendada do Java Development Kit |
| 📦 **Maven / Gradle** | Gerenciadores de dependências (quando aplicável) |

---

## 💻 IDEs Recomendadas

Para estudar e executar os projetos deste repositório, as seguintes IDEs são recomendadas:

### 🥇 IntelliJ IDEA
> A IDE mais poderosa e popular para desenvolvimento Java.

- ✅ Autocompletar inteligente e análise de código avançada
- ✅ Suporte nativo a Maven, Gradle e frameworks Java
- ✅ Versão **Community** gratuita disponível
- 🔗 [Baixar IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

---

### 🥈 Eclipse IDE
> Clássica e amplamente utilizada no mercado, especialmente no mundo corporativo.

- ✅ Open-source e completamente gratuita
- ✅ Grande ecossistema de plugins
- ✅ Excelente para projetos Maven e Java EE
- 🔗 [Baixar Eclipse](https://www.eclipse.org/downloads/)

---

### 🥉 VS Code
> Leve e flexível, ótima opção para quem já usa o editor no dia a dia.

- ✅ Leve e altamente customizável
- ✅ Suporte a Java via **Extension Pack for Java** (Microsoft)
- ✅ Gratuito e open-source
- 🔗 [Baixar VS Code](https://code.visualstudio.com/)
- 🔗 [Extensão: Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

---

## 🚀 Instalação do Java (Passo a Passo)

> Siga este guia completo para instalar o Java, configurar as variáveis de ambiente e rodar seus primeiros arquivos no VS Code.

---

### 📥 Passo 1 — Baixar o JDK

1. Acesse o site oficial da Oracle ou do OpenJDK:
   - 🔗 [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) *(recomendado para estudo)*
   - 🔗 [Adoptium (OpenJDK)](https://adoptium.net/) *(alternativa open-source)*

2. Escolha a versão **JDK 17** ou superior (LTS recomendado)
3. Selecione o instalador para o seu sistema operacional (**Windows**, **macOS** ou **Linux**)
4. Baixe e execute o instalador seguindo as instruções na tela

---

### 🌍 Passo 2 — Configurar as Variáveis de Ambiente (Windows)

> ⚠️ Este passo é necessário para que o comando `java` funcione em qualquer terminal do sistema.

**2.1 — Descobrir o caminho de instalação do JDK**

O JDK costuma ser instalado em um caminho como:
```
C:\Program Files\Java\jdk-17
```
Ou, se usou o Adoptium:
```
C:\Program Files\Eclipse Adoptium\jdk-17.x.x.x-hotspot
```

**2.2 — Adicionar a variável `JAVA_HOME`**

1. Pressione `Win + S` e busque por **"Variáveis de Ambiente"**
2. Clique em **"Editar as variáveis de ambiente do sistema"**
3. Na janela que abrir, clique em **"Variáveis de Ambiente..."**
4. Em **Variáveis do Sistema**, clique em **"Novo..."**
5. Preencha:
   - **Nome da variável:** `JAVA_HOME`
   - **Valor da variável:** `C:\Program Files\Java\jdk-17` *(ajuste para o seu caminho)*
6. Clique em **OK**

**2.3 — Adicionar o Java ao `PATH`**

1. Ainda em **Variáveis do Sistema**, selecione a variável **`Path`** e clique em **"Editar..."**
2. Clique em **"Novo"** e adicione:
   ```
   %JAVA_HOME%\bin
   ```
3. Clique em **OK** em todas as janelas abertas

**2.4 — Verificar a instalação**

Abra o **Prompt de Comando** ou **PowerShell** e execute:

```bash
java -version
```

Se tudo estiver certo, você verá algo como:
```
java version "17.0.x" ...
```

> ✅ **macOS/Linux:** Ao usar o instalador padrão, o Java geralmente já é configurado automaticamente no PATH. Verifique com `java -version` no terminal.

---

### 🧩 Passo 3 — Configurar o VS Code para Java

**3.1 — Instalar o VS Code**

Caso ainda não tenha, baixe em: 🔗 [https://code.visualstudio.com/](https://code.visualstudio.com/)

**3.2 — Instalar o Extension Pack for Java**

1. Abra o VS Code
2. Pressione `Ctrl + Shift + X` para abrir a aba de extensões
3. Busque por **"Extension Pack for Java"** (publicado pela Microsoft)
4. Clique em **Instalar**

> Este pacote instala automaticamente as extensões essenciais: suporte à linguagem Java, depurador, gerenciador de projetos e mais.

**3.3 — Verificar se o VS Code detectou o JDK**

1. Pressione `Ctrl + Shift + P` para abrir a paleta de comandos
2. Digite **"Java: Configure Java Runtime"** e selecione
3. Confirme que o JDK instalado aparece na lista

---

### ▶️ Passo 4 — Rodar um arquivo Java no VS Code

**4.1 — Criando e rodando um arquivo simples**

1. Crie um arquivo com extensão `.java`, por exemplo: `HelloWorld.java`
2. Escreva o código:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World! ☕");
    }
}
```

3. Salve o arquivo com `Ctrl + S`
4. Clique no botão **▶ Run** que aparece acima do método `main`

   *Ou pressione `Ctrl + F5` para rodar sem depuração*

5. O resultado será exibido no terminal integrado do VS Code:
```
Hello, World! ☕
```

> 💡 **Dica:** O nome do arquivo `.java` deve ser **igual** ao nome da classe pública. Ex: classe `HelloWorld` → arquivo `HelloWorld.java`

---

## ⚙️ Como Executar os Exercícios deste Repositório

**Pré-requisitos:**
- JDK 17 ou superior instalado
- Uma das IDEs recomendadas acima

**Passos:**

```bash
# 1. Clone o repositório
git clone https://github.com/seu-usuario/estudos-java.git

# 2. Acesse o diretório
cd estudos-java

# 3. Abra na sua IDE preferida e execute o arquivo desejado
```

Cada exercício pode ser executado diretamente pelo método `main` da respectiva classe Java.

---

## 🔄 Atualizações

Este repositório está em **constante evolução**. Novos exercícios, correções e melhorias são adicionados regularmente.

⭐ **Deixe uma estrela no repositório** para acompanhar as novidades!

---

## 📬 Contato

Sinta-se à vontade para abrir uma *issue* com sugestões, dúvidas ou melhorias.

---

<div align="center">

Feito com ☕ e muito estudo.

</div>