/*2. Realize o comando apropriado para a criação de uma tabela com o nome DISCIPLINAS, que
contenha os campos id_disciplina e nome_disciplina, com chave primária id_disciplina. O campo
id_disciplina é composto por um código numérico inteiro e o nome da disciplina é uma cadeia de
caracteres*/

CREATE TABLE DISCIPLINAS(
id_disciplina INT NOT NULL,
nome_disciplina VARCHAR(100),
PRIMARY KEY(id_disciplina)
);
