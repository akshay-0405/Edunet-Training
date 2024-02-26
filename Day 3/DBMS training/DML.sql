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

UPDATE EMPLOYEE SET SALARY=50000 WHERE ID=2;

DELETE FROM employee WHERE salary = 500 ;

-- ALTER TABLE employee MODIFY COLUMN id INT PRIMARY KEY;

CREATE TABLE department(deptno INT PRIMARY KEY,
empid INT,
deptname VARCHAR(30) NOT NULL,
city VARCHAR(30),
FOREIGN KEY(empid) REFERENCES employee(id) );

INSERT INTO department
VALUES (101,1,"CS","Pune");

SELECT * FROM employee INNER JOIN department ON employee.id=department.empid;
SELECT * FROM department;
SELECT * FROM employee;
SELECT * FROM student;