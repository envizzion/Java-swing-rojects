-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 25, 2017 at 03:44 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `imgt_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `accountinfo`
--

CREATE TABLE `accountinfo` (
  `TypeID` varchar(10) NOT NULL,
  `Type` varchar(100) NOT NULL,
  `Interest` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `child`
--

CREATE TABLE `child` (
  `AccNo` varchar(5) NOT NULL,
  `StartDate` varchar(100) NOT NULL,
  `DepositAmount` double UNSIGNED NOT NULL,
  `WithdrawAmount` double UNSIGNED NOT NULL,
  `Total` double UNSIGNED NOT NULL,
  `Type` varchar(10) NOT NULL,
  `childName` varchar(50) NOT NULL,
  `gNIC` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `child`
--

INSERT INTO `child` (`AccNo`, `StartDate`, `DepositAmount`, `WithdrawAmount`, `Total`, `Type`, `childName`, `gNIC`) VALUES
('KE001', '11/25/17', 0, 0, 0, 'KE', 'baba', '111111111v');

-- --------------------------------------------------------

--
-- Table structure for table `child_info`
--

CREATE TABLE `child_info` (
  `Name` varchar(100) NOT NULL,
  `gNIC` varchar(10) NOT NULL,
  `Age` int(11) NOT NULL,
  `DoB` varchar(20) NOT NULL,
  `Address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `child_info`
--

