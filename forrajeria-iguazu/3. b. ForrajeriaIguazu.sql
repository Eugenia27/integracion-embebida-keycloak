-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 25-04-2023 a las 18:44:17
-- Versión del servidor: 8.0.27
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `forrajeria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
  `id_producto` int NOT NULL,
  `nombre_prod` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `peso_prod` decimal(10,2) DEFAULT NULL,
  `precio_prod` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id_producto`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb3 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_producto`, `nombre_prod`, `peso_prod`, `precio_prod`) VALUES
(1, 'Alimento para perros', '10.50', '25.99'),
(2, 'Alimento para gatos', '5.50', '15.99'),
(3, 'Alimento para peces', '2.20', '7.99'),
(4, 'Heno de alfalfa', '5.00', '12.99'),
(5, 'Comida para aves', '1.50', '6.99'),
(6, 'Arena para gatos', '15.00', '8.99'),
(7, 'Pellets para conejos', '2.00', '10.99'),
(8, 'Pasto para hamsters', '1.00', '4.99'),
(9, 'Comida para tortugas', '0.50', '7.99'),
(10, 'Heno para caballos', '10.00', '22.99'),
(11, 'Semillas de girasol', '0.25', '2.99'),
(12, 'Alfalfa molida', '2.50', '8.99'),
(13, 'Huesos de carnaza', '0.20', '1.99'),
(14, 'Hojas de eucalipto', '0.50', '4.99'),
(15, 'Lecho de madera para roedores', '5.00', '9.99');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
