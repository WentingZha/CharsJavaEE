mysql –u root -p 
Abc@1234

create database zhadb;

use zhadb;

create table BOOK(
id int primary key auto_increment,
TYPE varchar(20) null,
NAME varchar(20) not null,
DESCRIPTION varchar(20) null
);

insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (1,'Computer Science','Spring','Spring intro');
insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (2,'Computer Science','MVC','Structure');
insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (3,'Computer Science','JVM','Java');
insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (4,'Computer Science','Android','Java');
insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (5,'Computer Science','J2EE','Java');
insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (6,'Computer Science','C++ effective','C++');
insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (7,'Computer Science','AI','Python');
insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (8,'Computer Science','.Net','C#');
insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (9,'Education','Teacher1','Theory');
insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (10,'Education','Teacher2','Theory');
insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (11,'Education','Teacher3','Theory');
insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (12,'Education','Teacher4','Theory');
insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (13,'Education','Teacher5','Theory');
insert into BOOK (ID, TYPE, NAME, DESCRIPTION) values (14,'Computer Science','Android','Java');

SELECT * FROM BOOK;
