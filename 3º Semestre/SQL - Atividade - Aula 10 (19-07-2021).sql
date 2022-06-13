/*EXERCÍCIOS – VIEWS, ÍNDICES E TRANSAÇÕES*/

/*1. Crie a view “tads3semestre” para mostrar o nome, nº de matrícula e telefone de contato
somente dos alunos do curso TADS que estão matriculados em disciplinas que pertencem ao 3º
semestre do curso no período letivo de 2020/1.*/

CREATE VIEW tads3semestre AS
SELECT nome, nro_matricula, telefone
FROM aluno
WHERE curso.nome = 'TADS' AND disciplina.semestre = '3' AND periodo_letivo.id_periodo_letivo = '3'
WITH CASCADED CHECK OPTION;

/*2. De maneira similar, faça a view “tpg1semestre” para mostrar o nome, nº de matrícula e
telefone de contato somente dos alunos do curso TPG que estão matriculados em disciplinas que
pertencem ao 1º semestre do curso no período letivo de 2020/1.*/

CREATE VIEW tads3semestre AS
SELECT nome, nro_matricula, telefone
FROM aluno
WHERE curso.nome = 'TPG' AND disciplina.semestre = '1' AND periodo_letivo.id_periodo_letivo = '3'
WITH CASCADED CHECK OPTION;

/*3. Faça a view “matrizTPG” para formar a matriz curricular do curso TPG, mostrando o semestre, o
nome e a carga horária das disciplinas. A matriz deve ser formada ordenando-se as disciplinas por
semestre.*/

CREATE VIEW matrizTPG AS
SELECT semestre, nome, ch
FROM disciplina
ORDER BY matricula.semestre;

/*4. Crie a view “reprovacoesTADS” para mostrar a quantidade de reprovações em cada uma das
disciplinas do curso TADS, por período letivo. Mostre o nome e o semestre da disciplina, o período
letivo em questão, o nome do docente responsável e o número de reprovações. A lista de
reprovações deve ser ordenada de maneira decrescente em relação ao nº de reprovações. Para
reprovar, a média deve ser menor do que 7.0 ou a frequência deve ser menor do que 75.0.*/

CREATE VIEW reprovacoesTADS AS
SELECT disciplina.nome, disciplina.semestre, periodo_letivo.descricao, docente.nome
FROM disciplina, periodo_letivo, docente
WHERE disciplina.nome = 'TADS'
ORDER BY DESC num_reprovacoes;

/*5. Elabore a view “mediasTPG” para elencar as notas e frequências médias das disciplinas do curso
TPG durante o período letivo 2019/2. Para tanto, mostre o nome da disciplina, o nome do docente
responsável e as duas médias calculadas. É importante que o resultado seja ordenado pela média
de nota.*/

CREATE VIEW mediasTPG AS
SELECT disciplina.nome, docente.nome
FROM disciplina, docente
WHERE disciplina.nome = 'TPG'
ORDER BY media_nota;

/*6. Cite e explique como funcionam 3 tipos de indexação possíveis de utilização em bancos de
dados.*/


/*7. Em SQL, especificamos níveis de isolamento de transações para evitar 3 problemas ou violações
que ocorrem em transações simultâneas. Cite e explique estes 3 fenômenos.*/


/*8. Quais os 4 níveis de isolamento de transações existentes em SQL? Explique como eles se
relacionam entre si e como evitam, ou não, os 3 fenômenos da questão anterior.*/