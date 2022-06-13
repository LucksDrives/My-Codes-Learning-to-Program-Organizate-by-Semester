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
cod_unidade ref. Unidade
*/

insert into categoria(id_categoria, nome_categoria)
values('1234563','Minecraft');

insert into fabricante(id_fabricante, nome_fabricante)
values('1234561','Noth');

insert into cliente (cod_cliente, nome_cliente, telefone, endereco)
values('1234562','Maicon', '4002-8922', 'Rua vereador 451');

insert into automovel (cod_auto, nome, id_categoria, id_fabricante)
values('1234565','Gol', '1234563', '1234561');

insert into unidade (cod_unidade, cod_auto, cor, modelo, valor)
values('1234566','1234565', 'azul', 'gol', 1200);

insert into Aluguel (numero, cod_cliente, cod_unidade, data, km_inicial, km_final)
values('1','1234562', '1234566','2020-02-01','1','20');