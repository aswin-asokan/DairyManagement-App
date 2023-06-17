-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 11, 2022 at 05:46 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Dairymanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `Purchases`
--

CREATE TABLE `Purchases` (
  `Id` int(11) NOT NULL,
  `SellerName` varchar(30) NOT NULL,
  `MilkType` varchar(20) NOT NULL,
  `Quantity` int(30) NOT NULL,
  `Rate` int(30) NOT NULL,
  `Amount` int(30) NOT NULL,
  `Date` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Purchases`
--

INSERT INTO `Purchases` (`Id`, `SellerName`, `MilkType`, `Quantity`, `Rate`, `Amount`, `Date`) VALUES
(16, 'Ramu', 'Milk : Cow', 10, 20, 200, '29/04/2022'),
(17, 'Ramu', 'Milk : Cow', 10, 20, 200, '01/04/2022'),
(18, 'Raju', 'Milk : Goat', 10, 30, 300, '01/05/2022'),
(19, 'Raju', 'Milk : Goat', 10, 30, 300, '02/05/2022'),
(20, 'Reghu', 'Milk : Buffalo', 10, 25, 250, '02/05/2022'),
(21, 'Jacob', 'Butter', 5, 15, 75, '03/05/2022'),
(22, 'Jose', 'Ghee', 5, 15, 75, '03/05/2022'),
(24, 'Kevin', 'Cream', 7, 15, 105, '04/05/2022'),
(25, 'Kevin', 'Cream', 7, 15, 105, '05/05/2022'),
(26, 'Ramu', 'Milk : Cow', 10, 20, 200, '06/05/2022'),
(27, 'Jose', 'Cheese', 7, 20, 140, '06/05/2022'),
(28, 'Jacob', 'Milk : Goat', 10, 30, 300, '07/05/2022'),
(30, 'Raju', 'Milk : Buffalo', 5, 25, 125, '08/05/2022');

-- --------------------------------------------------------

--
-- Table structure for table `Quantity`
--

CREATE TABLE `Quantity` (
  `Product` varchar(30) NOT NULL,
  `Sum` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Quantity`
--

INSERT INTO `Quantity` (`Product`, `Sum`) VALUES
('Milk : Cow', 7),
('Milk : Goat', 4),
('Milk : Buffalo', 5),
('Butter', 0),
('Ghee', 0),
('Cheese', 3),
('Cream', 7);

-- --------------------------------------------------------

--
-- Table structure for table `Registration`
--

CREATE TABLE `Registration` (
  `UserName` varchar(30) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `PhnNum` varchar(10) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Registration`
--

INSERT INTO `Registration` (`UserName`, `Address`, `PhnNum`, `Password`) VALUES
('', 'wqwq', 'qwqw', ''),
('as', 'as', '1234', '1234'),
('Aswin', 'Aluva', '6238303567', '123456'),
('AswinA', 'Aluva', '12345698', '123456'),
('Raju', 'Perumbavoor', '2456987315', '123456'),
('Ramu', 'Kochi', '1234567890', '123456'),
('Reghu', 'Malappuram', '78451296', '123456'),
('shawarma', 'kochi', '6238802171', 'sathwik');

-- --------------------------------------------------------

--
-- Table structure for table `Sales`
--

CREATE TABLE `Sales` (
  `Id` int(11) NOT NULL,
  `DealerName` varchar(30) NOT NULL,
  `MilkType` varchar(20) NOT NULL,
  `Quantity` int(30) NOT NULL,
  `Rate` int(30) NOT NULL,
  `Amount` int(30) NOT NULL,
  `Date` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Sales`
--

INSERT INTO `Sales` (`Id`, `DealerName`, `MilkType`, `Quantity`, `Rate`, `Amount`, `Date`) VALUES
(20, 'Seetha', 'Milk : Cow', 6, 25, 150, '30/04/2022'),
(21, 'Raju', 'Milk : Cow', 4, 25, 100, '01/05/2022'),
(22, 'Ramu', 'Milk : Goat', 10, 35, 350, '01/05/2022'),
(23, 'Reghu', 'Milk : Cow', 10, 25, 250, '02/05/2022'),
(24, 'Ramu', 'Milk : Goat', 10, 35, 350, '02/05/2022'),
(25, 'Seetha', 'Milk : Buffalo', 10, 35, 350, '02/05/2022'),
(26, 'Jose', 'Butter', 5, 20, 100, '03/05/2022'),
(27, 'Jacob', 'Ghee', 5, 20, 100, '03/05/2022'),
(29, 'Mary', 'Cream', 6, 20, 120, '05/05/2022'),
(30, 'Jose', 'Cream', 1, 20, 20, '05/05/2022'),
(32, 'Kevin', 'Cheese', 4, 25, 100, '06/05/2022'),
(43, 'Jose', 'Milk : Goat', 6, 35, 210, '07/06/2022'),
(44, 'sathwik', 'Milk : Cow', 3, 25, 75, '07/07/2022');

-- --------------------------------------------------------

--
-- Table structure for table `Staffs`
--

CREATE TABLE `Staffs` (
  `Id` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `PhoneNumber` varchar(10) NOT NULL,
  `Address` varchar(30) NOT NULL,
  `Age` int(10) NOT NULL,
  `Gender` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Staffs`
--

INSERT INTO `Staffs` (`Id`, `Name`, `PhoneNumber`, `Address`, `Age`, `Gender`) VALUES
(3, 'Raghav', '95768497', 'Aluva', 30, 'Male'),
(6, 'Geetha', '45631289', 'Perumbavoor', 27, 'Female');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Purchases`
--
ALTER TABLE `Purchases`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `Registration`
--
ALTER TABLE `Registration`
  ADD PRIMARY KEY (`UserName`);

--
-- Indexes for table `Sales`
--
ALTER TABLE `Sales`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `Staffs`
--
ALTER TABLE `Staffs`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Purchases`
--
ALTER TABLE `Purchases`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `Sales`
--
ALTER TABLE `Sales`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT for table `Staffs`
--
ALTER TABLE `Staffs`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
