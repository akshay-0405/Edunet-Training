CREATE DATABASE NBNDB;
SHOW DATABASES;
SHOW SCHEMAS;
USE NBNDB;
SHOW TABLES;

-- DDL queries have word "TABLE" in them.

-- 4 ways of opening MySQL
-- Workbench , Shell , Command Line , CMD

CREATE TABLE student(rollno int, name varchar(25));

DESC STUDENT;

ALTER TABLE STUDENT ADD COLUMN age VARCHAR(25);
ALTER TABLE STUDENT DROP COLUMN AGE;
ALTER TABLE STUDENT MODIFY COLUMN age INT;
ALTER TABLE STUDENT CHANGE COLUMN rollno id INT;
ALTER TABLE STUDENT RENAME COLUMN ROLLNO TO ID;

-- Although TRUNCATE TABLE is similar to DELETE , 
-- it is classified as a DDL statement rather than a DML statement. 
-- It differs from DELETE in the following ways: 
-- Truncate operations drop and re-create the table, 
-- which is much faster than deleting rows one by one, 
-- particularly for large tables. 
TRUNCATE TABLE student;
SELECT * FROM STUDENT;

DROP TABLE student;
DROP DATABASE NBNDB;