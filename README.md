# Estudos de Java

Repositório de exercícios e anotações para praticar Java, desde os fundamentos até programação orientada a objetos e recursão. Cada arquivo representa um exercício independente e pode ser lido, compilado e executado separadamente.

## Pré-requisitos

- JDK 17 ou superior instalado
- Terminal ou uma IDE com suporte a Java

Confira a instalação com:

```bash
java -version
javac -version
```

## Organização

| Pasta | Conteúdos praticados |
|---|---|
| `java-basico` | Entrada de dados, variáveis e decisões |
| `Loops` | Repetições, contadores, validações e menus |
| `loops_aninhados` | Laços dentro de laços e padrões |
| `matriz_vetor` | Vetores, matrizes e buscas |
| `funcoes` | Métodos, parâmetros e cálculos reutilizáveis |
| `recursao` | Soluções recursivas e sequências matemáticas |
| `poo` | Classes, objetos e primeiros conceitos de POO |
| `prova-*` e `prova_*` | Exercícios de revisão e avaliação |
| `busca` | Algoritmos de busca |
| `relembrar.java` | Revisões de aulas anteriores |

Os nomes das classes e dos arquivos nem sempre seguem o mesmo padrão porque o projeto registra a evolução dos estudos. Consulte o próprio código para identificar o método `main` e os dados esperados.

## Compilar e executar

### Um arquivo sem pacote

No PowerShell:

```powershell
javac .\Loops\Tabuada.java
java -cp .\Loops Tabuada
```

No Bash:

```bash
javac Loops/Tabuada.java
java -cp Loops Tabuada
```

### Um arquivo com pacote

Alguns exercícios usam declaração de pacote. Compile a partir da raiz para uma pasta temporária e execute usando o nome completo da classe:

```powershell
New-Item -ItemType Directory -Force .build | Out-Null
javac -d .build .\busca\Ult.java
java -cp .build busca.Ult
```

O exemplo acima imprime `2`, o último índice em que o valor procurado aparece.

### Verificar todos os exercícios

```powershell
$sources = Get-ChildItem -Recurse -Filter *.java -File | Select-Object -ExpandProperty FullName
New-Item -ItemType Directory -Force .build | Out-Null
javac -Xlint:all -d .build $sources
```

A compilação confirma a sintaxe e os tipos, mas não substitui a execução dos exercícios que dependem de entrada pelo teclado. As pastas `.build` e `.build-check` são ignoradas pelo Git.

## Como estudar

1. Escolha uma pasta compatível com o assunto que está estudando.
2. Leia o `main` e anote quais entradas o programa espera.
3. Execute o exercício com casos normais e casos-limite.
4. Reescreva a solução usando nomes mais claros ou uma abordagem diferente.
5. Compare o resultado e registre a dúvida no código ou nas anotações.

## Contribuições

Melhorias de legibilidade, correções de exercícios e novos exemplos são bem-vindos. Mantenha cada exercício pequeno, explique decisões que não sejam óbvias e valide as alterações compilando os fontes afetados.
