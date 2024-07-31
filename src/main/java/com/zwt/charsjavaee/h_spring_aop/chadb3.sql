-- mysql -u root -p
-- Abc@1234

CREATE TABLE ACCOUNT(
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(20),
    MONEY INT
);
INSERT INTO ACCOUNT values (NULL,'caamanting',1000000);
INSERT INTO ACCOUNT values (NULL,'HWH',1000000);

CREATE TABLE ACCOUNT3(
                        ID INT PRIMARY KEY AUTO_INCREMENT,
                        NAME VARCHAR(20),
                        MONEY INT
);