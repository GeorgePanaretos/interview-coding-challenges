SELECT Customers.CustomerID, Customers.FirstName, Customers.LastName, SUM(Dishes.Price) as TotalSpend
FROM Customers INNER JOIN Orders ON Customers.CUSTOMERID = Orders.CUSTOMERID
INNER JOIN OrdersDishes ON Orders.ORDERID = OrdersDishes.ORDERID
INNER JOIN Dishes On OrdersDishes.DISHID = Dishes.DISHID
GROUP BY Customers.CUSTOMERID
HAVING  SUM(Dishes.Price) > 450
ORDER BY SUM(Dishes.Price) DESC;
