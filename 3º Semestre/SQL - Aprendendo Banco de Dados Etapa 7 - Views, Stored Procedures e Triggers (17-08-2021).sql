/*Todas as Informações em relação a Construção do Código e Detalhamento do mesmo no Relatório de Operação*/

/*Views clientes com a Mesa 1: No geral essa view é uma maneira alternativa de observação de dados da tabela cliente em relação a sua mesa, afunilando as informações apenas para demonstração de clientes da mesa 1 essa view se trata de uma tabela virtual ou uma consulta armazenada.*/
CREATE VIEW clientesmesa1 AS
SELECT nome_cliente, id_cliente, telefone_cliente
FROM cliente
WHERE cliente.num_mesa = '1'
ORDER BY id_cliente
WITH CASCADED CHECK OPTION;

/*Stored Procedures: Procedimentos Armazenados são maneiras de concentrar a lógica necessária para determinada função para agilizar o retorno de informações, no geral é utilizado para executar várias funções apartir de uma unica instrução. Nessa função em questão foi retornado o total do valor da fatura obtida*/
CREATE FUNCTION maiorvalordocaixa(float)
RETURNS float AS $$
	SELECT count(valor) FROM fatura
$$
LANGUAGE SQL;

/*Triggers: São operações que são realizadas de forma espontânea a partir da ocorrência de eventos específicos, sendo eles insert, update e delete. Nessa Execução foi feito uma operação para gerar um log de registros para o Insert em questão.*/
CREATE FUNCTION logCliente()
RETURNS trigger AS $$
begin
INSERT INTO logCliente (id_cliente, nome_cliente, telefone_cliente)
VALUES (OLD.id_cliente, OLD.nome, OLD.telefone);
RETURN OLD;
end;
$$ LANGUAGE plpgsql;

/*Executor da Função Anterior*/
CREATE TRIGGER executa_logCliente
AFTER UPDATE ON cliente
FOR EACH ROW EXECUTE PROCEDURE logCliente();
CREATE TABLE logCliente(
id_logCliente serial,
id_cliente integer,
nome_cliente varchar(200),
telefone_cliente varchar(20),
PRIMARY KEY (id_log_cliente)
);