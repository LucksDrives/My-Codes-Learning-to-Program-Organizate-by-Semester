/*A partir do banco de dados “ifrs”, faça o que se pede em cada questão:*/

/*1. Devido ao afastamento do docente Charles Babbage para cursar um mestrado, foi necessário realizar a contratação
de uma docente substituta para ministrar a(s) disciplina(s) vinculada(s) a ele no período letivo de 2020/1. A docente Carol
Shaw, que possui Mestrado, foi contratada e iniciou suas atividades em 01/03/2020. Realize os comandos necessários para:*/

/*A. fazer a inclusão da docente substituta no cadastro de docentes.*/

	/*Consulta das Informações do Docente Charles Baddage*/
		Select id_docente, nome, titulacao, ingresso
		From docente
		Where nome = 'Charles Babbage'
		order by id_docente DESC;

	/*Inserção da nova Docente Carol Shaw*/
		insert into docente(id_docente, nome, titulacao, ingresso)
		values('99','Carol Shaw', 'Mestrado', '2020-03-01');

/*B. vincular a docente substituta à(s) disciplina(s) ministrada(s) até então pelo docente Charles Babbage, somente no período
letivo de 2020/1.*/

	/*Consulta das Informações das Disciplinas*/
		Select id_disciplina, nome, semestre, ch, id_curso
		From disciplina
		order by id_disciplina DESC;

	/*Consulta das Informações das Turmas*/
		Select id_turma, id_disciplina, id_docente, id_periodo_letivo
		From turma
		order by id_disciplina DESC;
	
	/*Consulta das Informações dos Periodos Letivos*/
		Select id_periodo_letivo, descricao
		From periodo_letivo;
		
	/*Disciplinas que o docente Charles Baddage Leciona
		29 = Contabilidade;
		28 = Matemática Financeira;
		27 = Aspectos Econômicos da Gestão;*/
	  
	/*Insersão da Docente Carol Shaw nas Disciplinas e Substituição do Docente Charles Babbage*/
		update turma
		set id_docente = '99'
		where id_docente = '9' AND id_periodo_letivo = '3';
		


/*2. Um dos relatórios necessários ao sistema é a listagem de disciplinas e docentes em cada período letivo, para
determinada condição. Faça o comando para elaborar esta listagem, mostrando o nome da disciplina, a descrição do
respectivo período letivo e o nome do docente responsável, somente para as disciplinas que são do 1º semestre da matriz
dos cursos. Não confunda o período letivo com o semestre de cadastro da disciplina em relação à matriz curricular. Mostre a
listagem ordenando alfabeticamente pelo nome da disciplina e pelo período letivo.*/
		
	/*Consulta as Informações Requisitadas*/
		Select disciplina.nome, descricao, docente.nome AS nome_docente
		From disciplina, periodo_letivo, docente
		Where semestre = '1'
		order by disciplina.nome, id_periodo_letivo ASC;
	

/*3. O sistema acadêmico do IFRS precisa mostrar a quantidade de alunos em cada um dos cursos cadastrados no banco
de dados. Faça o comando para atender a esta solicitação, mostrando o nome do curso e a quantidade de alunos. Lembre-se
que os alunos se repetem, pois estão em várias turmas de um mesmo curso.*/
	
	/*Consulta as Disciplinas*/
		Select id_disciplina, nome
		From disciplina;
		
	/*Consulta as Turmas*/
		Select id_turma, id_disciplina, id_docente, id_periodo_letivo
		From turma
			
	/*Consulta os Alunos*/
		Select nro_matricula, nome, cpf, telefone, id_aluno
		From aluno;

	/*Consulta as Matriculas*/
		Select id_aluno, id_turma, frequencia, id_matricula, nota
		From matricula;
		Where id_aluno

	/*Verificação da Quantidade de Alunos*/
		Select COUNT(aluno.id_aluno) AS quantidade
		From aluno

	/*Verificação da Quantidade de Cursos*/
		SELECT Count(curso.id_curso) AS quantidade
		FROM curso
    	ORDER BY quantidade DESC; 

	/*Consultar a Quantidade de Alunos para Cada Curso*/
		SELECT curso.nome, COUNT(distinct aluno.id_aluno) AS quantidade
		FROM aluno
		INNER JOIN matricula ON (aluno.id_aluno = matricula.id_aluno)	
		INNER JOIN turma ON (matricula.id_turma = turma.id_turma)		
		INNER JOIN disciplina ON (turma.id_disciplina = disciplina.id_disciplina)
		INNER JOIN curso ON (disciplina.id_curso = curso.id_curso)		
		GROUP BY curso.nome
    	ORDER BY quantidade DESC;


