# Restaurant Menu Database Documentation

## Database Structure

### Dishes Table

| Field | Type | Constraint |
|-------|------|------------|
| DishID | int | PK |
| Name | varchar(50) | |
| Description | varchar(255) | |
| Price | decimal | |
| Type | varchar(50) | |

## Task Requirements

### Data Retrieval Specifications
- Filter dishes with prices between $8.00 and $9.00
- Include only DishID, Name, and Price columns
- Sort results by name alphabetically in ascending order

### Constraints
- The Dishes table contains at least two rows
- Price currency is not specified in the table structure or data
- Solution should use numeric values in the Price column

## Example Data

### Source Table: Dishes

Total Records: 22 rows (13 not displayed)

| DISHID | NAME | DESCRIPTION |
|--------|------|-------------|
| 1 | Parmesan Deviled Eggs | These delectable little bites are made with organic eggs... |
| 2 | Artichokes with Garlic Aioli | Our artichokes are brushed with an olive oil and... |
| 3 | French Onion Soup | Caramelized onions slow cooked in a savory broth... |
| 4 | Mini Cheeseburgers | These mini cheeseburgers are served on a fresh bun... |
| 5 | Panko Stuffed Mushrooms | Large mushroom caps are filled with a savory cream ch... |
| 6 | Garden Buffet | Choose from our fresh local, organically grown ingredients... |
| 7 | House Salad | Our house salad is made with romaine lettuce and... |
| 8 | Chef's Salad | The chef's salad has cucumber, tomatoes, red onions... |
| 9 | Quinoa Salmon Salad | Our quinoa salad is served with quinoa, tomatoes... |
| [...] | | |

### Filtered Result (Price Range: $8.00 - $9.00)

Total Records: 6 rows

| DISHID | NAME | PRICE |
|--------|------|-------|
| 2 | Artichokes with Garlic Aioli | 9.00 |
| 16 | Cheesecake | 9.00 |
| 8 | Chef's Salad | 9.00 |
| 15 | Creme Brulee | 9.00 |
| 4 | Mini Cheeseburgers | 8.00 |
| 1 | Parmesan Deviled Eggs | 8.00 |

## Technical Notes
- Table uses foreign keys designed for joining in SQL queries
- Primary Key (PK) is implemented on the DishID column
- Varchar fields have specific length constraints (50 and 255 characters)
- Price is stored as decimal type for precise monetary values
- Results must be filtered based on raw numeric values in the Price column
- Alphabetical sorting is case-sensitive

## Query Requirements
- Must filter for prices between 8.00 and 9.00 inclusive
- Must select only DishID, Name, and Price columns
- Must sort by Name in ascending order
- Should handle decimal price values appropriately
- Should return all matching records within the price range
