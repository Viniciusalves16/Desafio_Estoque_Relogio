# Desafio_Estoque_Relogio

Desafio Java Back end
****

comando para executar criaçao do banco no docker
docker exec -it pg-desafio psql -U postgres -c "CREATE DATABASE desafio_db;"

docker ps Verifica se o container esta ativo

docker start pg-desafio - Inicia o container

docker exec -it pg-desafio psql -U root -l - Lista os bancos de dados disponiveis