SELECT TOP 2 Reservations.Date, Reservations.Partysize, Customers.FIRSTNAME, Customers.LASTNAME, Customers.EMAIL 
FROM Reservations INNER JOIN Customers ON
Reservations.CUSTOMERID = Customers.CUSTOMERID
order by Reservations.DATE DESC;
