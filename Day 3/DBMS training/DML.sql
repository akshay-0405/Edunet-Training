USE NBNDB;
CREATE TABLE employee(id int, name VARCHAR(40), salary INT);
SHOW TABLES;
DESC employee;

INSERT INTO employee(id,name,salary) VALUES (01,"Madhav",0);
INSERT INTO employee(id,name) VALUES (02,"Ankit");
INSERT INTO employee(salary,id,name) VALUES (100000,03,"Akshay");

INSERT INTO employee(id,name,salary) 
VALUES (04,"Suraj",5),
(05,"Prasad",500);

SELECT * FROM employee;