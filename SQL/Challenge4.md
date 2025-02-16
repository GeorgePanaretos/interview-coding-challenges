# Customer Orders Database Documentation

## Database Structure

### Customers Table
| Field | Type | Constraint |
|-------|------|------------|
| CustomerID | int | PK |
| FirstName | varchar(255) | |
| LastName | varchar(255) | |
| Email | varchar(255) | |
| Address | varchar(255) | |
| City | varchar(255) | |
| State | char(2) | |
| Phone | varchar(255) | |
| Birthday | date | |
| FavoriteDish | int | |

### Orders Table
| Field | Type | Constraint |
|-------|------|------------|
| OrderID | int | PK |
| CustomerID | int | FK |
| OrderDate | datetime | |

## Task Requirements

### Data Retrieval Specifications
- Find the three customers with the most orders
- Include CustomerID, FirstName, and LastName columns
- Include total number of orders per customer
- Sort by number of orders in descending order
- Limit to top 3 customers

### Constraints
- Each Order has a CustomerID that joins to a row in the Customers table

## Example Data

### Source Tables

```sql
Customers(CustomerID, FirstName, LastName)
Orders(OrderID, CustomerID)
```

### Result

Total Records: 3 rows

| CUSTOMERID | FIRSTNAME | LASTNAME | CUSTOMERORDERCOUNT |
|------------|-----------|-----------|-------------------|
| 100 | Blythe | Leggan | 20 |
| 35 | Luciano | Winton | 17 |
| 27 | Yves | Dell'Abbate | 16 |

## Technical Notes
- Tables use foreign key relationships for joining
- Primary Key (PK) implemented on CustomerID and OrderID
- Foreign Key (FK) relationship between Orders.CustomerID and Customers.CustomerID
- Varchar fields have 255 character length limit
- State field is fixed at 2 characters
- Birthday stored as date type
- OrderDate stored as datetime type

## Query Requirements
- Must join Customers and Orders tables
- Must count orders per customer
- Must sort by order count in descending order
- Must limit to top 3 customers
- Must include only specified columns in output
- Column names must match example output exactly

## Additional Information
- Database contains multiple related tables with foreign keys
- Query requires aggregation function (COUNT)
- Proper GROUP BY clause required for aggregation
- Results must be limited to exactly 3 rows
- All column names are case-sensitive
