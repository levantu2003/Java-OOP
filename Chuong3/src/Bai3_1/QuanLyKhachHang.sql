CREATE DATABASE QuanLyKhachHang;
GO
USE QuanLyKhachHang;

CREATE TABLE NhomKhachHang (
	MaNhom varchar(9) not null primary key,
	TenNhom nvarchar(50)
);

CREATE TABLE KhachHang(
	MaKH varchar(9) not null primary key,
	TenKH nvarchar(100),
	NamSinh int,
	MaNhom varchar(9),
	FOREIGN KEY (MaNhom) references NhomKhachHang(MaNhom)
);

INSERT INTO NhomKhachHang
VALUES  ('N1',N'Khach hang trung thanh'),
		('N2', N'Khach hang tiem nang'),
		('N3', N'Khach hang tieu cuc');

INSERT INTO KhachHang
VALUES  ('KH4',N'Tran Van Minh',1990,'N2'),
		('KH5',N'Le Thi Hoa',1985,'N1'),
		('KH6',N'Pham Tuan Anh',1995,'N3'),
		('KH7',N'Nguyen Thi Hong',1988,'N1'),
		('KH8',N'Vo Hoang Nam',1992,'N2'),
		('KH9',N'Tran Thi Lan Anh',1998,'N3'),
		('KH10',N'Do Van Hung',1980,'N1');