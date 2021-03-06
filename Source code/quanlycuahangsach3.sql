-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th3 02, 2022 lúc 01:12 AM
-- Phiên bản máy phục vụ: 10.4.21-MariaDB
-- Phiên bản PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlycuahangsach`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitiethoadon`
--

CREATE TABLE `chitiethoadon` (
  `MaHD` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaSP` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonGia` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `chitiethoadon`
--

INSERT INTO `chitiethoadon` (`MaHD`, `MaSP`, `SoLuong`, `DonGia`) VALUES
('HD2', 'SP6', 60, 60),
('HD2', 'SP1', 2, 55.3),
('HD1', 'SP1', 1, 55.3),
('HD3', 'SP4', 1, 76),
('HD3', 'SP6', 1, 60),
('HD1', 'SP2', 10, 55.2),
('HD1', 'SP3', 11, 79.2),
('HD4', 'SP1', 3, 55.3),
('HD5', 'SP7', 1, 95),
('HD5', 'SP4', 3, 76),
('HD6', 'SP4', 1, 76),
('HD6', 'SP3', 1, 79.2),
('HD6', 'SP8', 5, 85),
('HD6', 'SP10', 2, 23),
('HD7', 'SP10', 1, 23),
('HD7', 'SP12', 2, 931.414),
('HD7', 'SP16', 3, 151),
('HD7', 'SP17', 1, 39.8),
('HD8', 'SP15', 1, 85),
('HD8', 'SP16', 1, 151),
('HD9', 'SP10', 1, 23),
('HD9', 'SP1', 1, 55.3),
('HD10', 'SP13', 1, 59),
('HD10', 'SP5', 10, 61.2),
('HD10', 'SP6', 10, 60),
('HD11', 'SP1', 1, 55.3),
('HD11', 'SP10', 1, 23),
('HD11', 'SP11', 2, 15.9),
('HD12', 'SP15', 2, 85),
('HD12', 'SP17', 1, 39.8),
('HD12', 'SP12', 1, 931.414),
('HD12', 'SP16', 5, 151),
('HD13', 'SP5', 1, 61.2),
('HD13', 'SP6', 1, 60),
('HD13', 'SP8', 3, 85),
('HD14', 'SP7', 4, 95),
('HD15', 'SP10', 1, 23),
('HD15', 'SP1', 2, 55.3),
('HD15', 'SP18', 1, 246),
('HD15', 'SP19', 1, 74),
('HD16', 'SP1', 20, 55.3);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `MaPN` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaSP` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `SoLuong` int(10) UNSIGNED NOT NULL,
  `DonGia` float UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietphieunhap`
--

INSERT INTO `chitietphieunhap` (`MaPN`, `MaSP`, `SoLuong`, `DonGia`) VALUES
('PN1', 'SP8', 10, 58),
('PN2', 'SP3', 35, 59.2),
('PN3', 'SP1', 35, 20),
('PN4', 'SP14', 35, 81),
('PN4', 'SP12', 12, 800.414),
('PN4', 'SP1', 50, 20),
('PN5', 'SP15', 31, 58),
('PN5', 'SP14', 1, 5.5),
('PN5', 'SP11', 1, 15.9),
('PN5', 'SP1', 1, 20),
('PN6', 'SP10', 1, 23.9),
('PN6', 'SP15', 10, 5.5),
('PN6', 'SP17', 5, 5.6),
('PN7', 'SP21', 100, 8),
('PN7', 'SP22', 10, 39),
('PN8', 'SP16', 10, 11.9),
('PN9', 'SP1', 10, 20);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `MaHD` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaNV` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaKH` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `NgayLap` date NOT NULL,
  `TongTien` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`MaHD`, `MaNV`, `MaKH`, `NgayLap`, `TongTien`) VALUES
