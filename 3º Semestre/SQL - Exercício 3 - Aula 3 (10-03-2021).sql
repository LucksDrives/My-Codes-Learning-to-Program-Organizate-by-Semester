/*3. Algumas unidades do automóvel Fiat Toro, da categoria picape, estão sendo adquiridas pela
locadora. Faça o cadastro deste automóvel no banco de dados para permitir o registro das
unidades da frota futuramente.*/

insert into categoria(id_categoria, nome_categoria)
values('12345610','Picape');

insert into automovel (cod_auto, nome, id_categoria, id_fabricante)
values('12345611','Fiat Toro', '12345610', '1234561');