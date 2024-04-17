use master
go
CREATE DATABASE QuanLyDiaCD
go
USE QuanLyDiaCD

create table CDDVDCollection (
	Ma varchar(6) not null primary key,
	TieuDe nvarchar(500),
	LoaiDia nvarchar(10),
	NamXB int
)

INSERT INTO CDDVDCollection (Ma, TieuDe, LoaiDia, NamXB)
VALUES 
('sp1', N'CD nhạc sến', 'CD', 2015),
('sp2', N'DVD học tiếng Anh', 'DVD', 2016), 
('sp3', N'DVD học kế toán', 'DVD', 2018),
('sp4', N'Đĩa phim kiếm hiệp', 'DVD', 2000),
('sp5', N'Đĩa nhạc xuân', 'DVD', 2018),
('sp6', N'Đĩa học lập trình Java', 'DVD', 2015);

select * from CDDVDCollection

GO
CREATE PROCEDURE sp_LietKeAllCDDVD
AS
BEGIN
    SELECT * FROM CDDVDCollection;
END
GO

CREATE PROCEDURE sp_LietKeAllCDDVDTheoNam
    @NamXB INT
AS
BEGIN
    SELECT * 
    FROM CDDVDCollection
    WHERE NamXB = @NamXB;
END
GO

CREATE PROCEDURE sp_LietKeAllCDDVDTheoNamVaTheLoai
    @NamXB INT,
    @LoaiDia NVARCHAR(10)
AS
BEGIN
    SELECT * 
    FROM CDDVDCollection
    WHERE NamXB = @NamXB
        AND LoaiDia = @LoaiDia;
END
GO