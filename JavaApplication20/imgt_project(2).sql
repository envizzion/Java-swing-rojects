-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 24, 2017 at 04:54 PM
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
('KE001', '11/6/17', 0, 0, 0, 'KE', 'a', '555555555v'),
('KE003', '11/7/17', 0, 0, 0, 'KE', 'dsd', '333333333v'),
('KE004', '11/12/17', 0, 0, 0, 'KE', 'gg', '111111111v'),
('KE005', '11/12/17', 0, 0, 0, 'KE', 'aa', '555555555v'),
('SI002', '11/6/17', 0, 0, 0, 'SI', 'a', '555555555v'),
('SI003', '11/12/17', 0, 0, 0, 'SI', 'gg', '111111111v'),
('SI004', '11/12/17', 0, 0, 0, 'SI', 'fff', '888888888v');

-- --------------------------------------------------------

--
-- Table structure for table `child_info`
--

CREATE TABLE `child_info` (
  `Name` varchar(100) NOT NULL,
  `gNIC` varchar(10) NOT NULL,
  `Age` int(11) NOT NULL,
  `DoB` date NOT NULL,
  `Address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `child_info`
--

INSERT INTO `child_info` (`Name`, `gNIC`, `Age`, `DoB`, `Address`) VALUES
('a', '555555555v', 3, '2011-06-17', 'b,bb,bbb'),
('aa', '555555555v', 3, '2011-12-17', 'b,bb,bbb'),
('dsd', '333333333v', 3, '2011-07-17', 'c,cc,ccc'),
('gg', '111111111v', 3, '2011-12-17', 'g,bbg,bbbg');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `NIC` varchar(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `DoB` date NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Telephone` varchar(11) NOT NULL,
  `Income` double UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`NIC`, `Name`, `DoB`, `Address`, `Telephone`, `Income`) VALUES
('222222222v', 'd', '2011-12-17', 'q,qq,qqq', '1244444444', 334),
('444444444v', 'a', '2011-07-17', 'a,aa,aaa', '4444444444', 55),
('777777777v', 'a', '2011-07-17', 'a,aa,aaa', '4444444444', 55),
('888888888v', 'a', '2011-07-17', 'a,aa,aaa', '4444444444', 55),
('999999999v', 'dd', '2011-07-17', 'e,ee,eee', '4444444444', 44);

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

--
-- Dumping data for table `groupsavings`
--

INSERT INTO `groupsavings` (`AccNo`, `StartDate`, `DepositAmount`, `WithdrawAmount`, `Total`) VALUES
('GS001', '11/7/17', 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `groupsavingsmembers`
--

CREATE TABLE `groupsavingsmembers` (
  `NIC` varchar(10) NOT NULL,
  `AccNo` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `groupsavingsmembers`
--

INSERT INTO `groupsavingsmembers` (`NIC`, `AccNo`) VALUES
('111111111v', 'GS001'),
('444444444v', 'GS001'),
('777777777v', 'GS001'),
('999999999v', 'GS001');

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

--
-- Dumping data for table `guaranter`
--

INSERT INTO `guaranter` (`LoanID`, `NIC`, `Name`, `ContactNumber`) VALUES
('LN001', '888888877v', 'u', '7877879789');

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
('111111111v', 'ggg', 'g,bbg,bbbg'),
('333333333v', 'asdf', 'c,cc,ccc'),
('555555555v', 'aa', 'b,bb,bbb');

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

--
-- Dumping data for table `loandetails`
--

INSERT INTO `loandetails` (`LoanID`, `NIC`, `Amount`, `Installment`, `No_of_Installment`, `RemainingInstallment`, `RemainingAmount`, `Type`, `Issued`, `StartDate`) VALUES
('LN001', '777777777v', 6050, 504.54545454545456, 12, 10, 5045.454545454545, 'CU', 'yes', '09/10/17');

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

--
-- Dumping data for table `loaninfo`
--

INSERT INTO `loaninfo` (`TypeID`, `Type`, `Interest`, `MinAmount`, `MaxAmount`) VALUES
('001', 'CU', 0.1, 2500, 15000),
('002', 'SE', 0.1, 25000, 500000),
('003', 'LI', 0.05, 25000, 200000),
('004', 'HO', 0.12, 30000, 100000);

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
('MS001', '555555555v'),
('MS004', '888888888v'),
('MS005', '999999999v'),
('MS006', '222222222v'),
('MS008', '777777777v'),
('SH003', '777777777v'),
('SS001', '777777777v');

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
('MS001', '11/6/17', 1314.4473133887204, 0, 1314.4473133887204, '555555555v'),
('MS004', '08/25/15', 855.1696790581566, 0, 855.1696790581566, '888888888v'),
('MS008', '11/25/15', 17120, 2000, 15120, '777777777v');

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

--
-- Dumping data for table `samurdhidefinitesavings`
--

INSERT INTO `samurdhidefinitesavings` (`AccNo`, `StartDate`, `DepositAmount`, `Total`, `NIC`) VALUES
('SS001', '11/24/17', 0, 0, '777777777v');

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
('SH001', '11/14/17', 500, 0, 500, '777777777v'),
('SH002', '11/14/17', 0, 0, 0, '777777777v'),
('SH003', '11/14/17', 0, 0, 0, '777777777v');

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

--
-- Dumping data for table `stamp`
--

INSERT INTO `stamp` (`Stamp_id`, `ForSavings`, `ForDeposit`, `Eligible`, `NIC`) VALUES
(3, 200, 2500, 'Yes', '777777777v');

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
  ADD PRIMARY KEY (`AccNo`);

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
  ADD PRIMARY KEY (`AccNo`);

--
-- Indexes for table `nonmember`
--
ALTER TABLE `nonmember`
  ADD PRIMARY KEY (`AccNo`);

--
-- Indexes for table `nonmembersavings`
--
ALTER TABLE `nonmembersavings`
  ADD PRIMARY KEY (`AccNo`);

--
-- Indexes for table `samurdhidefinitesavings`
--
ALTER TABLE `samurdhidefinitesavings`
  ADD PRIMARY KEY (`AccNo`);

--
-- Indexes for table `shares`
--
ALTER TABLE `shares`
  ADD PRIMARY KEY (`AccNo`);

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
  MODIFY `Stamp_id` double NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
