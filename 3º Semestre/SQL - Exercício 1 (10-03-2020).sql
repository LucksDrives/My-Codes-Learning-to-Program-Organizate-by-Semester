/*1. Faça o comando SQL para criar uma tabela denominada NATURAL, contendo os campos id,
nome, cidade e estado, sendo o campo id do tipo numérico inteiro e os demais do tipo cadeia de
caracteres. O campo id é a chave primária da tabela*/

CREATE TABLE NATURAL(
id INT NOT NULL,
nome VARCHAR(200),
cidade VARCHAR(100),
estado CHAR(2),
PRIMARY KEY(id)
);
