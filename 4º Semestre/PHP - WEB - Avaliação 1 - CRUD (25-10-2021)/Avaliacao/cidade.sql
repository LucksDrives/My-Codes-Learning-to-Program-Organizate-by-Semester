-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01-Set-2019 às 17:53
-- Versão do servidor: 10.3.16-MariaDB
-- versão do PHP: 7.1.30

--
-- Banco de dados: `Cidade`
--

-- --------------------------------------------------------|

/*Tabela de Criação da Tabela das Cidades*/

CREATE TABLE `cidade` (

  `idcidade` int(11) PRIMARY KEY AUTO_INCREMENT,

  `nome` varchar(100) NOT NULL,
  
  `imagem` varchar(100) NOT NULL

) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------|

/*Inserção de Testes*/

insert into cidade (idcidade, nome, imagem)
values('1','Nova Bassano', '1.png');

insert into cidade (idcidade, nome, imagem)
values('2','Nova Prata', '2.png');

insert into cidade (idcidade, nome, imagem)
values('3','Veranópilis', '3.png');

insert into cidade (idcidade, nome, imagem)
values('4','Nova Araça', '4.png');

insert into cidade (idcidade, nome, imagem)
values('5','Caxias', '5.png');

insert into cidade (idcidade, nome, imagem)
values('6','Ibiraiaras', '6.png');

insert into cidade (idcidade, nome, imagem)
values('7','Nova Alvorada', '7.png');

insert into cidade (idcidade, nome, imagem)
values('8','Bento Gonsalves', '8.png');

insert into cidade (idcidade, nome, imagem)
values('9','Vila Flores', '9.png');

insert into cidade (idcidade, nome, imagem)
values('10','Serafina Correa', '10.png');