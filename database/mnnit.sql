-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 26, 2019 at 09:04 PM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mnnit`
--

-- --------------------------------------------------------

--
-- Table structure for table `getit`
--

CREATE TABLE IF NOT EXISTS `getit` (
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mob` varchar(10) DEFAULT NULL,
  `id` varchar(30) NOT NULL,
  `pwd` varchar(20) DEFAULT NULL,
  `address` varchar(200) NOT NULL DEFAULT 'My house',
  `state` varchar(30) NOT NULL DEFAULT 'my state',
  `city` varchar(30) NOT NULL DEFAULT 'my city',
  `pincode` int(6) NOT NULL DEFAULT '111111',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `getit`
--

INSERT INTO `getit` (`name`, `email`, `mob`, `id`, `pwd`, `address`, `state`, `city`, `pincode`) VALUES
('ADITYA', 'ben@10.com', '6234567890', 'aditya', '12345678', 'My house', 'my state', 'my city', 111111),
('Mayankesh Mishra', 'mayankeshmishra100@gmail.com', '7905084484', 'manku', 'sheela', 'My house', 'my state', 'my city', 111111),
('mudita', 'mudita@g', '8787023436', 'mudita', 'tapan123', 'My house', 'my state', 'my city', 111111),
('Prajwal', 'prajwal@gmail.com', '8853586550', 'prajwal', '19027812', 'My house', 'my state', 'my city', 111111),
('Pranshu', 'shuklapranshu679@gmail.com', '6307854453', 'pranshu', '123456789', 'My house', 'my state', 'my city', 111111),
('trial user', 'trial@gmail.com', '9450507505', 'qwe', '19027812', 'My house', 'my state', 'my city', 111111),
('Ankit mishra', 'ankit@gmail.com', '6789654321', 'sa', '12345678', 'My house', 'my state', 'my city', 111111),
('Sankalp mishra', 'sankalp1902@gmail.com', '8853586550', 'sankalp1902', '19027812', 'My house', 'my state', 'my city', 111111),
('Shatakshi tripathi', 'shatakshi@gmail.com', '8853586550', 'shatakshi', '19027812', 'My house', 'my state', 'my city', 111111);

-- --------------------------------------------------------

--
-- Table structure for table `health`
--

