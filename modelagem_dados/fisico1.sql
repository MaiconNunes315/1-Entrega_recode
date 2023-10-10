-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Hospedagem (
nome_local VARCHAR(40),
id INTEGER PRIMARY KEY,
data_saida DATETIME,
preco_diaria DECIMAL(10.2),
data_entrada DATETIME,
endereco VARCHAR(250),
cep VARCHAR(10),
-- Erro: nome do campo duplicado nesta tabela!
id INTEGER
)

CREATE TABLE promocoes (
detalhes VARCHAR(250),
quant_dias INTEGER,
preco DECIMAL(10,2),
desconto INTEGER,
id INTEGER PRIMARY KEY,
-- Erro: nome do campo duplicado nesta tabela!
id INTEGER
)

CREATE TABLE reserva (
id INTEGER,
-- Erro: nome do campo duplicado nesta tabela!
id INTEGER
)

CREATE TABLE cliente (
nome  VARCHAR(50),
rg VARCHAR(10),
rua VARCHAR(20),
id INTEGER PRIMARY KEY,
numero INTEGER,
cpf CHAR(11),
estado VARCHAR(25),
data_nascimento DATETIME,
telefone VARCHAR(15),
criado_em DATETIME,
modificado_em DATETIME,
complemento VARCHAR(20),
senha VARCHAR(20),
cep VARCHAR(10),
email VARCHAR(50)
)

CREATE TABLE usuario (
id VARCHAR(10),
email VARCHAR(10),
nome VARCHAR(10),
permissao VARCHAR(10),
rg VARCHAR(10),
telefone VARCHAR(10),
cpf VARCHAR(10),
endereco VARCHAR(10)
)

CREATE TABLE passagem (
id INTEGER PRIMARY KEY,
local_embarque VARCHAR(40),
local_desembarque VARCHAR(40),
data_desembarque DATETIME,
data_embarque DATETIME
)

CREATE TABLE destinos (
detalhes VARCHAR(250),
id INTEGER PRIMARY KEY,
estado VARCHAR(25),
img VARCHAR(250),
regiao VARCHAR(20),
pais VARCHAR(15),
cidade VARCHAR(25)
)

ALTER TABLE Hospedagem ADD FOREIGN KEY(id) REFERENCES destinos (id)
ALTER TABLE promocoes ADD FOREIGN KEY(id) REFERENCES destinos (id)
ALTER TABLE reserva ADD FOREIGN KEY(id) REFERENCES cliente (id)
ALTER TABLE reserva ADD FOREIGN KEY(id) REFERENCES destinos (id)
