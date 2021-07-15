create database sanpham
go
use sanpham
go
create table sanpham
(
	masp char(5) primary key,
	tenSP nvarchar(20) not null,
	maloaiSP char(5),
	constraint fk foreign key(maloaiSP) references loaisanpham(maloaiSP)
)
create table loaisanpham
(
	maloaiSP char(5) primary key,
	tenloaisp nvarchar(20) not null
)