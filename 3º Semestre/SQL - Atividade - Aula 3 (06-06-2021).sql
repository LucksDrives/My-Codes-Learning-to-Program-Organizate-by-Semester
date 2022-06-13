/*1. No banco de dados desenvolvido na aula anterior, a partir do modelo abaixo, faça inserções de
dados para “popular” as tabelas. Para cada tabela, faça 3 inserções de dados respeitando a lógica
presente. Seja criativo e diversifique os dados a serem inseridos. Não se esqueça de vincular dados
entre as tabelas e considerar as chaves estrangeiras no momento de realizar as inserções.
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

/*Tabelas do Banco de Dados*/
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

/*Inicio do Exercício*/
insert into categoria (id_categoria, nome_categoria)
values('1234563','Minecraft');

insert into fabricante (id_fabricante, nome_fabricante)
values('1234561','Noth');

insert into cliente (cod_cliente, nome_cliente, telefone, endereco)
values('1234562','Maicon', '4002-8922', 'Rua vereador 451');

insert into automovel (cod_auto, nome, id_categoria, id_fabricante)
values('1234565','Gol', '1234563', '1234561');

insert into unidade (cod_unidade, cod_auto, cor, modelo, valor)
values('1234566','1234565', 'azul', 'gol', 1200);

insert into Aluguel (numero, cod_cliente, cod_unidade, data_ret, data_dev, km_inicial, km_final)
values('1','1234562', '1234566','2021-01-01','2021-03-01','1','20');

/*2. Algumas unidades do automóvel Volkswagen Virtus, da categoria sedã, estão sendo adquiridas
pela locadora. Faça o cadastro deste automóvel no banco de dados para permitir o registro das
unidades da frota futuramente.*/

insert into categoria(id_categoria, nome_categoria)
values('1234569','Sedã');

insert into fabricante(id_fabricante, nome_fabricante)
values('77','volkswagen');

insert into automovel (cod_auto, nome, id_categoria, id_fabricante)
values('1234569','Volkswagen Virtus', '1234569', '77');

/*3. Algumas unidades do automóvel Fiat Toro, da categoria picape, estão sendo adquiridas pela
locadora. Faça o cadastro deste automóvel no banco de dados para permitir o registro das
unidades da frota futuramente.*/

insert into categoria(id_categoria, nome_categoria)
values('12345610','Picape');

insert into fabricante(id_fabricante, nome_fabricante)
values('88','Fiat');

insert into automovel (cod_auto, nome, id_categoria, id_fabricante)
values('12345611','Fiat Toro', '12345610', '88');

/*4. Faça a inserção da seguinte unidade na frota da locadora (faça as inserções adicionais
necessárias para que a informação fique completa):
cod_unidade: 47; cod_auto: 32; cor: “branco”; modelo: “1.0 LTZ Turbo”
Para tanto, sabe-se que o cod_auto 32 refere-se ao automóvel “Onix”, da categoria “Hatch”, da
fabricante “Chevrolet”.*/

insert into categoria(id_categoria, nome_categoria)
values('12345625','Hatch');

insert into fabricante(id_fabricante, nome_fabricante)
values('11','Chevrolet');

insert into automovel (cod_auto, nome, id_categoria, id_fabricante)
values('32','Onix', '12345625', '11');

insert into unidade (cod_unidade, cod_auto, cor, modelo, valor)
values('47','32', 'Branco', '1.0 LTZ Turbo', 1200);

/*5. Registre, para a unidade 47 da frota da empresa, um aluguel realizado no dia 25/02/2020. Sabese que o automóvel marcava a quilometragem de 23678 km quando foi retirado e 24065 km ao
ser devolvido. O cliente responsável pelo aluguel foi o sr. “Alberto Roberto”, residente na “Rua
Chico Anysio nº 1000” e que possui o seguinte contato telefônico “54 34372300” (faça as
inserções adicionais necessárias para que a informação fique completa).*/

insert into cliente (cod_cliente, nome_cliente, telefone, endereco)
values('12345629','Alberto Roberto', '54 34372300', 'Rua chico anysio n 1000');

