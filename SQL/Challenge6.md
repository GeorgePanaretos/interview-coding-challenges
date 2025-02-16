# Most Expensive Restaurant Order Documentation

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

### Dishes Table
| Field | Type | Constraint |
|-------|------|------------|
| DishID | int | PK |
| Name | varchar(50) | |
| Description | varchar(255) | |
| Price | decimal | |
| Type | varchar(50) | |

### OrdersDishes Table
| Field | Type | Constraint |
|-------|------|------------|
| OrdersDishesID | int | PK |
| OrderID | int | FK |
| DishID | int | FK |

## Task Requirements

### Data Retrieval Specifications
Find the most expensive order with the following information:
- OrderID: ID of the most expensive order
- FirstName: Customer's first name
- LastName: Customer's last name
- OrderTotal: Total value of the order

### Join Requirements
- Orders.OrderID -> OrdersDishes.OrderID
- OrdersDishes.DishID -> Dishes.DishID
- Orders.CustomerID -> Customers.CustomerID

### Constraints
- Each dish in an order has a quantity of one (no quantity column)
- Total order value is calculated as sum of dish prices

## Example Data

### Source Tables
Required tables for the query:
- Orders
- OrdersDishes
- Dishes
- Customers

### Result Example
| ORDERID | FIRSTNAME | LASTNAME | ORDERTOTAL |
|---------|-----------|-----------|------------|
| 787 | Yves | Dell'Abbate | 58.95 |

## Technical Notes
- Multiple table joins required
- Aggregation needed for total order value
- Decimal precision for price calculations
- Primary and foreign key relationships must be maintained
- No quantity multiplier needed for pricing

## Query Requirements
- Must join all four tables correctly
- Must calculate total order value using sum of dish prices
- Must return exactly one row (the most expensive order)
- Must include all specified columns
- Column names must match example output exactly

## Additional Information
- Database uses standard SQL joins
- Price calculations should maintain decimal precision
- Order total should be calculated before determining maximum
- All joins must maintain referential integrity
- Foreign key relationships ensure data consistency