CREATE TABLE IF NOT EXISTS `health` (
  `id` varchar(30) NOT NULL,
  `address` varchar(300) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `pincode` int(6) DEFAULT NULL,
  `pack` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `health`
--

INSERT INTO `health` (`id`, `address`, `state`, `city`, `pincode`, `pack`) VALUES
('902', NULL, NULL, NULL, NULL, NULL),
('aditya', NULL, NULL, NULL, NULL, NULL),
('dn', NULL, NULL, NULL, NULL, NULL),
('jj', NULL, NULL, NULL, NULL, NULL),
('manku', 'Hig-32, 1-Circular road, Rajapur', 'Uttar Pradesh', 'Allahabad', 211001, NULL),
('mudita', NULL, NULL, NULL, NULL, NULL),
('prajwal', NULL, NULL, NULL, NULL, NULL),
('pranshu', NULL, NULL, NULL, NULL, NULL),
('rishabh', NULL, NULL, NULL, NULL, NULL),
('sankjmn', NULL, NULL, NULL, NULL, NULL),
('sanr', NULL, NULL, NULL, NULL, NULL),
('sanrghf', NULL, NULL, NULL, NULL, NULL),
('shatakshi', NULL, NULL, NULL, NULL, NULL),
('tapan', NULL, NULL, NULL, NULL, NULL),
('tapan.chitransh', NULL, NULL, NULL, NULL, NULL),
('wedf', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `healthadmin`
--

CREATE TABLE IF NOT EXISTS `healthadmin` (
  `id` int(2) DEFAULT NULL,
  `headtext` varchar(500) DEFAULT NULL,
  `headlist1` varchar(500) DEFAULT NULL,
  `headlist2` varchar(500) DEFAULT NULL,
  `headlist3` varchar(500) DEFAULT NULL,
  `bantext` varchar(500) DEFAULT NULL,
  `worktext` varchar(500) DEFAULT NULL,
  `packtext` varchar(500) DEFAULT NULL,
  `servicetext` varchar(500) DEFAULT NULL,
  `price` varchar(5) DEFAULT NULL,
  `hdetail` varchar(500) DEFAULT NULL,
  `hprice` varchar(5) DEFAULT NULL,
  `wdetail` varchar(500) DEFAULT NULL,
  `wprice` varchar(5) DEFAULT NULL,
  `ddetail` varchar(500) DEFAULT NULL,
  `dprice` varchar(5) DEFAULT NULL,
  `bdetail` varchar(500) DEFAULT NULL,
  `bprice` varchar(5) DEFAULT NULL,
  `weekdetail` varchar(500) DEFAULT NULL,
  `weekprice` varchar(5) DEFAULT NULL,
  `gallery` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `healthadmin`
--

INSERT INTO `healthadmin` (`id`, `headtext`, `headlist1`, `headlist2`, `headlist3`, `bantext`, `worktext`, `packtext`, `servicetext`, `price`, `hdetail`, `hprice`, `wdetail`, `wprice`, `ddetail`, `dprice`, `bdetail`, `bprice`, `weekdetail`, `weekprice`, `gallery`) VALUES
(1, 'STAY FIT & HEALTHY', 'We will help you achieve your perfect body', 'It is never too late to get back in shape', 'All we need is your full dedication', 'Get it health and fitness will help you achieve your dream shape in your free time as you are free to select your own package as per your need :)', 'Some of the methods that may help you get your goal :-)', 'This is dummy text, you may change it from admin panel.', '', '20', 'This is dummy text', '2500', 'This is dummy text', '1200', '', '40', '', '1500', 'This is dummy text', '2200', 'This is dummy text, you may change it from admin panel.');

-- --------------------------------------------------------

--
-- Table structure for table `indexadmin`
--

CREATE TABLE IF NOT EXISTS `indexadmin` (
  `id` int(2) NOT NULL DEFAULT '1',
  `headtext` varchar(500) DEFAULT NULL,
  `repairservicedetail` varchar(500) DEFAULT NULL,
  `healthservicedetail` varchar(500) DEFAULT NULL,
  `tutorservicedetail` varchar(500) DEFAULT NULL,
  `salonservicedetail` varchar(500) DEFAULT NULL,
  `footerquote` varchar(500) DEFAULT NULL,
  `enablehealth` varchar(10) NOT NULL DEFAULT 'enable',
  `enabletutor` varchar(10) NOT NULL DEFAULT 'enable',
  `enablerepair` varchar(10) NOT NULL DEFAULT 'enable',
  `enablesalon` varchar(10) NOT NULL DEFAULT 'enable'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `indexadmin`
--

INSERT INTO `indexadmin` (`id`, `headtext`, `repairservicedetail`, `healthservicedetail`, `tutorservicedetail`, `salonservicedetail`, `footerquote`, `enablehealth`, `enabletutor`, `enablerepair`, `enablesalon`) VALUES
(1, 'A helping hand for you :)', 'Got your electronics ruined? ', 'Willing for a better body shape?', 'Want your child to score more?', 'Get yourself groomed', 'Our team which made it to this much ;)', 'Enable', 'Enable', 'Enable', 'Enable');

-- --------------------------------------------------------

--
-- Table structure for table `partner`
--

CREATE TABLE IF NOT EXISTS `partner` (
  `name` varchar(50) DEFAULT NULL,
  `gender` varchar(7) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `aadhar` bigint(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `phone` bigint(10) NOT NULL,
  `type` varchar(25) NOT NULL,
  `password` varchar(30) NOT NULL,
  `add1` varchar(50) NOT NULL,
  `add2` varchar(50) NOT NULL,
  `city` varchar(20) NOT NULL,
  `state` varchar(20) NOT NULL,
  `pin` int(6) NOT NULL,
  `time_from` varchar(10) NOT NULL DEFAULT '10:00 AM',
  `time_till` varchar(10) NOT NULL DEFAULT '05:00 PM',
  `sunday` int(1) NOT NULL DEFAULT '0',
  `monday` int(1) NOT NULL DEFAULT '0',
  `tuesday` int(1) NOT NULL DEFAULT '0',
  `wednesday` int(1) NOT NULL DEFAULT '0',
  `thursday` int(1) NOT NULL DEFAULT '0',
  `friday` int(1) NOT NULL DEFAULT '0',
  `saturday` int(1) NOT NULL DEFAULT '0',
  `Status` varchar(10) NOT NULL DEFAULT 'availaible',
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `partner`
--

INSERT INTO `partner` (`name`, `gender`, `dob`, `aadhar`, `email`, `phone`, `type`, `password`, `add1`, `add2`, `city`, `state`, `pin`, `time_from`, `time_till`, `sunday`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `saturday`, `Status`) VALUES
('Sankalp Mishra', 'Male', '2000-02-22', 111122223333, 'sankalp1902@gmail.com', 8853586550, 'Tutor', '19027812', 'Ward no 7 House no 209', 'wqe', 'Allahabad', 'Uttar Pradesh', 211019, '02:22', '14:22', 1, 1, 1, 1, 1, 1, 1, 'availaible'),
('Ankit mishra', 'Male', '1999-03-29', 777777777777, 'asdfg@sdfghj', 9876543210, 'Repairing', '12345678', 'qwert', 'asdfg', 'sdfgh', 'Uttar Pradesh', 211019, '00:00', '17:00', 0, 1, 0, 1, 1, 1, 1, 'availaible');

-- --------------------------------------------------------

--
-- Table structure for table `repair`
--

CREATE TABLE IF NOT EXISTS `repair` (
  `id` varchar(30) NOT NULL,
  `address` varchar(300) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `pincode` int(6) DEFAULT NULL,
  `pack` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `repair`
--

INSERT INTO `repair` (`id`, `address`, `state`, `city`, `pincode`, `pack`) VALUES
('aditya', NULL, NULL, NULL, NULL, NULL),
('mudita', NULL, NULL, NULL, NULL, NULL),
('prajwal', 'qwedrh, wsdfhj, adchjk', 'dcfmkl', 'zsdjklzs', 211019, NULL),
('pranshu', NULL, NULL, NULL, NULL, NULL),
('qwe', NULL, NULL, NULL, NULL, NULL),
('sa', NULL, NULL, NULL, NULL, NULL),
('shatakshi', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `salon`
--

CREATE TABLE IF NOT EXISTS `salon` (
  `id` varchar(30) DEFAULT NULL,
  `address` varchar(300) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `pincode` int(6) DEFAULT NULL,
  `pack` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salon`
--

INSERT INTO `salon` (`id`, `address`, `state`, `city`, `pincode`, `pack`) VALUES
('prajwal', NULL, NULL, NULL, NULL, NULL),
('mudita', NULL, NULL, NULL, NULL, NULL),
('qwe', NULL, NULL, NULL, NULL, NULL),
('sa', NULL, NULL, NULL, NULL, NULL),
('pranshu', NULL, NULL, NULL, NULL, NULL),
('aditya', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `salonadmin`
--

CREATE TABLE IF NOT EXISTS `salonadmin` (
  `id` int(2) NOT NULL,
  `head` varchar(500) NOT NULL,
  `headlist1` varchar(1000) NOT NULL,
  `headlist2` varchar(1000) NOT NULL,
  `headlist3` varchar(1000) NOT NULL,
  `bantext` varchar(1000) NOT NULL,
  `worktext` varchar(1000) NOT NULL,
  `packtext` varchar(1000) NOT NULL,
  `pack1` varchar(500) NOT NULL,
  `pack2` varchar(500) NOT NULL,
  `pack3` varchar(500) NOT NULL,
  `pack4` varchar(500) NOT NULL,
  `price1` varchar(10) NOT NULL,
  `price2` varchar(10) NOT NULL,
  `price3` varchar(10) NOT NULL,
  `price4` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tutor`
--

CREATE TABLE IF NOT EXISTS `tutor` (
  `id` varchar(20) NOT NULL,
  `address` varchar(100) NOT NULL,
  `state` varchar(20) NOT NULL,
  `city` varchar(20) NOT NULL,
  `pincode` int(6) NOT NULL,
  `subject` varchar(15) NOT NULL,
  `class` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tutoradmin`
--

CREATE TABLE IF NOT EXISTS `tutoradmin` (
  `id` int(2) DEFAULT NULL,
  `headtext` varchar(500) DEFAULT NULL,
  `servicetext` varchar(500) DEFAULT NULL,
  `tutorserviceteacher` varchar(500) DEFAULT NULL,
  `tutorserviceclass` varchar(500) DEFAULT NULL,
  `tutorservicesubject` varchar(500) DEFAULT NULL,
  `method` varchar(500) DEFAULT NULL,
  `tutormethod1` varchar(500) DEFAULT NULL,
  `tutormethod2` varchar(500) DEFAULT NULL,
  `tutormethod3` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tutoradmin`
--

INSERT INTO `tutoradmin` (`id`, `headtext`, `servicetext`, `tutorserviceteacher`, `tutorserviceclass`, `tutorservicesubject`, `method`, `tutormethod1`, `tutormethod2`, `tutormethod3`) VALUES
(1, 'A LEARNING CURVE IS ESSENTIAL FOR GROWTH...', 'This is dummy text', 'This is dummy text', 'This is dummy text', 'This is dummy text', 'This is dummy text', 'This is dummy text', 'This is dummy test', 'This is dummy text');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
