# SQL-SYNTAX-BASICS

### TABLE OF CONTENTS
- [SELECT](#select)
- [Comparison operators](#comparison-operators)
- [NULL](#null)
- [INSERT INTO](#insert-into)
- [UPDATE](#update)
- [DELETE](#delete)
- ...

## SELECT

```SQL
-- All Rows:
SELECT * FROM table_name;

-- Unique Rows 
SELECT DISTINCT column1, column2 FROM table_name;
-- Nuber of unique rows
SELECT COUNT(DISTINCT column1) FROM table_name;

-- Conditions
SELECT column1, column2 FROM table_name WHERE condition_xy;

-- Sorting
SELECT column1, column2 FROM table_name
ORDER BY column1, column2 ASC|DESC;

-- AND / OR 
SELECT * FROM Customers
WHERE Country = 'Spain' AND (CustomerName LIKE 'G%' OR CustomerName LIKE 'R%'); 

-- NOT & BETWEEN
SELECT * FROM Customers WHERE CustomerID NOT BETWEEN 10 AND 60;

-- NOT & IN
SELECT * FROM Customers WHERE City NOT IN ('Paris', 'London');

```

## Comparison operators
| Operatror | Decription |
| ----------| ------------ |
| = | Equal |	
| > | Greater than |	
| < | Less than |
| >= | Greater than or equal |
| <= | Less than or equal |
| <> or !=| Not equal |
| BETWEEN |	Between a certain range |
| LIKE |	Search for a pattern (% = beliebiges zeichen) |
| IN |	To specify multiple possible values for a column |

## NULL

```SQL
-- IS NULL
SELECT column_names FROM table_name WHERE column_name IS NULL; 

-- IS NOT NULL
SELECT column_names FROM table_name WHERE column_name IS NOT NULL; 
```

## INSERT INTO

```SQL
-- One Row
INSERT INTO table_name (column1, column2, column3, ...)
VALUES (value1, value2, value3, ...); 

-- Multiple Rows
INSERT INTO table_name (column1, column2, column3, ...)
VALUES 
(value1, value2, value3, ...);
(value1, value2, value3, ...); 
...
```
## INSERT INTO SELECT
- The INSERT INTO SELECT statement copies data from one table and inserts it into another table.

```SQL
-- Copy all columns
INSERT INTO table2
SELECT * FROM table1
WHERE condition_xy; 

-- Copy only certain columns
INSERT INTO table2 (column1, column2, column3, ...)
SELECT column1, column2, column3, ...
FROM table1
WHERE condition; 
```

## UPDATE 

```SQL
-- Syntax
UPDATE table_name
SET column1 = value1, column2 = value2 
WHERE condition_xy;
```

## DELETE 
```SQL
-- Syntax
DELETE FROM table_name WHERE condition_xy;

-- Delete all records
DELETE FROM table_name;
```

## Aggregate Functions

```SQL
-- MIN/MAX
SELECT MIN(column_name) FROM table_name WHERE condition_xy;
SELECT MIN(column_name) FROM table_name WHERE condition_xy;

-- Count
SELECT COUNT(column_name) FROM table_name WHERE condition_xy;
-- Count distinct
SELECT COUNT(DISTINCT Price) FROM Products;

-- SUM
SELECT SUM(column_name) FROM table_name WHERE condition_xy; 
-- SUM() With an Expression
SELECT SUM(Quantity * 10) FROM OrderDetails; 

-- AVG
SELECT AVG(column_name) FROM table_name WHERE condition_xy;
-- Higher than average
SELECT * FROM Products WHERE price > (SELECT AVG(price) FROM Products); 

-- AS (Column Alias) 
SELECT MIN(Price) AS SmallestPrice FROM Products;
SELECT COUNT(*) AS [Number of records] FROM Products;
```

## LIKE
```SQL
-- LIKE
SELECT column1, column2 FROM table_name WHERE column_name LIKE pattern;

--Starts With
SELECT * FROM Customers WHERE CustomerName LIKE 'La%'; 
```

| Wildcard | Description |
| -------- | ----------- |
| _ | Represents a single character |	
| % | Represents zero or more characters |

## IN

```SQL
-- IN
SELECT column1, column2 FROM table_name WHERE column_name IN (value1, value2, ...);

-- IN(SELECT) - Subquery
SELECT * FROM Customers WHERE CustomerID IN (SELECT CustomerID FROM Orders);
-- NOT IN(SELECT) - Subquery
SELECT * FROM Customers WHERE CustomerID NOT IN (SELECT CustomerID FROM Orders);
```

## BETWEEN
```SQL 
-- BETWEEN
SELECT column1, column2 FROM table_name WHERE column_name BETWEEN value1 AND value2;
-- BETWEEN Dates
SELECT * FROM Orders WHERE OrderDate BETWEEN '1996-07-01' AND '1996-07-31';
```

## JOIN
```SQL
-- INNER JOIN / JOIN
SELECT column1 FROM table1 
INNER JOIN table2 ON table1.column_name = table2.column_name;

-- LEFT / RIGHT JOIN
SELECT column1, column2 FROM table1
LEFT JOIN table2 ON table1.column_name = table2.column_name;

-- FULL JOIN / FULL OUTER JOIN
SELECT column1, coulmn2 FROM table1
FULL OUTER JOIN table2 ON table1.column_name = table2.column_name
WHERE condition;

-- JOIN three tables
SELECT Orders.OrderID, Customers.CustomerName, Shippers.ShipperName
FROM ((Orders
INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID)
INNER JOIN Shippers ON Orders.ShipperID = Shippers.ShipperID); 

-- SELF JOIN
SELECT column1, column2 FROM table1 T1, table1 T2 WHERE condition;
-- The following SQL statement matches customers that are from the same city:
SELECT A.CustomerName AS CustomerName1, B.CustomerName AS CustomerName2, A.City
FROM Customers A, Customers B
WHERE A.CustomerID <> B.CustomerID
AND A.City = B.City
ORDER BY A.City;
```

## GROUP BY
```SQL
-- GROUP BY
SELECT column1, column2 FROM table_name
WHERE condition_xy
GROUP BY column1, column2
ORDER BY column1, column2

-- Example
SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country;
```

## HAVING
Used to filter groups based on an aggregate condition after grouping

```SQL
-- HAVING
SELECT column1, column2
FROM table_name WHERE condition_xy
GROUP BY column1, column2
HAVING condition
ORDER BY column1, column2;

-- Example
SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country
HAVING COUNT(CustomerID) > 5;
```

## UNION / UNION ALL

The UNION operator is used to combine the result-set of two or more SELECT statements.

- Every SELECT statement within UNION must have the same number of columns
- The columns must also have similar data types
- The columns in every SELECT statement must also be in the same order
- The UNION operator selects only distinct values by default. To allow duplicate values, use UNION ALL


```SQL
-- UNION
SELECT column1, column2 FROM table1
UNION
SELECT column1, column2 FROM table2;

-- UNION ALL
SELECT column1, column2 FROM table1
UNION ALL
SELECT column1, column2 FROM table2; 
```

## EXISTS

- The EXISTS operator is used to test for the existence of any record in a subquery.
- The EXISTS operator returns TRUE if the subquery returns one or more records.


```SQL
-- EXISTS
SELECT column1, column2 FROM table_name
WHERE EXISTS
(SELECT column_name FROM table_name WHERE condition); 
```

## ANY
- returns TRUE if ANY of the subquery values meet the condition

```SQL
-- ANY
SELECT column1, column2 FROM table_name
WHERE column_name operator ANY
  (SELECT column_name FROM table_name WHERE condition_xy); 

-- Example
SELECT ProductName FROM Products
WHERE ProductID = ANY
  (SELECT ProductID FROM OrderDetails WHERE Quantity = 10);
```
## ALL
- returns TRUE if ALL of the subquery values meet the condition
- is used with SELECT, WHERE and HAVING statements

```SQL
-- ALL Syntax with SELECT
SELECT ALL column1, column2 FROM table_name WHERE condition; 

-- ALL Syntax with WHERE or HAVING
SELECT column1, column2 FROM table_name
WHERE column_name operator ALL
  (SELECT column_name FROM table_name WHERE condition_xy); 

-- Example
SELECT ProductName FROM Products
WHERE ProductID = ALL
  (SELECT ProductID FROM OrderDetails WHERE Quantity = 10);
```
## CASE 
- The CASE expression goes through conditions and returns a value when the first condition is met (like an if-then-else statement). So, once a condition is true, it will stop reading and return the result. If no conditions are true, it returns the value in the ELSE clause. 
```SQL
-- CASE
CASE
    WHEN condition1 THEN result1
    WHEN condition2 THEN result2
    WHEN conditionN THEN resultN
    ELSE result
END; 
```

## CREATE TABLE
```SQL
-- Create a Table
CREATE TABLE table_name (
    column1 datatype,
    column2 datatype,
    column3 datatype,
   ....
); 

-- Example
CREATE TABLE Persons (
    PersonID int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255)
);
```

## DROP TABLE
```SQL
-- Delete a table
DROP TABLE table_name;
-- Only delte contet
TRUNCATE TABLE table_name; 
```

## ALTER TABLE
- The ALTER TABLE statement is used to add, delete, or modify columns in an existing table.
- The ALTER TABLE statement is also used to add and drop various constraints on an existing table.

```SQL
-- ADD column
ALTER TABLE table_name ADD column_name datatype;
-- Drop column
ALTER TABLE table_name DROP COLUMN column_name;
-- Rename column 
ALTER TABLE table_name RENAME COLUMN old_name to new_name;
-- Alter Datatype
ALTER TABLE table_name ALTER COLUMN column_name datatype; 
```

## Constraints
```SQL
CREATE TABLE table_name (
    column1 datatype constraint,
    column2 datatype constraint,
    column3 datatype constraint,
    ....
);
```

| Constraint | Description |
|------------|-------------|
| NOT NULL | Ensures that a column cannot have a NULL value |
| UNIQUE | Ensures that all values in a column are different |
| PRIMARY KEY | A combination of NOT NULL and UNIQUE. Uniquely identifies each row |
| FOREIGN KEY | Prevents actions that would destroy links between tables |
| CHECK | Ensures that the values in a column satisfy a specific condition |
| DEFAULT | Sets a default value for a column if no value is specified |
| CREATE INDEX | Used to create and retrieve data from the database very quickly |

### NOT NULL
```SQL
-- CREATE TABLE
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255) NOT NULL,
    Age int
);
-- ALTER TABLE
ALTER TABLE Persons ALTER COLUMN Age int NOT NULL; 
```
### UNIQUE
```SQL 
-- CREATE TABLE
CREATE TABLE Persons (
    ID int NOT NULL UNIQUE,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int
);
-- ALTER TABLE
ALTER TABLE Persons ADD UNIQUE (ID); 
```

### PRIMARY KEY

```SQL
-- CREATE TABLE
CREATE TABLE Persons (
    ID int PRIMARY KEY,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int
);

-- ALTER TABLE
ALTER TABLE Persons ADD CONSTRAINT pk_Persons_ID PRIMARY KEY (ID);
```

### FOREIGN KEY

```SQL
-- CREATE TABLE with foreign key
CREATE TABLE Orders (
    OrderID int PRIMARY KEY,
    OrderNumber int NOT NULL,
    CustomerID int,
    FOREIGN KEY (CustomerID) REFERENCES Persons(ID)
);

-- ALTER TABLE
ALTER TABLE Orders ADD CONSTRAINT fk_Orders_Customer FOREIGN KEY (CustomerID) REFERENCES Persons(ID);
```

### CHECK

```SQL
-- CREATE TABLE with CHECK constraint
CREATE TABLE Products (
    ID int,
    ProductName varchar(255),
    Price decimal(10, 2),
    CHECK (Price >= 0)
);

-- ALTER TABLE
ALTER TABLE Products ADD CONSTRAINT chk_Price_Positive CHECK (Price >= 0);
```

### DEFAULT

```SQL
-- CREATE TABLE with DEFAULT value
CREATE TABLE Employees (
    ID int,
    Name varchar(255),
    Country varchar(50) DEFAULT 'USA'
);

-- ALTER TABLE
ALTER TABLE Employees ALTER COLUMN Country SET DEFAULT 'USA';
```

### CREATE INDEX

```SQL
-- Create index on LastName for faster searches
CREATE INDEX idx_lastname ON Persons(LastName);

-- Drop index
DROP INDEX idx_lastname;
```

