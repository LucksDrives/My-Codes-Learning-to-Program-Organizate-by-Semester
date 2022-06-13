/*Todas as Informações em relação a Construção do Código e Detalhamento do mesmo no Relatório de Operação*/

/*Aqui temos uma atualização do cadastro do número de telefone do cliente 002 (Osmar Tokio)*/
update cliente
set telefone_cliente='(54)999812203'
where id_cliente='002';

/*Aqui temos uma atualização do cadastro do pedido do cliente 001 (João da Siva) que decidiu trocar seu pedido e pediu apenas Alface*/
update pedidos
set comida='Alface'
where id_pedidos='001';

/*Aqui temos uma atualização do cadastro do pedido do cliente 003 (Pedro Gamer) que decidiu trocar seu pedido e pediu um X-Burguer*/
update pedidos
set comida='X-burguer'
where id_pedidos='003';

/*Aqui temos uma atualização do cadastro do nome do cliente 001 (João da Silva) já que o mesmo não estava cadastrado com o acento*/
update cliente
set nome_cliente='joão da Silva'
where id_cliente='001';

/*Aqui temos um cancelamento de pedido e assim uma exclusão do cadastro do pedido do cliente 009 (Serjio Cunha)*/
delete from pedidos
where id_pedidos='009';

/*Aqui temos um cancelamento de pedido e assim uma exclusão do cadastro do pedido do cliente 010 (Josmar Albara)*/
delete from pedidos
where id_pedidos='010';

/*Consulta de Pedidos para cada Cliente*/
SELECT pedidos.id_pedidos, pedidos.comida, pedidos.bebida, cliente.id_cliente
FROM cliente
INNER JOIN pedidos ON (cliente.id_cliente = pedidos.id_cliente)		
GROUP BY pedidos.id_pedidos, cliente.id_cliente
ORDER BY cliente.id_cliente DESC;

/*Consulta de Mesas*/
SELECT mesa.num_mesa, quant_cliente, data_locacao
FROM mesa
ORDER BY mesa.num_mesa;

/*Consulta de Mesas para cada Cliente*/
SELECT cliente.id_cliente, nome_cliente, mesa.num_mesa, data_locacao
FROM cliente
INNER JOIN mesa ON (cliente.num_mesa = mesa.num_mesa)		
GROUP BY mesa.num_mesa, cliente.id_cliente
ORDER BY cliente.id_cliente;

/*Consultar os Cargos e Turnos de cada Funcionário*/
SELECT funcionario.id_funcionario, cargo, turno, garcom.gorjeta, caixa.num_caixa
FROM funcionario
INNER JOIN caixa ON (funcionario.id_funcionario = caixa.id_funcionario)
INNER JOIN garcom ON (funcionario.id_funcionario = garcom.id_funcionario)
GROUP BY funcionario.id_funcionario, garcom.gorjeta, caixa.num_caixa
ORDER BY id_funcionario;

/*Consultar Faturas de Cada Caixa*/
SELECT caixa.num_caixa, funcionario.id_funcionario, fatura.data_fatura, fatura.valor, fatura.id_fatura
FROM caixa
INNER JOIN fatura ON (caixa.num_caixa = fatura.num_caixa)
INNER JOIN funcionario ON (caixa.id_funcionario = funcionario.id_funcionario)
GROUP BY caixa.num_caixa, fatura.id_fatura, funcionario.id_funcionario
ORDER BY caixa.num_caixa;

/*Consultar Fatura dos primeiros 3 Dias da Abertura do Bar*/
SELECT id_fatura, valor, data_fatura,
CASE
WHEN data_fatura = '2021-08-15' THEN 'Primeiro dia'
WHEN data_fatura = '2021-08-16' THEN 'Segundo dia'
WHEN data_fatura = '2021-08-17' THEN 'Terceiro dia'
ELSE 'Outro dia'
END as primeiros_dias
FROM fatura
GROUP BY fatura.id_fatura;


