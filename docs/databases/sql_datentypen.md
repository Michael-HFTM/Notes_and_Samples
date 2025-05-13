## String Data Types

```sql
-- Fixed length (padded with spaces)
Column CHAR(n)

-- Variable length (with maximum limit)
Column VARCHAR(n)

-- Unlimited length (no defined limit)
Column TEXT
```

**Notes:**

* `CHAR(n)` → always stores exactly `n` characters (e.g., `PLZ CHAR(4)`)
* `VARCHAR(n)` → up to `n` characters, space-efficient
* `TEXT` → no length restriction (except system limits)

---

## Numeric Data Types

```sql
-- Integer number
Column INTEGER

-- Exact decimal number
Column NUMERIC(p, s)
```

**Example:**

```sql
Amount NUMERIC(10, 2)  -- e.g., 99999999.99
```

---

## Date & Time

```sql
-- Date only
Column DATE

-- Time only
Column TIME

-- Date + time
Column TIMESTAMP
-- With time zone
Column TIMESTAMPTZ
```

---

## Boolean

```sql
-- Boolean value
Column BOOLEAN
```

**Possible values:** `TRUE`, `FALSE`, `NULL`

---

## Identifiers & Auto-Increment

```sql
-- Globally unique ID
Column UUID

-- Auto-increment (legacy)
Column SERIAL PRIMARY KEY

-- Auto-increment (modern, recommended)
Column INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY
```

---

## Best Practices (Summary)

* **Choose the most specific type:** use `VARCHAR(20)` instead of `TEXT` when the length is known and limited.
* **Avoid overly large types:** use `DATE` instead of `TIMESTAMP` if the time part is not needed.
* **Consider performance:** `UUID` and `TEXT` can slow down indexing.
* **Use domain-specific types:** e.g., `INET`, `POINT` (PostgreSQL only).
* **Mind DBMS differences:** not all types work the same across PostgreSQL, MySQL, SQL Server, etc.
