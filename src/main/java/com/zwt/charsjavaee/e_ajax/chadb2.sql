mysql –u root -p 
Abc@1234

create database chadb2;

use chadb2;

create table USER(
ID int PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(20),
AGE INT,
SEARCH_COUNT INT
);

INSERT INTO USER values (NULL,'ZWT','35','100');
INSERT INTO USER  values (NULL,'GLZ','56','101');
INSERT INTO USER  values (NULL,'ZWM','61','200');
INSERT INTO USER  values (NULL,'HWH','35','212');

SELECT * FROM USER;

-- Check users have 'Z' in his name, sort the result descendingly, display 4 items only
SELECT * FROM USER WHERE NAME LIKE '%Z%' ORDER BY SEARCH_COUNT DESC LIMIT 0,4;

CREATE TABLE NEWS(
    ID INT PRIMARY KEY AUTO_INCREMENT,
    TITLE VARCHAR(200)
);

DELIMITER $$
CREATE PROCEDURE insert_data1()
BEGIN
    DECLARE i INT;
    SET i=1;
    WHILE i<=100 DO
          INSERT INTO NEWS VALUES (NULL,CONCAT('ABCDEFGHIJKLMNOPQRSTUVWXYZ',i));
          SET i=i+1;
    END WHILE;
END
$$

CALL insert_data1();

SELECT * FROM NEWS;