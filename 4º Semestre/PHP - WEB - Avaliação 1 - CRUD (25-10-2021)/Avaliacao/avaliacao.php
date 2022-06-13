<?php //Abertura do PHP
/*----------------------------------------------------------------------------------------------------------*/ 

/*Título e Informações do Projeto*/

print('<h2>Avaliação 1 - Desenvolvimento Web II</h2>

<br><strong>|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|</strong><br>

<br>•Crie uma página "listaCidade.php" que exibe o nome e fotos das cidades (armazenadas na tabela cidade).<br> 

<br>•Ao pedir para inserir, as imagens devem ser armazenadas na pasta “cidades” e seu nome deve ser o “idcidade” <br>
(por exemplo, para a cidade que possui idcidade = 3, o nome do arquivo será "3.png"). Ainda, somente imagens PNG poderão ser aceitas.<br> 

<br>•Ao clicar em deleta, o link será direcionado ao “formCidade?acao = deleta&idcidade = X”, sendo X o id da cidade.<br>');

print('<br><strong>|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|</strong><br>');
/*----------------------------------------------------------------------------------------------------------*/

	/*Realizar conexão*/
																													
	$servidor = 'localhost'; // Servidor Hospedado
	$usuario = 'root'; // Usuário do Mysql
	$senha = ''; // Senha
	$bancoDados = 'cidade'; // Nome do Banco de Dados
	
	$conexao = mysqli_connect($servidor, $usuario, $senha,$bancoDados); // Código para Estabeler a conexão			
	
/*----------------------------------------------------------------------------------------------------------*/
	
	/*Testar Funcionalidade da Conexão*/																			
	
	print('<br>Situação da Conexão: '); //Printar Situação da Conexão
	
	if(mysqli_connect_errno()){ //Verificação do Funcionamento - Caso Não Efetue a Conexão Corretamente
		print('Conexão com Problemas<br>'); //Print de Conexão Não Estabelecida
	}
	else{ //Verificação do Funcionamento - Caso Efetue a Conexão Corretamente
		echo "Conexão Realizada com Sucesso<br>"; //Print de Conexão Estabelecida
	}																												

	print('<br><strong>|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|</strong><br>');

/*----------------------------------------------------------------------------------------------------------*/
	
	/*Criação da Tabela das Cidades*/
	
	print('<HTML><HEAD></HEAD><BODY><table border="1">'); // Abertura do Html
	
	print('<h2>Cidades</h2>'); // Título da Tabela
	
	print('<button onclick="Botao1(\'bt_1\',\'pe_1\')" id="bt_1">Inserir→&nbsp;</button><br>'); // Botão para Mostrar Formulário de Inserção
	
	//Script de Ocultar e Mostar Formulario de Inserção
	print('<script type="text/javascript">
	function Botao1(id,p){
		var bt = document.getElementById(id);
		var par = document.getElementById(p);
		
		if(bt.innerText == \'Inserir\xa0↓\xa0\') {
			bt.innerText = \'Inserir\xa0→\xa0\';
			par.style.display = \'none\';
		}
		else{
			bt.innerText = \'Inserir\xa0↓\xa0\';
			par.style.display = \'block\';
		}
	}
	</script>');
	
	// Formulário de Insersão
	print('
	<p id="pe_1" style="display:none;">	
	<form method="POST" action="inserir_cidades.php" enctype="multipart/form-data">
	<label>Nome&nbsp;&nbsp;&nbsp;&nbsp;</label>	<input type="text" name="nome" placeholder="Nome da Cidade" style="width: 112px;"required><br>
	<label>Arquivo </label>	<input type="file" name="imagem">
	<br><br><input type="submit" name="enviar" value="Enviar"></form></p>'); 
	
	// Título da Tabela
	print('<tr>');
	print('<th> Id </th><th> Nome </th><th> Foto </th><th> Ação </th>');
	print('</tr>');	

	$sql = "select * from cidade";

	$res = mysqli_query($conexao,$sql);
	
	//Armazenar Valores na Tabela
	while($cidade = mysqli_fetch_array($res)){
	$id = $cidade['idcidade'];
	print('<tr>');
	print('<td>' . $cidade['idcidade'] . '</td>');
	print('<td>' . $cidade['nome'] . '</td>');
	print('<td><img src="cidades/'.$cidade['imagem'].'" width="100px"></img></td>');
	echo "<td><a id='a' href='deletar_cidade.php?id=" . $cidade['idcidade'] . "'onClick='a_onClick()'>Deletar</a></td>"; // Botão para Mostrar Formulário de Inserção
}

	//Alerta de Cidade Deletada
	print('<html><head></head><body><script type="text/javascript">
	function a_onClick() {
		alert(\'Cidade Deletada!\');
	}
	</script></body></html>');
	
	print('</table></BODY></HTML>'); // Fechamento do Html
	
/*----------------------------------------------------------------------------------------------------------*/
?>