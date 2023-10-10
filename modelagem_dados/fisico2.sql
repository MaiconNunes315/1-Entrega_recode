-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE cliente (
nome  VARCHAR(50),
rg VARCHAR(9),
rua VARCHAR(50),
numero INTEGER,
cpf CHAR(11),
estado VARCHAR(25),
data_nascimento DATETIME,
telefone VARCHAR(15),
criado_em DATETIME,
modificado_em DATETIME,
complemento VARCHAR(25),
senha VARCHAR(20),
cep VARCHAR(10),
email VARCHAR(100),
id_cliente INTEGER PRIMARY KEY,
cidade VARCHAR(20)
)

CREATE TABLE usuario (
email VARCHAR(100),
nome VARCHAR(50),
permissao VARCHAR(10),
rg VARCHAR(9),
telefone VARCHAR(15),
cpf CHAR(11),
endereco VARCHAR(100),
id_usuario INTEGER PRIMARY KEY
)

CREATE TABLE destinos (
detalhes VARCHAR(250),
estado VARCHAR(25),
img VARCHAR(250),
regiao VARCHAR(25),
pais VARCHAR(20),
cidade VARCHAR(20),
id_destino INTEGER PRIMARY KEY
)

CREATE TABLE promocoes (
detalhes VARCHAR(250),
quant_dias INTEGER,
preco DECIMAL(10,2),
desconto INTEGER,
id_promocoes INTEGER PRIMARY KEY,
id_destino INTEGER,
FOREIGN KEY(id_destino) REFERENCES destinos (id_destino)
)

CREATE TABLE reserva (
id_cliente INTEGER,
id_hospedagem INTEGER,
id_reserva INTEGER PRIMARY KEY,
FOREIGN KEY(id_cliente) REFERENCES cliente (id_cliente)/*falha: chave estrangeira*/
)

CREATE TABLE hospedagem (
valor_diaria DECIMAL(10,2),
data_saida DATETIME,
preco_diaria DECIMAL(10,2),
data_entrada DATETIME,
endereco VARCHAR(100),
cep VARCHAR(9),
nome_local VARCHAR(40),
id_hospedagem INTEGER PRIMARY KEY,
id_destino INTEGER,
FOREIGN KEY(id_destino) REFERENCES destinos (id_destino)
)

CREATE TABLE passagem (
local_embarque VARCHAR(40),
local_desembarque VARCHAR(40),
data_desembarque DATETIME,
data_embarque DATETIME,
id_passagem INTEGER PRIMARY KEY
)

