USE ak;

-- Conditions of UNION operator
-- 		Every SELECT statement within UNION must have the same number of columns
-- 		The columns must also have similar data types
-- 		The columns in every SELECT statement must also be in the same order
SELECT LASTNAME FROM EMPL
UNION
SELECT NAME FROM STUDENT;

-- Intersect Does not work in MySQL but alternative to it is  
