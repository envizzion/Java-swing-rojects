-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 22, 2017 at 11:31 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `newcanteen`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Cust_ID` int(11) NOT NULL,
  `cus_name` varchar(25) DEFAULT NULL,
  `address` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Cust_ID`, `cus_name`, `address`) VALUES
(102, 'BBbb', 'gdfgdg'),
(103, 'CC', 'asdssdsf');

-- --------------------------------------------------------

--
-- Table structure for table `cust_login`
--

CREATE TABLE `cust_login` (
  `username` varchar(20) NOT NULL,
  `password` int(11) NOT NULL,
  `Cust_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cust_login`
--

INSERT INTO `cust_login` (`username`, `password`, `Cust_ID`) VALUES
('bbb', 123, 102),
('CC', 1111, 103);

-- --------------------------------------------------------

--
-- Table structure for table `cust_orders`
--

CREATE TABLE `cust_orders` (
  `Cust_ID` int(11) NOT NULL,
  `Order_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cust_orders`
--

INSERT INTO `cust_orders` (`Cust_ID`, `Order_ID`) VALUES
(102, 13),
(102, 14),
(103, 12);

-- --------------------------------------------------------

--
-- Table structure for table `cus_tp_nos`
--

CREATE TABLE `cus_tp_nos` (
  `Cust_tp` int(11) NOT NULL,
  `Cust_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cus_tp_nos`
--

INSERT INTO `cus_tp_nos` (`Cust_tp`, `Cust_ID`) VALUES
(213123, 102),
(3432434, 103);

-- --------------------------------------------------------

--
-- Table structure for table `food_item`
--

CREATE TABLE `food_item` (
  `Food_ID` int(11) NOT NULL,
  `Food_name` varchar(20) DEFAULT NULL,
  `unit_price` int(11) DEFAULT NULL,
  `stock_amount` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `food_item`
--

INSERT INTO `food_item` (`Food_ID`, `Food_name`, `unit_price`, `stock_amount`) VALUES
(10000, 'cake', 130, 335);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(20) DEFAULT NULL,
  `password` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 1111),
('admin', 1111);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `Order_ID` int(11) NOT NULL,
  `date` datetime DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `unit_price` int(11) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `Food_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`Order_ID`, `date`, `amount`, `unit_price`, `description`, `Food_ID`) VALUES
(9, '2017-07-13 03:30:00', 30, 80, 'gffh', 10000),
(12, '2017-07-05 00:00:00', 11, 130, 'fsdsadds', 10000),
(13, '2017-07-06 00:00:00', 33, 130, 'dfsdf', 10000),
(14, '2017-07-12 03:30:00', 50, 130, 'rtgrtg', 10000);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `Sup_ID` int(11) NOT NULL,
  `Sup_name` varchar(20) DEFAULT NULL,
  `Sup_address` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`Sup_ID`, `Sup_name`, `Sup_address`) VALUES
(1000, 'A', 'dfffffff'),
(1001, 'DD', 'sdfsdfdf');

-- --------------------------------------------------------

--
-- Table structure for table `sup_orders`
--

CREATE TABLE `sup_orders` (
  `Sup_ID` int(11) NOT NULL,
  `Order_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sup_orders`
--

INSERT INTO `sup_orders` (`Sup_ID`, `Order_ID`) VALUES
(1000, 9);

-- --------------------------------------------------------

--
-- Table structure for table `sup_tp_nos`
--

CREATE TABLE `sup_tp_nos` (
  `Sup_tp` int(11) NOT NULL,
  `Sup_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sup_tp_nos`
--

INSERT INTO `sup_tp_nos` (`Sup_tp`, `Sup_ID`) VALUES
(132, 1000),
(1312323, 1001);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Cust_ID`);

--
-- Indexes for table `cust_login`
--
ALTER TABLE `cust_login`
  ADD PRIMARY KEY (`Cust_ID`,`username`);

--
-- Indexes for table `cust_orders`
--
ALTER TABLE `cust_orders`
  ADD PRIMARY KEY (`Cust_ID`,`Order_ID`),
  ADD KEY `Order_ID` (`Order_ID`);

--
-- Indexes for table `cus_tp_nos`
--
ALTER TABLE `cus_tp_nos`
  ADD PRIMARY KEY (`Cust_tp`),
  ADD KEY `Cust_ID` (`Cust_ID`);

--
-- Indexes for table `food_item`
--
ALTER TABLE `food_item`
  ADD PRIMARY KEY (`Food_ID`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`Order_ID`),
  ADD KEY `Food_ID` (`Food_ID`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`Sup_ID`);

--
-- Indexes for table `sup_orders`
--
ALTER TABLE `sup_orders`
  ADD PRIMARY KEY (`Sup_ID`,`Order_ID`),
  ADD KEY `Order_ID` (`Order_ID`);

--
-- Indexes for table `sup_tp_nos`
--
ALTER TABLE `sup_tp_nos`
  ADD PRIMARY KEY (`Sup_tp`),
  ADD KEY `Sup_ID` (`Sup_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `Cust_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=104;
--
-- AUTO_INCREMENT for table `food_item`
--
ALTER TABLE `food_item`
  MODIFY `Food_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10001;
--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `Order_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `Sup_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1002;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `cust_login`
--
ALTER TABLE `cust_login`
  ADD CONSTRAINT `cust_login_ibfk_1` FOREIGN KEY (`Cust_ID`) REFERENCES `customer` (`Cust_ID`);

--
-- Constraints for table `cust_orders`
--
ALTER TABLE `cust_orders`
  ADD CONSTRAINT `cust_orders_ibfk_1` FOREIGN KEY (`Cust_ID`) REFERENCES `customer` (`Cust_ID`),
  ADD CONSTRAINT `cust_orders_ibfk_2` FOREIGN KEY (`Order_ID`) REFERENCES `orders` (`Order_ID`);

--
-- Constraints for table `cus_tp_nos`
--
ALTER TABLE `cus_tp_nos`
  ADD CONSTRAINT `cus_tp_nos_ibfk_1` FOREIGN KEY (`Cust_ID`) REFERENCES `customer` (`Cust_ID`);

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`Food_ID`) REFERENCES `food_item` (`Food_ID`);

--
-- Constraints for table `sup_orders`
--
ALTER TABLE `sup_orders`
  ADD CONSTRAINT `sup_orders_ibfk_1` FOREIGN KEY (`Sup_ID`) REFERENCES `supplier` (`Sup_ID`),
  ADD CONSTRAINT `sup_orders_ibfk_2` FOREIGN KEY (`Order_ID`) REFERENCES `orders` (`Order_ID`);

--
-- Constraints for table `sup_tp_nos`
--
ALTER TABLE `sup_tp_nos`
  ADD CONSTRAINT `sup_tp_nos_ibfk_1` FOREIGN KEY (`Sup_ID`) REFERENCES `supplier` (`Sup_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