/*4. Com a intenção de medir o índice de aproveitamento das disciplinas do curso de Tecnologia em Processos Gerenciais,
é necessário verificar a média das notas e a frequência global dos alunos nas disciplinas do referido curso, por período letivo.
Faça o comando para mostrar o nome da disciplina, a descrição do período letivo, a média geral das notas e a frequência
global (média da frequência) para o referido curso, somente para a situação onde as disciplinas apresentaram índices de
aproveitamento positivos: média geral das notas igual ou superior a 7.0 e frequência global igual ou superior a 75.*/
	
	/*Listar Índices das Disciplinas SEM Períodos Letivos*/	
		SELECT disciplina.nome, AVG(matricula.nota) AS media_nota, AVG(matricula.frequencia) AS media_frequencia
		FROM matricula
		INNER JOIN turma ON (matricula.id_turma = turma.id_turma)	
		INNER JOIN disciplina ON (turma.id_disciplina = disciplina.id_disciplina)
		GROUP BY disciplina.nome
		HAVING AVG(matricula.nota) >= '7' AND AVG(matricula.frequencia) >= '75';

	/*Listar Índices das Disciplinas COM Períodos Letivos*/	
		SELECT disciplina.nome, periodo_letivo.descricao, AVG(matricula.nota) AS media_nota, AVG(matricula.frequencia) AS media_frequencia
		FROM periodo_letivo, matricula
		INNER JOIN turma ON (matricula.id_turma = turma.id_turma)	
		INNER JOIN disciplina ON (turma.id_disciplina = disciplina.id_disciplina)
		GROUP BY disciplina.nome, periodo_letivo.descricao
		HAVING AVG(matricula.nota) >= '7' AND AVG(matricula.frequencia) >= '75';


/*5. Solicitou-se que o sistema apresente a listagem de alunos com o pior desempenho acadêmico por disciplina nos
cursos. Para tanto, baseado na menor nota por disciplina registrada no banco de dados, faça uma listagem mostrando o
nome do curso, o nome da disciplina, o nome do aluno e a nota do(s) aluno(s) que se enquadra(m) nesta situação
(eventualmente pode existir mais de um aluno por disciplina com a mesma nota mais baixa naquela disciplina). Mostre a
listagem ordenando alfabeticamente pelo nome do curso, da disciplina e do aluno.*/	
		
	/*Listar Todas as Notas por disciplinas nos cursos*/
		SELECT curso.nome AS curso, disciplina.nome AS disciplinas, aluno.nome AS alunos, matricula.nota
		FROM curso	
		INNER JOIN disciplina ON (curso.id_curso = disciplina.id_curso)
		INNER JOIN turma ON (disciplina.id_disciplina = turma.id_disciplina)	
		INNER JOIN matricula ON (turma.id_turma = matricula.id_turma)	
		INNER JOIN aluno ON (matricula.id_aluno = aluno.id_aluno)
		GROUP BY curso.nome, disciplina.nome, aluno.nome, matricula.nota
		ORDER BY curso.nome, disciplina.nome, aluno.nome;

	/*Listar os Piores Desempenhos Acadêmicos por Disciplina nos Cursos*/
		SELECT curso.nome AS curso, disciplina.nome AS disciplinas, aluno.nome AS alunos, matricula.nota
		FROM curso	
		INNER JOIN disciplina ON (curso.id_curso = disciplina.id_curso)
		INNER JOIN turma ON (disciplina.id_disciplina = turma.id_disciplina)	
		INNER JOIN matricula ON (turma.id_turma = matricula.id_turma)	
		INNER JOIN aluno ON (matricula.id_aluno = aluno.id_aluno)	
		GROUP BY curso.nome, disciplina.nome, aluno.nome, matricula.nota
		HAVING matricula.nota = MIN(matricula.nota)
		ORDER BY curso.nome, disciplina.nome, aluno.nome;