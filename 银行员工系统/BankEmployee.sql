use master
go
create database BankSystem
use BankSystem
go

create table BankEmployee(
EmpId int primary key identity(1,1),
EmpName varchar(30) not null,
EmpPwd varchar(30) not null,
EmpPart varchar(10) not null,
EmpSalary int 
)

insert into BankEmployee values ('abby','123','���鲿',5000)
insert into BankEmployee values ('cuuy','456','��֯��',3000)
insert into BankEmployee values ('burry','789','�༭��',4000)

select * from BankEmployee