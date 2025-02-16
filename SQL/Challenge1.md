# Retrieve Sorted Data from a Specific Table

## Description
You're given a database containing the following table:

### Customers Table Structure

| PK  | Column Name   | Data Type      |
|-----|-------------|---------------|
| ✔  | CustomerID  | int           |
|     | FirstName   | varchar(255)  |
|     | LastName    | varchar(255)  |
|     | Email       | varchar(255)  |
|     | Address     | varchar(255)  |
|     | City        | varchar(255)  |
|     | State       | char(2)       |
|     | Phone       | varchar(255)  |
|     | Birthday    | date          |
|     | FavoriteDish | int           |

## Task
Return a list of customers sorted in ascending order by **last name** and **first name**.

## Result
The result should include the following columns:
- `FirstName`
- `LastName`
- `Email`

The sorting should be done in **ascending order** by:
1. `LastName`
2. `FirstName`

## Constraints
- The `Customers` table contains **at least two rows**.

## Example

### Source Table

| CUSTOMERID | FIRSTNAME     | LASTNAME     | EMAIL                      | ADDRESS                   | CITY          | STATE | PHONE          | BIRTHDAY   |
|------------|-------------|--------------|----------------------------|---------------------------|--------------|-------|---------------|------------|
| 1          | Maggi       | Dommey       | mdomoney@wisdompets.com     | 53177 Fieldstone Pass     | San Bernardino | CA    | 760-702-5469  | 1938-10-11 |
| 2          | Javier      | Dawks        | jdawks1@red3design.com      | 25629 Brown Trail         | Hartford      | CT    | 860-906-1459  | 1953-11-21 |
| 3          | Aleen       | Fasey        | afasey2@kinetecoicnc.com    | 41967 Mockingbird Court   | Boca Raton    | FL    | 561-410-2222  | 1900-08-10 |
| 4          | Taylor      | Jenkins      | tjenkins@rouxacademy.org    | 968 Bartillon Park        | Fort Lauderdale | FL  | 954-555-7424  | 1961-05-02 |
| 5          | Imogen      | Kabsch       | ikabsch@landonhotel.com     | 222 Hudson Point          | Anderson      | SC    | 864-326-7456  | 1919-08-27 |
| 6          | Don         | Weingarten   | dweingarten@kinetecoicnc.com | 6 Derek Avenue           | Columbus      | GA    | 706-389-4923  | 1919-07-19 |
| 7          | Cammi       | Kynett       | ckynett6@orangevalleycaa.org | 237 Homewood Hill       | Washington    | DC    | 202-798-6252  | 1927-03-06 |
| 8          | Steffie     | Kleis        | skleis7@wisdompets.com      | 360 Little Fleur Park    | Evansville    | IN    | 812-301-6915  | 1957-12-27 |
| 9          | Carilyn     | Calver       | ccalver8@samoca.org         | 3664 Emmet Circle        | Dulles        | VA    | 571-718-5931  | 1960-12-17 |
| 10         | Barbara-anne | Sweet       | bsweet9@samoca.org         | 257 Mallory Drive        | San Antonio   | TX    | 210-776-2859  | 1911-04-01 |

### Expected Result

| FIRSTNAME  | LASTNAME  | EMAIL                         |
|------------|---------|------------------------------|
| Giraldo    | Algar   | galgar21@kinetecoicnc.com    |
| Gustave    | Alphonso | galphonso28@wisdompets.com  |
| Romeo      | Annett  | rannettle@samoca.org        |
| Herby      | Aspinal | haspinals@red3design.com    |
| Emlyn      | Attwooll | eattwooll@hplussport.com   |
| Lydie      | Awmack  | lawmack1@samoca.org        |
| Joel       | Baigneard | jbaigneard2@orangevalleycaa.org |
| Tybie      | Balme   | tbalme1p@orangevalleycaa.org |
| Cathryn    | Beau    | cbeaulc@wisdompets.com      |
| Amory      | Bunyard | abunyardm@samoca.org       |

## SQL Query Example

```sql
SELECT FirstName, LastName, Email
FROM Customers
ORDER BY LastName ASC, FirstName ASC;
