SELECT COUNT(Orders.ORDERID) as NumSold, CAST(Orders.ORDERDATE AS DATE) as Day
FROM Dishes
INNER JOIN OrdersDishes ON Dishes.DISHID = OrdersDishes.DishID
INNER JOIN Orders ON OrdersDishes.ORDERID = Orders.ORDERID
WHERE Dishes.Name like 'H%Pizza%'
GROUP BY Day
ORDER BY Day ASC;
