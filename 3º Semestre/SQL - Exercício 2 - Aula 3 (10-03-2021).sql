/*2. Algumas unidades do automóvel Volkswagen Virtus, da categoria sedã, estão sendo adquiridas
pela locadora. Faça o cadastro deste automóvel no banco de dados para permitir o registro das
unidades da frota futuramente.*/

insert into categoria(id_categoria, nome_categoria)
values('1234569','Sedã');

insert into automovel (cod_auto, nome, id_categoria, id_fabricante)
values('1234569','Volkswagen Virtus', '1234569', '1234561');