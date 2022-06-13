/*5. Registre, para a unidade 47 da frota da empresa, um aluguel realizado no dia 25/02/2020. Sabese que o automóvel marcava a quilometragem de 23678 km quando foi retirado e 24065 km ao
ser devolvido. O cliente responsável pelo aluguel foi o sr. “Alberto Roberto”, residente na “Rua
Chico Anysio nº 1000” e que possui o seguinte contato telefônico “54 34372300” (faça as
inserções adicionais necessárias para que a informação fique completa).
*/

insert into cliente (cod_cliente, nome_cliente, telefone, endereco)
values('12345629','Alberto Roberto', '54 34372300', 'Rua chico anysio n 1000');

insert into Aluguel (numero, cod_cliente, cod_unidade, data_ret, data_dev, km_inicial, km_final)
values('2','12345629', '47','2020-02-25','2020-03-30','23678','20');