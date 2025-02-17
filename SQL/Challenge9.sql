SELECT Orders.ORDERID, STRING_AGG(Dishes.Name,',' ORDER BY Dishes.NAME) as Events 
FROM Dishes
INNER JOIN OrdersDishes ON Dishes.DISHID = OrdersDishes.DishID
INNER JOIN Orders ON OrdersDishes.ORDERID = Orders.ORDERID
WHERE Orders.ORDERDATE > '2022-05-01 00:00:00.0'
GROUP BY Orders.ORDERID;
