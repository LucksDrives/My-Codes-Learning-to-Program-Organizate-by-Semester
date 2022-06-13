<?php

/*Exercicio 1*/ print ('<strong>|------------------------------Exercício 1------------------------------|</strong><br>');

print('<strong>[1]</strong> Site da escola para aluno e professor. Uma escola deseja implementar um site que terá acesso restrito a
algumas páginas. Existem dois tipos de usuários: aluno e professor. Os dois usuários acessam o sistema
através de um formulário único, que contém os campos de “login”, “senha” e um botão de submissão.
Desenvolva a página “verifica.php” que recebe os dados desse formulário e, conforme o tipo de usuário,
redireciona-o para a página de acesso restrito correspondente. Veja os dados adicionais:<br>');

print('<br><br><br><br>');


/*Exercicio 2*/ print ('<strong>|------------------------------Exercício 2------------------------------|</strong><br>');

print('<strong>[2]</strong> Período de permanência. Um site deseja que, quando o usuário sair do sistema, seja mostrado o tempo
que ele permaneceu conectado. Ou seja, a diferença entre o horário que ele fez o login até o momento em
que saiu. Sabendo isso, qual(is) comando(s) você adicionaria às páginas:<br>');

print('“verifica.php”: para que o tempo inicial seja gravado<br>');

print('“sair.php”: para que calcule o tempo de permanência na página e o exiba<br>');

print('Considere que as demais implementações (verificação de senha e criação dos mecanismos de acesso
restrito) já estejam feitas.<br>');

print('<br><br><br><br>');


/*Exercicio 3*/ print ('<strong>|------------------------------Exercício 3------------------------------|</strong><br>');

print('<strong>[3]</strong> Cadastro de festas. Conforme o formulário e a tabela a seguir, crie a página formFesta.html contendo o
formulário HTML, e a página insereFesta.php para inserir os dados do formulário na tabela festa. A tabela
festa já existe no banco de dados em anexo.<br>');

print('<br><br><br><br>');


/*Exercicio 4*/ print ('<strong>|------------------------------Exercício 4------------------------------|</strong><br>');

print('<strong>[4]</strong> Consultas de festas. Considerando a tabela festa, implemente as duas páginas a seguir. Cada página
realiza uma consulta SQL na tabela.<br>');

print('• Na página festasFuturas.php, são apresentadas as festas cujas datas são posteriores à data atual.
A ordenação deve ser por data mais recente, seguido do nome da cidade e do nome da festa.
Utilize uma estrutura de tabela para mostrar os dados.<br>');

$conexao = mysqli_connect('localhost','root','','lista4');

if(mysqli_connect_errno()){
	print('<br>Problemas na Conexao<br>');
}

print('<HTML>
<HEAD>
</HEAD>
<BODY>
<button id="1" onClick="reply_click(this.id)">Festas Futuras</button>');

print('<script type="text/javascript">
  function reply_click(clicked_id){
	  alert("Festas Futuras: ");
  }
</script>');

print('<br><br>• Na página cidadesFestas.php, são apresentados os nomes das cidades e a quantidade total de
festas por cidade. A ordenação deve ser por quantidade, de maior para menor, seguido de ordem
alfabética do nome da cidade. Utilize a estrutura de tabela para mostrar os dados.
<br>');

print('<button id="1" onClick="reply_click(this.id)">Festas Cidades</button>');




print('<script type="text/javascript">
  function reply_click(clicked_id){
      alert("Festas da Cidade: ");
  }
</script>');

print('
</BODY>
</HTML>');

print('<br><br><br><br>');


/*Exercicio 5*/ print ('<strong>|------------------------------Exercício 5------------------------------|</strong><br>');

print('<strong>[5]</strong> Cadastro de CDs. Baseado no formulário a seguir (cd.html) e nas tabelas (cd e musica), desenvolva o
cadastro (inserção) de CDs no banco de dados (insereCd.php). Considere que as colunas id sejam de
autoincremento. As tabelas já existem no banco de dados em anexo.<br>');

print('<br><br><br><br>');


/*Exercicio 6*/ print ('<strong>|------------------------------Exercício 6------------------------------|</strong><br>');

print('<strong>[6]</strong> Reajuste dos preços. Uma página PHP deve exibir os dados do produto e o preço, armazenados na tabela
produto. Para cada produto, será possível dar 10%, 15% ou 20% de desconto. Logo, ao clicar no link de um
desconto, altere o preço na tabela conforme o respectivo desconto. A tabela produto já existe no banco de
dados em anexo.<br>');

$conexao = mysqli_connect('localhost','root','','lista4');

if(mysqli_connect_errno()){
	print('<br>Problemas na Conexao<br>');
}

if(isset($_GET['id']) and isset($_GET['desconto'])){
	$id = $_GET['id'];
	$reajuste = 1-($_GET['desconto']/100);
	
	$sql = "update produto set preco = (preco * $reajuste) where idProduto = $id";
		
	$res = mysqli_query($conexao,$sql);
}

print('<HTML>
<HEAD>
</HEAD>
<BODY>');

print('<p><strong>Tabela de Desconto</strong></p>
<table border="1" cellspacing="0" cellpadding="5"
<tr>
<th>Produto</th>
<th>Preço</th>
<th>Descontos</th>
</tr>');

$sql = "select idProduto, nome, preco from produto";

$res = mysqli_query($conexao,$sql);

while($produtos = mysqli_fetch_array($res)){
	$id = $produtos['idProduto'];
	print('<tr>');
	print('<td>' . $produtos['nome'] . '</td>');
	print('<td>' . $produtos['preco'] . '</td>');
	print('<td><a href="lista4.php?id='.$id.'&desconto=10">10%</a>');
	print(' <a href="lista4.php?id='.$id.'&desconto=15">15%</a>');
	print(' <a href="lista4.php?id='.$id.'&desconto=30">30%</a></td></tr>');
}

print('</table>
</BODY>
</HTML>');

print('<br><br><br><br>');

?>