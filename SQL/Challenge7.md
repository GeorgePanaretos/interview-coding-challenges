
Here's the Markdown README file for the task described:

markdown
# Find the Average of All Restaurant Orders

You're given a database with many tables that have foreign keys designed to join the tables during SQL queries.

## Database Schema

### Orders

| Column Name | Data Type | Description            |
|-------------|-----------|------------------------|
| OrderID     | int       | Primary Key            |
| CustomerID  | int       |                        |
| OrderDate   | datetime  |                        |

### OrdersDishes

| Column Name      | Data Type | Description            |
|------------------|-----------|------------------------|
| OrdersDishesID    | int       | Primary Key            |
| OrderID           | int       |                        |
| DishID            | int       |                        |

### Dishes

| Column Name | Data Type       | Description            |
|-------------|-----------------|------------------------|
| DishID      | int             | Primary Key            |
| Name        | varchar(50)     |                        |
| Description | varchar(255)     |                        |
| Price       | decimal         |                        |
| Type        | varchar(50)     |                        |

## Your Task

Find the average of all orders. There are two steps and therefore two queries in this challenge, one nested within the other.

- **Step 1**: Get the sum of each order in a dataset.
- **Step 2**: Get the average of the order sums.

The result should have a single row with one column:

- **ORDERAVERAGE**: Average value of all orders

## Constraints

- The `Dishes` table doesn't have a quantity column, so you can assume each dish in an order has a quantity of one.

## SQL Queries

### Step 1: Sum of Each Order

```sql
SELECT 
    o.OrderID,
    SUM(d.Price) AS OrderTotal
FROM 
    Orders o
JOIN 
    OrdersDishes od ON o.OrderID = od.OrderID
JOIN 
    Dishes d ON od.DishID = d.DishID
GROUP BY 
    o.OrderID

Step 2: Average of Order Sums
sql
SELECT 
    AVG(OrderTotal) AS ORDERAVERAGE
FROM (
    SELECT 
        o.OrderID,
        SUM(d.Price) AS OrderTotal
    FROM 
        Orders o
    JOIN 
        OrdersDishes od ON o.OrderID = od.OrderID
    JOIN 
        Dishes d ON od.DishID = d.DishID
    GROUP BY 
        o.OrderID
) AS Subquery

Result
| ORDERAVERAGE |
|--------------|
| 32.66777     |

This query first calculates the total price for each order by joining Orders, OrdersDishes, and Dishes tables, and then averages these totals to find the average order value across all orders.

This Markdown file includes all the details from the provided images, formatted according to your specifications, including the table formatting as shown in the second image. If you need any further adjustments or if you'd like to generate images to complement this README, just let me know!
