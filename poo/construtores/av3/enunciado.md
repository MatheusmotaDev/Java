Questão 01 — Cadastro de Filmes

Uma locadora deseja iniciar o desenvolvimento de um sistema para representar os filmes disponíveis em seu catálogo. Nesta primeira versão, você deverá criar uma classe que represente um filme e uma aplicação simples para instanciar e exibir objetos dessa classe.

1. Classe Filme

Crie uma classe chamada Filme com os seguintes atributos:

titulo, do tipo String;
genero, do tipo String;
anoLancamento, do tipo int.

Crie um construtor que receba os três valores e inicialize os atributos do objeto. Utilize a palavra-chave this nas atribuições realizadas dentro do construtor.

2. Aplicação

Crie uma classe Main contendo o método main. Dentro dela, crie exatamente dois objetos da classe Filme com os dados abaixo:

Filme	1	2
Título	Interestelar	Toy Story
Gênero	Ficção Científica	Animação
Ano de lançamento	2014	1995

Depois, exiba no console os dados dos dois filmes utilizando System.out.println(). A saída deve identificar cada filme e apresentar título, gênero e ano de lançamento.