('HD1', 'NV2', 'KH2', '2021-04-18', 1478.5),
('HD10', 'NV23', 'KH16', '2021-04-24', 1271),
('HD11', 'NV12', 'KH22', '2021-04-25', 110.1),
('HD12', 'NV12', 'KH19', '2021-04-26', 1896.21),
('HD13', 'NV12', 'KH14', '2021-04-26', 376.2),
('HD14', 'NV12', 'KH19', '2021-05-01', 380),
('HD15', 'NV12', 'KH15', '2021-05-05', 453.6),
('HD16', 'NV12', 'KH1', '2021-05-10', 1106),
('HD2', 'NV1', 'KH1', '2021-04-18', 240),
('HD3', 'NV1', 'KH1', '2021-04-19', 35),
('HD4', 'NV1', 'KH1', '2021-04-21', 60),
('HD5', 'NV15', 'KH1', '2021-04-24', 31.6),
('HD6', 'NV15', 'KH7', '2021-04-24', 174.6),
('HD7', 'NV15', 'KH13', '2021-04-24', 81),
('HD8', 'NV15', 'KH3', '2021-04-24', 17.4),
('HD9', 'NV15', 'KH12', '2021-04-24', 43.9);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKH` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TenKH` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `DiaChi` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `SDT` varchar(15) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`) VALUES
('KH1', 'Nguyễn Thanh Sung', 'TP HCM', '0123456789'),
('KH10', 'Trần Hải Ngọc', 'Kiên Giang', '0905271941'),
('KH11', 'Nguyễn Xuân Diệu', 'TP HCM', '0301279552'),
('KH12', 'Trần Thân Thiện', 'Hà Nội', '0123617389'),
('KH13', 'Huỳnh Minh Mẫn', 'An Giang', '0389230581'),
('KH14', 'Trần Xuân Hạ Thu Đông', 'Long An', '0972136531'),
('KH15', 'Nguyễn Thị Nở', 'TP HCM', '0702571936'),
('KH16', 'Huỳnh Anh Em', 'Bến Tre', '0892383623'),
('KH17', 'Trần Thanh Hóa', 'TP HCM', '0702397442'),
('KH18', 'Huỳnh Minh Trung', 'TP HCM', '0120982736'),
('KH19', 'Trần Ngọc Ngà', 'TP HCM', '0702843627'),
('KH2', 'Nguyễn Thiên Thu', 'Huế', '0126461589'),
('KH20', 'Trần Thị Hoài Nhớ', 'TP HCM', '0126729137'),
('KH21', 'Nguyễn Văn Võ', 'Kiên Giang', '0723812935'),
('KH22', 'Huỳnh Lê Diệu Hân', 'Hà Nội', '0306279178'),
('KH3', 'Phan Thanh Tùng', 'Hà Nội', '0952612771'),
('KH4', 'Trần Thanh Sơn', 'Hải Phòng', '0120617231'),
('KH5', 'Trần Thanh Thái', 'Bến Tre', '0912385524'),
('KH6', 'Nguyễn Hồng Nhung', 'Huế', '0967263941'),
('KH7', 'Từ Ngọc Cảnh', 'Sóc Trăng', '0306172915'),
('KH8', 'Nguyễn Thiên Phụng', 'Vũng Tàu', '0703167293'),
('KH9', 'Nguyễn Diệu Ái', 'TP HCM', '0805178293');


-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaisanpham`
--

