-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 15-Out-2023 às 22:00
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

DELIMITER $$
--
-- Functions
--
CREATE DEFINER=`root`@`localhost` FUNCTION `calculaPreco` (`desconto` INT, `preco` DECIMAL(10,2)) RETURNS DECIMAL(10,2) BEGIN
 
                 RETURN preco - (desconto /100 * preco);
END$$

CREATE DEFINER=`root`@`localhost` FUNCTION `calculaPrecoTotal` (`desconto` INT, `preco` DECIMAL(10,2)) RETURNS DECIMAL(10,2) BEGIN 
RETURN preco - (desconto /100 * preco); 
END$$

DELIMITER ;

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

--
-- Extraindo dados da tabela `contato`
--

INSERT INTO `contato` (`id`, `email`, `data`, `mensagem`, `telefone`, `nome`) VALUES
(2, 'kjsdfljfd', '2023-10-15 13:32:03', 'kap[ksdp', 'aksdkfsd', 'dfakpk'),
(3, 'lkasjlçdfsd', '2023-10-15 13:32:08', 'çfodkoçdsfk', '5', 'fsdkp´çsk');

-- --------------------------------------------------------

--
-- Estrutura da tabela `destino`
--

CREATE TABLE `destino` (
  `id_destino` bigint(10) NOT NULL,
  `detalhes` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `estado` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `img` text COLLATE utf8_unicode_ci,
  `cidade` varchar(25) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `destino`
--

INSERT INTO `destino` (`id_destino`, `detalhes`, `estado`, `pais`, `img`, `cidade`) VALUES
(1, 'Lindas paisagens', 'Rio grande do norte', 'Brasa', 'https://visit.natal.br/assets/img/galeria3-min.jpg', 'Natal'),
(2, 'encatada pela wall street', 'New York', 'EUA', 'https://www.remessaonline.com.br/blog/wp-content/uploads/2022/06/morar-em-nova-york.jpg', 'New York '),
(3, 'praias paradisíacas', 'Bahia', 'Brasil', 'https://rodoviariaonline.com.br/wp-content/uploads/2018/11/deseja-um-pouco-de-axe-confira-as-8-principais-praias-em-salvador.jpg', 'Salvador');

-- --------------------------------------------------------

--
-- Estrutura da tabela `hospedagem`
--

CREATE TABLE `hospedagem` (
  `id_hospedagem` bigint(10) NOT NULL,
  `nomeLocal` varchar(25) COLLATE utf8_unicode_ci DEFAULT NULL,
  `precoDiaria` decimal(10,2) DEFAULT NULL,
  `endereco` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_destino` bigint(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `hospedagem`
--

INSERT INTO `hospedagem` (`id_hospedagem`, `nomeLocal`, `precoDiaria`, `endereco`, `id_destino`) VALUES
(3, 'Hotel Paradise Resort', '300.00', 'rua da praia 123', 1),
(4, 'Hotel bla bla ', '290.69', 'jhads kajsdklsda ikjds', 3);

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
  `tipoUsuario` varchar(6) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `rg`, `endereco`, `cpf`, `estado`, `dataNascimento`, `telefone`, `criado_em`, `modificado_em`, `senha`, `email`, `tipoUsuario`) VALUES
(2, 'Maicon Nunes', '267625772', 'Rua Sambaitiba lt 21 qd 70', '12245465411', 'Rio de Janeiro', '1969-12-31', '2127596417', '2023-10-10 09:31:51', '2023-10-10 09:31:51', '123456789', 'mnunes315@hotmail.com', 'admin'),
(4, 'Natalia Pereira', '267625772', 'Rua Sambaitiba lt 21 qd 70', '12245465411', 'Rio de Janeiro', '1995-05-29', '2127596417', '2023-10-10 09:40:52', '2023-10-10 09:40:52', '123456789', 'mnunes315@hotmail.com', 'admin'),
(5, 'Marli Maria da Silva Nunes', '222222775', 'Rua 10 lt 21 qd 70', '25465542122', 'Rio de Janeiro', '1995-05-29', '2199999999', '2023-10-10 09:46:26', '2023-10-10 09:46:26', '987654321', 'mnunes315@gmail.com', 'user'),
(6, 'Natália Pereira', '22256412', 'Rua da paz lote 15', '14891843764', 'Rio de Janeiro', '1995-05-29', '21964437980', '2023-10-10 10:35:45', '2023-10-14 17:10:31', '987654321', 'natalia@natalia.com', 'client');

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
  `id_usuario` bigint(10) DEFAULT NULL,
  `precoTotal` decimal(10,2) DEFAULT NULL,
  `preco` decimal(10,2) DEFAULT NULL,
  `possuiHospedagem` binary(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `viagem`
--

INSERT INTO `viagem` (`id_viagem`, `observacoes`, `desconto`, `dataSaida`, `dataEntrada`, `id_destino`, `id_usuario`, `precoTotal`, `preco`, `possuiHospedagem`) VALUES
(1, 'não', 10, '2023-10-15 10:10:00', '2023-10-10 10:10:00', 3, 2, '1398.11', '100.00', 0x31),
(2, 'gfh ', 10, '2023-10-15 10:10:00', '2023-10-10 10:10:00', 3, 6, '1398.11', '100.00', 0x31);

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
  ADD KEY `fk_hospedagem` (`id_destino`);

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
  ADD KEY `id_destino` (`id_destino`),
  ADD KEY `viagem_ibfk_1` (`id_usuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `contato`
--
ALTER TABLE `contato`
  MODIFY `id` bigint(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `destino`
--
ALTER TABLE `destino`
  MODIFY `id_destino` bigint(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `hospedagem`
--
ALTER TABLE `hospedagem`
  MODIFY `id_hospedagem` bigint(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` bigint(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `viagem`
--
ALTER TABLE `viagem`
  MODIFY `id_viagem` bigint(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `hospedagem`
--
ALTER TABLE `hospedagem`
  ADD CONSTRAINT `fk_hospedagem` FOREIGN KEY (`id_destino`) REFERENCES `destino` (`id_destino`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `viagem`
--
ALTER TABLE `viagem`
  ADD CONSTRAINT `viagem_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`),
  ADD CONSTRAINT `viagem_ibfk_2` FOREIGN KEY (`id_destino`) REFERENCES `destino` (`id_destino`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
