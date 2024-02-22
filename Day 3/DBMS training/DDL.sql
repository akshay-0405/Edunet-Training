CREATE DATABASE NBNDB;
SHOW DATABASES;
SHOW SCHEMAS;
USE NBNDB;

CREATE TABLE student(rollno int, name varchar(25));

DESC STUDENT;

ALTER TABLE STUDENT ADD COLUMN age VARCHAR(25);
ALTER TABLE STUDENT DROP COLUMN AGE;
ALTER TABLE STUDENT MODIFY COLUMN age INT;
ALTER TABLE STUDENT CHANGE COLUMN rollno id INT;

DROP TABLE student;
DROP DATABASE NBNDB;