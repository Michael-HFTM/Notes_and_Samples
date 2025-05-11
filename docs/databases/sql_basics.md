# SQL basics

## SELECT

```SQL
-- Alle Einträge:
SELECT * FROM table_name;

-- Einzigartiege Einträge: 
SELECT DISTINCT column1, column2 FROM table_name;
-- Anzahl einzigartiger Einträge:
SELECT COUNT(DISTINCT column1) FROM table_name;

-- Bedingung:
SELECT column1, column2 FROM table_name WHERE condition_xy;

-- Sortieren
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

**Vergleichsoperatoren:**
| Operatror | Beschreibung |
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
-- Eine Zeile
INSERT INTO table_name (column1, column2, column3, ...)
VALUES (value1, value2, value3, ...); 

-- Mehrere Zeilen
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







### DROP TABLE
```SQL
-- Delete a Table
DROP TABLE table_name;
```