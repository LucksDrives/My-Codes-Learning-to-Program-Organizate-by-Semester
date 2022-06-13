<?php
/*----------------------------------------------------------------------------------------------------------*/

	/*Realizar conexão*/
																													
	$servidor = 'localhost'; // Servidor Hospedado
	$usuario = 'root'; // Usuário do Mysql
	$senha = ''; // Senha
	$bancoDados = 'cidade'; // Nome do Banco de Dados
	
	$conexao = mysqli_connect($servidor, $usuario, $senha,$bancoDados); // Código para Estabeler a conexão			
	
/*----------------------------------------------------------------------------------------------------------*/
	
	/*Apagar Valores da Tabela*/
	
	$id = filter_input(INPUT_GET, 'id', FILTER_SANITIZE_NUMBER_INT);
	
	$sql="DELETE FROM cidade WHERE idcidade='$id'";
		
	$res = mysqli_query($conexao,$sql);
	
/*----------------------------------------------------------------------------------------------------------*/

	/*Realizar Redirecionamento*/
	
	header("Location: avaliacao.php");
	
/*----------------------------------------------------------------------------------------------------------*/	
?>