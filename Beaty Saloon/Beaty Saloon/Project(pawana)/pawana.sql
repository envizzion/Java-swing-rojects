-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 12, 2019 at 08:16 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pawana`
--

-- --------------------------------------------------------

--
-- Table structure for table `catering_orders`
--

CREATE TABLE `catering_orders` (
  `order_ID` int(11) NOT NULL,
  `cusID` varchar(20) DEFAULT NULL,
  `Advance` float NOT NULL,
  `price` float DEFAULT NULL,
  `Purchased_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `catering_orders`
--

INSERT INTO `catering_orders` (`order_ID`, `cusID`, `Advance`, `price`, `Purchased_date`) VALUES
(1, '2001', 1000, 6000, '2019-01-12');

-- --------------------------------------------------------

--
-- Table structure for table `catering_order_items`
--

CREATE TABLE `catering_order_items` (
  `order_ID` varchar(20) DEFAULT NULL,
  `service_ID` varchar(20) DEFAULT NULL,
  `Quantity` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `catering_order_items`
--

INSERT INTO `catering_order_items` (`order_ID`, `service_ID`, `Quantity`) VALUES
('1', '2', '2');

-- --------------------------------------------------------

--
-- Table structure for table `catering_services`
--

CREATE TABLE `catering_services` (
  `id` int(6) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Service_Type` varchar(20) DEFAULT NULL,
  `Total_Quantity` int(11) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `details` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `catering_services`
--

INSERT INTO `catering_services` (`id`, `Name`, `Service_Type`, `Total_Quantity`, `price`, `details`) VALUES
(2, 'cabana', 'Hut', 3, 3000, 'per day pricing');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cusID` int(10) NOT NULL,
  `Name` varchar(30) DEFAULT NULL,
  `NIC` varchar(20) DEFAULT NULL,
  `Address` varchar(40) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `ContactNo` varchar(20) DEFAULT NULL,
  `regDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cusID`, `Name`, `NIC`, `Address`, `Email`, `ContactNo`, `regDate`) VALUES
(2001, 'Harsha', 'dhdhdh', 'ddjdakfna,sgslg,sgsh', 'djdjdj', 'djhdjd', '2019-01-12'),
(2002, 'harsha', '124187', 'qrgqrgqkrkq', 'qrqtq', 'qtqtqt', '2019-01-08');

-- --------------------------------------------------------

--
-- Table structure for table `dress_details`
--

CREATE TABLE `dress_details` (
  `dress_id` int(4) NOT NULL,
  `dress_type` varchar(20) DEFAULT NULL,
  `mat_type` varchar(20) DEFAULT NULL,
  `details` varchar(20) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dress_details`
--

INSERT INTO `dress_details` (`dress_id`, `dress_type`, `mat_type`, `details`, `price`) VALUES
(1, 'sareee', 'cotton', 'sdff', '2000'),
(2, 'Nilame kit', 'cotton', 'sdffdvd', '3000'),
(3, 'Court', 'lenin', 'sdffdfsv', '1000');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `empID` int(10) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `NIC` varchar(15) DEFAULT NULL,
  `Address` varchar(30) DEFAULT NULL,
  `Contact_no` varchar(13) DEFAULT NULL,
  `Section` varchar(10) DEFAULT NULL,
  `Joined_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`empID`, `Name`, `NIC`, `Address`, `Contact_no`, `Section`, `Joined_date`) VALUES
(1, 'wbcxbwx', '12345688i', 'ascsvsvs', '234235364', 'a', '2019-01-10'),
(2, 'dfg', '45', 'fg', '5446456456', 'Catering', '2019-01-13');

-- --------------------------------------------------------

--
-- Table structure for table `emptypes`
--

CREATE TABLE `emptypes` (
  `name` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emptypes`
--

INSERT INTO `emptypes` (`name`) VALUES
('Beautician');

-- --------------------------------------------------------

--
-- Table structure for table `halls`
--

CREATE TABLE `halls` (
  `id` int(11) NOT NULL,
  `Hall_Name` varchar(30) DEFAULT NULL,
  `Capacity` varchar(10) DEFAULT NULL,
  `Details` varchar(100) DEFAULT NULL,
  `Price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `halls`
--

INSERT INTO `halls` (`id`, `Hall_Name`, `Capacity`, `Details`, `Price`) VALUES
(1, 'Hill View', '200', 'AC', 20000),
(2, 'Kapruka', '100', 'AC', 15000);

-- --------------------------------------------------------

--
-- Table structure for table `item_order_dates`
--

CREATE TABLE `item_order_dates` (
  `item_id` varchar(10) DEFAULT NULL,
  `orderID` varchar(10) DEFAULT NULL,
  `item_type` varchar(20) DEFAULT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item_order_dates`
--

INSERT INTO `item_order_dates` (`item_id`, `orderID`, `item_type`, `date`) VALUES
('carror24', '2', 'jewel', '2018-12-27'),
('1', '2', 'dress', '2018-12-27'),
('carror24', '3', 'jewel', '2019-01-01'),
('1', '3', 'dress', '2019-01-01'),
('1', '4', 'dress', '2019-01-01'),
('carDecor', '5', 'decor', '2019-02-13'),
('Gihan', '5', 'group', '2019-02-13'),
('2', '6', 'decor', '2019-02-13'),
('1', '6', 'group', '2019-02-13'),
('2', '7', 'dress', '2019-01-10'),
('1', '7', 'dress', '2019-01-10');

-- --------------------------------------------------------

--
-- Table structure for table `jewellery`
--

CREATE TABLE `jewellery` (
  `name` varchar(10) NOT NULL,
  `Description` varchar(80) DEFAULT NULL,
  `price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jewellery`
--

INSERT INTO `jewellery` (`name`, `Description`, `price`) VALUES
('carror24', 'xvxvc', 3000),
('carrot36', 'dfg', 5000),
('carrot61', 'dfdfgdfg', 4000);

-- --------------------------------------------------------

--
-- Table structure for table `order_requests`
--

CREATE TABLE `order_requests` (
  `orderID` int(5) NOT NULL,
  `cusID` varchar(10) DEFAULT NULL,
  `Purchased_date` date DEFAULT NULL,
  `Required_Date` date DEFAULT NULL,
  `Type` varchar(30) DEFAULT NULL,
  `paymentDone` int(10) DEFAULT NULL,
  `total_cost` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `order_requests`
--

INSERT INTO `order_requests` (`orderID`, `cusID`, `Purchased_date`, `Required_Date`, `Type`, `paymentDone`, `total_cost`) VALUES
(1, '2000', '2018-12-27', '0000-00-00', '0', NULL, '5000.0'),
(2, '2000', '2018-12-27', '0000-00-00', '0', NULL, '5000.0'),
(3, '2000', '2019-01-01', '0000-00-00', '0', NULL, '5000.0'),
(4, '2000', '2019-01-01', '0000-00-00', '0', NULL, '2000.0'),
(5, '2000', '2019-01-06', '2019-02-13', 'decor_group', 3000, '3000.0'),
(6, '2000', '2019-01-06', '2019-02-13', 'decor_group', 3000, '3000.0'),
(7, '2001', '2019-01-10', '2019-01-10', 'jewel_dress', 5000, '5000.0');

-- --------------------------------------------------------

--
-- Table structure for table `packages`
--

CREATE TABLE `packages` (
  `packageID` int(5) NOT NULL,
  `ServiceType` varchar(30) DEFAULT NULL,
  `packageName` varchar(20) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `saloon_orders`
--

CREATE TABLE `saloon_orders` (
  `orderID` int(10) NOT NULL,
  `cusID` varchar(10) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `Purchased_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `saloon_orders`
--

INSERT INTO `saloon_orders` (`orderID`, `cusID`, `price`, `Purchased_date`) VALUES
(2, '2000', 1000, '2018-12-26'),
(3, '2000', 1100, '2019-01-03'),
(4, '2000', 1100, '2019-01-03');

-- --------------------------------------------------------

--
-- Table structure for table `saloon_services`
--

CREATE TABLE `saloon_services` (
  `serviceName` varchar(100) NOT NULL,
  `hairOrFacial` varchar(20) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `saloon_services`
--

INSERT INTO `saloon_services` (`serviceName`, `hairOrFacial`, `price`) VALUES
('Blow Dyeing and Hair Set', 'Hair', '455'),
('Clean up', 'Skin', '1500'),
('Coloring and Hena treatment', 'Hair', '1100'),
('Eyebrow shape', 'Skin', ''),
('Gold Facial', 'Skin', '500'),
('Layer and Lether Cuts', 'Hair', '1000'),
('Normal Facial', 'Skin', '2000'),
('Oil Treatment', 'Hair', '1200'),
('package_1', 'Bridal', '10000'),
('package_2', 'Bridal', '12000'),
('Pearl Facial', 'Skin', '2000'),
('Rebonding', 'Hair', '1000'),
('Relaxing', 'Hair', '1000'),
('Scrub', 'Skin', '2000'),
('Treading and Waxing', 'Skin', '2000');

-- --------------------------------------------------------

--
-- Table structure for table `section`
--

CREATE TABLE `section` (
  `name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `id` int(11) NOT NULL,
  `Section` varchar(20) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Brand` varchar(20) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `Reorder_Level` int(11) DEFAULT NULL,
  `Unit_Price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`id`, `Section`, `Name`, `Brand`, `Quantity`, `Reorder_Level`, `Unit_Price`) VALUES
(1, 'Saloon', 'night cream', 'natures secret', 66, 10, 390),
(2, 'Saloon', 'skin cream', 'fair and lovely', 48, 10, 300),
(3, 'Saloon', 'facial cream', 'clear', 22, 5, 100),
(4, 'Saloon', 'facial cream 2', 'dgghfgh', 30, 10, 100);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `supID` int(10) NOT NULL,
  `Name` varchar(30) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Address` varchar(30) DEFAULT NULL,
  `ContactNo` varchar(20) DEFAULT NULL,
  `Type` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`supID`, `Name`, `Email`, `Address`, `ContactNo`, `Type`) VALUES
(1000, 'dfg', 'dgggf', 'dg', 'dg', 'Catering');

-- --------------------------------------------------------

--
-- Table structure for table `supplier_orders`
--

CREATE TABLE `supplier_orders` (
  `order_ID` int(11) NOT NULL,
  `supplier_ID` varchar(20) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `purchased_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier_orders`
--

INSERT INTO `supplier_orders` (`order_ID`, `supplier_ID`, `price`, `purchased_date`) VALUES
(1, '1000', 3560, '2019-01-10'),
(2, '1000', 2940, '2019-01-10'),
(3, '1000', 2000, '2019-01-10'),
(4, '1000', 14250, '2019-01-10'),
(5, '2001', 6000, '2019-01-10'),
(6, '2001', 6000, '2019-01-10');

-- --------------------------------------------------------

--
-- Table structure for table `supplier_order_items`
--

CREATE TABLE `supplier_order_items` (
  `order_id` varchar(20) DEFAULT NULL,
  `item_id` varchar(20) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier_order_items`
--

INSERT INTO `supplier_order_items` (`order_id`, `item_id`, `quantity`) VALUES
('1', '1', 4),
('1', '2', 8),
('2', '2', 4),
('2', '1', 6),
('3', '3', 20),
('4', '1', 45),
('4', '3', 12),
('5', '2', 2),
('6', '2', 2);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userName`, `password`) VALUES
('saman', '123'),
('1231', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `wedding_events`
--

CREATE TABLE `wedding_events` (
  `id` int(11) NOT NULL,
  `Service_Name` varchar(30) DEFAULT NULL,
  `Decoration_type` varchar(30) DEFAULT NULL,
  `Quantity` varchar(30) DEFAULT NULL,
  `note` varchar(30) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wedding_events`
--

INSERT INTO `wedding_events` (`id`, `Service_Name`, `Decoration_type`, `Quantity`, `note`, `price`) VALUES
(1, 'carDecoration', 'flower', 'per car', 'dfcvbcvb', 1000),
(2, 'carDecor', 'flower', 'per car', 'dfcvbcvb', 1000);

-- --------------------------------------------------------

--
-- Table structure for table `wedding_groups`
--

CREATE TABLE `wedding_groups` (
  `id` int(11) NOT NULL,
  `Leader_name` varchar(20) DEFAULT NULL,
  `Contact_no` varchar(20) DEFAULT NULL,
  `Address` varchar(30) DEFAULT NULL,
  `Event_type` varchar(20) DEFAULT NULL,
  `Payment` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wedding_groups`
--

INSERT INTO `wedding_groups` (`id`, `Leader_name`, `Contact_no`, `Address`, `Event_type`, `Payment`) VALUES
(1, 'Gihan', '1232242342', 'asd,gdfgfd,df', 'Kandian wes dancing', 2000),
(2, 'Harsha', '1231437613', 'susduujs', 'Ashtaka', 13232);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `catering_orders`
--
ALTER TABLE `catering_orders`
  ADD PRIMARY KEY (`order_ID`);

--
-- Indexes for table `catering_services`
--
ALTER TABLE `catering_services`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cusID`);

--
-- Indexes for table `dress_details`
--
ALTER TABLE `dress_details`
  ADD PRIMARY KEY (`dress_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`empID`);

--
-- Indexes for table `halls`
--
ALTER TABLE `halls`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `jewellery`
--
ALTER TABLE `jewellery`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `order_requests`
--
ALTER TABLE `order_requests`
  ADD PRIMARY KEY (`orderID`);

--
-- Indexes for table `packages`
--
ALTER TABLE `packages`
  ADD PRIMARY KEY (`packageID`);

--
-- Indexes for table `saloon_orders`
--
ALTER TABLE `saloon_orders`
  ADD PRIMARY KEY (`orderID`);

--
-- Indexes for table `saloon_services`
--
ALTER TABLE `saloon_services`
  ADD PRIMARY KEY (`serviceName`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`supID`);

--
-- Indexes for table `supplier_orders`
--
ALTER TABLE `supplier_orders`
  ADD PRIMARY KEY (`order_ID`);

--
-- Indexes for table `wedding_events`
--
ALTER TABLE `wedding_events`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `wedding_groups`
--
ALTER TABLE `wedding_groups`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `catering_orders`
--
ALTER TABLE `catering_orders`
  MODIFY `order_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `catering_services`
--
ALTER TABLE `catering_services`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `cusID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2003;
--
-- AUTO_INCREMENT for table `dress_details`
--
ALTER TABLE `dress_details`
  MODIFY `dress_id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `empID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `halls`
--
ALTER TABLE `halls`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `order_requests`
--
ALTER TABLE `order_requests`
  MODIFY `orderID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `packages`
--
ALTER TABLE `packages`
  MODIFY `packageID` int(5) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `saloon_orders`
--
ALTER TABLE `saloon_orders`
  MODIFY `orderID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `stock`
--
ALTER TABLE `stock`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `supID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1001;
--
-- AUTO_INCREMENT for table `supplier_orders`
--
ALTER TABLE `supplier_orders`
  MODIFY `order_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `wedding_events`
--
ALTER TABLE `wedding_events`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `wedding_groups`
--
ALTER TABLE `wedding_groups`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
