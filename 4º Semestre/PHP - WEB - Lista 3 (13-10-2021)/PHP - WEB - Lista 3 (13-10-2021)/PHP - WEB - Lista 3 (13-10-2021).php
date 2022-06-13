<?php

print('<h1>Lista 3</h1>');

/*Exercicio 1*/ print ('<strong>|------------------------------Exercício 1------------------------------|</strong><br>');

print('<strong>[1]</strong>Triângulo. O triângulo é uma figura geométrica que pode ser classificado conforme a proporcionalidade
de seus lados:<br><br>');
print('Equilátero: todos os lados são iguais;<br>
 Isóceles: pelo menos dois lados com a mesma medida;<br>
 Escaleno: as três medidas são diferentes.<br><br>
Faça uma página HTML que contenha um formulário no qual o usuário informará três números que
representam cada um dos lados de um triângulo e determine sua classificação de proporcionalidade.<br>');

print('<HTML>
<HEAD>
</HEAD>
<BODY>');

$dadoinform = filter_input_array(INPUT_POST);

print('<br>
	<p>Descobrir o Tipo do Triângulo:</p>
	<form method="POST">
    <input type="text" name="numero1" placeholder="Informe o Numero 1">
    <input type="e-mail" name="numero2" placeholder="Informe o Numero 2">
	<input type="e-mail" name="numero3" placeholder="Informe o Numero 3">
    <input type="submit" name="calcular" value="Calcular">');

if($dadoinform == NULL){ 
	print('<br><br>[Informações Recebidas]<br>');
	print('<br>Número 1: Não Informado');
	print('<br>Número 2: Não Informado');
	print('<br>Número 3: Não Informado');
}
else{
	print('<br><br>[Informações Recebidas]<br><br>');
	print('Número 1: ');
	var_dump($dadoinform["numero1"]); print('<br>');

	print('Número 2: ');
	var_dump($dadoinform["numero2"]); print('<br>');

	print('Número 3: ');
	var_dump($dadoinform["numero3"]);

	print('<br><br>Tipo do Triângulo: ');

	if(($dadoinform["numero1"] == $dadoinform["numero2"]) && ($dadoinform["numero1"] == $dadoinform["numero3"] )){
		print('Equilátero');
	}
	else if(($dadoinform["numero1"] != $dadoinform["numero2"]) && ($dadoinform["numero1"] != $dadoinform["numero3"]) && ($dadoinform["numero2"] != $dadoinform["numero3"])){
		print('Escaleno');
	}

	else{
		print('Isóceles');
	}
}

print('<br></form>
</BODY>
</HTML>');

print('<br><br><br><br>');


/*Exercicio 2*/ print ('<strong>|------------------------------Exercício 2------------------------------|</strong><br>');

print('<strong>[2]</strong> Exibindo opções de anos no campo select de um formulário. Construa uma página PHP que monte as
opções de uma seleção de um formulário HTML que apresente os anos, iniciando do ano anterior ao
momento do acesso da página até os três anos seguintes. Exemplo: como estamos no ano de 2021, deve
exibir as opções: 2020, 2021, 2022, 2023, 2024.<br>');

print('<br><br>
	<form method="post" action="#">
	<select name="ano">
	<option value="">Escolha o ano</option>');

$ano_ini = date('Y')-1;

for($a=$ano_ini;$a<($ano_ini+5);$a++){
	print('<option value= '. $a . '">' . $a . '</option>');
}

print('</select>
	</form>');

print('<br><br><br><br>');


/*Exercicio 3*/ print ('<strong>|------------------------------Exercício 3------------------------------|</strong><br>');

print('<strong>[3]</strong> Verificação de senha. Dado um formulário POST de login e senha, o qual é submetido à página
verificasenha.php, implemente-a considerando a seguinte regra: se a senha for igual ao login com a
primeira letra em maiúscula, a página deverá mostrar a mensagem “Usuário válido”, caso contrário, exibirá
“Usuário inválido”. Um exemplo de login válido é: se o login for “roger”, a senha deverá ser “Roger”.<br><br>');

print('<HTML>
<HEAD>
</HEAD>
<BODY>');

$arquivouser = fopen('usuarios.txt','r');
$login = array();

if ($arquivouser) {
	while (!feof($arquivouser)) {
		$login[] = (string)fgets($arquivouser);
	}
	fclose($arquivouser);
};

print('Valores do Arquivo:');

print('<br>Login[1]: ');print_r($login[0]); 
print('<br>Login[2]: ');print_r($login[1]); 
print('<br>Login[3]: ');print_r($login[2]); 

print('<br><br>');

$dadologin = filter_input_array(INPUT_POST, FILTER_DEFAULT);

print('<form name="add_msg" method="POST">
Login: <input type="text" name="login"><br>
Senha: <input type="password" name="senha"><br>
<input type="submit" value="Verificar">');

print('<br><br>[Informações Recebida]<br> ');

if($dadologin == NULL){ 
	print('<br>Login: Não Informada');
	print('<br>Senha: Não Informada');
}
else{
	print('Login: ');
	var_dump($dadologin["login"]); print('<br>');

	print('Senha: ');
	var_dump($dadologin["senha"]); print('<br>');
}

print('</form>
</BODY>
</HTML>');


print('<br><br><br><br>');


/*Exercicio 4*/ print ('<strong>|------------------------------Exercício 4------------------------------|</strong><br>');

print('<strong>[4]</strong> Editor de texto. Faça um formulário que receberá o arquivo texto.txt via upload, conforme anexo. A
página PHP que trata o formulário irá exibir outro formulário que conterá um campo textarea, cujo
conteúdo será o texto contido no arquivo texto.txt, e um botão submit. Ao clicar no botão, o texto alterado
deverá ser salvo no arquivo texto.txt.<br>');

print('<HTML>
<HEAD>
</HEAD>
<BODY>');

$arquivotext = fopen('texto.txt','r');
$textoarq = array();

if ($arquivotext) {
	while (!feof($arquivotext)) {
		$textoarq[] = (string)fgets($arquivotext);
	}
	fclose($arquivotext);
};

print('<br>Texto do Arquivo: ');

print_r($textoarq[0]); 

print('</form>
</BODY>
</HTML>');

print('<br><br><br><br>');


/*Exercicio 5*/ print ('<strong>|------------------------------Exercício 5------------------------------|</strong><br>');

print('<strong>[5]</strong> Soma de números em arquivo. Faça uma página PHP que irá ler o arquivo soma.txt, conforme anexo. Essa
página deverá determinar a soma dos números contidos no arquivo.<br><br>');

$arquivo = fopen('soma.txt','r');
$num = array();

if ($arquivo) {
	while (!feof($arquivo)) {
		$num[] = (int)fgets($arquivo);
	}
	fclose($arquivo);
}

print_r($num);

$soma = 0;

foreach($num as $n) {
	$soma += $n;
}

print('<br>Soma: '.$soma);

print('<br><br><br><br>');


/*Exercicio 6*/ print ('<strong>|------------------------------Exercício 6------------------------------|</strong><br>');

print('<strong>[6]</strong> Login em arquivo texto. Faça um formulário HTML que irá conter os seguintes dados do usuário: Nome,
Login e Senha. Quando o formulário for submetido, os dados deverão ser gravados no arquivo usuarios.txt,
conforme anexo. Como o login deve ser uma informação única, é necessário que você verifique se já não há
o login cadastrado. Se houver, exiba a mensagem “o login já existe” e retorne ao formulário com os dados
preenchidos. Caso contrário, adicione os dados do usuário no final do arquivo, separando-os por “;” e
retorne ao formulário vazio.<br>');

print('<br><br><br><br>');


/*Exercicio 7*/ print ('<strong>|------------------------------Exercício 7------------------------------|</strong><br>');

print('<strong>[7]</strong> Conta bancária. Suponha que uma conta bancária possua R$ 215,00 de saldo. Processe o arquivo
conta.txt, em anexo, realizando as operações devidas, considerando os dados assim dispostos:<br><br>
data;operação;descrição;valor.<br><br>
Faça um formulário PHP que receberá o arquivo conta.txt via upload. Ao enviar o arquivo, a página PHP irá
salvar o arquivo com o nome “operacoes.txt”, abrir o arquivo e processá-lo. Se a operação for de crédito
(C), o valor deverá ser somado ao saldo inicial, se for débito (D), deverá ser subtraído. Como resultado, a
página deverá exibir o saldo anterior, as operações realizadas e o saldo atual, utilizando-se uma estrutura
de tabela HTML, formatando corretamente datas e valores monetários. R: R$ 394,60.<br>');

print('<br><br><br><br>');


?>
