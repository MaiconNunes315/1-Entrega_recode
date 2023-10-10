-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE usuario (
id BIGINT(10) PRIMARY KEY,
nome  VARCHAR(50),
rg VARCHAR(9),
endereco VARCHAR(50),
cpf VARCHAR(11),
estado VARCHAR(20),
data_nascimento DATETIME,
telefone VARCHAR(11),
criado_em DATETIME,
modificado_em DATETIME,
senha VARCHAR(32),
email VARCHAR(50),
tipoUsuario VARCHAR(5)
)

CREATE TABLE Hospedagem (
id_hospedagem BIGINT(10) PRIMARY KEY,
nomeLocal VARCHAR(25),
precoDiaria DECIMAL(10,2),
endereco VARCHAR(50),
id_viagem BIGINT(10)
)

CREATE TABLE Viagem (
id_viagem BIGINT(10) PRIMARY KEY,
observacoes VARCHAR(250),
desconto INTEGER,
dataSaida DATETIME,
dataEntrada DATETIME,
id_destino BIGINT(10),
id BIGINT(10),
FOREIGN KEY(id) REFERENCES usuario (id)
)

CREATE TABLE contato (
id BIGINT(10) PRIMARY KEY,
email VARCHAR(50),
data DATETIME,
mensagem VARCHAR(500),
telefone VARCHAR(11),
nome VARCHAR(25)
)

CREATE TABLE destino (
id_destino BIGINT(10) PRIMARY KEY,
detalhes VARCHAR(250),
estado VARCHAR(20),
pais VARCHAR(20),
img VARCHAR(250),
cidade VARCHAR(25),
possuiPromocao CHAR(3)
)

ALTER TABLE Hospedagem ADD FOREIGN KEY(id_viagem) REFERENCES Viagem (id_viagem)
ALTER TABLE Viagem ADD FOREIGN KEY(id_destino) REFERENCES destino (id_destino)
