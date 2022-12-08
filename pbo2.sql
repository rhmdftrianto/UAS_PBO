-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2022 at 05:54 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo2`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`username`, `password`) VALUES
('admin', 'admin'),
('user', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `departemen`
--

CREATE TABLE `departemen` (
  `KODE_DEPARTEMEN` varchar(3) NOT NULL,
  `NAMA_DEPARTEMEN` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `departemen`
--

INSERT INTO `departemen` (`KODE_DEPARTEMEN`, `NAMA_DEPARTEMEN`) VALUES
('002', 'Eksternal'),
('004', 'Internal'),
('003', 'Keilmuan'),
('001', 'KPSDM');

-- --------------------------------------------------------

--
-- Table structure for table `himatol`
--

CREATE TABLE `himatol` (
  `NIM` varchar(12) NOT NULL,
  `NAMA` varchar(20) NOT NULL,
  `DIVISI` varchar(20) NOT NULL,
  `DEPARTEMEN` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `himatol`
--

INSERT INTO `himatol` (`NIM`, `NAMA`, `DIVISI`, `DEPARTEMEN`) VALUES
('1909116017', 'Ferryza Nurwahyu', 'Adkesma', 'Internal'),
('2109116027', 'Rahmad Fitrianto', 'Hub Akademik', 'Keilmuan'),
('2109116036', 'Zaki Baridwan Sauqi', 'MBM', 'KPSDM'),
('2109116097', 'Andi Muhammad ', 'Sosmas', 'Eksternal');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `departemen`
--
ALTER TABLE `departemen`
  ADD PRIMARY KEY (`KODE_DEPARTEMEN`),
  ADD KEY `NAMA_DEPARTEMEN` (`NAMA_DEPARTEMEN`);

--
-- Indexes for table `himatol`
--
ALTER TABLE `himatol`
  ADD PRIMARY KEY (`NIM`),
  ADD KEY `fk_departemen` (`DEPARTEMEN`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `himatol`
--
ALTER TABLE `himatol`
  ADD CONSTRAINT `fk_departemen` FOREIGN KEY (`DEPARTEMEN`) REFERENCES `departemen` (`NAMA_DEPARTEMEN`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
