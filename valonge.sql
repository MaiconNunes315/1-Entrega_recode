-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 10-Out-2023 às 23:05
-- Versão do servidor: 10.1.38-MariaDB
-- versão do PHP: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `valonge`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `contato`
--

CREATE TABLE `contato` (
  `id` bigint(10) NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `data` datetime DEFAULT NULL,
  `mensagem` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telefone` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nome` varchar(25) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `destino`
--

CREATE TABLE `destino` (
  `id_destino` bigint(10) NOT NULL,
  `detalhes` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `estado` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `img` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cidade` varchar(25) COLLATE utf8_unicode_ci DEFAULT NULL,
  `possuiPromocao` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `hospedagem`
--

CREATE TABLE `hospedagem` (
  `id_hospedagem` bigint(10) NOT NULL,
  `nomeLocal` varchar(25) COLLATE utf8_unicode_ci DEFAULT NULL,
  `precoDiaria` decimal(10,2) DEFAULT NULL,
  `endereco` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_viagem` bigint(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` bigint(10) NOT NULL,
  `nome` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `rg` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `endereco` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `cpf` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `estado` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `dataNascimento` date NOT NULL,
  `telefone` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `criado_em` datetime NOT NULL,
  `modificado_em` datetime NOT NULL,
  `senha` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tipoUsuario` varchar(5) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `rg`, `endereco`, `cpf`, `estado`, `dataNascimento`, `telefone`, `criado_em`, `modificado_em`, `senha`, `email`, `tipoUsuario`) VALUES
(2, 'Maicon Nunes', '267625772', 'Rua Sambaitiba lt 21 qd 70', '12245465411', 'Rio de Janeiro', '1969-12-31', '2127596417', '2023-10-10 09:31:51', '2023-10-10 09:31:51', '123456789', 'mnunes315@hotmail.com', 'admin'),
(3, 'Marli Nunes', '267625772', 'Rua Sambaitiba lt 21 qd 70', '12245465411', 'Rio de Janeiro', '1992-02-10', '2127596417', '2023-10-10 09:39:17', '2023-10-10 11:59:01', '123456789', 'mnunes315@hotmail.com', 'admin'),
(4, 'Natalia Pereira', '267625772', 'Rua Sambaitiba lt 21 qd 70', '12245465411', 'Rio de Janeiro', '1995-05-29', '2127596417', '2023-10-10 09:40:52', '2023-10-10 09:40:52', '123456789', 'mnunes315@hotmail.com', 'admin'),
(5, 'Marli Maria da Silva Nunes', '222222775', 'Rua 10 lt 21 qd 70', '25465542122', 'Rio de Janeiro', '1995-05-29', '2199999999', '2023-10-10 09:46:26', '2023-10-10 09:46:26', '987654321', 'mnunes315@gmail.com', 'user'),
(6, 'Marli Maria da Silva Nunes', '222222775', 'Rua 10 lt 21 qd 70', '25465542122', 'Rio de Janeiro', '1995-05-29', '2199999999', '2023-10-10 10:35:45', '2023-10-10 10:35:45', '987654321', 'mnunes315@gmail.com', 'user');

-- --------------------------------------------------------

--
-- Estrutura da tabela `viagem`
--

CREATE TABLE `viagem` (
  `id_viagem` bigint(10) NOT NULL,
  `observacoes` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `desconto` int(11) DEFAULT NULL,
  `dataSaida` datetime DEFAULT NULL,
  `dataEntrada` datetime DEFAULT NULL,
  `id_destino` bigint(10) DEFAULT NULL,
  `id` bigint(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contato`
--
ALTER TABLE `contato`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `destino`
--
ALTER TABLE `destino`
  ADD PRIMARY KEY (`id_destino`);

--
-- Indexes for table `hospedagem`
--
ALTER TABLE `hospedagem`
  ADD PRIMARY KEY (`id_hospedagem`),
  ADD KEY `id_viagem` (`id_viagem`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `viagem`
--
ALTER TABLE `viagem`
  ADD PRIMARY KEY (`id_viagem`),
  ADD KEY `id` (`id`),
  ADD KEY `id_destino` (`id_destino`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `contato`
--
ALTER TABLE `contato`
  MODIFY `id` bigint(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `destino`
--
ALTER TABLE `destino`
  MODIFY `id_destino` bigint(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `hospedagem`
--
ALTER TABLE `hospedagem`
  MODIFY `id_hospedagem` bigint(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` bigint(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `viagem`
--
ALTER TABLE `viagem`
  MODIFY `id_viagem` bigint(10) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `hospedagem`
--
ALTER TABLE `hospedagem`
  ADD CONSTRAINT `hospedagem_ibfk_1` FOREIGN KEY (`id_viagem`) REFERENCES `viagem` (`id_viagem`);

--
-- Limitadores para a tabela `viagem`
--
ALTER TABLE `viagem`
  ADD CONSTRAINT `viagem_ibfk_1` FOREIGN KEY (`id`) REFERENCES `usuario` (`id`),
  ADD CONSTRAINT `viagem_ibfk_2` FOREIGN KEY (`id_destino`) REFERENCES `destino` (`id_destino`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
