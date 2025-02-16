SELECT TOP 1  Orders.OrderID, Customers.FirstName, Customers.LastName, SUM(Dishes.Price) AS ORDERTOTAL
FROM Orders
INNER JOIN OrdersDishes ON
Orders.OrderID = OrdersDishes.OrderID
INNER JOIN Dishes ON
OrdersDishes.DishID = Dishes.DishID
INNER JOIN Customers ON
Orders.CUSTOMERID = Customers.CUSTOMERID
GROUP BY Orders.ORDERID
ORDER BY ORDERTOTAL DESC;
