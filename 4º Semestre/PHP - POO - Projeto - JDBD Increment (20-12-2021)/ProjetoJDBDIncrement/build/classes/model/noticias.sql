-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01-Set-2019 às 17:53
-- Versão do servidor: 10.3.16-MariaDB
-- versão do PHP: 7.1.30

--
-- Banco de dados: `noticias`
--

-- --------------------------------------------------------|

/*Tabela de Criação da Tabela dos noticias*/

CREATE TABLE `estoque_control` (

  `numero_galpao` int PRIMARY KEY AUTO_INCREMENT,
  
  `nome_galpao` varchar(100) NOT NULL

) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `noticias` (

  `idnoticias` int PRIMARY KEY AUTO_INCREMENT,

  `nome` varchar(100) NOT NULL,
  
  `quantidade` int NOT NULL,
  
  `imagem` varchar(100) NOT NULL,
  
  `descricao` varchar(2000) NOT NULL,
  
  `numero_galpao` int NOT NULL,
  
  constraint fk_codigo_estoque_control
   
  FOREIGN KEY (numero_galpao) REFERENCES estoque_control (numero_galpao) 

) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------|

/*Inserção de Testes [Estoques]*/

insert into estoque_control (numero_galpao, nome_galpao)
values('1','Nova Prata');

insert into estoque_control (numero_galpao, nome_galpao)
values('2','Caxias');

insert into estoque_control (numero_galpao, nome_galpao)
values('3','Veranópolis');

-- --------------------------------------------------------|

/*Inserção de Testes [noticias]*/

insert into noticias (idnoticias, nome, imagem, quantidade, descricao, numero_galpao)
values('1','Como seria uma sequência do filme do Mario?', '1.png', '14.15', 'Quando foi anunciado que teríamos uma versão live-action de Super Mario Bros para os cinemas, os fãs ficaram curiosos sobre como seria feita a adaptação dos jogos para as telonas. No entanto, quando o filme foi lançado em 1993, acabou não sendo bem recebido pela crítica e pelo público. Antes do filme chegar aos cinemas, já haviam conversas para que a produção ganhasse uma continuação, entretanto, devido à recepção negativa, a sequência do filme protagonizado pela dupla Bob Hoskins e John Leguizamo nunca viu a luz do dia.', '1');

insert into noticias (idnoticias, nome, imagem, quantidade, descricao, numero_galpao)
values('2','Filme de Super Mario Bros. da Illumination será lançado em 2022', '2.png', '11.03', 'O nosso encanador mais querido do universo dos games estreará em seu próprio filme. A Nintendo anunciou que está trabalhando em uma parceria com a Illumination Entertainment para fazer um filme de Super Mario Bros. Ela revelou que a data do filme está prevista para 2022', '2');

insert into noticias (idnoticias, nome, imagem, quantidade, descricao, numero_galpao)
values('3','Partida de Super Mario a 380 mil fps mostra toda a magia de uma TV de tubo', '3.png', '12.00', 'Ah, as saudosas TVs de tubo, onde a maioria de nós cresceu assistindo a filmes e jogando nossos antigos consoles. A tecnologia dos televisores mudou muito de lá para cá, trazendo imagens cristalinas e com resolução gigantesca, mas ainda tem gente que faz questão de matar a saudade dos aparelhos mais antigos, inclusive até pagando caro por modelos antigos. E para entender como é a magia por traz das TVs de tubo e como elas trabalham de maneira diferente das novas televisões de 4K, o canal The Slow Mo Guys do YouTube resolveu registrar o funcionamento de cada uma delas da maneira que melhor sabem fazer: com cenas em câmera lenta de até 380 mil frames por segundo. Para se ter uma ideia, filmes comuns são registrados em 24 frames por segundo e os jogos mais avançados podem ser apreciados em 60 frames por segundos.', '3');

insert into noticias (idnoticias, nome, imagem, quantidade, descricao, numero_galpao)
values('4','Fãs de Super Mario estão em pânico com rumores de que o personagem vai "morrer"', '4.png', '10.30', 'A Nintendo (NTDOF), dona da franquia, também lançou outros produtos Super Mario para o 35º aniversário, que também estariam à venda somente até a data. Os fãs têm se esforçado para entender por que as vendas dos novos produtos acabam na quarta-feira, uma data que muitos consideram arbitrária. Foi então que começou uma especulação de que a vida de Mario também estaria acabando.', '1');

insert into noticias (idnoticias, nome, imagem, quantidade, descricao, numero_galpao)
values('5','Internet crava morte do Mario nesta quarta', '5.png', '13.21', 'Dentre eles, estavam os anúncios de Super Mario 3d World + Bowsers Fury, Super Mario 3D All-Stars, a coletânea dos jogos 3D do personagem (Super Mario 64, Super Mario Sunshine e Super Mario Galaxy), Super Mario Bros. 35 (uma espécie de battle royale online) e Game & Watch: Super Mario Bros. Pois bem, acontece que a Nintendo achou que seria uma boa ideia fazer com que alguns dos jogos fossem lançados temporariamente, como é o caso de Super Mario 3D All-Stars, Super Mario Bros. 35, Game & Watch: Super Mario Bros. Quem comprou, comprou; quem não comprou, dançou e tem até hoje, quarta (31) para garantir o seu antes que o título desejado desapareça da Nintendo eShop e se torne raridade no mercado.', '2');

