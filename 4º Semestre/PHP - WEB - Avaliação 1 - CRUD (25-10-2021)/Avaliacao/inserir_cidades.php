<?php
/*----------------------------------------------------------------------------------------------------------*/
	
	/*Realizar conexão*/
																													
	$servidor = 'localhost'; // Servidor Hospedado
	$usuario = 'root'; // Usuário do Mysql
	$senha = ''; // Senha
	$bancoDados = 'cidade'; // Nome do Banco de Dados
	
	$conexao = mysqli_connect($servidor, $usuario, $senha, $bancoDados); // Código para Estabeler a conexão			
	
/*----------------------------------------------------------------------------------------------------------*/

	/*Inserir Cidades*/
	
	$nome = filter_input(INPUT_POST, 'nome', FILTER_SANITIZE_STRING);
	$nome_imagem = $_FILES['imagem']['name'];
	
	$sql="INSERT INTO cidade (nome, imagem) VALUES ('$nome', '$nome_imagem')";
	
	$res = mysqli_query($conexao,$sql);
	
	$diretorio = 'cidades/'; //Direcitório da Imagem
	
	move_uploaded_file($_FILES['imagem']['tmp_name'], $diretorio.$nome_imagem);
	
/*----------------------------------------------------------------------------------------------------------*/

	/*Realizar Redirecionamento*/
	
	header("Location: avaliacao.php");	
	
/*----------------------------------------------------------------------------------------------------------*/	
?>