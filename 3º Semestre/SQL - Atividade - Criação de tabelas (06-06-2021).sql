/*1. Faça o comando SQL para criar uma tabela denominada NATURAL, contendo os campos id,
nome, cidade e estado, sendo o campo id do tipo numérico inteiro e os demais do tipo cadeia de
caracteres. O campo id da a chave primária da tabela*/

CREATE TABLE NATURAL1(
id INT NOT NULL,
nome VARCHAR(200),
cidade VARCHAR(100),
estado CHAR(2),
PRIMARY KEY(id)
);

/*2. Realize o comando apropriado para a criação de uma tabela com o nome DISCIPLINAS, que
contenha os campos id_disciplina e nome_disciplina, com chave primária id_disciplina. O campo
id_disciplina é composto por um código numérico inteiro e o nome da disciplina é uma cadeia de
caracteres*/

CREATE TABLE DISCIPLINAS(
id_disciplina INT NOT NULL,
nome_disciplina VARCHAR(100),
PRIMARY KEY(id_disciplina)
);

/*3.Tendo por base a seguinte tabela: Escreva o comando SQL correto para incluir um novo campo id_categoria do tipo INT na tabela
PRODUTO.*/

ALTER TABLE PRODUTO ADD COLUMN id_categoria INT

/*4. Desenvolva, para o modelo relacional abaixo, os comandos SQL de criação das respectivas
tabelas. Não esqueça de considerar as restrições de chave primária, de valor nulo e de integridade
referencial, quando for o caso. Para as colunas que representam código e id, utilize o tipo inteiro.
Categoria (id_categoria, nome_categoria)
Fabricante (id_fabricante, nome_fabricante)
Cliente (cod_cliente, nome_cliente, telefone, endereco)
Automovel (cod_auto, nome, id_categoria, id_fabricante)
id_categoria ref. Categoria
id_fabricante ref. Fabricante
Unidade (cod_unidade, cod_auto, cor, modelo)
cod_auto ref. Automovel
Aluguel (numero, cod_cliente, cod_unidade, data, km_inicial, km_final)
cod_cliente ref. Cliente
cod_unidade ref. Unidade*/

CREATE TABLE fabricante (
    id_fabricante integer NOT NULL,
	nome_fabricante character varying(100) NOT NULL,
	PRIMARY KEY (id_fabricante)
);


CREATE TABLE categoria (
    id_categoria integer NOT NULL,
	nome_categoria character varying(100) NOT NULL,
	PRIMARY KEY (id_categoria)	
);


CREATE TABLE automovel (
    cod_auto integer NOT NULL,
    nome character varying(100) NOT NULL,
    id_categoria integer NOT NULL,
    id_fabricante integer NOT NULL,
	PRIMARY KEY (cod_auto),
	FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria),
	FOREIGN KEY (id_fabricante) REFERENCES fabricante(id_fabricante)
);


CREATE TABLE cliente (
    cod_cliente integer NOT NULL,
    nome_cliente character varying(100) NOT NULL,
    telefone character varying(11) NOT NULL,
    endereco character varying(150) NOT NULL,
	PRIMARY KEY (cod_cliente)
);


CREATE TABLE unidade (
    cod_unidade integer NOT NULL,
    cod_auto integer NOT NULL,
    cor character varying(100) NOT NULL,
    modelo character varying(100) NOT NULL,
    valor numeric(10,2) NOT NULL,
	PRIMARY KEY (cod_unidade),
	FOREIGN KEY (cod_auto) REFERENCES automovel(cod_auto)
);


CREATE TABLE aluguel (
    numero integer NOT NULL,
    cod_cliente integer NOT NULL,
    cod_unidade integer NOT NULL,
    data_ret date NOT NULL,
    data_dev date NOT NULL,
    km_inicial integer NOT NULL,
    km_final integer NOT NULL,
	PRIMARY KEY (numero),
	FOREIGN KEY (cod_cliente) REFERENCES cliente(cod_cliente),
	FOREIGN KEY (cod_unidade) REFERENCES unidade(cod_unidade)
);

/*5. Desenvolva, para o modelo relacional abaixo, os comandos SQL de criação das respectivas
tabelas. Não esqueça de considerar as restrições de chave primária, de valor nulo e de integridade
referencial, quando for o caso. Para as colunas que representam código e id, utilize o tipo inteiro.
Também deseja-se que as colunas que representam “descrição” e “nome” tenham uma restrição
para não ficarem sem um valor preenchido.
Produto (codigo, descrição, medida, id_categoria, id_marca)
id_categoria ref. Categoria
id_marca ref. Marca
Categoria (id_categoria, nome)
Marca (id_marca, nome)*/

CREATE TABLE marca (
    id_marca integer NOT NULL,
	nome character varying(100) NOT NULL,
	PRIMARY KEY (id_marca)
);


CREATE TABLE categoria (
    id_categoria integer NOT NULL,
	nome character varying(100) NOT NULL,
	PRIMARY KEY (id_categoria)	
);


CREATE TABLE produto (
    codigo integer NOT NULL,
    descricao character varying(100) NOT NULL,
	medida character varying(10) NOT NULL,
    id_categoria integer NOT NULL,
    id_marca integer NOT NULL,
	PRIMARY KEY (codigo),
	FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria),
	FOREIGN KEY (id_marca) REFERENCES marca(id_marca)
);