CREATE TABLE `loaisanpham` (
  `MaLSP` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TenLSP` varchar(70) COLLATE utf8_unicode_ci NOT NULL,
  `Mota` varchar(200) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `loaisanpham`
--

INSERT INTO `loaisanpham` (`MaLSP`, `TenLSP`, `Mota`) VALUES
('LSP1', 'Văn học Việt Nam', 'Các loại sách thể loại văn học Việt Nam'),
('LSP2', 'Văn học nước ngoài', 'Các loại sách thể loại văn học nước ngoài'),
('LSP3', 'Sách Văn hóa xã hội – Lịch sử - Tôn giáo', 'Các loại sách thể loại văn hóa xã hội - lịch sử - Tôn giáo'),
('LSP4', 'Sách Giáo trình', 'Các loại sách phục vụ giảng dạy và học tập'),
('LSP5', 'Sách học ngoại ngữ', 'Các loại sách phục vụ và hỗ trợ việc học ngoại ngữ'),
('LSP6', 'Tâm lý - Kĩ năng sống', 'Các loại sách về tâm lý và kĩ năng sống'),
('LSP7', 'Tiểu sử - Hồi ký', 'Các loại sách, báo, tài liệu sử ký sưu tầm'),
('LSP8', 'Sách thiếu nhi', 'Các loại sách báo phù hợp cho trẻ em'),
('LSP9', 'Sách Kinh tế - Chính trị', 'Các loại sách về Kinh tế - Chính trị');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `MaNCC` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TenNCC` varchar(70) COLLATE utf8_unicode_ci NOT NULL,
  `DiaChi` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `SDT` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `Fax` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhacungcap`
--

INSERT INTO `nhacungcap` (`MaNCC`, `TenNCC`, `DiaChi`, `SDT`, `Fax`) VALUES
('NCC1', 'NCC Đông A', 'TP HCM', '024 3856 9367', '(84-28) 3 9951614'),
('NCC2', 'Công ty TNHH Văn Hóa Sáng Tạo First News - Trí Việt', 'TP HCM', '028 3822 7979', '(84.28) 3822 4560'),
('NCC3', 'NXB Kim Đồng', 'Hà Nội', '0243 943 4490', '0243 8229085'),
('NCC4', 'Nhã Nam', 'TP HCM', '0903244248', '(84-8) 38 443 034'),
('NCC5', 'No Starch Press', 'U.S.A', '800.420.7240', '415.863.9950'),
('NCC6', 'NXB Văn Học', 'TP.HCM', '(84. 28) 382279', '(84. 28) 3822 4560'),
('NCC7', 'Thái Hà', 'Hà Nội', '024 3793 0480', '0243 8229469'),
('NCC8', 'NXB Trẻ', 'TP HCM', '(84.028) 393162', '(84.028) 38437450');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TenNV` text COLLATE utf8_unicode_ci NOT NULL,
  `NgaySinh` date NOT NULL,
  `DiaChi` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `SDT` varchar(15) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `TenNV`, `NgaySinh`, `DiaChi`, `SDT`) VALUES
('NV1', 'Phạm Anh Tuấn', '1999-04-05', 'Đắk Lắk', '0145647854'),
('NV10', 'Nguyễn Thị Hồng Hạnh', '2001-11-29', 'Bến Tre', '01262368193'),
('NV11', 'Phan Thị Hồng Trinh', '2001-12-11', 'Nghệ An', '0366227168'),
('NV12', 'Nguyễn Hữu An', '2001-06-15', 'TP HCM', '0981578293'),
('NV13', 'Lê Công Huynh', '2001-09-12', 'Sóc Trăng', '0977232173'),
('NV14', 'Lê Hồng Hoa', '1992-08-13', 'TP HCM', '0805126735'),
('NV15', 'Nguyễn Thị My', '1992-12-30', 'Hà Nội', '0703689147'),
('NV16', 'Trương Thị Hồng Huệ', '2001-11-29', 'Quảng Bình', '0825719263'),
('NV17', 'Trương Minh Hải', '1992-01-16', 'Thanh Hoá', '0123691368'),
('NV18', 'Nguyễn Thị Cẩm Duyên', '1995-11-03', 'TP HCM', '0120984178'),
('NV19', 'Lê Thanh Quang', '1995-04-19', 'Huế', '0956146728'),
('NV2', 'Trần Văn Hi', '2000-04-05', 'TP HCM', '0123456489'),
('NV20', 'Đặng Anh Tuấn', '1997-02-14', 'Đắk Lắk', '0702536184'),
('NV21', 'Huỳnh Công Thành', '1996-11-20', 'Long An', '0709123175'),
('NV22', 'Huỳnh Thị Hồng Hương', '1994-11-27', 'TP HCM', '0912635198'),
('NV23', 'Lê Nguyên Trung', '2001-03-14', 'Long An', '0123671823'),
('NV24', 'Trương Thanh Dũng', '1997-10-28', 'Đồng Tháp', '0981237651'),
('NV25', 'Hòa', '2022-02-02', 'Bình Định', '0336397899'),
('NV3', 'Phạm Bá Nguyên Trung', '2001-05-19', 'Huế', '0128456786'),
('NV4', 'Lê Anh Tuấn', '1999-04-05', 'Đắk Lắk', '01207764668'),
('NV5', 'Trương Minh Hải', '2001-11-29', 'Quảng Bình', '0367756753'),
('NV6', 'Nguyễn Hải Âu', '1992-04-24', 'Huế', '0364198226'),
('NV7', 'Hoàng Thanh Hùng', '1989-11-13', 'Long An', '0276886265'),
('NV8', 'Trịnh Văn Công', '1990-07-16', 'Tiền Giang', '0392656931'),
('NV9', 'Nguyễn Minh Hải', '2001-11-29', 'Quảng Bình', '0977268398');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhaxuatban`
--

CREATE TABLE `nhaxuatban` (
  `MaNXB` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TenNXB` varchar(70) COLLATE utf8_unicode_ci NOT NULL,
  `Diachi` varchar(200) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhaxuatban`
--

INSERT INTO `nhaxuatban` (`MaNXB`, `TenNXB`, `Diachi`) VALUES
('NXB1', 'NXB Kim Đồng', 'Hà Nội'),
('NXB2', 'NXB Tổng Hợp TPHCM', 'TP.HCM'),
('NXB3', 'NXB Hội Nhà Văn', 'TP.HCM'),
('NXB4', 'NXB Chính trị quốc gia Sự thật', 'TP.HCM'),
('NXB5', 'NXB Văn Học', 'Hà Nội'),
('NXB6', 'NXB Hà Nội', 'Hà Nội'),
('NXB7', 'NXB Trẻ', 'TP.HCM');


-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieunhap`
--

