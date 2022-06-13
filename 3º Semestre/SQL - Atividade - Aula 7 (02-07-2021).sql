CREATE TABLE Cliente(
id_cliente INT NOT NULL,
nome_cliente VARCHAR(200),
telefone character varying(11) NOT NULL,
PRIMARY KEY(id_cliente)
);

CREATE TABLE Produto(
id_produto INT NOT NULL,
quantidade_estoque INT NOT NULL,
nome_produto VARCHAR(200) NOT NULL,
marca_produto VARCHAR(200) NOT NULL,
valor_produto DOUBLE NOT NULL,
PRIMARY KEY(id_produto),
);

CREATE TABLE Pedido(
id_pedido INT NOT NULL,
valor_total DOUBLE NOT NULL,
data_pedido DATE NOT NULL,
id_cliente INT NOT NULL,
id_produto INT NOT NULL,
PRIMARY KEY(id_pedido),
FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente),
FOREIGN KEY (id_produto) REFERENCES Produto(id_produto)
);

/*1. Faça os comandos SQL de inserção e atualização necessários para registrar no banco de dados:
- um pedido de um novo cliente na data de hoje (nome: Alberto Roberto, telefone: 54-987654321);
- este pedido é composto por 7 unidades do produto Cereals e 3 unidades do produto Sandwiches;
- ao criar o pedido, coloque como valor total: 0.00;
- após, obrigatoriamente, faça um comando de atualização do valor total do pedido, utilizando-se uma subconsulta para calcular o calor total do pedido, baseando nos valores unitários e 
quantidades de cada produto no pedido.*/

/*Inserção do Cliente*/
insert into Cliente(id_cliente, nome_cliente, telefone)
values('001','Alberto Roberto','54-987654321');

/*Inserção dos Produtos*/
insert into Produto(id_produto, quantidade_estoque, nome_produto, marca_produto, valor_produto)
values('011','10','Celeral Radical', 'Nescal', '6');

insert into Produto(id_produto, quantidade_estoque, nome_produto, marca_produto, valor_produto)
values('012','10','Sandwiche de Frango', 'McDonald', '4');

/*Inserção dos Pedidos*/
insert into Pedido(id_pedido, valor, data_pedido, id_cliente, id_produto)
values('111','0','2021-07-01','001', '011');

insert into Pedido(id_pedido, valor, data_pedido, id_cliente, id_produto)
values('112','0','2021-07-01','001', '012');

/*Atualização dos Produtos*/
update Produto
set quantidade_estoque='3'
where id_produto='011';

update Produto
set quantidade_estoque='7'
where id_produto='012';

/*Atualização do Pedido*/
update Pedidos
set valor_total= '10'
where id_pedido='111';


/*2. Faça o comando SQL que consulte, para cada produto existente, o nome do produto, o nome 
da marca e o valor unitário, ordenando pelos valores dos produtos.*/

Select nome_produto, marca_produto, valor_produto
From Produto
order by valor_produto DESC;

/*3. Faça o comando SQL que consulte a soma dos totais dos pedidos por cada cliente, mostrando o nome 
do cliente e o somatório. Clientes que não realizaram pedidos também devem aparecer, destacando-se a soma como “0” ou “NULL”.*/

Select valor_total, id_cliente, nome_cliente
From Pedido, Cliente

/*4. Faça o comando SQL que consulte a data do pedido e nome do cliente do pedido de menor valor 
total.*/

Select Min(valor_total) data_pedido, nome_cliente
From Pedido, Cliente

/*5. Faça o comando SQL que consulte os itens do pedido de maior valor registrado, mostrando o nome do 
produto e a quantidade de cada item. Obs.: o resultado deve ser ordenado pela quantidade (da maior 
para a menor).*/

Select Max(valor_total) nome_produto, quantidade_estoque
From Produto
order by quantidade_estoque DESC;

/*6. Faça o comando SQL que consulte o valor médio dos produtos por marca, mostrando o nome da 
marca e o valor médio calculado. */

Select AVG(valor_produto), marca_produto
From Produto

/*7. Faça o comando SQL que consulte os produtos pedidos pelos clientes de último sobrenome “Price”, 
mostrando a data do pedido, o nome do produto e o valor unitário, e o nome do cliente.*/

Select SUBSTRING(nome_cliente, 0, CHARINDEX(' ', nome_cliente)) As Nome, REVERSE(SUBSTRING(REVERSE(nome_cliente), 0, CHARINDEX(' ', REVERSE(nome_cliente)))) As Sobrenome, data_pedido, nome_produto, valor_produto, nome_cliente
From Produto, Pedido, Cliente
where Sobrenome='Price'

/*8. Faça o comando SQL que consulte os pedidos que possuem valor total superior à média dos valores
totais dos pedidos, mostrando a data do pedido, nome do cliente e valor total do pedido. Obs.: o 
resultado deve ser ordenado pelo valor total (do menor para o maior).*/

Select valor_total, data_pedido, nome_cliente
From Pedidos, Cliente
where valor_total > AVG(valor_total)
order by valor_total;

/*9. Faça o comando SQL que consulte a quantidade de unidades de cada produto que está presente nos 
itens dos pedidos, mostrando o nome do produto e a quantidade, ordenando da maior quantidade 
para a menor.*/

Select quantidade_estoque, nome_produto
From Produto
order by quantidade_estoque DESC;