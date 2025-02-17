SELECT Name, Price as OriginalPrice,
CASE
    WHEN Price < 7  THEN '5%'
    WHEN Price >= 7 and Price <= 10 THEN '10%'
    ELSE '15%'
END AS DiscountPercent
,CASE
    WHEN Price < 7  THEN CAST (Price-Price*0.05 AS NUMERIC(36,2))
    WHEN Price >= 7 and Price <= 10 THEN CAST(Price-Price*0.1 AS NUMERIC(36,2))
    ELSE CAST(Price-Price*0.15AS NUMERIC(36,2))
END AS DiscountPrice
FROM Dishes
ORDER BY Name ASC;
