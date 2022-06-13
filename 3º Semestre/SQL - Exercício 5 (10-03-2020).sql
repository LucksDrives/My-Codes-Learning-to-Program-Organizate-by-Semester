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