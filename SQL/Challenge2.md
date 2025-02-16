# SQL Reservation Query Exercise

## Problem Description
Write a SQL query to retrieve the two most recent reservations from a restaurant database system. The database contains customer information and their respective reservations.

## Database Schema

### Tables and Columns

----------------------------------------------------------------------
| CUSTOMERS                 | RESERVATIONS                             |
|--------------------------|------------------------------------------|
| PK CustomerID    int     | PK ReservationID    int                 |
| FirstName     varchar(255)| CustomerID          int                 |
| LastName      varchar(255)| Date                datetime            |
| Email         varchar(255)| PartySize           tinyint            |
| Address       varchar(255)|                                         |
| City          varchar(255)|                                         |
| State         char(2)     |                                         |
| Phone         varchar(255)|                                         |
| Birthday      date        |                                         |
| FavoriteDish  int        |                                         |
----------------------------------------------------------------------

## Task Requirements
Create a SQL query that returns:
1. The two most recent reservations
2. Results sorted in descending order by date (newest first)
3. The following columns:
   - Reservation date
   - Party size
   - Customer's first name
   - Customer's last name
   - Customer's email

## Constraints
- The Reservations table contains at least two rows
- Each reservation is connected to a customer record
- Must use standard ANSI SQL syntax
- Must use INNER JOIN syntax (not USING)
- Must use proper join syntax (not Oracle or Sybase specific syntax)

## Sample Data

----------------------------------------------------------------------
| FIRSTNAME      | LASTNAME       | EMAIL                              |
|----------------|----------------|-----------------------------------|
| Giraldo        | Algar         | galgar21@kinetecoinc.com          |
| Gustave        | Alphonso      | galphonso28@wisdompets.com        |
| Romeo          | Annett        | rannett1e@samoca.org              |
| Herby          | Aspinal       | haspinals@red30design.com         |
| Emlyn          | Attwool       | eattwoolt@hplussport.com          |
| Lydie          | Awmack        | lawmack1a@samoca.org              |
| Joel           | Baignard      | jbaignard2k@orangevalleycaa.org   |
| Tybie          | Balme         | tbalme1p@orangevalleycaa.org      |
| Cathryn        | Beau          | cbeau1c@wisdompets.com            |
| Amory          | Bunyard       | abunyard@samoca.org               |
----------------------------------------------------------------------

## Source Tables and Required Columns
```
Reservations (Date, PartySize)
Customers (FirstName, LastName, Email)
```

## Implementation Notes
- Use standard ANSI SQL syntax
- For inner joins, use the "INNER JOIN ... ON ..." keywords
- For outer joins, use the "LEFT OUTER JOIN" keywords
- Avoid Oracle-specific "a=b(*)" syntax or Sybase "a *= b" syntax

## Educational Resources
To learn more about SQL, a course is available on LinkedIn Learning (link provided in the exercise).