CREATE TABLE `phieunhap` (
  `MaPN` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaNCC` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaNV` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `NgayNhap` date NOT NULL,
  `TongTien` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phieunhap`
--

INSERT INTO `phieunhap` (`MaPN`, `MaNCC`, `MaNV`, `NgayNhap`, `TongTien`) VALUES
('PN1', 'NCC2', 'NV1', '2019-04-24', 2960),
('PN10', 'NCC1', 'NV12', '2021-12-22', 0),
('PN2', 'NCC3', 'NV1', '2019-04-24', 2765),
('PN3', 'NCC5', 'NV12', '2019-04-25', 1000),
('PN4', 'NCC4', 'NV12', '2019-04-26', 4880),
('PN5', 'NCC5', 'NV12', '2019-04-26', 4690),
('PN6', 'NCC8', 'NV12', '2019-04-26', 1069),
('PN7', 'NCC6', 'NV12', '2019-05-01', 11900),
('PN8', 'NCC1', 'NV12', '2019-05-10', 1190),
('PN9', 'NCC2', 'NV12', '2019-05-10', 20000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `MaSP` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaLSP` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `TenSP` varchar(70) COLLATE utf8_unicode_ci NOT NULL,
  `DonGia` float NOT NULL,
  `SoLuong` int(10) UNSIGNED NOT NULL DEFAULT 1,
  `HinhAnh` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `MaTG` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaNXB` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`MaSP`, `MaLSP`, `TenSP`, `DonGia`, `SoLuong`, `HinhAnh`, `MaTG`, `MaNXB`) VALUES
('SP1', 'LSP1', 'Còn chút gì để nhớ', 55.3, 90, 'Con-chut-gi-de-nho-294x507.jpg', 'TG1', 'NXB1'),
('SP10', 'LSP1', 'Việt Bắc', 23, 75, 'Viet-bac-124x189.jpg', 'TG2', 'NXB1'),
('SP11', 'LSP2', 'Người kép già', 15.9, 99, 'Nuoi-kep-gia-600x600.jpg', 'TG3', 'NXB3'),
('SP12', 'LSP3', 'Ho Chi Minh on Revolution: Selected Writings, 1920-66 by Ho Chi Minh (', 931.414, 21, 'Ho-Chi-Minh-Revolution-333x499.jpg', 'TG4', 'NXB3'),
('SP13', 'LSP6', 'Đắc nhân tâm', 59, 146, 'Dac-nhan-tam-600x600.jpg', 'TG5', 'NXB2'),
('SP14', 'LSP7', 'Nhắm mắt nhìn sao', 118, 47, 'Nham-mat-nhin-sao-600x600.jpg', 'TG6', 'NXB3'),
('SP15', 'LSP1', 'Khói bếp không tan', 85, 500, 'Khoi-bep-khong-tan-700x700.jpg', 'TG8', 'NXB7'),
('SP16', 'LSP9', 'Phục Hồi Kinh Tế Sau Khủng Hoảng Covid-19 - Economics In The Age Of CO', 151, 51, 'Economics-In-The-Age-Of-Covid-19-600x600.jpg', 'TG9', 'NXB3'),
('SP17', 'LSP8', 'Dế Mèn phiêu lưu ký', 39.8, 168, 'De-men-phieu-luu-ky-1000x1386.jpg', 'TG10', 'NXB1'),
('SP18', 'LSP3', 'Mười Tôn Giáo Lớn Trên Thế Giới', 246, 59, 'Muoi-ton-giao-lon-tren-the-gioi-181x278.jpg', 'TG11', 'NXB4'),
('SP19', 'LSP7', 'Nỗi Buồn Chiến Tranh', 74, 44, 'Noi-buon-chien-tranh-181x279.jpg', 'TG12', 'NXB7'),
('SP2', 'LSP2', 'Nhà giả kim', 55.2, 70, 'Nha-gia-kim-768x1230.jpg', 'TG13', 'NXB3'),
('SP20', 'LSP4', 'Eloquent JavaScript: A Modern Introduction to Programming', 486.3, 12, 'Eloquent-JavaScript-465x640.jpg', 'TG14', 'NXB2'),
('SP21', 'LSP2', 'The World of Ice & Fire: The Untold History of Westeros and the Game o', 471.5, 38, 'Game-of-throne-1000x1324.jpg', 'TG15', 'NXB7'),
('SP22', 'LSP8', 'Tôi là Bê Tô', 64, 55, 'Toi-la-Be-To-329x512.jpg', 'TG1', 'NXB1'),
('SP3', 'LSP5', 'Cách Học 10 Ngoại Ngữ Nhanh Nhất', 79.2, 169, 'Cach-hoc-10-ngoai-ngu-600x600.jpg', 'TG16', 'NXB6'),
('SP4', 'LSP4', 'Thanh Toán Quốc Tế', 76, 56, 'Thanh-toan-quoc-te-690x1055.jpg', 'TG17', 'NXB2'),
('SP5', 'LSP1', 'Phòng Trọ Ba Người (Tái Bản 2019)', 61.2, 57, 'Phong-tro-ba-nguoi-600x600.jpg', 'TG1', 'NXB7'),
('SP6', 'LSP1', 'Hạ Đỏ (Tái Bản 2018)', 60, 44, 'Ha-do-600x600.jpg', 'TG1', 'NXB7'),
('SP7', 'LSP1', 'Thơ Tố Hữu', 95, 8, 'To-Huu-tho-800x1167.jpg', 'TG2', 'NXB5'),
('SP8', 'LSP1', 'Tuyển tập Kim Lân', 85, 20, 'Tuyen-tap-Kim-Lan-440x640.jpg', 'TG3', 'NXB5'),
('SP9', 'LSP1', 'Tắt đèn', 53.3, 45, 'Tat-den-600x600.jpg', 'TG4', 'NXB5');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tacgia`
--

CREATE TABLE `tacgia` (
  `MaTG` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TenTG` varchar(70) COLLATE utf8_unicode_ci NOT NULL,
  `Mota` varchar(200) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tacgia`
--

INSERT INTO `tacgia` (`MaTG`, `TenTG`, `Mota`) VALUES
('TG1', 'Nguyễn Nhật Ánh', 'Tác giả Việt chuyên viết tiểu thuyết Việt Nam'),
('TG10', 'Tô Hoài', 'Nhà văn nổi tiếng Việt Nam'),
('TG11', 'Hoàng Tâm Xuyên', 'Nhà văn nổi tiếng Việt Nam'),
('TG12', 'Bảo Ninh', 'Nhà văn nổi tiếng Việt Nam'),
('TG13', 'Paulo Coelho', 'Nhà văn nổi tiếng Bồ Đào Nha'),
('TG14', 'Marijn Haverbeke', 'Nhà văn nổi tiếng Bồ Đào Nha'),
('TG15', 'George R. R. Martin', 'Nhà viết tiểu thuyết người Mỹ'),
('TG16', 'Hoàng Thanh Hải', 'Tác giả sách ngoại ngữ được ưa chuộng'),
('TG17', 'Nguyễn Đăng Dờn', 'PGS. TS đại học quốc gia thành phố Hồ Chí Minh'),
('TG2', 'Tố Hữu', 'Nhà thơ nổi tiếng Việt Nam'),
('TG3', 'Kim Lân', 'Tác phẩm của ông chứa đấy sự bi thương'),
('TG4', 'Hồ Chí Minh', 'Vị cha già dân tộc'),
('TG5', 'Dale Carnegie', 'Nhà văn, nhà diễn thuyết người Mỹ'),
('TG6', 'Hà Chương', 'Nhạc sĩ khiếm thị, được biết đến trong văn học Việt Nam với tác phẩm tự truyện \"Nhắm mắt nhìn sao\"'),
('TG7', 'Ngô Tất Tố', 'Nhà Văn tiêu biểu trong nền văn học Việt Nam'),
('TG8', 'Lê Giang', 'Nhà Văn nổi tiếng ở Việt Nam'),
('TG9', 'Joshua Gans', 'Giáo sư kinh tế tại Trường Kinh doanh Melbourne-Úc');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `TenTaiKhoan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `MatKhau` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `MaNV` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `LoaiQuyen` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`TenTaiKhoan`, `MatKhau`, `MaNV`, `LoaiQuyen`) VALUES
('admin', 'admin', 'NV25', 'QuanLy'),
('NhanVien', 'nv', 'NV20', 'NhanVienBanHang'),
('NhanVien2', 'nv2', 'NV9', 'NhanVienNhapHang');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD KEY `MaSP` (`MaSP`),
  ADD KEY `MaHD` (`MaHD`);

--
-- Chỉ mục cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD KEY `MaSP` (`MaSP`),
  ADD KEY `MaPN` (`MaPN`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MaHD`),
  ADD KEY `MaNV` (`MaNV`),
  ADD KEY `MaKH` (`MaKH`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKH`);


--
-- Chỉ mục cho bảng `loaisanpham`
--
ALTER TABLE `loaisanpham`
  ADD PRIMARY KEY (`MaLSP`);

--
-- Chỉ mục cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`MaNCC`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`);

--
-- Chỉ mục cho bảng `nhaxuatban`
--
ALTER TABLE `nhaxuatban`
  ADD PRIMARY KEY (`MaNXB`);


--
-- Chỉ mục cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MaPN`),
  ADD KEY `MaNCC` (`MaNCC`),
  ADD KEY `MaNV` (`MaNV`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`MaSP`),
  ADD KEY `LoaiSP` (`MaLSP`),
  ADD KEY `tg` (`MaTG`),
  ADD KEY `nxb` (`MaNXB`);

--
-- Chỉ mục cho bảng `tacgia`
--
ALTER TABLE `tacgia`
  ADD PRIMARY KEY (`MaTG`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`TenTaiKhoan`),
  ADD KEY `MaNV` (`MaNV`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD CONSTRAINT `chitiethoadon_ibfk_1` FOREIGN KEY (`MaHD`) REFERENCES `hoadon` (`MaHD`) ON UPDATE CASCADE,
  ADD CONSTRAINT `chitiethoadon_ibfk_2` FOREIGN KEY (`MaSP`) REFERENCES `sanpham` (`MaSP`) ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD CONSTRAINT `chitietphieunhap_ibfk_2` FOREIGN KEY (`MaSP`) REFERENCES `sanpham` (`MaSP`) ON UPDATE CASCADE,
  ADD CONSTRAINT `chitietphieunhap_ibfk_3` FOREIGN KEY (`MaPN`) REFERENCES `phieunhap` (`MaPN`) ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`) ON UPDATE CASCADE,
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_ibfk_1` FOREIGN KEY (`MaNCC`) REFERENCES `nhacungcap` (`MaNCC`) ON UPDATE CASCADE,
  ADD CONSTRAINT `phieunhap_ibfk_2` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `nxb` FOREIGN KEY (`MaNXB`) REFERENCES `nhaxuatban` (`MaNXB`) ON UPDATE CASCADE,
  ADD CONSTRAINT `sanpham_ibfk_1` FOREIGN KEY (`MaLSP`) REFERENCES `loaisanpham` (`MaLSP`) ON UPDATE CASCADE,
  ADD CONSTRAINT `tg` FOREIGN KEY (`MaTG`) REFERENCES `tacgia` (`MaTG`) ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `taikhoan_ibfk_2` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
