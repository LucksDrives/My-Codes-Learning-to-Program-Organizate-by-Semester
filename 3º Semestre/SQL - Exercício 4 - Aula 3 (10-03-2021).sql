/*4. Faça a inserção da seguinte unidade na frota da locadora (faça as inserções adicionais
necessárias para que a informação fique completa):
cod_unidade: 47; cod_auto: 32; cor: “branco”; modelo: “1.0 LTZ Turbo”
Para tanto, sabe-se que o cod_auto 32 refere-se ao automóvel “Onix”, da categoria “Hatch”, da
fabricante “Chevrolet”.*/

insert into categoria(id_categoria, nome_categoria)
values('12345625','Hatch');

insert into automovel (cod_auto, nome, id_categoria, id_fabricante)
values('32','Onix', '12345625', '1234561');

insert into unidade (cod_unidade, cod_auto, cor, modelo, valor)
values('47','32', 'Branco', '1.0 LTZ Turbo', 1200);