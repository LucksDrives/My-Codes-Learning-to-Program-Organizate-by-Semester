/*1. Elabore uma consulta que mostre todos os atributos dos gêneros (genres) cadastrados no IMDb. Faça o
resultado ser exibido em ordem alfabética pelo nome do gênero.*/

Select  genre_id, name, last_updated
From genres;

/*2. Elabore uma consulta que mostre o nº da temporada (season), o nº do episódio (episode), o nome do
episódio e a nota de classificação (episode_rating) dos episódios do programa de TV que possui ‘content_id
= 3’ e que tenham nota de classificação superior a 9.0. Faça o resultado ser exibido ordenado pela nota de
classificação, da maior para a menor.*/

Select  season_num, episode_id, episode_name, episode_rating
From episode_list
where content_id='3' AND episode_rating > 9
order by episode_rating  DESC;

/*3. Elabore uma consulta que mostre o título, a descrição, o nº total de temporadas e o score IMDb dos
conteúdos cadastrados que tenham 5 ou mais temporadas. Faça o resultado ser exibido ordenado pelo
score IMDb, do maior para o menor.*/

Select title, description, total_seasons, imdb_score_votes
From contents
where total_seasons > '5'
order by imdb_score_votes DESC;

/*4. Elabore uma consulta que mostre o título, o tempo de duração (play_time) e o nome do tipo dos
conteúdos cadastrados que se relacionam com o tipo de conteúdo (content_type) de nome ‘Movie’. Faça o
resultado ser exibido em ordem alfabética pelo título do conteúdo.*/

Select title, play_time, content_type
From contents
where content_type = 'Movie'
order by title DESC;

/*5. Elabore uma consulta que mostre o título e o total de episódios dos conteúdos e o nome e a descrição de
cada episódio, somente dos conteúdos cadastrados que tenham menos de 20 episódios ao total. Faça o
resultado ser exibido em ordem alfabética pelo título do conteúdo e pelo nome do episódio, nesta ordem.*/

Select title, total_episodes, episode_name, description
From contents
where total_episodes > '20'
order by title DESC, episode_name DESC;