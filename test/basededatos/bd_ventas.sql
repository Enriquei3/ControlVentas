-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-05-2020 a las 09:04:33
-- Versión del servidor: 10.3.16-MariaDB
-- Versión de PHP: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_ventas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(10) NOT NULL,
  `dpi` varchar(13) DEFAULT NULL,
  `Nombres` varchar(244) DEFAULT NULL,
  `Direccion` varchar(244) DEFAULT NULL,
  `estado` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idcliente`, `dpi`, `Nombres`, `Direccion`, `estado`) VALUES
(1, '', 'C.F.', '', '1'),
(2, '123', 'Pedro Martinez', 'Teculutan', '1'),
(3, '1234', 'Juan Manuel Díaz', 'Rio Hondo', '1'),
(4, '12345', 'Miguel Angel Lemus', 'Guatemala', '1'),
(5, '123456', 'Jose Enrique Isales ', 'San Diego', '1'),
(6, '1234567', 'Ricardo Valenzuela', 'San Diego', '1'),
(8, '12345678', 'Sofia Gutierrez', 'Zacapa', '1'),
(10, '123456789', 'Enrique', 'San Diego, Zacapa', '1'),
(11, '555555', 'Juan Pablo Dominguez', 'Zacapa', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_ventas`
--

CREATE TABLE `detalle_ventas` (
  `idDetalleVentas` int(11) NOT NULL,
  `Ventas_idVentas` int(11) NOT NULL,
  `Producto_idProducto` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `PrecioVenta` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalle_ventas`
--

INSERT INTO `detalle_ventas` (`idDetalleVentas`, `Ventas_idVentas`, `Producto_idProducto`, `Cantidad`, `PrecioVenta`) VALUES
(13, 7, 1, 10, 10),
(14, 7, 2, 15, 30),
(15, 7, 3, 10, 150),
(16, 7, 5, 15, 10),
(17, 8, 2, 2, 30),
(18, 8, 1, 1, 10),
(19, 9, 1, 5, 10),
(20, 9, 3, 10, 150),
(21, 10, 1, 10, 10),
(22, 11, 1, 10, 10),
(23, 12, 2, 20, 30),
(24, 13, 1, 1, 10),
(25, 14, 1, 5, 10),
(26, 14, 2, 3, 30),
(27, 15, 2, 10, 30),
(28, 15, 1, 10, 10),
(29, 16, 1, 2, 10),
(30, 16, 3, 3, 150),
(31, 16, 5, 3, 10),
(32, 17, 2, 1, 30),
(33, 17, 1, 1, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `Nombres` varchar(244) NOT NULL,
  `Precio` double NOT NULL,
  `Stock` int(11) NOT NULL,
  `Estado` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `Nombres`, `Precio`, `Stock`, `Estado`) VALUES
(1, 'COCA COLA', 10, 45, '1'),
(2, 'HAMBURGUESA', 30, 49, '1'),
(3, 'PIZZA', 150, 77, '1'),
(5, 'PEPSI', 10, 82, '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `idVendedor` int(11) NOT NULL,
  `dpi` varchar(13) NOT NULL,
  `Nombres` varchar(255) NOT NULL,
  `Telefono` varchar(8) NOT NULL,
  `Estado` varchar(1) NOT NULL,
  `User_2` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`idVendedor`, `dpi`, `Nombres`, `Telefono`, `Estado`, `User_2`) VALUES
(1, '123456', 'Enrique Isales', '12345678', '1', 'enrique'),
(2, '123', 'Karla Vargas', '12345678', '1', 'karla'),
(3, '1234', 'Alan Cruz', '545454', '1', 'alan');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `idventas` int(11) NOT NULL,
  `Cliente_idCliente` int(11) NOT NULL,
  `Vendedor_idVendedor` int(11) NOT NULL,
  `NumeroVentas` varchar(244) DEFAULT NULL,
  `fechaventa` varchar(10) DEFAULT NULL,
  `monto` double DEFAULT NULL,
  `estado` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`idventas`, `Cliente_idCliente`, `Vendedor_idVendedor`, `NumeroVentas`, `fechaventa`, `monto`, `estado`) VALUES
(7, 5, 1, '00000001', '18/4/2020', 2200, '1'),
(8, 4, 1, '00000002', '18/4/2020', 70, '1'),
(9, 5, 1, '00000003', '18/4/2020', 1550, '1'),
(10, 5, 1, '00000004', '18/4/2020', 100, '1'),
(11, 6, 1, '00000005', '18/4/2020', 100, '1'),
(12, 11, 1, '00000006', '18/4/2020', 600, '1'),
(13, 4, 1, '00000007', '18/4/2020', 10, '1'),
(14, 2, 1, '00000008', '23/4/2020', 140, '1'),
(15, 2, 1, '00000009', '27/4/2020', 400, '1'),
(16, 3, 1, '000000010', '27/4/2020', 500, '1'),
(17, 2, 1, '000000010', '28/4/2020', 40, '1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idcliente`);

--
-- Indices de la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  ADD PRIMARY KEY (`idDetalleVentas`),
  ADD KEY `Ventas_idVentas` (`Ventas_idVentas`),
  ADD KEY `Producto_idProducto` (`Producto_idProducto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`idVendedor`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`idventas`),
  ADD KEY `Cliente_idCliente` (`Cliente_idCliente`),
  ADD KEY `Vendedor_idVendedor` (`Vendedor_idVendedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idcliente` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  MODIFY `idDetalleVentas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `idVendedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `idventas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  ADD CONSTRAINT `detalle_ventas_ibfk_1` FOREIGN KEY (`Producto_idProducto`) REFERENCES `producto` (`idProducto`) ON UPDATE CASCADE,
  ADD CONSTRAINT `detalle_ventas_ibfk_2` FOREIGN KEY (`Ventas_idVentas`) REFERENCES `ventas` (`idventas`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`Vendedor_idVendedor`) REFERENCES `vendedor` (`idVendedor`) ON UPDATE CASCADE,
  ADD CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idcliente`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
