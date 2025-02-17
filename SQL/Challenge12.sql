SELECT '00'||EmployeeId as ID, (LastName||', '||FirstName) as Name,  
LOWER((SUBSTR(FirstName,1,1))||SUBSTR(LastName,1,7)) as Login, 
(Username||'@nadias-garden.com') as Email
FROM Employees
ORDER BY Name ASC;
