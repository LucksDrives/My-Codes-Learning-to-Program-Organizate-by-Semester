/*Todas as Informações em relação a Construção do Código e Detalhamento do mesmo no Relatório de Operação*/

/*Inserção das Mesas*/
insert into mesa(data_locacao, quant_cliente, num_mesa)
values('2021-08-15','2','001');

insert into mesa(data_locacao, quant_cliente, num_mesa)
values('2021-08-15','2','002');

insert into mesa(data_locacao, quant_cliente, num_mesa)
values('2021-08-15','2','003');

insert into mesa(data_locacao, quant_cliente, num_mesa)
values('2021-08-15','4','004');

/*Inserção dos Clientes*/
insert into Cliente(id_cliente, nome_cliente, telefone_cliente, num_mesa)
values('001','Joao da silva','(54)4002-8922', '004');

insert into Cliente(id_cliente, nome_cliente, telefone_cliente, num_mesa)
values('002','Osmar Tokio','(54)4002-8927', '004');

insert into Cliente(id_cliente, nome_cliente, telefone_cliente, num_mesa)
values('003','Pedro Gamer','(54)4002-8926', '004');

insert into Cliente(id_cliente, nome_cliente, telefone_cliente, num_mesa)
values('004','Gabriel Camargo','(54)4002-8925', '004');

insert into Cliente(id_cliente, nome_cliente, telefone_cliente, num_mesa)
values('005','Michael Vidi','(54)4002-8913', '003');

insert into Cliente(id_cliente, nome_cliente, telefone_cliente, num_mesa)
values('006','Carlos Penes','(54)4002-8912', '003');

insert into Cliente(id_cliente, nome_cliente, telefone_cliente, num_mesa)
values('007','Arthur Bunda','(54)4002-8911', '002');

insert into Cliente(id_cliente, nome_cliente, telefone_cliente, num_mesa)
values('008','Aurelio Antonioli','(54)4002-8921', '002');

insert into Cliente(id_cliente, nome_cliente, telefone_cliente, num_mesa)
values('009','Serjio Cunha','(54)4002-8923', '001');

insert into Cliente(id_cliente, nome_cliente, telefone_cliente, num_mesa)
values('010','Josberto Albara','(54)4002-8928', '001');

/*Inserção dos Pedidos*/
insert into pedidos(id_pedidos, comida, bebida, id_cliente)
values('001','Pastel de Frango','Cachaça 51','001');

insert into pedidos(id_pedidos, comida, bebida, id_cliente)
values('002','Pastel de Carne','Nada','002');

insert into pedidos(id_pedidos, comida, bebida, id_cliente)
values('003','Pastel de Vento','Agua','003');

insert into pedidos(id_pedidos, comida, bebida, id_cliente)
values('004','X-Avestruz','Todinho','004');

insert into pedidos(id_pedidos, comida, bebida, id_cliente)
values('005','X-Frango','Cerveja Skol','005');

insert into pedidos(id_pedidos, comida, bebida, id_cliente)
values('006','Hamburguer de Peixe','Suco de Manga','006');

insert into pedidos(id_pedidos, comida, bebida, id_cliente)
values('007','Picadinho GG','Suco de Maracujá','007');

insert into pedidos(id_pedidos, comida, bebida, id_cliente)
values('008','La-Minuta','Tekila','008');

insert into pedidos(id_pedidos, comida, bebida, id_cliente)
values('009','Frango Grelhado','Agua','009');

insert into pedidos(id_pedidos, comida, bebida, id_cliente)
values('010','Ovo','Nada','010');

/*Inserção dos Funcionarios*/
insert into funcionario(id_funcionario, nome_func, cargo, turno)
values('001','Maicon Vidi','Fachineiro','Manhã');

insert into funcionario(id_funcionario, nome_func, cargo, turno)
values('002','Alex dos Anjos','Fachineiro','Tarde');

insert into funcionario(id_funcionario, nome_func, cargo, turno)
values('003','Maria Antonioli','Fachineira','Noite');

insert into funcionario(id_funcionario, nome_func, cargo, turno)
values('004','Barbara Penes','Cozinheira','Manhã');

insert into funcionario(id_funcionario, nome_func, cargo, turno)
values('005','Patrick Bunda','Cozinheiro','Tarde');

insert into funcionario(id_funcionario, nome_func, cargo, turno)
values('006','Marcos João Pereira','Cozinheiro','Noite');

insert into funcionario(id_funcionario, nome_func, cargo, turno)
values('007','Emanuel Gaymer','Garçom','Manhã');

insert into funcionario(id_funcionario, nome_func, cargo, turno)
values('008','Pedro Pepo','Garçom','Tarde');

insert into funcionario(id_funcionario, nome_func, cargo, turno)
values('009','Jean Almeida','Garçom','Noite');

insert into funcionario(id_funcionario, nome_func, cargo, turno)
values('010','Pedro Alcantara','Caixa','Manhã');

insert into funcionario(id_funcionario, nome_func, cargo, turno)
values('011','Alcindo Vieira','Caixa','Tarde');

insert into funcionario(id_funcionario, nome_func, cargo, turno)
values('012','Emanuele Almeida','Caixa','Noite');

/*Inserção dos Garçons*/
insert into garcom(id_funcionario,gorjeta)
values('007','5.00');

insert into garcom(id_funcionario,gorjeta)
values('008','10.00');

insert into garcom(id_funcionario,gorjeta)
values('009','35.00');

/*Inserção dos Caixas*/
insert into caixa(id_funcionario, num_caixa)
values('010','001');

insert into caixa(id_funcionario, num_caixa)
values('011','002');

insert into caixa(id_funcionario, num_caixa)
values('012','003');

/*Inserção das Faturas*/
insert into fatura(data_fatura, valor, id_fatura, num_caixa)
values('2021-08-15','550.90','001','001');

insert into fatura(data_fatura, valor, id_fatura, num_caixa)
values('2021-08-15','150.90','002','002');

insert into fatura(data_fatura, valor, id_fatura, num_caixa)
values('2021-08-15','120.90','003','003');