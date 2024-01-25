USE master
GO 
CREATE DATABASE Lap04JspServletJDBC;
GO
USE Lap4JspServletJDBC;
GO 
-- Creat table 
create table USER_ACCOUNT
(
      USER_NAME VARCHAR(30) NOT NULL,
	  GENDER VARCHAR(1) NOT NULL,
	  PASSWORD VARCHAR(30) NOT NULL,
	  primary key (user_name )
);
Go 
--Create table 
create table PRODUCT
(
      CODE VARCHAR (20) NOT NULL,
	  NAME NVARCHAR(128) NOT NULL,
	  PRICE FLOAT NOT NULL,
	  primary key (CODE)
);
Go
--Insert data:----------------------------------------
insert into USER_ACCOUNT(USER_NAME, GENDER, PASSWORD)
values('tom', 'M', 'tom001');

insert into USER_ACCOUNT(USER_NAME, GENDER, PASSWORD)
values('jerry', 'M','jerry001');

insert into product(CODE, NAME, PRICE)
values('P001', 'Java Core',100);

insert into product(CODE, NAME, PRICE)
value ('P002', 'C# Core', 90);
GO