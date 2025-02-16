SELECT AVG(OrderTotal)
From ( SELECT Orders.OrderID, SUM(Dishes.Price) as OrderTotal
FROM Orders
INNER JOIN OrdersDishes ON Orders.OrderID = OrdersDishes.OrderID
INNER JOIN Dishes ON OrdersDishes.DishID = Dishes.DishID
GROUP BY OrdersDishes.OrderID);
