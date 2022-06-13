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
cod_unidade ref. Unidade
*/
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