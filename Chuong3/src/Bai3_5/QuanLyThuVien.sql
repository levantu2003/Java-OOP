use master
go
CREATE DATABASE QuanLyThuVien;
go
USE QuanLyThuVien;

-- Creating NguoiDung Table
CREATE TABLE NguoiDung (
    ND_ID int PRIMARY KEY,
    TenDangNhap nvarchar(20),
    MatKhau nvarchar(45),
    HoTen nvarchar(255),
    Email nvarchar(45),
    DiaChi nvarchar(255),
    NgaySinh date,
    GioiTinh nvarchar(10)
);

-- Creating LoaiSach Table
CREATE TABLE LoaiSach (
    LS_ID INT IDENTITY(1,1) PRIMARY KEY,
    Ten NVARCHAR(50),
    MoTa NVARCHAR(100)
);

-- Creating Sach Table
CREATE TABLE Sach (
    S_ID int PRIMARY KEY,
    TieuDe nvarchar(255),
    TacGia nvarchar(255),
    NamXuatBan int,
    TheLoai int FOREIGN KEY REFERENCES LoaiSach(LS_ID),
    MoTa nvarchar(255)
);

-- Creating HoaDon Table
CREATE TABLE HoaDon (
    HD_ID int PRIMARY KEY,
    Ngay date,
    NhanVien nvarchar(255),
    TenKhachHang nvarchar(255),
    GhiChu nvarchar(255)
);

-- Creating ChiTietHoaDon Table
CREATE TABLE ChiTietHoaDon (
    CTHD_ID int PRIMARY KEY,
    IDHoaDon int FOREIGN KEY REFERENCES HoaDon(HD_ID),
    IDSach int FOREIGN KEY REFERENCES Sach(S_ID),
    SoLuong int,
    GiaBan float
);

-- Creating PhieuNhapSach Table
CREATE TABLE PhieuNhapSach (
    PNS_ID int PRIMARY KEY,
    GhiChu nvarchar(255),
    Ngay date,
    NhanVien nvarchar(255)
);

-- Creating ChiTietPhieuNhapSach Table
CREATE TABLE ChiTietPhieuNhapSach (
    CTPNS_ID int PRIMARY KEY,
    IDPhieuNhapSach int FOREIGN KEY REFERENCES PhieuNhapSach(PNS_ID),
    IDSach int FOREIGN KEY REFERENCES Sach(S_ID),
    SoLuong int,
    DonGia float
);


-- Inserting data into NguoiDung
INSERT INTO NguoiDung VALUES (1, 'user1', 'pass1', 'Nguyen Van A', 'email1@example.com', 'Address 1', '1990-01-01', 'Male');
INSERT INTO NguoiDung VALUES (2, 'user2', 'pass2', 'Le Thi B', 'email2@example.com', 'Address 2', '1992-02-02', 'Female');
INSERT INTO NguoiDung VALUES (3, 'user3', 'pass3', 'Tran Van C', 'email3@example.com', 'Address 3', '1994-03-03', 'Male');

-- Inserting data into LoaiSach
INSERT INTO LoaiSach VALUES ('Novel', 'Fictional books');
INSERT INTO LoaiSach VALUES ('Science', 'Educational books');
INSERT INTO LoaiSach VALUES ('History', 'Historical books');

-- Inserting data into Sach
INSERT INTO Sach VALUES (1, 'Book Title 1', 'Author 1', 2000, 1, 'Description of Book 1');
INSERT INTO Sach VALUES (2, 'Book Title 2', 'Author 2', 2002, 2, 'Description of Book 2');
INSERT INTO Sach VALUES (3, 'Book Title 3', 'Author 3', 2004, 3, 'Description of Book 3');

-- Inserting data into HoaDon
INSERT INTO HoaDon VALUES (1, '2024-04-01', 'Employee 1', 'Customer 1', 'Note 1');
INSERT INTO HoaDon VALUES (2, '2024-04-02', 'Employee 2', 'Customer 2', 'Note 2');
INSERT INTO HoaDon VALUES (3, '2024-04-03', 'Employee 3', 'Customer 3', 'Note 3');

-- Inserting data into ChiTietHoaDon
INSERT INTO ChiTietHoaDon VALUES (1, 1, 1, 2, 100.0);
INSERT INTO ChiTietHoaDon VALUES (2, 2, 2, 3, 150.0);
INSERT INTO ChiTietHoaDon VALUES (3, 3, 3, 1, 200.0);

-- Inserting data into PhieuNhapSach
INSERT INTO PhieuNhapSach VALUES (1, 'Note PNS 1', '2024-04-10', 'Employee 1');
INSERT INTO PhieuNhapSach VALUES (2, 'Note PNS 2', '2024-04-11', 'Employee 2');
INSERT INTO PhieuNhapSach VALUES (3, 'Note PNS 3', '2024-04-12', 'Employee 3');

-- Inserting data into ChiTietPhieuNhapSach
INSERT INTO ChiTietPhieuNhapSach VALUES (1, 1, 1, 20, 50.0);
INSERT INTO ChiTietPhieuNhapSach VALUES (2, 2, 2, 30, 40.0);
INSERT INTO ChiTietPhieuNhapSach VALUES (3, 3, 3, 10, 60.0);
