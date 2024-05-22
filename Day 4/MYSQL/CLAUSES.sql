USE AK;

-- SQL Clauses are In-Built Functions

CREATE TABLE Customers(customer_name VARCHAR(50), country VARCHAR(20), product VARCHAR(20), category VARCHAR(20), price DECIMAL(8,2)) ;

-- INSERT INTO customerS (customer_name, country, product, category, price) VALUES 
-- ('Maria Garcia', 'Spain', 'Laptop', 'Electronics', 1299.99),
-- ('Ahmed Khan', 'Pakistan', 'Television', 'Electronics', 899.99),
-- ('Sophie Müller', 'Germany', 'Headphones', 'Electronics', 149.99),
-- ('David Johnson', 'Canada', 'Smartwatch', 'Electronics', 299.99),
-- ('Luis Rodríguez', 'Mexico', 'Printer', 'Electronics', 199.99),
-- ('Emily Anderson', 'Australia', 'Gaming Console', 'Electronics', 399.99),
-- ('Nina Ivanova', 'Bulgaria', 'E-reader', 'Electronics', 89.99),
-- ('Kim Lee', 'South Korea', 'Wireless Charger', 'Electronics', 49.99),
-- ('Julia Kowalski', 'Poland', 'Bluetooth Speaker', 'Electronics', 69.99),
-- ('Sophie Johnson', 'UK', 'Dining Table', 'Furniture', 599.99),
-- ('Chen Wei', 'China', 'Bookshelf', 'Furniture', 299.99),
-- ('Maria Garcia', 'Spain', 'Cheese', 'Food', 8.99),
-- ('Sophie Müller', 'Germany', 'Bread', 'Food', 2.49),
-- ('Ahmed Khan', 'Pakistan', 'Rice', 'Food', 5.99);

SELECT * FROM CUSTOMERS; 

DROP TABLE CUSTOMERS;

SELECT * FROM CUSTOMERS WHERE CATEGORY = "ELECTRONICS" AND PRICE >= 200 ;
SELECT COUNT(CUSTOMER_NAME),COUNTRY FROM CUSTOMERS GROUP BY COUNTRY LIMIT 5 ;
SELECT CUSTOMER_NAME,COUNTRY FROM CUSTOMERS ORDER BY CUSTOMER_NAME DESC;