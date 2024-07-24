mysql –u root -p 
Abc@1234

create database chadb1;

use chadb1;

create table BOOKSTORE(
ID int not null,
NAME varchar(20) not null,
WRITER varchar(20) null,
primary key (ID)
);

insert into BOOKSTORE (ID, NAME, WRITER) values (1,'Effective Java','Joshua Bloch');
insert into BOOKSTORE (ID, NAME, WRITER) values (2,'C++ primer','SL & JL & BEM');

SELECT * FROM BOOKSTORE;


create table STUDENT(
NAME varchar(20) not null,
AGE varchar(20) null,
SCORE varchar(20) null,
primary key (NAME)
);

insert into STUDENT (NAME, AGE,SCORE) values ('CaaManting','35','100');
insert into STUDENT (NAME, AGE,SCORE) values ('GLZ','56','70');
insert into STUDENT (NAME, AGE,SCORE) values ('ZWM','61','70');
insert into STUDENT (NAME, AGE,SCORE) values ('HWH','35','80');



SELECT * FROM STUDENT;



create table USER(
uid varchar(20) not null,
ucode varchar(20) null,
loginname varchar(20) null,
password varchar(20) null,
username varchar(20) null,
gender varchar(20) null,
birthday varchar(20) null,
dutydate varchar(20) null,
primary key (uid)
);

insert into USER (uid,ucode,loginname,password,username,gender) values ('1','1','caamanting','caamanting','caamanting','femail');

SELECT * FROM USER;


create table STUDENT1(
ID int not null,
NAME varchar(20) not null,
AGE varchar(20) null,
SCORE varchar(20) null,
primary key (ID)
);

insert into STUDENT1 (ID,NAME, AGE,SCORE) values (1,'CaaManting','35','90');
insert into STUDENT1 (ID,NAME, AGE,SCORE) values (2,'GLZ','56','90');
insert into STUDENT1 (ID,NAME, AGE,SCORE) values (3,'ZWM','61','90');
insert into STUDENT1 (ID,NAME, AGE,SCORE) values (4,'HWH','35','90');

-- page1: 2 items, 
-- Calculate: (currentPage-1) * item count

-- (1-1)*2
SELECT * FROM STUDENT1 LIMIT 0,2

-- (2-1)*2
SELECT * FROM STUDENT1 LIMIT 2,2

create table person(
    id int primary key auto_increment,
    name varchar(20),
    age int
);
insert into person values (null,'CMT',35);
insert into person values (null,'GLZ',56);
insert into person values (null,'ZWM',60);




create table CARD(
    id int primary key auto_increment,
    name varchar (10),
    pid int,
    constraint cp_fk foreign key (pid) references person(id) 
);
insert into card values (null,'12345',1);
insert into card values (null,'23456',2);
insert into card values (null,'34567',3);

ALTER TABLE CARD CHANGE COLUMN `name` `number` VARCHAR(10);

ALTER TABLE `CARD` ADD COLUMN `NUMBER` VARCHAR(10);
update card set number = '11111' where id = 1;
update card set number = '22222' where id = 2;
update card set number = '33333' where id = 3;

update person set age = 61 where id = 3;

select * from card c, person p WHERE c.pid = p.id;
select c.id cid,number,pid,name,age from card c,person p where c.pid = p.id;

create table classes(
    id int primary key auto_increment,
    name varchar(10)
);
insert into classes values (NULL,'Class ZWT');
insert into classes values (NULL,'Class GLZ');

CREATE TABLE PUPIL(
    pupilId INT primary key auto_increment,
    name varchar(10),
    age int,
    cid int,
    constraint classes_foreign_key foreign key (cid) references classes(id)
);
insert into PUPIL values (NULL,'Kam',7,1);
insert into PUPIL values (NULL,'Churn',8,1);
insert into PUPIL values (NULL,'Au',6,2);
insert into PUPIL values (NULL,'Sun',7,2);

select * from classes c, pupil p where c.id = p.cid;
select c.id cid, c.name cname, p.pupilId pid, p.name pname, p.age pupil_age from classes c, pupil p where c.id = p.cid;




CREATE TABLE COURSE(
    id int primary key AUTO_INCREMENT,
    name varchar(10)
);

ALTER TABLE COURSE CHANGE COLUMN `name` `name` VARCHAR(20);
insert into course values(null,'Chinese');
insert into course values(null,'Math');
insert into course values(null,'English');
insert into course values(null,'Computer Science');

CREATE TABLE PUP_COURSE(
    id INT PRIMARY KEY AUTO_INCREMENT,
    pupil_id INT,
    course_id INT,
    CONSTRAINT pup_course_foreign_key_1 FOREIGN KEY (pupil_id) REFERENCES PUPIL(pupilId),
    CONSTRAINT pup_course_foreign_key_2 FOREIGN KEY (course_id) REFERENCES course(id)
);
INSERT INTO PUP_COURSE VALUES(NULL,1,1);
INSERT INTO PUP_COURSE VALUES(NULL,1,2);
INSERT INTO PUP_COURSE VALUES(NULL,1,3);
INSERT INTO PUP_COURSE VALUES(NULL,2,1);
INSERT INTO PUP_COURSE VALUES(NULL,2,2);
INSERT INTO PUP_COURSE VALUES(NULL,2,3);
INSERT INTO PUP_COURSE VALUES(NULL,2,4);
INSERT INTO PUP_COURSE VALUES(NULL,3,1);
INSERT INTO PUP_COURSE VALUES(NULL,3,2);
INSERT INTO PUP_COURSE VALUES(NULL,4,1);
INSERT INTO PUP_COURSE VALUES(NULL,4,2);
INSERT INTO PUP_COURSE VALUES(NULL,4,3);

SELECT * FROM PUPIL pupil, COURSE course, PUP_COURSE pup_course WHERE
pup_course.pupil_id = pupil.pupilId AND pup_course.course_id = course.id;


SELECT pupil.pupilId pupil_id, pupil.name pupil_name, pupil.age pupil_age, 
pup_course.id course_id, course.name course_name FROM 
PUPIL, COURSE, PUP_COURSE WHERE
pup_course.pupil_id = pupil.pupilId AND pup_course.course_id = course.id;

SELECT * FROM person WHERE id = 2;
SELECT * FROM pupil WHERE cid = 1;
SELECT course.id,course.name from pup_course, course WHERE 
pup_course.course_id = course.id AND pup_course.pupil_id=1; 