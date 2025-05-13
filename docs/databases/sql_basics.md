# SQL-SYNTAX-BASICS

- [SELECT](#select)
    - [Comparison operators](#comparison-operators)
    - [NULL](#null)
- [INSERT INTO](#insert-into)
- [UPDATE](#update)
- [DELETE](#delete)


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

### Comparison operators
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

### NULL

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
```SQL
...
```


## TABLE

### DROP TABLE
```SQL
-- Delete a Table
DROP TABLE table_name;
```