insert into Aluguel (numero, cod_cliente, cod_unidade, data_ret, data_dev, km_inicial, km_final)
values('2','12345629', '47','2021-02-25','2021-03-30','23678','20');

/*6. Após verificar um erro no cadastro da unidade 47 da frota, solicita-se que o modelo da referida
unidade seja atualizado para o “1.0 LT”.*/

update unidade
set modelo='1.0 LT'
where cod_unidade='47';

/*7. Ocorreu um problema na aquisição das unidades do automóvel Fiat Toro. Assim, faça a remoção
deste veículo dos registros do banco de dados.*/

delete from automovel
where cod_auto='12345611';

/*8. Após a chegada dos veículos VW Virtus, registre as 3 unidades recebidas na frota. Duas
unidades são do modelo “Comfortline” de cor “Prata” e a terceira unidade é da cor “Branca”, do
modelo “Highline”.*/

insert into categoria(id_categoria, nome_categoria)
values('1234569','Sedã');

insert into automovel (cod_auto, nome, cor, modelo, id_categoria, id_fabricante)
values('1234570','Volkswagen VW Virtus 1', 'Prata', 'comfortline', '1234569', '1234561');

insert into automovel (cod_auto, nome, cor, modelo, id_categoria, id_fabricante)
values('1234571','Volkswagen VW Virtus 2', 'Prata', 'comfortline', '1234569', '1234561');

insert into automovel (cod_auto, nome, cor, modelo, id_categoria, id_fabricante)
values('1234572','Volkswagen VW Virtus 3', 'Branco', 'Highline', '1234569', '1234561');

/*9. No banco de dados desenvolvido na aula anterior, a partir do modelo abaixo, faça inserções de
dados para “popular” as tabelas. Para as tabelas “Categoria” e “Marca”, faça 3 inserções de dados.
Após, faça 5 inserções de Produtos, respeitando a lógica presente. Seja criativo e diversifique os
dados a serem inseridos. Não se esqueça de vincular dados entre as tabelas e considerar as chaves
estrangeiras no momento de realizar as inserções.
Produto (codigo, descrição, medida, id_categoria, id_marca)
id_categoria ref. Categoria
id_marca ref. Marca
Categoria (id_categoria, nome)
Marca (id_marca, nome)*/

/*Tabelas do Banco de Dados*/
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

/*Resolução do Exercício*/
/*Categorias*/
insert into categoria (id_categoria, nome_categoria)
values('1234223','Cosméticos');

insert into categoria (id_categoria, nome_categoria)
values('12342234','Remédios');

insert into categoria (id_categoria, nome_categoria)
values('12342623','Sapatos');

/*Marcas*/
insert into marca (id_marca, nome)
values('557', 'Avon');

insert into marca (id_marca, nome)
values('558', 'Integral Medical');

insert into marca (id_marca, nome)
values('5557', 'nike');

/*Produtos*/

insert into produto (codigo, descrição,id_categoria, id_marca)
values('122379878','batom vermelho','1234223','557');

insert into produto (codigo, descrição,id_categoria, id_marca)
values('12237987448','batom azul','1234223','557');

insert into produto (codigo, descrição,id_categoria, id_marca)
values('1223798353537448','batom laranja','1234223','557');

insert into produto (codigo, descrição,id_categoria, id_marca)
values('122374987448','batom preto','1234223','557');

insert into produto (codigo, descrição,id_categoria, id_marca)
values('12237987148','batom rosa','1234223','557');

/*10. Faça a inserção do produto de descrição “Presunto”, da marca “Sadia”, na categoria “Frios”.
Este produto é adquirido por “kg” (faça as inserções adicionais necessárias).*/

insert into categoria (id_categoria, nome_categoria)
values('123422','Frios');

insert into marca (id_marca, nome)
values('555', 'Sadia');

insert into produto (codigo, descrição, kg_inicial, kg_final,id_categoria, id_marca)
values('1223','presunto','1','20','123422','555');

/*11. Agora, o registro do produto de descrição “Presunto” precisa ser corrigido, visto que a sua
marca correta é “Lebon” (faça as inserções adicionais necessárias).*/

insert into marca (id_marca, nome)
values('777', 'Lebon');

update marca
set id_marca='777'
where id_marca='555';