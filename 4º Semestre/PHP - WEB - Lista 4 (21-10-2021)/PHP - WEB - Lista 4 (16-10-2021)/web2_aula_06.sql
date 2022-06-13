-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01-Set-2019 às 17:53
-- Versão do servidor: 10.3.16-MariaDB
-- versão do PHP: 7.1.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `web2_aula_06`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cd`
--

CREATE TABLE `cd` (
  `id` int(11) NOT NULL,
  `artista` varchar(200) NOT NULL,
  `titulo` varchar(200) NOT NULL,
  `descricao` text NOT NULL,
  `preco` double(10,2) NOT NULL,
  `ano` year(4) NOT NULL,
  `estilo` varchar(100) NOT NULL,
  `gravadora` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `festa`
--

CREATE TABLE `festa` (
  `idFesta` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `endereco` varchar(200) NOT NULL,
  `cidade` varchar(200) NOT NULL,
  `dia` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `festa`
--

INSERT INTO `festa` (`idFesta`, `nome`, `endereco`, `cidade`, `dia`) VALUES
(1, 'Medi In Rock - 10 Anos', 'Parque de Eventos CTG Rincão da Roça Reúna', 'Veranópolis/RS', '2020-11-15'),
(2, 'Festival Internacional de Folclore de Nova Prata - 15a Edição', 'Ginásio de Esportes Santa Cruz', 'Nova Prata/RS', '2020-09-11'),
(3, '50º Festival Estadual do Whisky', 'SOAL - Av. Pinheiro Machado', 'Veranópolis/RS', '2020-09-07'),
(4, 'We Love Neon - Edição Veranópolis', 'SOAL - Av. Pinheiro Machado', 'Veranópolis/RS', '2020-09-13');

-- --------------------------------------------------------

--
-- Estrutura da tabela `musica`
--

CREATE TABLE `musica` (
  `id` int(11) NOT NULL,
  `id_cd` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `idProduto` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `preco` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`idProduto`, `nome`, `preco`) VALUES
(1, 'Carteira', '10.00'),
(2, 'Sapato', '89.90'),
(3, 'Bolsa', '64.75');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cd`
--
ALTER TABLE `cd`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `festa`
--
ALTER TABLE `festa`
  ADD PRIMARY KEY (`idFesta`);

--
-- Índices para tabela `musica`
--
ALTER TABLE `musica`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_cd` (`id_cd`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`idProduto`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cd`
--
ALTER TABLE `cd`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `festa`
--
ALTER TABLE `festa`
  MODIFY `idFesta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `musica`
--
ALTER TABLE `musica`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `idProduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `musica`
--
ALTER TABLE `musica`
  ADD CONSTRAINT `id_cd_fk` FOREIGN KEY (`id_cd`) REFERENCES `cd` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
