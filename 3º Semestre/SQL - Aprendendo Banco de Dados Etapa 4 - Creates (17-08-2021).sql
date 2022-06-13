/*Todas as Informações em relação a Construção do Código e Detalhamento do mesmo no Relatório de Operação*/

CREATE TABLE public.Mesa (
    data_locacao date NOT NULL,
    quant_cliente integer NOT NULL,
    num_mesa integer NOT NULL,
	PRIMARY KEY (num_mesa)
);

CREATE TABLE public.Cliente (
    nome_cliente character varying(20) NOT NULL,
    telefone_cliente character varying(115) NOT NULL,
    id_cliente integer NOT NULL,
	num_mesa integer NOT NULL,
	PRIMARY KEY (id_cliente),
	FOREIGN KEY (num_mesa) REFERENCES Mesa(num_mesa)
);

CREATE TABLE public.Pedidos (
    bebida character varying(115) NOT NULL,
    comida character varying(115) NOT NULL,
    id_pedidos integer NOT NULL,
	id_cliente integer NOT NULL,
	PRIMARY KEY (id_pedidos),
	FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
);

CREATE TABLE public.Funcionario (
    cargo character varying(20) NOT NULL,
    nome_func character varying(20) NOT NULL,	
    turno character varying(20) NOT NULL,
    id_funcionario integer NOT NULL,
	PRIMARY KEY (id_funcionario)
);

CREATE TABLE public.Garcom (
	gorjeta float NOT NULL,
	id_funcionario integer NOT NULL,
	FOREIGN KEY (id_funcionario) REFERENCES Funcionario(id_funcionario)	
);

CREATE TABLE public.Caixa (
    num_caixa integer NOT NULL,
	id_funcionario integer NOT NULL,
	PRIMARY KEY (num_caixa),
	FOREIGN KEY (id_funcionario) REFERENCES Funcionario(id_funcionario)	
);

CREATE TABLE public.Fatura (
    data_fatura date NOT NULL,
	valor float NOT NULL,
    id_fatura integer NOT NULL,
	num_caixa integer NOT NULL,
	PRIMARY KEY (id_fatura),
	FOREIGN KEY (num_caixa) REFERENCES Caixa(num_caixa)	
);