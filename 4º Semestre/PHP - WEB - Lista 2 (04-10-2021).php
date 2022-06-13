<?php

print('<h1>Lista 2</h1>');

/*Exercicio 1*/ print ('<strong>|------------------------------Exercício 1------------------------------|</strong><br>');

print('<strong>[1]</strong> Cálculo de custo de um carro. O custo de um carro novo ao consumidor é a soma do custo de fábrica
com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o
percentual do distribuidor seja de 28% e os impostos de 45%, escreva um programa que receba o valor do
custo de fábrica de um carro via GET, calcule e escreva o custo final ao consumidor.<br>');

$PercDistribuidor = 29;
$PercImpostos = 47;
$CustoFabrica = 50.0;
$ValorDistribuidor = 0.0;
$ValorImpostos = 0.0;
$CustoConsumidor = 0.0;

print('<br>Valor de Custo de Fabrica: '.$CustoFabrica);

$ValorDistribuidor = $CustoFabrica + ($CustoFabrica * $PercDistribuidor / 100);

$ValorImpostos = $CustoFabrica + ($CustoFabrica * $PercImpostos / 100);

$CustoConsumidor = $CustoFabrica + $ValorDistribuidor + $ValorImpostos;

print('<br><br>Custo ao Consumidor: ' .$CustoConsumidor);

print('<br><br><br><br>');


/*Exercicio 2*/ print ('<strong>|------------------------------Exercício 2------------------------------|</strong><br>');

print('<strong>[2]</strong> Cálculo de comissão de vendas. Uma revendedora de carros usados paga a seus funcionários vendedores
um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das
vendas por eles efetuadas. Escreva um programa que receba por GET o número de carros vendidos pelo
vendedor, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e
escreva o salário final do vendedor.<br>');

$numcarrosvend = 5.0;
$totalvenda = 500.0;
$salariofixo = 200.0;
$comissao = 20.0;
$salariofinal = 0.0;

print('<br>Salário Fixo: '.$salariofixo);

print('<br>Total de Vendas: '.$totalvenda);

print('<br>Número de Carros Vendidos: '.$numcarrosvend);

print('<br>Comissão em Reis: '.$comissao);

$salariofinal = ($numcarrosvend * $comissao) + ($totalvenda * 0.05) + $salariofixo;

print('<br>Salário final: '.$salariofinal);

print('<br><br><br><br>');


/*Exercicio 3*/ print ('<strong>|------------------------------Exercício 3------------------------------|</strong><br>');

print('<strong>[3]</strong> Cálculo de custo de compra de maçãs. Se compradas em quantidade inferior a uma dúzia, as maçãs
custam R$ 1,30 cada, e, caso compradas a partir de 12, o preço se torna R$ 1,00. Escreva um programa que
receba por GET o número de maçãs compradas, calcule e escreva o custo total da compra.<br>');

$qtmacans = 13;
$precomacans = 0.0;

print('<br>Quantidade de Maçãs Compradas: '.$qtmacans);

if($qtmacans < 12){
	$precomacans = $qtmacans * 0.30;
	print('<br>Deverá Pagar: '.$precomacans);
}
else {
	$precomacans = $qtmacans * 0.25;
	print('<br>Deverá Pagar: '.$precomacans);
}

print('<br><br><br><br>');


/*Exercicio 4*/ print ('<strong>|------------------------------Exercício 4------------------------------|</strong><br>');

print('<strong>[4]</strong> Soma. Considere que você tem uma página chamada “soma.php” que recebe uma variável “numeros”
via GET. Esses números são informados por meio de uma string e separados por vírgula; por exemplo:
soma.php?numeros = 1,46,7,9. Desenvolva a página soma.php que deverá receber os números, separá-los,
somá-los e apresentar o resultado da soma na tela.<br>');

$numRecebidos = "1, 5, 7";
$somaRecebidos = 0.0;

print('<br>Números Recebidos: ' .$numRecebidos);

$somaRecebidos = 1 + 5 + 7;

print('<br>Soma dos Números: ' .$somaRecebidos);

print('<br><br><br><br>');


/*Exercicio 5*/ print ('<strong>|------------------------------Exercício 5------------------------------|</strong><br>');

print('<strong>[5]</strong> Exibindo nome dos alunos conforme letra inicial. Considere que você tem uma página chamada
“alunos.php” que contém um array $alunos com o nome de vários alunos. Essa página, quando recebe por
GET a variável letra, exibirá apenas os nomes dos alunos em ordem alfabética, cuja inicial é a letra. Se não
houver alunos com a letra informada, a página deverá exibir a mensagem: “Não há alunos com a letra *”.
Se a variável letra não for informada, a página deverá exibir a mensagem: “É necessário informar a letra”.<br><br>');

$alunos = array('Beatriz','Rodrigo','Ana','Bruno','Rboerto');

sort($alunos);

if(isset($_GET['letra'])){
	$qtd = 0;
	
	foreach($alunos as $a) {
		if(strtoupper($_GET['letra']) == strtoupper(substr($a,0,01)) ) {
			$qtd++;
			print($qtd . '- ' . $a . '<br>');
		}
	}

	if($qtd == 0) {
		print('Não Existem alunos com a letra ' . strtoupper($_GET['letra']));
	}
}
	else {
			print('Uma Letra Precisa ser Informada');
	}		

print('<br><br><br><br>');


/*Exercicio 6*/ print ('<strong>|------------------------------Exercício 6------------------------------|</strong><br>');

print('<strong>[6]</strong> Capitanias hereditárias. Dado um array com nomes das capitanias hereditárias, exiba-os em ordem
ascendente ou descendente. Para isso, dependendo de um valor informado na URL (asc ou desc), os nomes
deverão ser exibidos em ordem alfabética ou em ordem invertida.<br>');

$nomescapher = array ('Maranhão','Ceará','Rio Grande','Itamaracá','Pernambuco','Baía de Todos os Santos','Ilhéus','Porto Seguro','Espírito Santo','São Tomé','São Vicente','Santo Amaro','Santana');

function usortTest($a, $b) {
    var_dump($a);
    var_dump($b);
    return -1;
}

print('<br>');

usort($nomescapher, 'usortTest');

print('<br><br><br><br>');


/*Exercicio 7*/ print ('<strong>|------------------------------Exercício 7------------------------------|</strong><br>');

print('<strong>[7]</strong> Alunos, médias e sexo. Considerando o array a seguir, <br><br>');

$nomealuno1 = 'Pedrinho Mandrak';
$nota1aluno1 = 8.0;
$nota2aluno1 = 6.2;

$nomealuno2 = 'CJ do Morro';
$nota1aluno2 = 10.0;
$nota2aluno2 = 2.0;

$nomealuno3 = 'Aleke Fumaça';
$nota1aluno3 = 4.1;
$nota2aluno3 = 6.5;

$nomealuno4 = 'Marilda Chinelo';
$nota1aluno4 = 0.0;
$nota2aluno4 = 0.1;

$somanotas = 0.0;
$mediaTurma = 0.0;
$qtnotas = 8;

print('[Aluno 1 - '.$nomealuno1.']');

print('<br>Nome do Aluno: '.$nomealuno1);

print('<br>Notas: '.$nota1aluno1.', '.$nota2aluno1);

print('<br><br>');

print('[Aluno 2 - '.$nomealuno2.']');

print('<br>Nome do Aluno: '.$nomealuno2);

print('<br>Notas: '.$nota1aluno2.', '.$nota2aluno2);

print('<br><br>');

print('[Aluno 3 - '.$nomealuno3.']');

print('<br>Nome do Aluno: '.$nomealuno3);

print('<br>Notas: '.$nota1aluno3.', '.$nota2aluno3);

print('<br><br>');

print('[Aluno 4 - '.$nomealuno4.']');

print('<br>Nome do Aluno: '.$nomealuno4);

print('<br>Notas: '.$nota1aluno4.', '.$nota2aluno4);

print('<br><br>');

print('<strong>a)</strong> Mostre a média da turma.<br>');

$somanotas = ($nota1aluno1 + $nota2aluno1) + ($nota1aluno2 + $nota2aluno2) + ($nota1aluno3 + $nota2aluno3) + ($nota1aluno4 + $nota2aluno4);

$mediaTurma = $somanotas / $qtnotas;

print('<br>Soma das Notas da da Turma: '.$somanotas);

print('<br>Média das Notas da Turma: '.$mediaTurma);

print('<br><br><br><br>');


/*Exercicio 8*/ print ('<strong>|------------------------------Exercício 8------------------------------|</strong><br>');

print('<strong>[8]</strong> Peso ideal. Sabendo que a fórmula para calcular o peso ideal é:
• para mulheres: (62.1 * altura) – 44.7;
• para homens: (72.2 * altura) – 58;
Faça uma função em PHP que recebe o sexo e a altura de uma pessoa e retorne o peso ideal. <br><br>');

function peso($sexo, $altura) {
	
	if(strtoupper($sexo) == 'M') {
		return ( (72.2*$altura) - 58);
	}
	elseif(strtoupper($sexo) == 'F') {
		return ( (62.1*$altura) - 44.7);
	}
	else{
		return ('Erro: Informe M ou F para Sexo');
	}
}	

print ('<br>Peso Ideal de um Homem de 1,80m é: ' . peso('m', 1.90) . 'kg');

print ('<br>Peso Ideal de uma Mulher de 1,65m é: ' . peso('f', 1.65) . 'kg');

print('<br><br><br><br>');