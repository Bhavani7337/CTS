INSERT INTO Orders VALUES
(103,1),
(104,1),
(105,1),
(106,2);

WITH CustomerOrderCounts AS (
    SELECT
        o.CustomerID,
        COUNT(o.OrderID) AS OrderCount
    FROM Orders o
    GROUP BY o.CustomerID
)
SELECT
    c.CustomerID,
    c.CustomerName,
    coc.OrderCount
FROM CustomerOrderCounts coc
JOIN Customers c
    ON c.CustomerID = coc.CustomerID
WHERE coc.OrderCount > 3;

SELECT * FROM Orders;
