# Customer City Pattern Filter Documentation

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

## Task Requirements

### Data Retrieval Specifications
- Return customers living in cities starting with the letter 'R'
- Include FirstName, LastName, and City columns
- Sort results by city name in ascending order

### Constraints
- The Customers table contains at least two rows

## Example Data

### Source Table Sample

| CUSTOMERID | FIRSTNAME | LASTNAME | EMAIL | ADDRESS |
|------------|-----------|-----------|--------|----------|
| 1 | Maggi | Domney | mdomney0@wisdompets.com | 53177 Fields |
| 2 | Javier | Dawks | jdawks1@red30design.com | 25629 Brown |
| 3 | Aleen | Fasey | afasey2@kinetecoinc.com | 41967 Mockin |
| [...] | | | | |

### Result

| FIRSTNAME | LASTNAME | CITY |
|-----------|-----------|------|
| Faina | Nelles | Reading |
| Cathryn | Beau | Reno |
| Yves | Dell'Abbate | Richmond |
| Dyanna | Fulger | Roanoke |
| Giraldo | Algar | Rochester |

## Technical Notes
- Case sensitivity for 'R' pattern matching should be considered
- VARCHAR(255) fields allow for variable-length city names
- Proper string pattern matching required for city filtering
- Results must be sorted alphabetically by city name
- Only specified columns should be included in output

## Query Requirements
- Must filter cities starting with 'R'
- Must return exactly three columns in specified order
- Must sort by city name
- Column names must match example output exactly
- String pattern matching must be case-sensitive

## Additional Information
- Database uses standard SQL string pattern matching
- No limit specified on number of results
- All matching cities should be included
- Foreign keys present but not needed for this query
- Output formatting matches example result structure
