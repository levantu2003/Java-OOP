use master
go
create database QuanLySinhVien
go
use QuanLySinhVien
go

create table students (
	masv nvarchar(50) not null,
	hoten nvarchar(50),
	email nvarchar(50),
	sodt nvarchar(50),
	gioitinh bit,
	diachi nvarchar(50),
	hinh nvarchar(50),
	constraint PK_MASV primary key (masv)
);

create table grade (
	id int not null,
	masv nvarchar(50),
	tienganh int,
	tinhoc int,
	gdtc int,
	constraint PK_ID primary key (id),
	constraint FK_MASV foreign key (masv) references students(masv)
)
create table users (
	username nvarchar(50) not null,
	password nvarchar(50),
	role nvarchar(50),
	constraint PK_USERNAME primary key (username),
)

INSERT INTO students (masv, hoten, email, sodt, gioitinh, diachi, hinh)
VALUES
('SV001', 'Nguyen Van A', 'nguyenvana@gmail.com', '0123456789', 1, '123 Main St', 'hinh1.jpg'),
('SV002', 'Tran Thi B', 'tranthib@gmail.com', '0987654321', 0, '456 Elm St', 'hinh2.jpg'),
('SV003', 'Le Van C', 'levanc@gmail.com', '0111222333', 1, '789 Oak St', 'hinh3.jpg');
GO


INSERT INTO grade (id, masv, tienganh, tinhoc, gdtc)
VALUES
(1, 'SV001', 85, 90, 80),
(2, 'SV002', 78, 85, 88),
(3, 'SV003', 92, 87, 91);
GO


INSERT INTO users (username, password, role)
VALUES
('admin', 'admin123', 'administrator'),
('sv001', 'password1', 'student'),
('sv002', 'password2', 'student');