INSERT INTO `child_info` (`Name`, `gNIC`, `Age`, `DoB`, `Address`) VALUES
('baba', '111111111v', 22, '11/12/14', 'c,cc,ccc');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `NIC` varchar(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `DoB` varchar(20) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Telephone` varchar(11) NOT NULL,
  `Income` double UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`NIC`, `Name`, `DoB`, `Address`, `Telephone`, `Income`) VALUES
('111111111v', 'aaa', '11/25/17', 'b,bb,bbb', '0771234567', 1000);

-- --------------------------------------------------------

--
-- Table structure for table `diriyamathasavings`
--

CREATE TABLE `diriyamathasavings` (
  `AccNo` varchar(5) NOT NULL,
  `StartDate` varchar(100) NOT NULL,
  `DepositAmount` double UNSIGNED NOT NULL,
  `WithdrawAmount` double UNSIGNED NOT NULL,
  `Total` double UNSIGNED NOT NULL,
  `NIC` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `groupsavings`
--

CREATE TABLE `groupsavings` (
  `AccNo` varchar(5) NOT NULL,
  `StartDate` varchar(100) DEFAULT NULL,
  `DepositAmount` double UNSIGNED DEFAULT NULL,
  `WithdrawAmount` double UNSIGNED DEFAULT NULL,
  `Total` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `groupsavingsmembers`
--

CREATE TABLE `groupsavingsmembers` (
  `NIC` varchar(10) NOT NULL,
  `AccNo` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `guaranter`
--

CREATE TABLE `guaranter` (
  `LoanID` varchar(5) NOT NULL,
  `NIC` varchar(10) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `ContactNumber` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `guardian`
--

CREATE TABLE `guardian` (
  `NIC` varchar(10) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guardian`
--

INSERT INTO `guardian` (`NIC`, `Name`, `Address`) VALUES
('111111111v', 'a', 'c,cc,ccc');

-- --------------------------------------------------------

--
-- Table structure for table `loandetails`
--

CREATE TABLE `loandetails` (
  `LoanID` varchar(5) NOT NULL,
  `NIC` varchar(10) NOT NULL,
  `Amount` double NOT NULL,
  `Installment` double UNSIGNED NOT NULL,
  `No_of_Installment` int(10) UNSIGNED NOT NULL,
  `RemainingInstallment` int(10) UNSIGNED NOT NULL,
  `RemainingAmount` double UNSIGNED NOT NULL,
  `Type` varchar(100) NOT NULL,
  `Issued` varchar(5) NOT NULL DEFAULT 'No',
  `StartDate` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `loaninfo`
--

CREATE TABLE `loaninfo` (
  `TypeID` varchar(10) NOT NULL,
  `Type` varchar(100) NOT NULL,
  `Interest` double NOT NULL,
  `MinAmount` double NOT NULL,
  `MaxAmount` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `AccNo` varchar(5) NOT NULL,
  `NIC` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`AccNo`, `NIC`) VALUES
('MS001', '111111111v'),
('SH001', '111111111v');

-- --------------------------------------------------------

--
-- Table structure for table `membersavings`
--

CREATE TABLE `membersavings` (
  `AccNo` varchar(5) NOT NULL,
  `StartDate` varchar(50) NOT NULL,
  `DepositAmount` double UNSIGNED NOT NULL,
  `WithdrawAmount` double UNSIGNED NOT NULL,
  `Total` double UNSIGNED NOT NULL,
  `NIC` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `membersavings`
--

INSERT INTO `membersavings` (`AccNo`, `StartDate`, `DepositAmount`, `WithdrawAmount`, `Total`, `NIC`) VALUES
('MS001', '11/25/17', 0, 0, 0, '111111111v');

-- --------------------------------------------------------

--
-- Table structure for table `nonmember`
--

CREATE TABLE `nonmember` (
  `AccNo` varchar(5) NOT NULL,
  `NIC` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `nonmembersavings`
--

CREATE TABLE `nonmembersavings` (
  `AccNo` varchar(5) NOT NULL,
  `StartDate` varchar(100) NOT NULL,
  `DepositAmount` double UNSIGNED NOT NULL,
  `WithdrawAmount` double UNSIGNED NOT NULL,
  `Total` double UNSIGNED NOT NULL,
  `NIC` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `samurdhidefinitesavings`
--

CREATE TABLE `samurdhidefinitesavings` (
  `AccNo` varchar(5) NOT NULL,
  `StartDate` varchar(100) NOT NULL,
  `DepositAmount` double UNSIGNED NOT NULL,
  `Total` double UNSIGNED NOT NULL,
  `NIC` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `shares`
--

CREATE TABLE `shares` (
  `AccNo` varchar(5) NOT NULL,
  `StartDate` varchar(100) NOT NULL,
  `DepositAmount` double UNSIGNED NOT NULL,
  `WithdrawAmount` double UNSIGNED NOT NULL,
  `Total` double UNSIGNED NOT NULL,
  `NIC` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shares`
--

INSERT INTO `shares` (`AccNo`, `StartDate`, `DepositAmount`, `WithdrawAmount`, `Total`, `NIC`) VALUES
('SH001', '11/25/17', 0, 0, 0, '111111111v');

-- --------------------------------------------------------

--
-- Table structure for table `stamp`
--

CREATE TABLE `stamp` (
  `Stamp_id` double NOT NULL,
  `ForSavings` double UNSIGNED DEFAULT NULL,
  `ForDeposit` double UNSIGNED NOT NULL,
  `Eligible` varchar(10) NOT NULL DEFAULT 'No',
  `NIC` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `updatedetails`
--

CREATE TABLE `updatedetails` (
  `type` varchar(15) NOT NULL,
  `Interest` double NOT NULL,
  `LastUpdate` date NOT NULL,
  `NextUpdate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `updatedetails`
--

INSERT INTO `updatedetails` (`type`, `Interest`, `LastUpdate`, `NextUpdate`) VALUES
('DSK', 0.05, '2017-12-30', '2018-06-30'),
('LOANS', 0, '2017-10-31', '2017-11-30'),
('MGN', 0.05, '2017-12-30', '2018-04-30'),
('SamShar', 0.05, '2018-12-31', '2019-12-31'),
('STAMP', 0, '2017-10-07', '2017-11-07');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `NIC` varchar(10) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Usernmae` varchar(50) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `Type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`NIC`, `Name`, `Usernmae`, `Password`, `Type`) VALUES
('121212121v', 'a', 'abcd', '1234', 'Accountant'),
('232323232v', 'b', 'abcd', '1234', 'Cashier'),
('343434343v', 'c', 'abcd', '1234', 'Loan'),
('d', 'sdsdff', 'abcd', '1234', 'Manager');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accountinfo`
--
ALTER TABLE `accountinfo`
  ADD PRIMARY KEY (`TypeID`);

--
-- Indexes for table `child`
--
ALTER TABLE `child`
  ADD PRIMARY KEY (`AccNo`);

--
-- Indexes for table `child_info`
--
ALTER TABLE `child_info`
  ADD PRIMARY KEY (`Name`,`gNIC`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`NIC`);

--
-- Indexes for table `diriyamathasavings`
--
ALTER TABLE `diriyamathasavings`
  ADD PRIMARY KEY (`AccNo`),
  ADD KEY `NIC` (`NIC`);

--
-- Indexes for table `groupsavings`
--
ALTER TABLE `groupsavings`
  ADD PRIMARY KEY (`AccNo`);

--
-- Indexes for table `groupsavingsmembers`
--
ALTER TABLE `groupsavingsmembers`
  ADD PRIMARY KEY (`NIC`);

--
-- Indexes for table `guaranter`
--
ALTER TABLE `guaranter`
  ADD PRIMARY KEY (`LoanID`);

--
-- Indexes for table `guardian`
--
ALTER TABLE `guardian`
  ADD PRIMARY KEY (`NIC`);

--
-- Indexes for table `loandetails`
--
ALTER TABLE `loandetails`
  ADD PRIMARY KEY (`LoanID`);

--
-- Indexes for table `loaninfo`
--
ALTER TABLE `loaninfo`
  ADD PRIMARY KEY (`TypeID`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`AccNo`);

--
-- Indexes for table `membersavings`
--
ALTER TABLE `membersavings`
  ADD PRIMARY KEY (`AccNo`),
  ADD KEY `NIC` (`NIC`);

--
-- Indexes for table `nonmember`
--
ALTER TABLE `nonmember`
  ADD PRIMARY KEY (`AccNo`);

--
-- Indexes for table `nonmembersavings`
--
ALTER TABLE `nonmembersavings`
  ADD PRIMARY KEY (`AccNo`),
  ADD KEY `NIC` (`NIC`);

--
-- Indexes for table `samurdhidefinitesavings`
--
ALTER TABLE `samurdhidefinitesavings`
  ADD PRIMARY KEY (`AccNo`),
  ADD KEY `NIC` (`NIC`);

--
-- Indexes for table `shares`
--
ALTER TABLE `shares`
  ADD PRIMARY KEY (`AccNo`),
  ADD KEY `NIC` (`NIC`);

--
-- Indexes for table `stamp`
--
ALTER TABLE `stamp`
  ADD PRIMARY KEY (`Stamp_id`);

--
-- Indexes for table `updatedetails`
--
ALTER TABLE `updatedetails`
  ADD PRIMARY KEY (`type`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`NIC`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `stamp`
--
ALTER TABLE `stamp`
  MODIFY `Stamp_id` double NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `diriyamathasavings`
--
ALTER TABLE `diriyamathasavings`
  ADD CONSTRAINT `diriyamathasavings_ibfk_1` FOREIGN KEY (`NIC`) REFERENCES `customer` (`NIC`);

--
-- Constraints for table `membersavings`
--
ALTER TABLE `membersavings`
  ADD CONSTRAINT `membersavings_ibfk_1` FOREIGN KEY (`NIC`) REFERENCES `customer` (`NIC`);

--
-- Constraints for table `nonmembersavings`
--
ALTER TABLE `nonmembersavings`
  ADD CONSTRAINT `nonmembersavings_ibfk_1` FOREIGN KEY (`NIC`) REFERENCES `customer` (`NIC`);

--
-- Constraints for table `samurdhidefinitesavings`
--
ALTER TABLE `samurdhidefinitesavings`
  ADD CONSTRAINT `samurdhidefinitesavings_ibfk_1` FOREIGN KEY (`NIC`) REFERENCES `customer` (`NIC`);

--
-- Constraints for table `shares`
--
ALTER TABLE `shares`
  ADD CONSTRAINT `shares_ibfk_1` FOREIGN KEY (`NIC`) REFERENCES `customer` (`NIC`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
