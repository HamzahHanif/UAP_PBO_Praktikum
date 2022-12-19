-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 19 Des 2022 pada 06.43
-- Versi server: 10.4.25-MariaDB
-- Versi PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uappbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `nama_produk` varchar(255) NOT NULL,
  `harga` double(12,0) DEFAULT NULL,
  `jumlah` int(25) NOT NULL,
  `diskon` double(12,0) DEFAULT NULL,
  `barcode` varchar(255) NOT NULL,
  `expired` varchar(255) NOT NULL,
  `kategori` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`nama_produk`, `harga`, `jumlah`, `diskon`, `barcode`, `expired`, `kategori`) VALUES
('qqqq', 2131, 2, 1231, '10', '2', ''),
('pempek', 2000, 1, 1000, '1', '2', 'makanan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mkn`
--

CREATE TABLE `mkn` (
  `nama_produk` varchar(255) NOT NULL,
  `harga` double(12,0) DEFAULT NULL,
  `jumlah` int(12) NOT NULL,
  `diskon` double(12,0) DEFAULT NULL,
  `id` int(12) NOT NULL,
  `daya_tahan` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `mkn`
--

INSERT INTO `mkn` (`nama_produk`, `harga`, `jumlah`, `diskon`, `id`, `daya_tahan`) VALUES
('mi ayam', 0., 1, 0., 1, 1),
('mi ayam', 0., 1, 0., 2, 1),
('mi ayam', 0., 1, 0., 3, 1),
('mi ayam', 0., 1, 0., 4, 1),
('mi ayam', 0., 1, 0., 5, 1),
('cilor', 2000, 1, 1, 6, 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE `penjualan` (
  `jumlahProduk` int(11) NOT NULL,
  `harga` int(11) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `penjualan`
--

INSERT INTO `penjualan` (`jumlahProduk`, `harga`, `stok`) VALUES
(1, 1, 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `produk`
--

CREATE TABLE `produk` (
  `nama_produk` varchar(255) NOT NULL,
  `harga` double(12,4) NOT NULL,
  `jumlah` int(20) DEFAULT NULL,
  `diskon` double(12,4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `mkn`
--
ALTER TABLE `mkn`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `mkn`
--
ALTER TABLE `mkn`
  MODIFY `id` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
